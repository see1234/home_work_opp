package HomeWork5.Ex1.personal;

import HomeWork5.Ex1.personal.FileExecutors.FileOperationSQL;
import HomeWork5.Ex1.personal.controllers.UserController;
import HomeWork5.Ex1.personal.FileExecutors.FileOperation;
import HomeWork5.Ex1.personal.model.Repository;
import HomeWork5.Ex1.personal.model.RepositoryFile;
import HomeWork5.Ex1.personal.utils.Validate;
import HomeWork5.Ex1.personal.views.ViewUser;

public class Main {

    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationSQL("users.db"); //Здесь можно менять базу
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository,validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}
