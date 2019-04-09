package com.example.mypage2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class person4_extend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person4_extend);

        int likesCnt;
        int followersCnt;
        TextView likes;
        TextView followers;

        Intent intent = getIntent();
        likesCnt = intent.getIntExtra("likesCnt",0);
        followersCnt = intent.getIntExtra("followersCnt",0);

        likes = findViewById(R.id.person4_likesCntE);
        followers = findViewById(R.id.person4_followersCntE);

        likes.setText(String.valueOf(likesCnt));
        followers.setText(String.valueOf(followersCnt));
    }
}
