package com.example.a1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import androidx.appcompat.widget.SwitchCompat;
import android.widget.TextView;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import org.w3c.dom.Text;


public class Register extends AppCompatActivity {
    private SeekBar teamLevelSeekBar;
    private TextView seekBarTextView;
    private Button submitRegistrationBtn;
    private SwitchCompat isAgreeTermsSwitch;
    private BottomNavigationView bottomNavigationView;
    private RadioGroup emailSubRadioGroup;

    Boolean is_email_sub = false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        teamLevelSeekBar = (SeekBar) findViewById(R.id.seekbar_team_level);
        seekBarTextView = (TextView) findViewById(R.id.seekbar_text);

        submitRegistrationBtn = (Button) findViewById(R.id.confirm_registration_button);
        submitRegistrationBtn.setEnabled(false);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.register);
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

        teamLevelSeekBar.setProgress(50);
        seekBarTextView.setText(String.valueOf(teamLevelSeekBar.getProgress()));

        teamLevelSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekBarTextView.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        isAgreeTermsSwitch = (SwitchCompat) findViewById(R.id.agree_disagree_switch);
        isAgreeTermsSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                submitRegistrationBtn.setEnabled(isChecked);
            }
        });

        emailSubRadioGroup = (RadioGroup) findViewById(R.id.radio_emails);
        emailSubRadioGroup.check(R.id.radio_no);

        emailSubRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                is_email_sub = checkedId == R.id.radio_yes ? true : false;

            }
        });

    }


    public void launchRegisterConfirm(View view) {
        EditText teamNameEditText = (EditText) findViewById(R.id.team_name_edit);
        String teamName = teamNameEditText.getText().toString();

        if (TextUtils.isEmpty(teamName)) {
            teamNameEditText.setError("Team Name can't be empty");
        } else {
            TextView teamLevelTextView = (TextView) findViewById(R.id.seekbar_text);
            String teamLevel = teamLevelTextView.getText().toString();

            Intent intent = new Intent(this, RegisterConfirmation.class);
            intent.putExtra("teamName", teamName);
            intent.putExtra("teamLevel", teamLevel);

            String email_sub = is_email_sub ? "Yes" : "No";

            intent.putExtra("EmailSub", email_sub);

            startActivity(intent);
        }
    }

}