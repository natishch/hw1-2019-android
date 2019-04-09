package com.example.mypage2;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class person2_extend extends AppCompatActivity {
    private int likesCnt;
    private int followersCnt;
    private TextView likes;
    private TextView followers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person2_extend);
        Intent intent = getIntent();
        likesCnt = intent.getIntExtra("likesCnt",0);
        followersCnt = intent.getIntExtra("followersCnt",0);

        likes = findViewById(R.id.person2_likesCntE);
        followers = findViewById(R.id.person2_followersCntE);

        likes.setText(String.valueOf(likesCnt));
        followers.setText(String.valueOf(followersCnt));

    }
}
