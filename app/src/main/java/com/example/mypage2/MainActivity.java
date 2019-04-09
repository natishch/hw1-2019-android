package com.example.mypage2;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView per1;
    private ImageView per2;
    private ImageView per3;
    private ImageView per4;
    private ImageView per5;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        per1 = findViewById(R.id.person1_profile_main);
        per2 = findViewById(R.id.person2_profile_main);
        per3 = findViewById(R.id.person3_profile_main);
        per4 = findViewById(R.id.person4_profile_main);
        per5 = findViewById(R.id.person5_profile_main);

        per1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExtendPage(1);

            }
        });
        per2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExtendPage(2);
            }
        });
        per3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExtendPage(3);
            }
        });
        per4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExtendPage(4);
            }
        });
        per5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExtendPage(5);
            }
        });

    }

    public void openExtendPage(int personNum){
        Intent intent = new Intent();
        switch (personNum){
            case 1: intent = new Intent(this, person1_main.class);
                    break;
            case 2: intent = new Intent(this, person2_main.class);
                    break;
            case 3: intent = new Intent(this, activity_person3_main.class);
                    break;
            case 4: intent = new Intent(this, person4_main.class);
                    break;
            case 5: intent = new Intent(this, person5_main.class);
                    break;
            default: break;
        }

            startActivity(intent);
    }
}
