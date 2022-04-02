package com.example.blitz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class hardGame extends AppCompatActivity {
    double harScore = 0.0;
    private Button hardLeaderboardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_game);

        hardLeaderboardButton = (Button) findViewById(R.id.hardLeaderboardButton);
        hardLeaderboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_hard_Leaderboard();
            }
        });

    }
    public void hardButtonClicked(View v) {
        EditText hardGuess = (EditText) findViewById(R.id.hardGuess);
        String hS = hardGuess.getText().toString();
        EditText hardName = (EditText) findViewById(R.id.hardName);
        String hardNameString = hardName.getText().toString();

        Double hD = Compare.parseDouble(hS);
        int hI = Compare.convertToInt(hD);
        int hR = Compare.generateHardRandomNumber();
        boolean harCom = Compare.comparison(hI, hR);

        if (harCom == true) {
            harScore++;
            String display = Compare.format(harScore);
            ((TextView) findViewById(R.id.hardScore)).setText(hardNameString + "'s score: " + display);
        }
        else {
            harScore = 0.0;
            String display = Compare.format(harScore);
            ((TextView) findViewById(R.id.hardScore)).setText(hardNameString + "'s score: " + display);
        }
    }

    public void openActivity_hard_Leaderboard() {
        Intent hardLeadIntent = new Intent(this, hardLeaderboard.class);
        startActivity(hardLeadIntent);
    }
}