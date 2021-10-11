package model;

import java.util.List;

public class NoteBook {
    private List<Note> notes;

    public NoteBook(List<Note> notes) {
        this.notes = notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public List<Note> getNotes() {
        return notes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj == null || (this.getClass() != obj.getClass())) {
            return false;
        }
        NoteBook noteBook = (NoteBook) obj;
        return (noteBook.notes == notes || ((notes != null) && notes.equals(noteBook.getNotes())));
    }

    @Override
    public int hashCode() {
        return notes.hashCode();
    }

    @Override
    public String toString() {
        return notes.toString();
    }
}
