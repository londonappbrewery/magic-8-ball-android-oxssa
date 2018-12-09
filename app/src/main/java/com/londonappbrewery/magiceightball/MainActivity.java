package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button B_ask = (Button) findViewById(R.id.askButton);
        final ImageView I_8Ball = (ImageView) findViewById(R.id.image_eightBall);
        final int Eball []= {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        B_ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomize = new Random();
                int number = randomize.nextInt(5);
                I_8Ball.setImageResource(Eball[number]);
            }
        });

    }
}
