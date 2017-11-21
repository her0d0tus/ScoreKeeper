package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    int scoreTeamB = 0;

    int foulTeamA = 0;

    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayFoulsForTeamA(foulTeamA);
        displayFoulsForTeamB(foulTeamB);
    }

    /**
     * This method adds 1 point to Team A's score.
     */
    public void addOneGoalForTeamA(View view) {
        scoreTeamA += 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * This method adds 1 point to Team B's score.
     */
    public void addOneGoalForTeamB(View view) {
        scoreTeamB += 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * This method adds 1 to Team A's fouls.
     */
    public void addOneFoulForTeamA(View view) {
        foulTeamA += 1;
        displayFoulsForTeamA(foulTeamA);
    }

    /**
     * This method adds 1 to Team B's fouls.
     */
    public void addOneFoulForTeamB(View view) {
        foulTeamB += 1;
        displayFoulsForTeamB(foulTeamB);
    }

    /**
     * Display score for Team B
     *
     * @param score
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display fouls for Team A
     *
     * @param fouls
     */
    public void displayFoulsForTeamA(int fouls) {
        TextView foulsView = findViewById(R.id.team_a_foul);
        foulsView.setText(String.valueOf(fouls));
    }

    /**
     * Display fouls for Team B
     *
     * @param fouls
     */
    public void displayFoulsForTeamB(int fouls) {
        TextView foulsView = findViewById(R.id.team_b_foul);
        foulsView.setText(String.valueOf(fouls));
    }

    /**
     * Display score for Team A
     *
     * @param score
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method sets the global variables that hold the scores of Team A and Team B to 0 and
     * displays that to the screen.
     */
    public void resetScoreAndFouls(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;

        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayFoulsForTeamA(foulTeamA);
        displayFoulsForTeamB(foulTeamB);
    }
}
