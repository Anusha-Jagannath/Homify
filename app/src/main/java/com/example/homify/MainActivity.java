package com.example.homify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.addExpenseBtn);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), AddExpenseActivity.class);
            startActivity(intent);
        });


    }
}