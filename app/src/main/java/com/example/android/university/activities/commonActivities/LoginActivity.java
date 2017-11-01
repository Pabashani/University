package com.example.android.university.activities.commonActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.android.university.R;
import com.example.android.university.activities.studentActivities.StudentLoginActivity;

public class LoginActivity extends AppCompatActivity {

    Button btn_administrator,btn_lecturer,btn_student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_administrator =(Button)findViewById(R.id.btn_administrator);
        btn_administrator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent(LoginActivity.this, .class);
//                startActivity(i);

            }
        });
        btn_lecturer = (Button)findViewById(R.id.btn_lecturer);
        btn_student = (Button)findViewById(R.id.btn_student);
        btn_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, StudentLoginActivity.class);
                 startActivity(intent);
            }
        });
    }
}
