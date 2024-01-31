package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }

    public void launchWelcomeScreen(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void launchHelloScreen(View view) {
        Intent intent = new Intent(this, Hello.class);
        startActivity(intent);
        finish();
    }

    public void launchRegisterScreen(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
        finish();
    }

}