package com.example.blitz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button beginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        beginButton = (Button) findViewById(R.id.beginButton);
        beginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                        openactivity_main2();

        }});


    }

    public void openactivity_main2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}