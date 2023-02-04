package HomeWork6.Ex2.data;

import HomeWork6.Ex2.database.DatabaseManager;
import HomeWork6.Ex2.fields.NoteFields;
import HomeWork6.Ex2.requests.Operation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Notes implements NoteInterface {
    private List<Note> noteList;
    private Operation operation;
    public Notes(Operation operation) {
        this.operation = operation;
        this.noteList = new ArrayList<Note>();
        loadNotes((List<String>) this.operation.getNotes());
    }
    @Override
    public void createNote(String head, String text, String data) {
        Note note = new Note(head,text,data);
        this.noteList.add(note);
        this.operation.createNote(note);
    }
    @Override
    public void deleteNote(int id) {
        for(int i = 0; i < noteList.size(); i++) {
            Note note = noteList.get(i);
            if(note.getId() == id) {
                noteList.remove(note);
                this.operation.deleteNote(id);
                break;
            }
        }
    }
    @Override
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
                this.operation.editNote(note, id);
                break;
            }
        }
    }
    @Override
    public List<Note> getNoteList() {
        return noteList;
    }
    @Override
    public void loadNote(String head, String text, String data) {
        this.noteList.add(new Note(head,text,data));
    }
    @Override
    public void loadNotes(List<String> stringList) {
        for(String string : stringList) {
            String[] args = string.split(";");
            loadNote(args[0],args[1],args[2]);
        }
    }
}
