package HomeWork5.Ex2;

import HomeWork5.Ex2.Loggers.SystemLogs;
import HomeWork5.Ex2.views.ViewConsole;

public class Main {

    public static void main(String[] args) {
        SystemLogs logs = new SystemLogs();
        ViewConsole viewConsole = new ViewConsole(logs);
        viewConsole.run();
    }
}
