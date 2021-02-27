package com.example.shnayder_gym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StepActivity5 extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step5);
        btn=(Button)findViewById(R.id.button24);
    }
    public void onClick(View v){
        Resources res=getResources();
        Drawable yellow= ResourcesCompat.getDrawable(res, R.drawable.button_yellow, null);
        btn.setBackground(yellow);
        startActivity(new Intent(this, SignInActivity.class));
    }
}