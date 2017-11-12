package com.example.johncena;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer johnCenaMP = MediaPlayer.create(this, R.raw.john_cena_intro);
        //Button playJohnCena = (Button) this.findViewById(R.id.johnCenaButton);
        findViewById(R.id.johnCenaButton).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                johnCenaMP.start();
            }
        });

    }
}