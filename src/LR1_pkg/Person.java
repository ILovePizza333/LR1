package LR1_pkg;

import java.io.PrintStream;

public class Person {
    private String name; // Имя
    private int age; // Возраст
    private String education; // Образование
    private String city; // Город

    // Конструктор с инициализацией полей
    public Person(String name, int age, String education, String city) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.city = city;
    }

    // Выдача переменных внешним программам
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getEducation() {
        return education;
    }
    public String getCity() {
        return city;
    }

    // Вывод информации о человеке в консоль
    public void print() {
    	System.out.println(name + ", " + age + ", " + education + ", " + city) ;
    }
    // Запись информации о человеке в файл
    public void printToFile(PrintStream stream) {
    	stream.println(name + ", " + age + ", " + education + ", " + city) ;
    }
}