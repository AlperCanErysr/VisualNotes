package com.can_erysr.visualnotes;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.can_erysr.visualnotes.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteHolder>{

    ArrayList<Notes> notesArrayList;

    public NoteAdapter(ArrayList<Notes> notesArrayList){
        this.notesArrayList = notesArrayList;
    }

    @NonNull
    @Override
    public NoteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NoteHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return notesArrayList.size();
    }

    public class NoteHolder extends RecyclerView.ViewHolder{
        private RecyclerRowBinding binding;

        public NoteHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
