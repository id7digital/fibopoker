package com.id7.apps.fibopoker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.lang.Thread;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread splashScrrenThread = new Thread()
        {
            @Override
            public void run() {
              try {
                sleep(3000);
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
              }
              catch(InterruptedException ex)
              {
                  ex.printStackTrace();
              }
            }
        };

        splashScrrenThread.start();
    }

}
