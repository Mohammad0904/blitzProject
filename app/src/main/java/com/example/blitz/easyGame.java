package com.example.blitz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class easyGame extends AppCompatActivity {
    double easeScore = 0.0;
    private Button easyLeaderboardButton;
    Leaderboard easyLeaderboard = new Leaderboard();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_game);

        easyLeaderboardButton = (Button) findViewById(R.id.easyLeaderboardButton);
        easyLeaderboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_easy_Leaderboard();
            }
        });
    }


    public void easyButtonClicked(View v) {
        EditText easyGuess = (EditText) findViewById(R.id.easyGuess);
        String eS = easyGuess.getText().toString();
        EditText easyName = (EditText) findViewById(R.id.easyName);
        String easyNameString = easyName.getText().toString();

        Double eD = Compare.parseDouble(eS);
        int eI = Compare.convertToInt(eD);
        int eR = Compare.generateEasyRandomNumber();
        boolean easyCom = Compare.comparison(eI, eR);

        if (easyCom == true) {
            easeScore++;
            String display = Compare.format(easeScore);
            ((TextView) findViewById(R.id.easyScore)).setText(easyNameString + "'s score: " + display);
            easyLeaderboard.addToLeaderboard((int) easeScore, easyNameString);
        }
        else {
            easeScore = 0.0;
            String display = Compare.format(easeScore);
            ((TextView) findViewById(R.id.easyScore)).setText(easyNameString + "'s score: " + display);
        }
    }

    public void openActivity_easy_Leaderboard() {
        Intent easLeadIntent = new Intent(this, easyLeaderboard.class);
        startActivity(easLeadIntent);
        ((TextView) findViewById(R.id.easy_Leaderboard)).setText(easyLeaderboard.getLeaderboard());
    }
}