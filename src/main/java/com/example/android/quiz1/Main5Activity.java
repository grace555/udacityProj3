package com.example.android.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main5Activity extends AppCompatActivity {
    // Question 4
    EditText question4_answer;
    int answer4_score;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void openActivity5(View view) {
        int answer3_score = getIntent().getExtras().getInt("score3");// fetch answer from question1
        int the_answer4 = submit4()+answer3_score;

        Intent intent4 = new Intent(Main5Activity.this, Main6Activity.class);
        intent4.putExtra("score4",the_answer4);
        startActivity(intent4);
    }
    public int submit4(){
        // Question 4 - Correct Answer is "Gravity"
        //------------------------------------------------------------------------------------------
        String answer4;
        question4_answer = (EditText) this.findViewById(R.id.question4_answer);
        answer4 = question4_answer.getText().toString().toLowerCase();
        if (answer4.equals("gravity")) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }
        return answer4_score;
    }//end sumbimt4
}
