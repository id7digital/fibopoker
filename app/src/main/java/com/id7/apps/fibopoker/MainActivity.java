package com.id7.apps.fibopoker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView image;
    private int stepSize = 5;
    private AdView mAdView;
    private CardView card0;
    private CardView cardhalf;
    private CardView card1;
    private CardView card2;
    private CardView card3;
    private CardView card5;
    private CardView card8;
    private CardView card13;
    private CardView card20;
    private CardView card40;
    private CardView card100;
    private CardView cardinfinity;
    private CardView cardquestion;
    private CardView cardcoffee;

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

        card0 = (CardView) findViewById(R.id.card0);
        cardhalf = (CardView) findViewById(R.id.cardhalf);
        card1 = (CardView) findViewById(R.id.card1);
        card2 = (CardView) findViewById(R.id.card2);
        card3 = (CardView) findViewById(R.id.card3);
        card5 = (CardView) findViewById(R.id.card5);
        card8 = (CardView) findViewById(R.id.card8);
        card13 = (CardView) findViewById(R.id.card13);
        card20 = (CardView) findViewById(R.id.card20);
        card40 = (CardView) findViewById(R.id.card40);
        card100 = (CardView) findViewById(R.id.card100);
        cardinfinity = (CardView) findViewById(R.id.infinity);
        cardquestion = (CardView) findViewById(R.id.question);
        cardcoffee = (CardView) findViewById(R.id.coffee);

        card0.setOnClickListener(this);
        cardhalf.setOnClickListener(this);
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card5.setOnClickListener(this);
        card8.setOnClickListener(this);
        card13.setOnClickListener(this);
        card20.setOnClickListener(this);
        card40.setOnClickListener(this);
        card100.setOnClickListener(this);
        cardinfinity.setOnClickListener(this);
        cardquestion.setOnClickListener(this);
        cardcoffee.setOnClickListener(this);
//        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                progress = (Math.round(progress/stepSize))*stepSize;
//                seekBar.setProgress(progress);
//
//
//                switch (progress) {
//
//                    case 0:
//                        image.setImageResource(R.mipmap.ic_foreground_0);
//                        break;
//                    case 5:
//                        image.setImageResource(R.mipmap.ic_foreground_1);
//                        break;
//                    case 10:
//                        image.setImageResource(R.mipmap.ic_foreground_2);
//                        break;
//                    case 15:
//                        image.setImageResource(R.mipmap.ic_foreground_3);
//                        break;
//                    case 20:
//                        image.setImageResource(R.mipmap.ic_foreground_5);
//                        break;
//                    case 25:
//                        image.setImageResource(R.mipmap.ic_foreground_8);
//                        break;
//                    case 30:
//                        image.setImageResource(R.mipmap.ic_foreground_13);
//                        break;
//                    case 35:
//                        image.setImageResource(R.mipmap.ic_foreground_21);
//                        break;
//                    case 40:
//                        image.setImageResource(R.mipmap.ic_foreground_question);
//                        break;
//                }
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });


    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch(v.getId())
        {
            case R.id.card0:
                i = new Intent(this, card.class);
                i.putExtra("cardNumber", "0");
                startActivity(i);
                break;
            case R.id.cardhalf:
                i = new Intent(this, card.class);
                i.putExtra("cardNumber", "1/2");
                startActivity(i);
                break;
            case R.id.card1:
                i = new Intent(this, card.class);
                i.putExtra("cardNumber", "1");
                startActivity(i);
                break;
            case R.id.card2:
                i = new Intent(this, card.class);
                i.putExtra("cardNumber", "2");
                startActivity(i);
                break;
            case R.id.card3:
                i = new Intent(this, card.class);
                i.putExtra("cardNumber", "3");
                startActivity(i);
                break;
            case R.id.card5:
                i = new Intent(this, card.class);
                i.putExtra("cardNumber", "5");
                startActivity(i);
                break;
            case R.id.card8:
                i = new Intent(this, card.class);
                i.putExtra("cardNumber", "8");
                startActivity(i);
                break;
            case R.id.card13:
                i = new Intent(this, card.class);
                i.putExtra("cardNumber", "13");
                startActivity(i);
                break;
            case R.id.card20:
                i = new Intent(this, card.class);
                i.putExtra("cardNumber", "20");
                startActivity(i);
                break;
            case R.id.card40:
                i = new Intent(this, card.class);
                i.putExtra("cardNumber", "40");
                startActivity(i);
                break;
            case R.id.card100:
                i = new Intent(this, card.class);
                i.putExtra("cardNumber", "100");
                startActivity(i);
                break;
            case R.id.infinity:
                i = new Intent(this, card.class);
                i.putExtra("cardNumber", "infinity");
                startActivity(i);
                break;
            case R.id.question:
                i = new Intent(this, card.class);
                i.putExtra("cardNumber", "?");
                startActivity(i);
                break;
            case R.id.coffee:
                i = new Intent(this, card.class);
                i.putExtra("cardNumber", "coffee");
                startActivity(i);
                break;
            default:
                break;
        }


    }
}
