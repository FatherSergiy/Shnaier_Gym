package com.example.shnayder_gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button4:
                startActivity(new Intent(SignInActivity.this, MainActivity.class));
                break;
            case R.id.textView4:
                startActivity(new Intent(SignInActivity.this, SignUpActivity.class));
        }
    }
}