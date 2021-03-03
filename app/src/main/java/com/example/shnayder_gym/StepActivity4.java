package com.example.shnayder_gym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class StepActivity4 extends AppCompatActivity {
Button btn1;
Button btn2;
Button btn3;
Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step4);
        btn1=(Button)findViewById(R.id.button20);
        btn2=(Button)findViewById(R.id.button21);
        btn3=(Button)findViewById(R.id.button22);
        next=(Button)findViewById(R.id.button23);
    }
    public void onClick(View v){
        Handler handler=new Handler();
        Resources res=getResources();
        Drawable yellow= ResourcesCompat.getDrawable(res, R.drawable.button_yellow, null);
        Drawable white=ResourcesCompat.getDrawable(res, R.drawable.button, null);
        switch (v.getId()){
            case R.id.button20:
                btn1.setBackground(yellow);
                btn2.setBackground(white);
                btn3.setBackground(white);
                break;
            case R.id.button21:
                btn1.setBackground(white);
                btn2.setBackground(yellow);
                btn3.setBackground(white);
                break;
            case R.id.button22:
                btn1.setBackground(white);
                btn2.setBackground(white);
                btn3.setBackground(yellow);
                break;
            case R.id.button23:
                next.setBackground(yellow);
                startActivity(new Intent(this, StepActivity5.class));
                break;
        }
    }
}