package com.example.shnayder_gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button4:
                startActivity(new Intent(this, SignInActivity.class));
            case R.id.textView5:
                startActivity(new Intent(this, SignInActivity.class));
        }
    }
}