package com.example.blitz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class mediumGame extends AppCompatActivity {
    double medScore = 0.0;
    private Button mediumLeaderboardButton;
    Leaderboard mediumLeaderboard = new Leaderboard();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium_game);

        mediumLeaderboardButton = (Button) findViewById(R.id.mediumLeaderboardButton);
        mediumLeaderboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_medium_Leaderboard();
            }
        });

    }

    public void mediumButtonClicked(View v) {
        EditText mediumGuess = (EditText) findViewById(R.id.mediumGuess);
        String mS = mediumGuess.getText().toString();
        EditText mediumName = (EditText) findViewById(R.id.mediumName);
        String mediumNameString = mediumName.getText().toString();

        Double mD = Compare.parseDouble(mS);
        int mI = Compare.convertToInt(mD);
        int mR = Compare.generateMediumRandomNumber();
        boolean medCom = Compare.comparison(mI, mR);

        if (medCom == true) {
            medScore++;
            String display = Compare.format(medScore);
            ((TextView) findViewById(R.id.mediumScore)).setText(mediumNameString + "'s score: " + display);
            mediumLeaderboard.addToLeaderboard((int) medScore, mediumNameString);
        }
        else {
            medScore = 0.0;
            String display = Compare.format(medScore);
            ((TextView) findViewById(R.id.mediumScore)).setText(mediumNameString + "'s score: " + display);
        }
    }

    public void openActivity_medium_Leaderboard() {
        Intent medLeadIntent = new Intent (this, mediumLeaderboard.class);
        startActivity(medLeadIntent);
        ((TextView) findViewById(R.id.medium_Leaderboard)).setText(mediumLeaderboard.getLeaderboard());
    }

}