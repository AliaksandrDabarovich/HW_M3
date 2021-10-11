package testcases;

import model.Note;
import model.NoteBook;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class SmokeTests {
    @Test(groups = {"Smoke"})
    public void noteEqualsPositiveTest() {
        Note note1 = new Note(1, 222222, "Alex", "Brown");
        Note note2 = new Note(1, 222222, "Alex", "Brown");

        Assert.assertTrue(note1.equals(note2), "Verify that notes are equals");
    }

    @Test (groups = {"Smoke"})
    public void noteBookEqualsPositiveTest() {
        Note note1 = new Note(1, 111111, "Alex", "Brown");
        Note note2 = new Note(2, 222222, "Pavel", "Black");
        Note note3 = new Note(3, 333333, "Ivan", "Red");

        List<Note> notes1 = Arrays.asList(note1, note2, note3);
        List<Note> notes2 = Arrays.asList(note1, note2, note3);

        NoteBook noteBook1 = new NoteBook(notes1);
        NoteBook noteBook2 = new NoteBook(notes2);

        Assert.assertTrue(noteBook1.equals(noteBook2), "Verify that noteBooks are equals");
    }
}
