package com.baonhan.textview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity
    {
        TextView tvRandom, tvHistory;
        Button btnReset, btnRandom;
        List<String> listNames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvRandom = findViewById(R.id.text_view_random);
        tvHistory = findViewById(R.id.text_view_history);
        btnReset = findViewById(R.id.button_reset);
        btnRandom = findViewById(R.id.button_random);
        initData();
        event();
    }
        private void initData() {
        listNames = new ArrayList<>();
            listNames.add(("Sasuke"));
            listNames.add("Naruto");
            listNames.add("Sakura");
            listNames.add("Kakashi");
            listNames.add("Hinata");
            listNames.add("Pain");
            listNames.add("Obito");
            listNames.add("Neji");
            listNames.add("Gaara");
            listNames.add("Rock Lee");
        }

        private void event() {
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random   = new Random();
                int indexRandom = random.nextInt(listNames.size()-1);
                String valueRandom = listNames.get(indexRandom);
                tvRandom.setText(valueRandom);
            }
        });
        }

    }