package com.varshayadv.quizeapp;

import android.widget.CheckBox;
import android.widget.TextView;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.CheckBox;
        import android.widget.TextView;

        import static android.R.attr.checkBoxPreferenceStyle;
        import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {
    CheckBox eightFiveSix,eightFiveZero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void TheAnswer(View View){


        eightFiveSix=(CheckBox) findViewById(R.id.first_question_option1);
        boolean haseightFiveSix=eightFiveSix.isChecked();

        eightFiveZero=(CheckBox) findViewById(R.id.first_question_option2);
        boolean haseightFiveZero=eightFiveZero.isChecked();


        if (eightFiveSix.isChecked()) {
            eightFiveZero.setChecked(false);
        }
        if(eightFiveZero.isChecked()){
            eightFiveSix.setChecked(false);
        }
        String ansMsg=andAnswer(haseightFiveSix,haseightFiveZero);
        firstQuestion(ansMsg);
    }
    private String andAnswer(boolean aEightFiveSix , boolean aEightFiveZero ){
        String msg="";
        if((aEightFiveSix)) {
            msg = "wrong" ;
        }
        if((aEightFiveZero)){
            msg="Right";
        }
        return msg;
    }

    private void firstQuestion(String ans){
        TextView firstQuestionTextView = (TextView) findViewById(R.id.first_question);
        firstQuestionTextView.setText(ans);
    }

}

