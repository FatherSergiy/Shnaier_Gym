package com.example.shnayder_gym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StepActivity1 extends AppCompatActivity {
Button btn_weight;
Button btn_fit;
Button btn_muscle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step1);
        btn_weight=(Button)findViewById(R.id.button);
        btn_fit=(Button)findViewById(R.id.button2);
        btn_muscle=(Button)findViewById(R.id.button3);
    }
    public void onClick(View v){
        Resources res=getResources();
        Drawable drawable1= ResourcesCompat.getDrawable(res, R.drawable.button_y1, null);
        Drawable drawable2=ResourcesCompat.getDrawable(res, R.drawable.button_y2, null);
        Drawable drawable3=ResourcesCompat.getDrawable(res, R.drawable.button_y3, null);
        switch(v.getId()) {
            case R.id.button:
                btn_weight.setBackground(drawable1);
                break;
            case R.id.button2:
                btn_fit.setBackground(drawable2);
                break;
            case R.id.button3:
                btn_muscle.setBackground(drawable3);
                break;
        }
        startActivity(new Intent(this, StepActivity2.class));
    }
}