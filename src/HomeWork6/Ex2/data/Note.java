package HomeWork6.Ex2.data;

import java.util.HashMap;
import java.util.List;

public class Note {
    private String heading;
    private String text;
    private String date;
    private int id;
    private static int max_id;

    public Note(String heading, String text, String date) {
        this.heading = heading;
        this.text = text;
        this.date = date;
        this.id = max_id;
        max_id++;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public int getId() {
        return id;
    }

    public String getHeading() {
        return heading;
    }
    public void setText(String text) {
        this.text = text;
    }


    public String getText() {
        return text;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return String.format("%s ID: %d - [%s] %s", date, id, heading, text);
    }
}
