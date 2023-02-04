package HomeWork6.Ex2.requests;

import HomeWork6.Ex2.data.Note;

import java.sql.ResultSet;

public interface Operation {
    void editNote(Note note, int id);
    void deleteNote(int id);
    void createNote(Note note);
    Object getNotes();

}
