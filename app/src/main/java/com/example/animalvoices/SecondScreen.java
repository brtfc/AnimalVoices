package com.example.animalvoices;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondScreen extends AppCompatActivity {
    Button cowSound;
    Button pigSOund;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        cowSound = findViewById(R.id.cowBtn);
        pigSOund = findViewById(R.id.pigsBtn);

        final MediaPlayer cowVoice = MediaPlayer.create(this, R.raw.cow);
        final MediaPlayer pigVoice = MediaPlayer.create(this, R.raw.pig);

        cowSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cowVoice.start();
            }
        });

        pigSOund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pigVoice.start();
            }
        });
    }
}
