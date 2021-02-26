package com.example.shnayder_gym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.widget.ScrollView;
import android.widget.Toast;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class LessonsActivity extends AppCompatActivity {
ScrollView hands;
ScrollView spine;
ScrollView torso;
ScrollView legs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

        hands=(ScrollView) findViewById(R.id.scrollView2);
        spine=(ScrollView) findViewById(R.id.scrollView3);
        torso=(ScrollView) findViewById(R.id.scrollView4);
        legs=(ScrollView) findViewById(R.id.scrollView5);

    }
    public void onClick(View v){
        hands.setVisibility(View.GONE);
        spine.setVisibility(View.GONE);
        torso.setVisibility(View.GONE);
        legs.setVisibility(View.GONE);
        switch(v.getId()){
            case R.id.button9:
                hands.setVisibility(View.VISIBLE);
                break;
            case R.id.button10:
                spine.setVisibility(View.VISIBLE);
                break;
            case R.id.button11:
                torso.setVisibility(View.VISIBLE);
                break;
            case R.id.button12:
                legs.setVisibility(View.VISIBLE);
                break;
        }
    }
}