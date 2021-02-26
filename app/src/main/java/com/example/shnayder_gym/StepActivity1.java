package com.example.shnayder_gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
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
        btn_weight=(Button)findViewById(R.id.button5);
        btn_fit=(Button)findViewById(R.id.button6);
        btn_muscle=(Button)findViewById(R.id.button7);
    }
    public void onClick(View v){
        Handler handler=new Handler();
        switch(v.getId()){
            case R.id.button:
                btn_weight.setVisibility(View.VISIBLE);
                break;
            case R.id.button2:
                btn_fit.setVisibility(View.VISIBLE);
                break;
            case R.id.button3:
                btn_muscle.setVisibility(View.VISIBLE);
                break;
        }
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(StepActivity1.this, SignInActivity.class));
            }
        }, 1000);
    }
}