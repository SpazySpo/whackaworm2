package org.legendtitans.whackaworm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class levelone extends AppCompatActivity {

    TextView textView;
    TextView scoreTextView;
    int score = 0;
    ImageView imageViewWorm1;
    ImageView imageViewWorm2;
    ImageView imageViewWorm3;
    ImageView imageViewWorm4;
    ImageView imageViewWorm5;
    ImageView imageViewWorm6;
    ImageView imageViewWorm7;
    ImageView imageViewWorm8;
    ImageView[] wormImageViews = new ImageView[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levelone);
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

        imageViewWorm1.setOnTouchListener( new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event){
                imageViewWorm1.setVisibility(View.INVISIBLE);
            score = score + 1;
            scoreTextView.setText(""+score);

                return false;
            }

        });
        imageViewWorm2.setOnTouchListener( new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event){
                imageViewWorm2.setVisibility(View.INVISIBLE);
                score = score + 1;
                scoreTextView.setText(""+score);
                return false;
            }

        });
        imageViewWorm3.setOnTouchListener( new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event){
                imageViewWorm3.setVisibility(View.INVISIBLE);
                score = score + 1;
                scoreTextView.setText(""+score);
                return false;
            }

        });
        imageViewWorm4.setOnTouchListener( new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event){
                imageViewWorm4.setVisibility(View.INVISIBLE);
                score = score + 1;
                scoreTextView.setText(""+score);
                return false;
            }

        });
        imageViewWorm5.setOnTouchListener( new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event){
                imageViewWorm5.setVisibility(View.INVISIBLE);
                score = score + 1;
                scoreTextView.setText(""+score);
                return false;
            }

        });
        imageViewWorm6.setOnTouchListener( new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event){
                imageViewWorm6.setVisibility(View.INVISIBLE);
                score = score + 1;
                scoreTextView.setText(""+score);
                return false;
            }

        });
        imageViewWorm7.setOnTouchListener( new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event){
                imageViewWorm7.setVisibility(View.INVISIBLE);
                score = score + 1;
                scoreTextView.setText(""+score);
                return false;
            }

        });
        imageViewWorm8.setOnTouchListener( new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event){
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



        new CountDownTimer(50000, 1000) {
            public void onTick(long millisUntilFinished) {
                long sec = (millisUntilFinished / 1000) ;
                textView.setText(sec+"");
            }
            // When the task is over it will print 00:00:00 there
            public void onFinish() {
                textView.setText("0");
            }
        }.start();

        new CountDownTimer(3000, 3000) {
            Random random = new Random();
            int randNum;

            public void onTick(long millisUntilFinished) {
                randNum = random.nextInt(8);
                wormImageViews[randNum].setVisibility(View.VISIBLE);
            }


            public void onFinish() {

                wormImageViews[randNum].setVisibility(View.INVISIBLE);
                start();
            }
        }.start();


    }

}