package com.example.android.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main9Activity extends AppCompatActivity {
    private Button button;
    int answer8_score;
    EditText question8_answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }
    public void openActivity9(View view) {
        int answer7_score = getIntent().getExtras().getInt("score7");// fetch answer from question1
        int the_answer8 = submit8()+answer7_score;

        Intent intent8 = new Intent(Main9Activity.this, Main10Activity.class);
        intent8.putExtra("score8",the_answer8);
        startActivity(intent8);
        /*Intent intent = new Intent(this, Main10Activity.class);
        startActivity(intent);*/
    }
    public int submit8(){
        // Question 8 - Correct Answer is "Wrist"
        //------------------------------------------------------------------------------------------
        String answer8;
        question8_answer = (EditText) this.findViewById(R.id.question8_answer);
        answer8 = question8_answer.getText().toString().toLowerCase();
        if (answer8.equals("wrist")) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }
        return answer8_score;
    }
}
