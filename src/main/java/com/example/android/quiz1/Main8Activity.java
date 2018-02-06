package com.example.android.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Main8Activity extends AppCompatActivity {
    private Button button;
    int answer7_score;
    CheckBox question7_choice1;
    CheckBox question7_choice2;
    CheckBox question7_choice3;
    CheckBox question7_choice4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }
    public void openActivity8(View view) {
        int answer6_score = getIntent().getExtras().getInt("score6");// fetch answer from question1
        int the_answer7 = submit7()+answer6_score;

        Intent intent7 = new Intent(Main8Activity.this, Main9Activity.class);
        intent7.putExtra("score7",the_answer7);
        startActivity(intent7);
        /*Intent intent = new Intent(this, Main9Activity.class);
        startActivity(intent);*/
    }

    public int submit7(){
        Boolean answer7_choice1;
        Boolean answer7_choice2;
        Boolean answer7_choice3;
        Boolean answer7_choice4;
        question7_choice1 = (CheckBox) this.findViewById(R.id.question7_choice1);
        question7_choice2 = (CheckBox) this.findViewById(R.id.question7_choice2);
        question7_choice3 = (CheckBox) this.findViewById(R.id.question7_choice3);
        question7_choice4 = (CheckBox) this.findViewById(R.id.question7_choice4);
        answer7_choice1 = question7_choice1.isChecked();
        answer7_choice2 = question7_choice2.isChecked();
        answer7_choice3 = question7_choice3.isChecked();
        answer7_choice4 = question7_choice4.isChecked();
        if (!answer7_choice1 && !answer7_choice2 && answer7_choice3 && answer7_choice4) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }
        return answer7_score;
    }
}
