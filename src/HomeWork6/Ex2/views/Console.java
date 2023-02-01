package HomeWork6.Ex2.views;

import HomeWork6.Ex2.data.Note;
import HomeWork6.Ex2.data.Notes;
import HomeWork6.Ex2.fields.NoteFields;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Console {
    private Notes notes;
    public Console(Notes noteList) {
        this.notes = noteList;
        run();
    }

    private void run() {
        getHelp();
        while(true) {
            try {
                String command = prompt("Введите команду: ");
                Commands cmd = Commands.valueOf(command.toUpperCase());
                switch(cmd) {
                    case LIST:
                        getList();
                        break;
                    case ADD:
                        addNote();
                        break;
                    case EDIT:
                        editNote();
                        break;
                    case DELETE:
                        removeNote();
                        break;
                    case HELP:
                        getHelp();
                        break;
                }
            }
            catch (Exception ex) {
                System.out.println(ex);
            }
        }

    }

    public void getList() {
        for(Note note : this.notes.getNoteList()) {
            System.out.println(note);
        }
    }
    public void getHelp() {
        System.out.println("Команды: ");
        for(Commands command : Commands.values()) {
            System.out.println(command);
        }
    }

    public void addNote() {
        String head = prompt("Введите заголовок: ");
        String text = prompt("Введите текст: ");
        notes.createNote(head,text, new Date().toString());
    }
    public void editNote() {
        int id = promptInt("Введите айди: ");
        String type = prompt("Введите тип (TEXT,HEAD): ");
        String edit = prompt("На что предлагаете изменить: ");
        NoteFields field = NoteFields.valueOf(type.toUpperCase());

        notes.editNote(id,field,edit);
    }
    public void removeNote() {
        int id = promptInt("Введите айди: ");
        notes.deleteNote(id);
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextInt();
    }
}
