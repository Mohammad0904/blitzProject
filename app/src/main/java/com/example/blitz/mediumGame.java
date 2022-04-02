package com.example.blitz;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class mediumGame extends AppCompatActivity {
    double medScore = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium_game);

    }

    public void mediumButtonClicked(View v) {
        EditText mediumGuess = (EditText) findViewById(R.id.mediumGuess);
        String mS = mediumGuess.getText().toString();

        Double mD = Compare.parseDouble(mS);
        int mI = Compare.convertToInt(mD);
        int mR = Compare.generateMediumRandomNumber();
        boolean medCom = Compare.comparison(mI, mR);

        if (medCom == true) {
            medScore++;
            String display = Compare.format(medScore);
            ((TextView) findViewById(R.id.mediumScore)).setText(display);
        }
        else {
            medScore = 0.0;
            String display = Compare.format(medScore);
            ((TextView) findViewById(R.id.mediumScore)).setText(display);
        }
    }

}