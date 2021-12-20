package com.example.sstation;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class IntroActivity extends AppCompatActivity {
    Animation topAnim,bottomAnim;
    ImageView img;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
       topAnim= AnimationUtils.loadAnimation(this, R.anim.top_anim);
       bottomAnim= AnimationUtils.loadAnimation(this, R.anim.bottom_anim);
       img= findViewById(R.id.ssimg);
       txt=findViewById(R.id.sstxt);
       img.setAnimation(topAnim);
       txt.setAnimation(bottomAnim);
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               startActivity(new Intent(IntroActivity.this, MainActivity.class));
               finish();
           }
       },2000);


    }


}