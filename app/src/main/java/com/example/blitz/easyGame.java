package com.example.blitz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

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

    public void easyButtonClicked(View v) {
        EditText easyGuess = (EditText) findViewById(R.id.easyGuess);
        String eS = easyGuess.getText().toString();
    }
}