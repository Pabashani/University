package com.example.android.university.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.university.R;

public class StudentRegisterActivity extends AppCompatActivity {

    EditText password_new;
    EditText password_new_retype;
    EditText std_registration_no;
    Button btn_confirm_details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        password_new = (EditText) findViewById(R.id.password_new);
        password_new_retype = (EditText) findViewById(R.id.password_new_retype);
        std_registration_no = (EditText) findViewById(R.id.std_registration_no);
        btn_confirm_details=(Button) findViewById(R.id.btn_confirm_details);
        btn_confirm_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
