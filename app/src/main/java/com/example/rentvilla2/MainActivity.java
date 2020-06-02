package com.example.rentvilla2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttona,buttonb;
        buttona=findViewById(R.id.signinbutton1);
        buttona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        buttonb=findViewById(R.id.loginbutton);
        buttonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }

    public void openActivity2(){
        Intent intent=new Intent(this, signIn.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent=new Intent(this, drawerhome.class);
        startActivity(intent);
    }

}
