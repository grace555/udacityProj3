package com.example.android.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Main7Activity extends AppCompatActivity {
    private Button button;
    int answer6_score;
    RadioButton question6_choice2;
    EditText question6_answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    public void openActivity7(View view) {
        int answer5_score = getIntent().getExtras().getInt("score5");// fetch answer from question1
        int the_answer6 = submit6()+answer5_score;

        Intent intent6 = new Intent(Main7Activity.this, Main8Activity.class);
        intent6.putExtra("score6",the_answer6);
        startActivity(intent6);
        /*Intent intent = new Intent(this, Main8Activity.class);
        startActivity(intent);*/
    }
    public int submit6(){
        // Question 6 - Correct Answer is "Clouds" or "Cloud"
        //------------------------------------------------------------------------------------------
        String answer6;
        question6_answer = (EditText) this.findViewById(R.id.question6_answer);
        answer6 = question6_answer.getText().toString().toLowerCase();
        if (answer6.equals("clouds") || answer6.equals("cloud")) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }
        return answer6_score;
    }
}
