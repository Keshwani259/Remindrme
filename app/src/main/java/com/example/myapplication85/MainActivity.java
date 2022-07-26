package com.example.myapplication85;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.audiofx.AudioEffect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3,et4;
    Button button;
    DataBase dataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        et1 = findViewById(R.id.editTextTextPersonName);
        et3 = findViewById(R.id.editTextTextPersonName3);

         dataBase= new DataBase(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String d= et1.getText().toString();
                String fd= et3.getText().toString();
                Boolean dd= dataBase.insertData(d, fd);
                if(dd==true){
                    Toast.makeText(MainActivity.this,"jiclkn",Toast.LENGTH_SHORT ).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"jiclkncvdc",Toast.LENGTH_SHORT ).show();


                }
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }

        });



        boolean dddd;

    }





}