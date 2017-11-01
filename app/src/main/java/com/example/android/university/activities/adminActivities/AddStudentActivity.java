package com.example.android.university.activities.adminActivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.android.university.R;

public class AddStudentActivity extends AppCompatActivity {

    EditText std_fullname_initials ,std_fullname ,std_reg_no  ;
    DatePicker std_dob;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
    }
}
