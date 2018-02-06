package com.example.android.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Main6Activity extends AppCompatActivity {
    private Button button;
    int answer5_score;
    RadioButton question5_choice2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
    public void openActivity6(View view) {
        int answer4_score = getIntent().getExtras().getInt("score4");// fetch answer from question1
        int the_answer5 = submit5()+answer4_score;

        Intent intent5 = new Intent(Main6Activity.this, Main7Activity.class);
        intent5.putExtra("score5",the_answer5);
        startActivity(intent5);
        /*Intent intent = new Intent(this, Main7Activity.class);
        startActivity(intent);*/
    }

    public int submit5(){
        // Question 5  - Correct Answers is #2 "Pine trees"
        //------------------------------------------------------------------------------------------
        Boolean answer5;
        question5_choice2 = (RadioButton) this.findViewById(R.id.question5_choice2);
        answer5 = question5_choice2.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }
        return answer5_score;
    }// end method submit5
}
