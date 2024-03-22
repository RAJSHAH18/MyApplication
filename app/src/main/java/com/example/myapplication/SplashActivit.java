package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        getSupportActionBar().hide(); It is used to hide toolbar from the splash screen
        Thread thread  = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                }
                catch (Exception e ){
                    e.printStackTrace();
                }
                finally{
                    Intent intent = new Intent(SplashActivit.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };thread.start();
    }
}