package com.example.shnayder_gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {
TextView name;
TextView password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        name=(TextView)findViewById(R.id.editTextTextPersonName);
        password=(TextView)findViewById(R.id.editTextTextPersonName2);
    }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button4:
                if(name.getText().toString().equals("")||password.getText().toString().equals(""))
            {
                Toast.makeText(getApplicationContext(), "Incorrect Name or Password", Toast.LENGTH_SHORT).show();
            }else{
                    startActivity(new Intent(SignInActivity.this, MainActivity.class));
            }
            break;
            case R.id.textView4:
            startActivity(new Intent(SignInActivity.this, SignUpActivity.class));
            break;
        }
    }
}