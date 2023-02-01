package HomeWork5.Ex1.personal.FileExecutors;

import java.util.List;

public interface FileOperation {
    List<String> readAllLines();


    void saveAllLines(List<String> lines);
    FileType getFileType();
}
