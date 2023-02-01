package HomeWork6.Ex2;

import HomeWork6.Ex2.data.Note;
import HomeWork6.Ex2.data.Notes;
import HomeWork6.Ex2.database.DatabaseManager;
import HomeWork6.Ex2.views.Console;

public class Start {

    public void start() {
        DatabaseManager databaseManager = new DatabaseManager();
        Notes notes = new Notes(databaseManager);
        Console console = new Console(notes);
    }
}
