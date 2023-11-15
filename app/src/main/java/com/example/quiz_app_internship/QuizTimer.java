package com.example.quiz_app_internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;


public class QuizTimer extends AppCompatActivity {

        private CountDownTimer timer;
      private String[] questions ={"IS DSA IS NECESSARY FOR PROGRAMMING?","Linked List is a part of which subject?","Which is the fastest language among the all?","Which of the following is not an inplace Algorithm?","DSA FULL FORM?"};
//    private  String[]  question1_option={"temp","temp","temp","temp","temp"};  //this will never be executed bcz our its options are in the xml file already
    private  String[]  question2_option={"temp","Maths","C++","Merge_sort","Data Structures & Algorithm"};
    private  String[]  question3_option={"temp","Chemistry","C","Quick_sort","Data Structures"};
    private  String[]  question4_option={"temp","Physics","Python","Selection_sort","Structure Data"};
    private  String[]  question5_option={"temp","Data Structure","Java","None of the Above","None of the Above"};

    private  int[]  answers={1,4,1,1,1};
    private  static  int score=0;
    android.widget.Button btn1;
    android.widget.Button btn2;
    android.widget.Button btn3;
    android.widget.Button btn4;
    TextView question;
    TextView attempt_question1;
    int index1=1;  //this is used to display on the user screen  total question attempted


    private int index=0;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_quiz_timer);
            HashMap<String, Integer> hashMap = new HashMap<>();
            // Add key-value pairs to the HashMap
            for (int i=0;i<questions.length;i++)
            {
                hashMap.put(questions[i], answers[i]);
            }
            Log.d("hii","Found"+hashMap);
            btn1=findViewById(R.id.option1);
            question=findViewById(R.id.question);
            btn2=findViewById(R.id.option2);
            btn3=findViewById(R.id.option3);
            btn4=findViewById(R.id.option4);
            attempt_question1=findViewById(R.id.attempt_question);
            btn1.setOnClickListener(new android.view.View.OnClickListener()
            {
                @Override
                public void onClick(android.view.View v) {
                    if(index<=questions.length-1)
                    //while the array is not going out of bounds
                    {
                        if (1==hashMap.get(questions[index]))
                        {
                            Log.d("hello" ,"done alright");
                            score++;
//                            android.widget.Toast.makeText(QuizTimer.this, "Your score is: "+ score, android.widget.Toast.LENGTH_SHORT).show();
                        }
                        //go to the next question
                        index++;
                        index1++;

                        if(index<=questions.length-1)
                        {
                            attempt_question1.setText("Question : "+(index1)+"/"+questions.length);
                            question.setText(questions[index]);
                            btn1.setText(question2_option[index]);
                            btn2.setText(question3_option[index]);
                            btn3.setText(question4_option[index]);
                            btn4.setText(question5_option[index]);
                        }
                        else
                        {
                            Intent it=new Intent(QuizTimer.this,testing.class);
                            it.putExtra("score1",score);
                            it.putExtra("total_length1",questions.length);
                            startActivity(it);
//                            android.widget.Toast.makeText(QuizTimer.this, "Your score is: "+ score + "/" + questions.length, android.widget.Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        android.widget.Toast.makeText(QuizTimer.this, "Please restart the game to continue..", android.widget.Toast.LENGTH_SHORT).show();
                    }
                }
            });

            btn2.setOnClickListener(new android.view.View.OnClickListener()
            {
                @Override
                public void onClick(android.view.View v) {
                    if(index<=questions.length-1)
                    //while the array is not going out of bounds
                    {
                        if (2==hashMap.get(questions[index]))
                        {
                            Log.d("hello","Inside if");
                            score++;
//                            android.widget.Toast.makeText(QuizTimer.this, "Your score is: "+ score, android.widget.Toast.LENGTH_SHORT).show();
                        }
                        Log.d("hello","Not Inside if");
                        index++;
                        index1++;

                        if(index<=questions.length-1)
                        {
                            attempt_question1.setText("Question : "+(index1)+"/"+questions.length);
                            question.setText(questions[index]);
                            btn1.setText(question2_option[index]);
                            btn2.setText(question3_option[index]);
                            btn3.setText(question4_option[index]);
                            btn4.setText(question5_option[index]);
                        }
                        else
                        {
                            Intent it=new Intent(QuizTimer.this,testing.class);
                            it.putExtra("score1",score);
                            it.putExtra("total_length1",questions.length);
                            startActivity(it);
//                            android.widget.Toast.makeText(QuizTimer.this, "Your score is: "+ score, android.widget.Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        android.widget.Toast.makeText(QuizTimer.this, "Please restart the game to continue..", android.widget.Toast.LENGTH_SHORT).show();
                    }
                }
            });
            btn3.setOnClickListener(new android.view.View.OnClickListener()
            {
                @Override
                public void onClick(android.view.View v) {
                    if(index<=questions.length-1)
                    //while the array is not going out of bounds
                    {
                        if (3==hashMap.get(questions[index]))
                        {
                            score++;
//                            android.widget.Toast.makeText(QuizTimer.this, "Your score is: "+ score, android.widget.Toast.LENGTH_SHORT).show();
                        }
                        index++;
                        index1++;

                        if(index<=questions.length-1)
                        {
                            attempt_question1.setText("Question : "+(index1)+"/"+questions.length);
                            question.setText(questions[index]);
                            btn1.setText(question2_option[index]);
                            btn2.setText(question3_option[index]);
                            btn3.setText(question4_option[index]);
                            btn4.setText(question5_option[index]);
                        }
                        else
                        {
                            Intent it=new Intent(QuizTimer.this,testing.class);
                            it.putExtra("score1",score);
                            it.putExtra("total_length1",questions.length);
                            startActivity(it);
//                            android.widget.Toast.makeText(QuizTimer.this, "Your score is: "+ score, android.widget.Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        android.widget.Toast.makeText(QuizTimer.this, "Please restart the game to continue..", android.widget.Toast.LENGTH_SHORT).show();
                    }
                }
            });
            btn4.setOnClickListener(new android.view.View.OnClickListener()
            {
                @Override
                public void onClick(android.view.View v) {
                    if(index<=questions.length-1)
                    //while the array is not going out of bounds
                    {
                        if (4==hashMap.get(questions[index]))
                        {
                            score++;
//                            android.widget.Toast.makeText(QuizTimer.this, "Your score is: "+ score, android.widget.Toast.LENGTH_SHORT).show();
                        }
                        index++;
                        index1++;

                        if(index<=questions.length-1)
                        {
                            attempt_question1.setText("Question : "+(index1)+"/"+questions.length);
                            question.setText(questions[index]);
                            btn1.setText(question2_option[index]);
                            btn2.setText(question3_option[index]);
                            btn3.setText(question4_option[index]);
                            btn4.setText(question5_option[index]);
                        }
                        else
                        {
                            Intent it=new Intent(QuizTimer.this,testing.class);
                            it.putExtra("score1",score);
                            it.putExtra("total_length1",questions.length);
                            startActivity(it);
//                            android.widget.Toast.makeText(QuizTimer.this, "Your score is: "+ score, android.widget.Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        android.widget.Toast.makeText(QuizTimer.this, "Please restart the game to continue..", android.widget.Toast.LENGTH_SHORT).show();
                    }
                }
            });
            // Start the timer with a 60-second countdown
            timer = new CountDownTimer(60000, 1000) {
                public void onTick(long millisUntilFinished) {
                    // Update the countdown timer UI element
                    TextView countdownTextView = findViewById(R.id.count_timer);
                    countdownTextView.setText("Time left: " + millisUntilFinished / 1000 + " seconds");
                }

                public void onFinish() {
                    // Trigger the quiz finish callback when the time is up
                    finishQuiz();
                }
            }.start();
        }

        private void finishQuiz() {

            Intent it=new Intent(QuizTimer.this,testing.class);
            it.putExtra("Time_up",-1);
            it.putExtra("score1",score);
            it.putExtra("total_length1",questions.length);
            Log.d("score","score is : "+score);
            startActivity(it);

        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            // Cancel the timer when the activity is destroyed
            if (timer != null) {
                timer.cancel();
            }
        }
    }
