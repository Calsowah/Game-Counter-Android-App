package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int currentScoreA;
    int currentScoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(currentScoreA);
        displayForTeamB(currentScoreB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increases score for A by 2.
     */
    public void incrementAby2(View view){
        currentScoreA = currentScoreA + 2;
        displayForTeamA(currentScoreA);
    }

    /**
     * Increases score for A by 3.
     */
    public void incrementAby3(View view){
        currentScoreA = currentScoreA + 3;
        displayForTeamA(currentScoreA);
    }

    public void incrementAby1(View view){
        currentScoreA=currentScoreA+1;
        displayForTeamA(currentScoreA);
    }

    /**
     * Increases score for B by 2.
     */
    public void incrementBby2(View view){
        currentScoreB = currentScoreB + 2;
        displayForTeamB(currentScoreB);
    }

    /**
     * Increases score for B by 3.
     */
    public void incrementBby3(View view){
        currentScoreB = currentScoreB + 3;
        displayForTeamB(currentScoreB);
    }

    public void incrementBby1(View view){
        currentScoreB=currentScoreB+1;
        displayForTeamB(currentScoreB);
    }

    public void reset (View view){
        currentScoreA = 0;
        currentScoreB = 0;
        displayForTeamA(currentScoreA);
        displayForTeamB(currentScoreB);
    }
}
