package com.example.a1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.text.TextUtils;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Feedback extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.feedback);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if(id == R.id.home) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                    overridePendingTransition(0,0);
                    return true;

                } else if (id == R.id.hello) {
                    startActivity(new Intent(getApplicationContext(), Hello.class));
                    finish();
                    overridePendingTransition(0,0);
                    return true;

                } else if (id == R.id.register) {
                    startActivity(new Intent(getApplicationContext(), Register.class));
                    finish();
                    overridePendingTransition(0,0);
                    return true;

                } else if (id == R.id.feedback) {
                    return true;

                } else {
                    return false;
                }
            }
        });
    }


    public void launchFeedbackConfirm(View v) {

        EditText editText = (EditText) findViewById(R.id.addFeedbackEditText);
        String custFeedback = editText.getText().toString();

        if(TextUtils.isEmpty(custFeedback)) {
            editText.setError("Field should not be empty");
        } else {
            Intent intent = new Intent(this, FeedbackConfirm.class);
            startActivity(intent);
            finish();
        }
    }

}