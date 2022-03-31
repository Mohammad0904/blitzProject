package com.example.blitz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class mediumGame extends AppCompatActivity {
    public int answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium_game);
        generateRandomNumber();
        /**button.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View j) {
                matchAnswer();
                }
        }
        */

    }
    public void generateRandomNumber() {
        Random mediumRandom = new Random();
        this.answer = mediumRandom.nextInt(50) + 1;
    }

    public void matchAnswer() {

    }
}