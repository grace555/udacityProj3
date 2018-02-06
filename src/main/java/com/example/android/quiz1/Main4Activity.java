package com.example.android.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Main4Activity extends AppCompatActivity {
    private Button button;
    // Question 3
    CheckBox question3_choice1;
    CheckBox question2_choice2;
    CheckBox question3_choice3;
    CheckBox question3_choice4;
    int answer3_score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

    }
    public void openActivity4(View view) {
        int answer2_score = getIntent().getExtras().getInt("score2");// fetch answer from question1
        int the_answer3 = submit3()+answer2_score;

        Intent intent3 = new Intent(Main4Activity.this, Main5Activity.class);
        intent3.putExtra("score3",the_answer3);
        startActivity(intent3);
    }
    public int submit3(){
        // Question 3  - Correct Answers are #1 (Ribosomes) and #3 (Golgi Apparatus)
        //------------------------------------------------------------------------------------------
        Boolean answer3_choice1;
        Boolean answer3_choice2;
        Boolean answer3_choice3;
        Boolean answer3_choice4;
        question3_choice1 = (CheckBox) this.findViewById(R.id.question3_choice1);
        question2_choice2 = (CheckBox) this.findViewById(R.id.question3_choice2);
        question3_choice3 = (CheckBox) this.findViewById(R.id.question3_choice3);
        question3_choice4 = (CheckBox) this.findViewById(R.id.question3_choice4);
        answer3_choice1 = question3_choice1.isChecked();
        answer3_choice2 = question2_choice2.isChecked();
        answer3_choice3 = question3_choice3.isChecked();
        answer3_choice4 = question3_choice4.isChecked();
        if (answer3_choice1 && !answer3_choice2 && answer3_choice3 && !answer3_choice4) {
            answer3_score = 1;
        } else {
            answer3_score = 0;

        }
        return answer3_score;
    }
}
