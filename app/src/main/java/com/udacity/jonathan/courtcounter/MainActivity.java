package com.udacity.jonathan.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(1);


    }

    public void submitThreePoints(View view) {
         counter =  counter + 3;
        displayForTeamA(counter);

    }

    public void submitTwoPoints(View view) {
        counter = counter +  2;
        displayForTeamA(counter);

    }

    public void submitOnePoint(View view) {
        counter = counter + 1;
        displayForTeamA(counter);
    }



    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


}
