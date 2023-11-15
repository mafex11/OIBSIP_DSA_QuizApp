package com.example.quiz_app_internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton radioButton1;
    CheckBox startQuizCheckbox;

    Button startbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startQuizCheckbox = findViewById(R.id.startQuizCheckbox);
         startbutton=findViewById(R.id.button_start);
        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startQuizCheckbox.isChecked()) {
                    // start the quiz activity
                    Intent intent = new Intent(MainActivity.this,QuizTimer.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please checkout the condition to start the game", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}