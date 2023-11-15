package com.example.quiz_app_internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class testing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);
        TextView marks=findViewById(R.id.marks);
        TextView regards=findViewById(R.id.regards);
        ImageView image=findViewById(R.id.imageView);
        TextView time_up=findViewById(R.id.time_up);

        Intent it= getIntent();

        int SCORE=it.getIntExtra("score1",0);
        int TOTALLENGTH=it.getIntExtra("total_length1",5);
        int time_out=it.getIntExtra("Time_up",-2);

        marks.setText("You have scored :"+ SCORE+"/"+TOTALLENGTH);
//        String score=SCORE.parseInt(SCORE);
//         String score = Integer.toString(SCORE);
//        Log.d("checking","find"+score);
        if (time_out==-1)
        {
            time_up.setText("OOps! Time Up");
        }
        if (SCORE>2)
        {
            regards.setText("Congratulation! You have passed the Contest.");

            image.setImageResource(R.drawable.passed_img);
        }
        else
        {
            regards.setText("Soory!.. You Are Failed ");
            image.setImageResource(R.drawable.failed_img);
        }

    }
}