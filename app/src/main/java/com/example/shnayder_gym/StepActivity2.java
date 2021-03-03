package com.example.shnayder_gym;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StepActivity2 extends AppCompatActivity {
Button male;
Button female;
Button next;
int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);
        male=(Button)findViewById(R.id.button13);
        female=(Button)findViewById(R.id.button14);
        next=(Button)findViewById(R.id.button15);
    }
    @SuppressLint("NonConstantResourceId")
    public void onClick(View v){
        Resources res=getResources();
        Drawable drawable= ResourcesCompat.getDrawable(res, R.drawable.crugi, null);
        Drawable drawable1=ResourcesCompat.getDrawable(res, R.drawable.button_yellow, null);
        Drawable drawable1_base=ResourcesCompat.getDrawable(res, R.drawable.text_button_next, null);
        Drawable drawable_base=ResourcesCompat.getDrawable(res, R.drawable.crug, null);
        switch (v.getId()){
            case R.id.button13:
            case R.id.textView6:
                female.setBackground(drawable_base);
                male.setBackground(drawable);
                i=1;
                break;
            case R.id.button14:
            case R.id.textView7:
                male.setBackground(drawable_base);
                female.setBackground(drawable);
                i=0;
                break;
            case R.id.button15:
                next.setBackground(drawable1);
                if(i==1){
                startActivity(new Intent(this, StepActivityMale.class));
                break;
            }else if(i==0){
                startActivity(new Intent(this, StepActivityFemale.class));
                break;
            }else{
                next.setBackground(drawable1_base);
                break;
            }
        }
    }
}