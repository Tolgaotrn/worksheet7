import org.example.Note;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoteTest {
    @Test
    public void numStudentCheck() {
        Note note = new Note(1, 10);
        assertEquals(1, note.getNumStudent());
    }
    @Test
    public void markCheck() {
        Note note = new Note(1,12.5);
        assertEquals(12.5, note.getMark());
    }
}
