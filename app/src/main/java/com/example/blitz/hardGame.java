package com.example.blitz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class hardGame extends AppCompatActivity {

    int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_game);

        int answer;
        generateRandomNumber();
    }
    public void generateRandomNumber() {
        Random hardRandom = new Random();
        this.answer = hardRandom.nextInt(100) + 1;
    }
}