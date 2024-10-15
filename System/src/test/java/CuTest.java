import org.example.CU;
import org.example.Note;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CuTest {
    @Test
    public void insertingCuTest() {
        Note note = new Note(12,5);
        CU cu = new CU("CU1", 10);
        cu.insertMarkCU(note.getNumStudent(), note.getMark());
        assertEquals(1, cu.getMarksSize());
    }
    @Test
    public void searchMethodTest() {
        Note note = new Note(12,5);
        CU cu = new CU("CU1", 10);
        cu.insertMarkCU(note.getNumStudent(), note.getMark());
        cu.searchStudfent(note.getNumStudent());
        assertEquals("CU1", cu.getNameCu());

    }
    @Test
    public void testIsApproved() {
        Note note = new Note(12,10);
        CU cu = new CU("CU1", 10);
        cu.insertMarkCU(note.getNumStudent(), note.getMark());
        assertEquals(true, cu.isApproved(note.getNumStudent()));
    }
}
