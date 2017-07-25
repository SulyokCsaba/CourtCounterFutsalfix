package com.example.android.courtcounterfutsal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Goal counters
    public int goalA=0;
    public int goalB=0;

    //Foul counters
    public int foulA=0;
    public int foulB=0;

    //Penalty count after 5 fouls
    public int penaltyA=0;
    public int penaltyB=0;

    //A team point incrementer
    public void goal_a(View v){
        goalA=goalA+1;
        displayForTeamA(goalA);
    }

    //B team point incrementer
    public void goal_b(View v){
        goalB=goalB+1;
        displayForTeamB(goalB);
    }

    //Incrementer for fouls and after 5 fouls increment penalties for A team
    public void foul_a(View v){
        if(foulA>=5){
            penaltyA=penaltyA+1;
            String penaltyCountA="Enemy's Penalty!\nNo.: " + penaltyA;
            displayFoulsTeamA(penaltyCountA);
        }
        else{ foulA++ ;
        displayFoulTeamA(foulA);}
    }


    //Incrementer for fouls and after 5 fouls increment penalties for B team
    public void foul_b(View v){
        if(foulB>=5){
            penaltyB=penaltyB+1;
            String penaltyCountB="Enemy's Penalty!\nNo.: " + penaltyB;
           displayFoulsTeamB(penaltyCountB);

        }
        else {foulB++ ;
        displayFoulTeamB(foulB);}
    }

    //Reset all data
    public void resettingAll(View v){
        goalA=0;
        goalB=0;
        foulA=0;
        foulB=0;
        penaltyA=0;
        penaltyB=0;
        displayForTeamA(goalA);
        displayForTeamB(goalB);
        displayFoulTeamA(foulA);
        displayFoulTeamB(foulB);
    }

    // Displays
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulsTeamA(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsTeamB(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}