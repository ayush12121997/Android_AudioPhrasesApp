package com.example.ayush.audiophrasesapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    public void playPhrase(View view)
    {
        if(view.getTag().equals("Name"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.mynameis);
            mediaPlayer.start();
        }
        else if(view.getTag().equals("How"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.howareyou);
            mediaPlayer.start();
        }
        else if(view.getTag().equals("Hello"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.hello);
            mediaPlayer.start();
        }
        else if(view.getTag().equals("Please"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.please);
            mediaPlayer.start();
        }
        else if(view.getTag().equals("Welcome"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.welcome);
            mediaPlayer.start();
        }
        else if(view.getTag().equals("Evening"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.goodevening);
            mediaPlayer.start();
        }
        else if(view.getTag().equals("Live"))
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.ilivein);
            mediaPlayer.start();
        }
        else
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
            mediaPlayer.start();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
