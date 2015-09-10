package com.mamoncillo.museoitm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread timer = new Thread(){
            public  void run(){
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(Splash.this,Principal.class );
                    startActivity(intent);
                }
            }
        };
        timer.start();
    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

}
