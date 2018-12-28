package com.elites.android.basketcounter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int initScore = 0, finalScoreTA = 0, finalScoreTB = 0, pts3 = 3, pts2 = 2, pt1 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }
    // game over action method
    public void gameOverAction(int score){
        TextView tvScoreTA = (TextView) findViewById(R.id.teamAScore);
        tvScoreTA.setText("" +score);
        TextView tvScoreTB = (TextView) findViewById(R.id.teamBScore);
        tvScoreTB.setText("" +score);
    }

    // display score Team A
    public void displayScoreTA(int score){
        TextView tvScoreTA = (TextView) findViewById(R.id.teamAScore);
        tvScoreTA.setText("" +score);
    }

    // display score Team B
    public void displayScoreTB(int score){
        TextView tvScoreTB = (TextView) findViewById(R.id.teamBScore);
        tvScoreTB.setText("" +score);
    }

    // game over method
    public void gameOver(View view){
        gameOverAction(initScore);
        finalScoreTA = initScore;
        finalScoreTB = initScore;
    }

    public int increase3TA(){
        finalScoreTA += pts3;
        return finalScoreTA;
    }

    public int increase2TA(){
        finalScoreTA += pts2;
        return finalScoreTA;
    }

    public int increase1TA(){
        finalScoreTA += pt1;
        return finalScoreTA;
    }

    public int increase3TB(){
        finalScoreTB += pts3;
        return finalScoreTB;
    }

    public int increase2TB(){
        finalScoreTB += pts2;
        return finalScoreTB;
    }

    public int increase1TB(){
        finalScoreTB += pt1;
        return finalScoreTB;
    }

    // increase by 3 points method
    public void add3pointsTA(View view){
        // increase by 3 points
        int score3 = increase3TA();
        displayScoreTA(score3);
    }

    // increase by 2 points method
    public void add2pointsTA(View view){
        // increase by 2 points
        int score2 = increase2TA();
        displayScoreTA(score2);
    }

    // increase by 2 points method
    public void add1pointTA(View view){
        // increase by 1 point
        int score1 = increase1TA();
        displayScoreTA(score1);
    }

    // increase by 3 points method
    public void add3pointsTB(View view){
        // increase by 3 points
        int score3 = increase3TB();
        displayScoreTB(score3);
    }

    // increase by 2 points method
    public void add2pointsTB(View view){
        // increase by 2 points
        int score2 = increase2TB();
        displayScoreTB(score2);
    }

    // increase by 2 points method
    public void add1pointTB(View view){
        // increase by 1 point
        int score1 = increase1TB();
        displayScoreTB(score1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
