package com.baonhan.textview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
    {
        TextView tvRandom, tvHistory;
        Button btnReset, btnRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvRandom = findViewById(R.id.text_view_random);
        tvHistory = findViewById(R.id.text_view_history);
        btnReset = findViewById(R.id.button_reset);
        btnRandom = findViewById(R.id.button_random);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click button reset", Toast.LENGTH_SHORT).show();
            }
        });
    }
}