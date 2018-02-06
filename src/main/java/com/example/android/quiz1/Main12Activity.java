package com.example.android.quiz1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main12Activity extends AppCompatActivity {
    private Button button;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    // Question 1
    RadioButton question1_choice3;
    // Question 2
    EditText question2_answer;
    // Question 3
    CheckBox question3_choice1;
    CheckBox question2_choice2;
    CheckBox question3_choice3;
    CheckBox question3_choice4;
    // Question 4
    EditText question4_answer;
    // Question 5
    RadioButton question5_choice2;
    // Question 6
    EditText question6_answer;
    // Question 7
    CheckBox question7_choice1;
    CheckBox question7_choice2;
    CheckBox question7_choice3;
    CheckBox question7_choice4;
    // Question 8
    EditText question8_answer;
    // Question 9
    RadioButton question9_choice2;
    // Question 10
    EditText question10_answer;
    String final_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        Intent intent = new Intent();
        int final_score = getIntent().getExtras().getInt("score10");
        int fail_score = 10 - final_score;
        TextView text1 = (TextView)findViewById(R.id.success_score);
        TextView text2 = (TextView)findViewById(R.id.fail_score);
        TextView text3 = (TextView)findViewById(R.id.message);
        String success = String.valueOf(final_score);
        String fail = String.valueOf(fail_score);
        if(final_score <= 5){
            final_message = "Your got "+ final_score+" out of 10";
            final_message += "\n practice mre  to improve yur score!";
        }
        if(final_score >= 6){
            final_message = "Congratulations";
            final_message += "\n Your score is "+final_score;
        }
        text1.setText(success);
        text2.setText(fail);
        text3.setText(final_message);
    }// end method onCreate

    public void home(){
        Intent intent = new Intent(Main12Activity.this, MainActivity.class);
        startActivity(intent);
    }
}
