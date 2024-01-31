package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Hello extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }

    public void launchWelcomeScreen(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void launchRegisterScreen(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

    public void launchFeedbackScreen(View view) {
        Intent intent = new Intent(this, Feedback.class);
        startActivity(intent);
    }
}