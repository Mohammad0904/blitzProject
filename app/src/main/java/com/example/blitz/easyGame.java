package com.example.blitz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class easyGame extends AppCompatActivity {
    double easeScore = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_game);
    }


    public void easyButtonClicked(View v) {
        EditText easyGuess = (EditText) findViewById(R.id.easyGuess);
        String eS = easyGuess.getText().toString();

        Double eD = Compare.parseDouble(eS);
        int eI = Compare.convertToInt(eD);
        int eR = Compare.generateEasyRandomNumber();
        boolean easyCom = Compare.comparison(eI, eR);

        if (easyCom == true) {
            easeScore++;
            String display = Compare.format(easeScore);
            ((TextView) findViewById(R.id.easyScore)).setText(display);
        }
        else {
            easeScore = 0.0;
            String display = Compare.format(easeScore);
            ((TextView) findViewById(R.id.easyScore)).setText(display);
        }
    }
}