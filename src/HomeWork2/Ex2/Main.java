package HomeWork2.Ex2;

public class Main {
    public static void main(String[] args) {
        Person grandpa = new Person("Дедушка васи", null, null);
        Person grandma = new Person("Бабушка васи", null, null);
        Person father = new Person("Папа васи", grandpa, grandma);
        Person mother = new Person("Мама васи", null, null);//Мамы и папы мы не знаем, оставляем
        Person son = new Person("Вася", father, mother);
        Person son_2 = new Person("Васин сын", son, null); //Допустим мама скрыта
        son_2.who();
        son_2.showGeniums(0);
        son.who();
        son.showGeniums(0);
    }
}
