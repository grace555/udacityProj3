package com.example.android.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    private Button button;
    int answer2_score;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    // Question 2
    EditText question2_answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void openActivity3(View view) {
        int answer1_score = getIntent().getExtras().getInt("score1");// fetch answer from question1
        int the_answer2 = submit2()+answer1_score;
        /*Intent intent = new Intent(this, Main4Activity.class);
        intent.putExtra("score1",the_answer1);
        startActivity(intent);
        */
        //Intent intent1 = new Intent();

        Intent intent2 = new Intent(Main3Activity.this, Main4Activity.class);
        intent2.putExtra("score2",the_answer2);
        startActivity(intent2);
    }

    public int submit2(){
        // Question 2 - Correct Answer is "Vulcanizing"
        //------------------------------------------------------------------------------------------
        String answer2;
        question2_answer = (EditText) this.findViewById(R.id.question2_answer);
        answer2 = question2_answer.getText().toString().toLowerCase();
        if (answer2.equals("vulcanizing")) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }
        return answer2_score;
    }// end methd submit1
}
