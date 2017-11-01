package com.example.android.university.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.university.R;

public class StudentLoginActivity extends AppCompatActivity {

    EditText std_registration_no,user_password;
    Button login_account,create_new_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        std_registration_no=(EditText) findViewById(R.id.std_registration_no);
        user_password = (EditText) findViewById(R.id.user_password);

        login_account=(Button) findViewById(R.id.login_account);

        create_new_account = (Button) findViewById(R.id.create_new_account);
        create_new_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentLoginActivity.this, StudentRegisterActivity.class);
                startActivity(intent);
            }
        });


    }
}
