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
        String result = "";
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
                if (listNames.size()>0){
                Random random   = new Random();
                int indexRandom = random.nextInt(listNames.size());
                String valueRandom = listNames.get(indexRandom);
                tvRandom.setText(valueRandom);
                tvHistory.setText(result);
                listNames.remove(indexRandom);
                if (listNames.size() == 1){
                    result = valueRandom + result;
                } else {
                    result+= " - " +valueRandom  ;
                }
            } else {
                    int Short;
                    Toast.makeText(MainActivity.this, "Full team", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = "";
                tvRandom.setText(result);
                tvHistory.setText(result);
                if (listNames.size()>0){
                    listNames.clear();
                }else{
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
            }
        });
        }
        }
