package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                String[] human = string.split(" ");
                if (Integer.parseInt(human[1]) < 0) {
                    throw new IOException();
                }
                Person person = new Person(human[0], Integer.parseInt(human[1]));
                people.add(person);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
        return people;
    }

}