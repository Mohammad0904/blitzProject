package com.example.blitz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class hardGame extends AppCompatActivity {

    double harScore = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_game);



    }
    public void hardButtonClicked(View v) {
        EditText hardGuess = (EditText) findViewById(R.id.hardGuess);
        String hS = hardGuess.getText().toString();

        Double hD = Compare.parseDouble(hS);
        int hI = Compare.convertToInt(hD);
        int hR = Compare.generateHardRandomNumber();
        boolean harCom = Compare.comparison(hI, hR);

        if (harCom == true) {
            harScore++;
            String display = Compare.format(harScore);
            ((TextView) findViewById(R.id.hardScore)).setText(display);
        }
        else {
            harScore = 0.0;
            String display = Compare.format(harScore);
            ((TextView) findViewById(R.id.hardScore)).setText(display);
        }
    }
}