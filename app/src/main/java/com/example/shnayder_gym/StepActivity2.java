package com.example.shnayder_gym;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StepActivity2 extends AppCompatActivity {
Button male;
Button female;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);
        male=(Button)findViewById(R.id.button13);
        female=(Button)findViewById(R.id.button14);
    }
    public void onClick(View v){
        Resources res=getResources();
        Drawable drawable= ResourcesCompat.getDrawable(res, R.drawable.crugi, null);
        switch (v.getId()){
            case R.id.button13:
                male.setBackground(drawable);
                startActivity(new Intent(this, StepActivityMale.class));
                break;
                case R.id.textView6:
                    startActivity(new Intent(this, StepActivityMale.class));
                    break;
            case R.id.button14:
                female.setBackground(drawable);
                startActivity(new Intent(this, StepActivityFemale.class));
                break;
            case R.id.textView7:
                startActivity(new Intent(this, StepActivityFemale.class));
                break;
        }
    }
}