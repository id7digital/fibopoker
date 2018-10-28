package com.id7.apps.fibopoker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private int stepSize = 5;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-8354575574816340~6439980842");

        SeekBar seekBar = findViewById(R.id.seekBar);
        image = findViewById(R.id.imageView);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progress = (Math.round(progress/stepSize))*stepSize;
                seekBar.setProgress(progress);


                switch (progress) {

                    case 0:
                        image.setImageResource(R.mipmap.ic_foreground_0);
                        break;
                    case 5:
                        image.setImageResource(R.mipmap.ic_foreground_1);
                        break;
                    case 10:
                        image.setImageResource(R.mipmap.ic_foreground_2);
                        break;
                    case 15:
                        image.setImageResource(R.mipmap.ic_foreground_3);
                        break;
                    case 20:
                        image.setImageResource(R.mipmap.ic_foreground_5);
                        break;
                    case 25:
                        image.setImageResource(R.mipmap.ic_foreground_8);
                        break;
                    case 30:
                        image.setImageResource(R.mipmap.ic_foreground_13);
                        break;
                    case 35:
                        image.setImageResource(R.mipmap.ic_foreground_21);
                        break;
                    case 40:
                        image.setImageResource(R.mipmap.ic_foreground_question);
                        break;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

}
