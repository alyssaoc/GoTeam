package com.soloiq.goteam;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static android.media.MediaPlayer.*;


public class MainActivity extends AppCompatActivity {

    MediaPlayer crickets;
    MediaPlayer miracle;
    MediaPlayer crackers;
    MediaPlayer gong;
    MediaPlayer fireworks;
    MediaPlayer drums;
    MediaPlayer fail;
    MediaPlayer magic;

    public void playCrickets(View view) {
        if (crickets.isPlaying()){
            crickets.pause();
        }
        else {
            crickets.start();
        }
    }

    public void playMiracle(View view) {
        if(miracle.isPlaying()){
            miracle.pause();
        }
        else {
            miracle.start();
        }
    }

    public void playCrackers (View view) {
        if(crackers.isPlaying()){
            crackers.pause();
        }
        else {
            crackers.start();
        }
    }

    public void playGong(View view){
        if(gong.isPlaying()){
            gong.pause();
        }
        else {
            gong.start();
        }
    }

    public void playFireworks(View view) {
        if(fireworks.isPlaying()){
            fireworks.pause();
        }
        else {
            fireworks.start();
        }
    }

    public void playDrums (View view) {
        if (drums.isPlaying()){
            drums.pause();
        }
        else {
            drums.start();
        }
    }

    public  void  playFail (View view) {
        if (fail.isPlaying()) {
            fail.pause();
        } else {
            fail.start();
        }
    }

    public void playMagic (View view) {
        if (magic.isPlaying()) {
            magic.pause();
        } else {
            magic.start();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crickets = create(this, R.raw.crickets);
        miracle = create(this, R.raw.miracle);
        crackers = create(this, R.raw.crackers);
        gong = create(this, R.raw.gong);
        fireworks = create(this, R.raw.fireworks);
        drums = create(this, R.raw.drums);
        fail = create(this, R.raw.fail);
        magic = create(this, R.raw.feeling);

    }
}
