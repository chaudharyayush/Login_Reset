package com.example.firstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class resetPassword extends AppCompatActivity {
    TextView sendInstructions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // getSupportActionBar().hide(); to hide action bar
        getSupportActionBar().setTitle("back");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_resetpassword);
        sendInstructions = findViewById(R.id.sendInstructions);
        sendInstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(resetPassword.this, mail.class);
                startActivity(intent);
            }
        });
    }
}