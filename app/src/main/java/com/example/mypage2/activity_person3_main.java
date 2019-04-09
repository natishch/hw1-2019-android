package com.example.mypage2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class activity_person3_main extends AppCompatActivity {

    private int likesCnt = getRandomNumberInRange(1000,5000);
    private int followersCnt = getRandomNumberInRange(1000,4000);
    private Button about;
    private ImageButton like;
    private ImageButton follow;
    private TextView linkTxt;
    private TextView followTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person3_main);

        linkTxt = findViewById(R.id.likeCnt);
        followTxt = findViewById(R.id.followerCnt);

        linkTxt.setText(String.valueOf(likesCnt));
        followTxt.setText(String.valueOf(followersCnt));

        about = findViewById(R.id.AboutMeButt);
        like = findViewById(R.id.LikeButt);
        follow = findViewById(R.id.FollowButt);



        about.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openExtendPage();
            }
        });

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likesCnt++;
                linkTxt.setText(String.valueOf(likesCnt));
            }
        });

        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                followersCnt++;
                followTxt.setText(String.valueOf(followersCnt));
            }
        });
    }

    public void openExtendPage(){
        Intent intent = new Intent(this, activity_person3_extend.class);
        intent.putExtra("likesCnt",likesCnt);
        intent.putExtra("followersCnt",followersCnt);
        startActivity(intent);
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}



