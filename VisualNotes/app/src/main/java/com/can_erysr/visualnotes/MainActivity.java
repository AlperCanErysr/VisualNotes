package com.can_erysr.visualnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;

    private Button btn;

    ArrayList<Notes> notesArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notesArrayList = new ArrayList<>();
        getData();

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

    private void getData(){
        try {
            SQLiteDatabase sqLiteStatement = this.openOrCreateDatabase("Notes",MODE_PRIVATE,null);

            Cursor cursor = sqLiteStatement.rawQuery("SELECT * FROM notes",null);

            int titleIx = cursor.getColumnIndex("title");
            int noteIx = cursor.getColumnIndex("note");
            int idIx = cursor.getColumnIndex("id");

            while (cursor.moveToNext()){
                String title = cursor.getString(titleIx);
                String note = cursor.getString(noteIx);

                int id = cursor.getInt(idIx);

                Notes notes = new Notes(title,note,id);
                notesArrayList.add(notes);
            }
            cursor.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //BUTONA TIKLANDIĞINDA NE OLACAK BAŞKA BİR AKTİVİTEYE GİDECEK -1
    public void openNewNote(){
        Intent intent = new Intent(this,NewNoteActivity.class);
        startActivity(intent);
    }

    public void openNotes(){
        Intent intent = new Intent(this,NoteAdapter.class);
        startActivity(intent);
    }

    public void newnote (View view){

    }
    public void notes (View view){

    }
}