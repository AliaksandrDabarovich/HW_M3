package model;

public class NoteBookProvider {
    private static NoteBookProvider instance;
    private NoteBook noteBook;

    private NoteBookProvider(NoteBook noteBook) {
        this.noteBook = noteBook;
    };

    public static NoteBookProvider getInstance(NoteBook noteBook) {
        if(instance == null) {
            instance = new NoteBookProvider(noteBook);
        }
        return instance;
    }

}
