package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    void sayHello(View v){
        System.out.println("Hello");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button objButton = (Button) findViewById(R.id.button);
        assert objButton != null;
        objButton.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view) {
               System.out.println("Hello world");
           }
        });
    }


}