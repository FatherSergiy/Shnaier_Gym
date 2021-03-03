package com.example.shnayder_gym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class StepActivityMale extends AppCompatActivity {
Button hands;
Button spine;
Button torso;
Button legs;
    ImageView figure;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_male);
        hands=(Button)findViewById(R.id.button19);
        spine=(Button)findViewById(R.id.button18);
        torso=(Button)findViewById(R.id.button17);
        legs=(Button)findViewById(R.id.button16);
        figure=(ImageView) findViewById(R.id.imageView11);
        Animation anim= AnimationUtils.loadAnimation(this, R.anim.figure);
        figure.startAnimation(anim);
    }
    public void onClick(View v){
        Resources res=getResources();
        Drawable yellow= ResourcesCompat.getDrawable(res, R.drawable.button_gender1, null);
                switch(v.getId()){
                    case R.id.button19:
                        hands.setBackground(yellow);
                        break;
                    case R.id.button18:
                        spine.setBackground(yellow);
                        break;
                    case R.id.button17:
                        torso.setBackground(yellow);
                        break;
                    case R.id.button16:
                        legs.setBackground(yellow);
                        break;
                }
                        startActivity(new Intent(StepActivityMale.this, StepActivity4.class));
    }
}