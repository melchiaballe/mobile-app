package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterConfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_confirmation);

        Intent intent = getIntent();
        String teamName = intent.getStringExtra("teamName");
        String teamLevel = intent.getStringExtra("teamLevel");
        String teamEmails = intent.getStringExtra("EmailSub");

        TextView tViewTeamName = findViewById(R.id.team_name);
        tViewTeamName.setText(teamName);

        TextView tViewTeamLevel = findViewById(R.id.team_level);
        tViewTeamLevel.setText(teamLevel);

        TextView tViewEmailSub = findViewById(R.id.team_emails);
        tViewEmailSub.setText(teamEmails);


    }

    public void launchSuccessScreen(View v) {
        Intent intent = new Intent(this, RegistrationSuccess.class);
        startActivity(intent);
        finish();
    }
}