package day5;

/*
 Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”.
Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
Задать значение для каждого поля, используя set методы.
Вывести в консоль значение каждого из полей, используя get методы.
Созданный вами класс должен отвечать принципам инкапсуляции.
*/
public class Task1 {
    public static void main(String[] args) {
        Car mersedes = new Car();
        mersedes.setModel("Mersedes");
        mersedes.setYear(2020);
        mersedes.setColor("Чёрный");
        System.out.println(mersedes.getModel());
        System.out.println(mersedes.getYear());
        System.out.println(mersedes.getColor());
    }
}

