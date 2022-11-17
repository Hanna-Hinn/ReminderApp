package com.example.firstactivityquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button addBtn;
    private EditText inputTxt;
    private Spinner todoTasks;
    private Switch doneSwitch;
    private TextView feedbackTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        extractVar();

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String task = inputTxt.getText().toString();

                if(doneSwitch.isChecked()){
                    feedbackTxt.setText(feedbackTxt.getText() + task + "!!!/n");
                }else{
                    feedbackTxt.setText(feedbackTxt.getText() + task +"/n");
                }
            }
        });

    }

    private void extractVar () {
        addBtn = findViewById(R.id.addBtn);
        inputTxt = findViewById(R.id.inputTxt);
        todoTasks = findViewById(R.id.todoTasks);
        doneSwitch = findViewById(R.id.doneSwitch);
        feedbackTxt = findViewById(R.id.feedbackTxt);
    }
}