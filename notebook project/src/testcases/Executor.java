package testcases;

import model.Note;
import model.NoteBook;
import model.NoteBookConsoleView;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    public static void main(String[] args) {
        // Class for verifying code.
        // TODO Will be deleted

        List<Note> notes = new ArrayList<>();
        Note note1 = new Note(1, 111, "T", "TT");
        Note note2 = new Note(2, 222, "A", "AA");
        Note note3 = new Note(3, 333, "V", "VV");
        Note note4 = new Note(4, 444, "C", "CC");
        notes.add(note1);
        notes.add(note2);
        notes.add(note3);
        notes.add(note4);
        NoteBook noteBook = new NoteBook(notes);
        NoteBookConsoleView noteBookProvider = new NoteBookConsoleView();
        noteBookProvider.print(noteBook);
    }
}
