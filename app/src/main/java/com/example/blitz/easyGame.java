package com.example.blitz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class easyGame extends AppCompatActivity {
    int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_game);
        generateRandomNumber();
    }

    public void generateRandomNumber() {
        Random easyRandom = new Random();
        this.answer = easyRandom.nextInt(10) + 1;
    }
}