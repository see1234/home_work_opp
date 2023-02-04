package HomeWork6.Ex2;

import HomeWork6.Ex2.data.Note;
import HomeWork6.Ex2.data.Notes;
import HomeWork6.Ex2.database.DatabaseManager;
import HomeWork6.Ex2.requests.Operation;
import HomeWork6.Ex2.requests.SQLOperation;
import HomeWork6.Ex2.views.Console;

public class Start {

    public void start() {
        DatabaseManager databaseManager = new DatabaseManager();
        Operation operation = new SQLOperation(databaseManager);
        Notes notes = new Notes(operation);
        Console console = new Console(notes);
    }
}
