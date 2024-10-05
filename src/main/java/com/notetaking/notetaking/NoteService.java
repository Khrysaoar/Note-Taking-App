package com.notetaking.notetaking;

import com.notetaking.notetaking.exception.NoteNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteService {
    private final List<Note> notes = new ArrayList<>();
    private static Long currentId = 1L;

    public Note createNote(Note note) {
        note.setId(currentId++);
        notes.add(note);
        return note;
    }

    public List<Note> getAllNotes() {
        return notes;
    }

    public Note getNoteById(Long id) {
        return notes.stream()
                .filter(note -> note.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new NoteNotFoundException(id)); // Throw custom exception
    }

    public Note updateNote(Long id, Note noteDetails) {
        Note note = getNoteById(id); // This will throw if not found
        note.setTitle(noteDetails.getTitle());
        note.setBody(noteDetails.getBody());
        return note;
    }

    public boolean deleteNote(Long id) {
        return notes.removeIf(note -> note.getId().equals(id));
    }
}
