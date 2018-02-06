package com.example.android.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main11Activity extends AppCompatActivity {
    private Button button;
    int answer10_score;
    EditText question10_answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        Button btn1 = (Button)findViewById(R.id.submit_answers);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                submit();
            }
        });
    }

    public void submit(){
        int answer9_score = getIntent().getExtras().getInt("score9");// fetch answer from question1
        int the_answer10 = submit10()+answer9_score;

        Intent intent10 = new Intent(Main11Activity.this, Main12Activity.class);
        intent10.putExtra("score10",the_answer10);
        startActivity(intent10);
        /*Intent intent1 = new Intent(this, Main12Activity.class);
        startActivity(intent1);*/
    }// end method

    public int submit10(){
        // Question 10 - Correct Answer is "Smelting"
        //------------------------------------------------------------------------------------------
        String answer10;
        question10_answer = (EditText) this.findViewById(R.id.question10_answer);
        answer10 = question10_answer.getText().toString().toLowerCase();
        if (answer10.equals("smelting")) {
            answer10_score = 1;
        } else {
            answer10_score = 0;
        }
        return answer10_score;
    }

}
