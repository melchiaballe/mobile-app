package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
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

    public void launchFeedbackScreen(View view) {
        Intent intent = new Intent(this, Feedback.class);
        startActivity(intent);
        finish();
    }


}