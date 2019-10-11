package com.id7.apps.fibopoker;

import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class card extends AppCompatActivity {

    private TextView card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        card = (TextView) findViewById(R.id.cardShown);
        String dd = getIntent().getStringExtra("cardNumber");
        card.setText(dd);

    }

}
