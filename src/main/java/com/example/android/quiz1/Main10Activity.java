package com.example.android.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Main10Activity extends AppCompatActivity {
    private Button button;
    int answer9_score;
    RadioButton question9_choice2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
    }
    public void openActivity10(View view) {
        int answer8_score = getIntent().getExtras().getInt("score8");// fetch answer from question1
        int the_answer9 = submit9()+answer8_score;

        Intent intent9 = new Intent(Main10Activity.this, Main11Activity.class);
        intent9.putExtra("score9",the_answer9);
        startActivity(intent9);
        /*Intent intent = new Intent(this, Main11Activity.class);
        startActivity(intent);*/
    }
    public int submit9(){
        // Question 9  - Correct Answers is #2 "Stalagmites"
        //------------------------------------------------------------------------------------------
        Boolean answer9;
        question9_choice2 = (RadioButton) this.findViewById(R.id.question9_choice2);
        answer9 = question9_choice2.isChecked();
        if (answer9) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }
        return answer9_score;
    }
    /*@Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }*/
}
