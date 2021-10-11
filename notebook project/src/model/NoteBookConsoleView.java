package model;

import java.util.List;

public class NoteBookConsoleView {
    public void print (Note note) {
        System.out.println(note.toString());
    }

    public void print (Note ... notes) {
        for (Note note : notes) {
            System.out.println(note.toString());
        }
    }

    public void print(NoteBook noteBook) {
        System.out.println(noteBook);
    }
}
