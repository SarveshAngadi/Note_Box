package com.example.notebox.listeners;

import com.example.notebox.entities.Note;

public interface NoteListener {
    void onNoteClicked(Note note, int position);
}
