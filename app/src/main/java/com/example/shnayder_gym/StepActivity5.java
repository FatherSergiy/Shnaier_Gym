package com.example.shnayder_gym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class StepActivity5 extends AppCompatActivity {
Button btn;
TextView weight;
TextView height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step5);
        btn=(Button)findViewById(R.id.button24);
        weight=(TextView)findViewById(R.id.editTextTextPersonName5);
        height=(TextView)findViewById(R.id.editTextTextPersonName6);
    }
    public void onClick(View v){
        Resources res=getResources();
        Drawable yellow= ResourcesCompat.getDrawable(res, R.drawable.button_yellow, null);
        btn.setBackground(yellow);
        if(weight.getText().toString().equals("")||height.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(), "Incorrect weight or height", Toast.LENGTH_SHORT).show();
        }else{
            startActivity(new Intent(this, MainActivity.class));
        }
    }
}