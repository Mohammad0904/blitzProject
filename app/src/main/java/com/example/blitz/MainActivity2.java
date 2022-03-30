package com.example.blitz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button mediumButton;
    private Button hardButton;
    private Button easyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mediumButton = (Button) findViewById(R.id.mediumButton);
        mediumButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openactivity_medium_game();

            }});

        hardButton = (Button) findViewById(R.id.hardButton);
        hardButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openactivity_hard_game();

            }});

        easyButton = (Button) findViewById(R.id.easyButton);
        easyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openactivity_easy_game();

            }});
        }

    public void openactivity_medium_game() {
        Intent mediumIntent = new Intent(this, mediumGame.class);
        startActivity(mediumIntent);
    }

    public void openactivity_hard_game() {
        Intent hardIntent = new Intent(this, hardGame.class);
        startActivity(hardIntent);
    }

    public void openactivity_easy_game() {
        Intent easyIntent = new Intent(this, easyGame.class);
        startActivity(easyIntent);
    }
}