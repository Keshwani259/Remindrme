package com.example.myapplication85;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.media.audiofx.AudioEffect;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    DataBase dataBase;
    ArrayList<String> Name ,Description;
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dataBase= new DataBase(this);
        Name = new ArrayList<>()
        ;

        Description = new ArrayList<>();

        displayAllDat();

                                        //cojocojiocjodocjodolcjodcpocjodpc
        adaptetr adaptetr = new adaptetr(this,Name, Description);
        recyclerView = findViewById(R.id.recycelrview);
        recyclerView.setAdapter(adaptetr);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    void displayAllDat(){
        Cursor cuor= dataBase.readall();
        if(dataBase == null){
            Toast.makeText(this, "No ddata", Toast.LENGTH_LONG);

        }
        else{
            while(cuor.moveToNext()){
                Name.add(cuor.getString(0));
                Description.add(cuor.getString(1));

            }
        }}
}
