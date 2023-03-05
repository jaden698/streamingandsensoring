package com.example.streamingandsensoring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bopen;
    Button bopen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bopen=findViewById(R.id.button);
        bopen2=findViewById(R.id.button2);
        bopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("xxxx");
                Intent i=getPackageManager().getLaunchIntentForPackage("com.example.testing_cv");
                startActivity(i);
            }
        });
        bopen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=getPackageManager().getLaunchIntentForPackage("github.umer0586");
                startActivity(i);
            }
        });
    }
}