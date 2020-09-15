package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b= (Button) findViewById(R.id.hButton);
        e=(EditText) findViewById(R.id.PersonName);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = e.getText().toString();
                sendData(s);


            }
        });
    }

    private void sendData(String s){
        Intent intent = new Intent(this, HelloActivity.class);
        intent.putExtra("PersonName" , s);

        startActivity(intent);
    }
}