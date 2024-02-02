package com.example.a1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Hello extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.hello);

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
                    return true;

                } else if (id == R.id.register) {
                    startActivity(new Intent(getApplicationContext(), Register.class));
                    finish();
                    overridePendingTransition(0,0);
                    return true;

                } else if (id == R.id.feedback) {
                    startActivity(new Intent(getApplicationContext(), Feedback.class));
                    finish();
                    overridePendingTransition(0,0);
                    return true;

                } else {
                    return false;
                }
            }
        });

    }
}