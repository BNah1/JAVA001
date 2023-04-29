package com.baonhan.textview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
    {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Random random = new Random();
//        Math.random();
//        `1.làm tròn 0.5
        int number1 = Math.round(0.5f);
//         2. làm tròn xuống
        double number2 = Math.floor(1.99999);
//         3. làm tròn lên
        double number3 = Math.ceil(1.00001);
//         4. Random
        Random random = new Random();
        for(int i = 0; i < 50; i++){
            int number4 = random.nextInt(13 -5 +1) + 5;
//      Log dữ liệu
        Log.d("BBB",number4 + "");}
//          Thông báo
        Toast.makeText(this, String.valueOf(number1),
                Toast.LENGTH_LONG).show();
    }
}