package HomeWork6.Ex2.data;

import HomeWork6.Ex2.database.DatabaseManager;
import HomeWork6.Ex2.fields.NoteFields;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Notes {
    private List<Note> noteList;
    private DatabaseManager databaseManager;
    public Notes(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
        this.noteList = new ArrayList<Note>();
        loadNotes();
    }
    public void loadNote(String head, String text, String data) {
        this.noteList.add(new Note(head,text,data));
    }
    public void createNote(String head, String text, String data) {
        Note note = new Note(head,text,data);
        this.noteList.add(note);
        this.databaseManager.update(String.format("INSERT INTO notes (id, head, text, data) VALUES(%s,'%s','%s','%s')", note.getId(), note.getHeading(), note.getText(), note.getDate()));
    }
    public void deleteNote(int id) {
        for(int i = 0; i < noteList.size(); i++) {
            Note note = noteList.get(i);
            if(note.getId() == id) {
                noteList.remove(note);
                this.databaseManager.update(String.format("DELETE FROM notes WHERE id=%d", id));
                break;
            }
        }
    }

    public void editNote(int id, NoteFields noteField, String edit) {
        for(int i = 0; i < noteList.size(); i++) {
            Note note = noteList.get(i);
            if(note.getId() == id) {
                if(noteField == NoteFields.TEXT) {
                    note.setText(edit);
                }
                else if(noteField == NoteFields.HEAD) {
                    note.setHeading(edit);
                }
                else {
                    new Exception("Такого типа нет (NOTEFIELDS)");
                }
                this.databaseManager.update(String.format("UPDATE notes SET text='%s', head='%s' WHERE id=%d", note.getText(), note.getHeading(), id));
                break;
            }
        }
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public void loadNotes() {
        ResultSet resultSet = this.databaseManager.getResult("SELECT * FROM notes");
        try {
            while (resultSet.next()) {
                loadNote(resultSet.getString("head"), resultSet.getString("text"), resultSet.getString("data"));
            }
            resultSet.close();
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
