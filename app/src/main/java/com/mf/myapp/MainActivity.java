package com.mf.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView create;
    LinearLayout account , pass,email;
    Button company , student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        company =findViewById(R.id.company);
        email =findViewById(R.id.email);
        student =findViewById(R.id.student);
        pass =findViewById(R.id.pass);
        account = findViewById(R.id.x);

        create =findViewById(R.id.creat);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                email.setVisibility(View.GONE);
                pass.setVisibility(View.GONE);
                account.setVisibility(View.VISIBLE);
            }
        });
        company.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Student.class);
                startActivity(intent);
            }
        });
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Student =new Intent(MainActivity.this, Company.class);
                startActivity(Student);
            }
        });

    }
}
