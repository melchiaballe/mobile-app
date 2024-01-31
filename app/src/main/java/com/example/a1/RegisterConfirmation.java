package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterConfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_confirmation);
    }

    public void launchRegisterScreen(View v) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

    public void launchSuccessScreen(View v) {
        Intent intent = new Intent(this, RegistrationSuccess.class);
        startActivity(intent);
    }
}