package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.courtcounter.model.Team;

public class MainActivity extends AppCompatActivity {

    Team teamA, teamB;

    TextView textViewTeamA;
    TextView textViewTeamB;
    TextView textViewScoreTeamA;
    TextView textViewScoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTeamA = (TextView) findViewById(R.id.textViewTeamA);
        textViewTeamB = (TextView) findViewById(R.id.textViewTeamB);

        textViewScoreTeamA = (TextView) findViewById(R.id.textViewScoreTeamA);
        textViewScoreTeamB = (TextView) findViewById(R.id.textViewScoreTeamB);


        teamA = new Team("SuperTeam");
        teamB = new Team("SpiderTeam");

        textViewTeamA.setText(teamA.getNome().toString());
        textViewTeamB.setText(teamB.getNome().toString());


    }

    public void setPoints(View view) {
        switch (view.getId()) {
            case R.id.buttonTeamAFree:
                teamA.setPontos(1);
                displayTeamA();
                break;
            case R.id.buttonTeamA2:
                teamA.setPontos(2);
                displayTeamA();
                break;
            case R.id.buttonTeamA3:
                teamA.setPontos(3);
                displayTeamA();
                break;
            case R.id.buttonTeamBFree:
                teamB.setPontos(1);
                displayTeamB();
                break;
            case R.id.buttonTeamB2Points:
                teamB.setPontos(2);
                displayTeamB();
                break;
            case R.id.buttonTeamB3Points:
                teamB.setPontos(3);
                displayTeamB();
                break;
            case R.id.buttonReset:
                teamA.resetPontos();
                teamB.resetPontos();
                resetScore();
                break;
        }

    }

    public void displayTeamA() {
        textViewScoreTeamA.setText(String.valueOf(teamA.getPontos()));

    }

    public void displayTeamB() {
        textViewScoreTeamB.setText(String.valueOf(teamB.getPontos()));

    }

    public void resetScore() {
        textViewScoreTeamA.setText("0");
        textViewScoreTeamB.setText("0");
    }
}
