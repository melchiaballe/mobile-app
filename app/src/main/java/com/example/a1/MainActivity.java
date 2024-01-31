package com.example.a1;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void launchHelloScreen(View view) {
        Intent intent = new Intent(this, Hello.class);
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