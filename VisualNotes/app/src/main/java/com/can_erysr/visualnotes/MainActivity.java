package com.can_erysr.visualnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.newnote);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewNote();
            }
        });
    }

    public void openNewNote(){
        Intent intent = new Intent(this,NewNoteActivity.class);
        startActivity(intent);
    }

    public void newnote (View view){

    }
    public void notes (View view){

    }
}