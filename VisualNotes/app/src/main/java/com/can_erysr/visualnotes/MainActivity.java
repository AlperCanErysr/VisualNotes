package com.can_erysr.visualnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BUTONA TIKLANDIĞINDA NE OLACAK -1
        button = (Button) findViewById(R.id.newnote);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewNote();
            }
        });

        button2 = (Button) findViewById(R.id.notesButton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotes();
            }
        });
    }
    //BUTONA TIKLANDIĞINDA NE OLACAK BAŞKA BİR AKTİVİTEYE GİDECEK -1
    public void openNewNote(){
        Intent intent = new Intent(this,NewNoteActivity.class);
        startActivity(intent);
    }

    public void openNotes(){
        Intent intent = new Intent(this,Notes.class);
        startActivity(intent);
    }

    public void newnote (View view){

    }
    public void notes (View view){

    }
}