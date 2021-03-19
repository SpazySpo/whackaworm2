package org.legendtitans.whackaworm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class leveltwo extends AppCompatActivity {

    TextView textView;
    int score = 0;
    TextView scoreTextView;
    ImageView imageViewWorm1;
    ImageView imageViewWorm2;
    ImageView imageViewWorm3;
    ImageView imageViewWorm4;
    ImageView imageViewWorm5;
    ImageView imageViewWorm6;
    ImageView imageViewWorm7;
    ImageView imageViewWorm8;
    ImageView[] wormImageViews = new ImageView[8];
    Boolean oneWorm = false;
    Boolean threeWorms = false;
    Boolean fourWorms = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leveltwo);
        textView = findViewById(R.id.textView);
        scoreTextView = findViewById(R.id.scoreTextView);
        imageViewWorm1 = findViewById(R.id.imageViewWorm1);
        imageViewWorm2 = findViewById(R.id.imageViewWorm2);
        imageViewWorm3 = findViewById(R.id.imageViewWorm3);
        imageViewWorm4 = findViewById(R.id.imageViewWorm4);
        imageViewWorm5 = findViewById(R.id.imageViewWorm5);
        imageViewWorm6 = findViewById(R.id.imageViewWorm6);
        imageViewWorm7 = findViewById(R.id.imageViewWorm7);
        imageViewWorm8 = findViewById(R.id.imageViewWorm8);


        imageViewWorm1.setVisibility(View.INVISIBLE);
        imageViewWorm2.setVisibility(View.INVISIBLE);
        imageViewWorm3.setVisibility(View.INVISIBLE);
        imageViewWorm4.setVisibility(View.INVISIBLE);
        imageViewWorm5.setVisibility(View.INVISIBLE);
        imageViewWorm6.setVisibility(View.INVISIBLE);
        imageViewWorm7.setVisibility(View.INVISIBLE);
        imageViewWorm8.setVisibility(View.INVISIBLE);


        imageViewWorm1.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                imageViewWorm1.setVisibility(View.INVISIBLE);
                score = score + 1;
                scoreTextView.setText(""+score);

                return false;
            }
        });
        imageViewWorm2.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                imageViewWorm2.setVisibility(View.INVISIBLE);
                score = score + 1;
                scoreTextView.setText(""+score);
                return false;
            }
        });
        imageViewWorm3.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                imageViewWorm3.setVisibility(View.INVISIBLE);
                score = score + 1;
                scoreTextView.setText(""+score);
                return false;
            }
        });
        imageViewWorm4.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                imageViewWorm4.setVisibility(View.INVISIBLE);
                score = score + 1;
                scoreTextView.setText(""+score);
                return false;
            }
        });
        imageViewWorm5.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                imageViewWorm5.setVisibility(View.INVISIBLE);
                score = score + 1;
                scoreTextView.setText(""+score);
                return false;
            }
        });
        imageViewWorm6.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                imageViewWorm6.setVisibility(View.INVISIBLE);
                score = score + 1;
                scoreTextView.setText(""+score);
                return false;
            }
        });
        imageViewWorm7.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                imageViewWorm7.setVisibility(View.INVISIBLE);
                score = score + 1;
                scoreTextView.setText(""+score);
                return false;
            }
        });
        imageViewWorm8.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                imageViewWorm8.setVisibility(View.INVISIBLE);
                score = score + 1;
                scoreTextView.setText(""+score);
                return false;
            }
        });

        wormImageViews[0] = imageViewWorm1;
        wormImageViews[1] = imageViewWorm2;
        wormImageViews[2] = imageViewWorm3;
        wormImageViews[3] = imageViewWorm4;
        wormImageViews[4] = imageViewWorm5;
        wormImageViews[5] = imageViewWorm6;
        wormImageViews[6] = imageViewWorm7;
        wormImageViews[7] = imageViewWorm8;








        CountDownTimer fourWormTimer = new CountDownTimer(3000, 3000) {

            Random random = new Random();
            int randNum;
            int randNum2;
            int randNum3;
            int randNum4;

            public void onTick(long millisUntilFinished) {

                randNum = random.nextInt(8);

                wormImageViews[randNum2].setVisibility(View.VISIBLE);
                randNum2 = random.nextInt(8);

                wormImageViews[randNum].setVisibility(View.VISIBLE);
                randNum3 = random.nextInt(8);


                wormImageViews[randNum3].setVisibility(View.VISIBLE);
                randNum4 = random.nextInt(8);


                wormImageViews[randNum4].setVisibility(View.VISIBLE);
            }

            public void onFinish() {
                wormImageViews[0].setVisibility(View.INVISIBLE);
                wormImageViews[1].setVisibility(View.INVISIBLE);
                wormImageViews[2].setVisibility(View.INVISIBLE);
                wormImageViews[3].setVisibility(View.INVISIBLE);
                wormImageViews[4].setVisibility(View.INVISIBLE);
                wormImageViews[5].setVisibility(View.INVISIBLE);
                wormImageViews[6].setVisibility(View.INVISIBLE);
                wormImageViews[7].setVisibility(View.INVISIBLE);

                start();


            }
        }.start();


        CountDownTimer mainTimer = new CountDownTimer(30000, 1000) {
            public void onTick(long millisUntilFinished) {
                long sec = millisUntilFinished / 1000;
                textView.setText(sec+"");
            }

            public void onFinish() {

                textView.setText("0");
                imageViewWorm1.setVisibility(View.INVISIBLE);
                imageViewWorm2.setVisibility(View.INVISIBLE);
                imageViewWorm3.setVisibility(View.INVISIBLE);
                imageViewWorm4.setVisibility(View.INVISIBLE);
                imageViewWorm5.setVisibility(View.INVISIBLE);
                imageViewWorm6.setVisibility(View.INVISIBLE);
                imageViewWorm7.setVisibility(View.INVISIBLE);
                imageViewWorm8.setVisibility(View.INVISIBLE);
                Intent intent = new Intent(getApplicationContext(), leveltwo.class);
                startActivity(intent);
            }
        }.start();



    }
}