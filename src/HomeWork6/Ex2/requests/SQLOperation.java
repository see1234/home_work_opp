package HomeWork6.Ex2.requests;

import HomeWork6.Ex2.data.Note;
import HomeWork6.Ex2.database.DatabaseManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLOperation implements Operation {
    private DatabaseManager databaseManager;
    public SQLOperation(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }
    @Override
    public void editNote(Note note, int id) {
        this.databaseManager.update(String.format("UPDATE notes SET text='%s', head='%s' WHERE id=%d", note.getText(), note.getHeading(), id));
    }

    @Override
    public void deleteNote(int id) {
        this.databaseManager.update(String.format("DELETE FROM notes WHERE id=%d", id));
    }

    @Override
    public void createNote(Note note) {
        this.databaseManager.update(String.format("INSERT INTO notes (id, head, text, data) VALUES(%s,'%s','%s','%s')", note.getId(), note.getHeading(), note.getText(), note.getDate()));
    }

    @Override
    public List<String> getNotes() {
        ResultSet resultSet = this.databaseManager.getResult("SELECT * FROM notes");
        ArrayList<String> stringArrayList = new ArrayList<String>();
        try {
            while (resultSet.next()) {
                stringArrayList.add(String.format("%s;%s;%s", resultSet.getString("head"), resultSet.getString("text"),resultSet.getString("data")));
            }
            resultSet.close();
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        return stringArrayList;
    }


}
