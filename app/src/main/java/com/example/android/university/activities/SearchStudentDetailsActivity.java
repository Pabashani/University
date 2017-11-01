package com.example.android.university.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.university.R;

public class SearchStudentDetailsActivity extends AppCompatActivity {


    Button btn_edit_details,search_btn;
    TextView std_mento_name,std_dep_name,std_faculty_name,std_exp_date,std_reg_date,std_name,std_reg_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_student_details);

        btn_edit_details = (Button) findViewById(R.id.btn_edit_details);
        btn_edit_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchStudentDetailsActivity.this, StudentRegisterActivity.class);
                startActivity(intent);
            }
        });

        search_btn =(Button) findViewById(R.id.search_btn);
        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        std_name = (TextView) findViewById(R.id.std_name);
        std_dep_name = (TextView) findViewById(R.id.std_dep_name);
        std_reg_no = (TextView) findViewById(R.id.std_reg_no);
        std_mento_name = (TextView) findViewById(R.id.std_mento_name);
        std_faculty_name = (TextView) findViewById(R.id.std_faculty_name);
        std_exp_date = (TextView) findViewById(R.id.std_exp_date);
        std_reg_date = (TextView) findViewById(R.id.std_reg_date);
    }
}
