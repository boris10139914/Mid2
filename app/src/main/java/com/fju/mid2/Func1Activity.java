package com.fju.mid2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class Func1Activity extends AppCompatActivity {
    Random r = new Random();
    int[] dicepicture = {
            R.drawable.d1, R.drawable.d2, R.drawable.d3, R.drawable.d4, R.drawable.d5, R.drawable.d6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
    }

    public void roll(View view) {
        int n = r.nextInt(6) + 1;
        ImageView dp = findViewById(R.id.imageView3_dice);
        new AlertDialog.Builder(this)
                .setMessage(n + "")
                .show();
        switch (n) {
            case 1:
                dp.setImageResource(dicepicture[0]);
                break;
            case 2:
                dp.setImageResource(dicepicture[1]);
                break;
            case 3:
                dp.setImageResource(dicepicture[2]);
                break;
            case 4:
                dp.setImageResource(dicepicture[3]);
                break;
            case 5:
                dp.setImageResource(dicepicture[4]);
                break;
            case 6:
                dp.setImageResource(dicepicture[5]);
                break;

        }
    }

}

