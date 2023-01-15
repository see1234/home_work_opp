package HomeWork2.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Person father;
    private Person mother;
    public List<Person> childs;
     public Person(String name, Person father, Person mother) {
         this.name = name;
         this.childs = new ArrayList<Person>();
         this.mother = mother;
         this.father = father;
     }
     public String build(int size) {
         StringBuilder stringBuilder = new StringBuilder();
         for(int i = 0; size > i; i++) {
             stringBuilder.append("  ");
         }
         return stringBuilder.toString();
     }
     public void who() {
         System.out.println("Я " + getName());
     }
     public void showGeniums(int i) {
         i++;
         if(this.mother != null) {
             System.out.println(build(i) + "мама: " + mother.getName());
             mother.showGeniums(i);
         }
         if(this.father != null) {
             System.out.println(build(i) +"папа: " + father.getName());
             father.showGeniums(i);
         }
         for(Person person : this.childs) {
             System.out.println(build(i) + "Дети: " + person.getName());
                 person.showGeniums(i);
         }


     }



    public String getName() {
        return name;
    }




}
