package day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> nameFamily1 = new ArrayList<>();
        List<String> nameFamily2 = new ArrayList<>();
        List<String> nameFamily3 = new ArrayList<>();
        List<String> nameFamily4 = new ArrayList<>();
        List<String> nameFamily5 = new ArrayList<>();
        List<String> nameFamily6 = new ArrayList<>();
        List<String> nameFamily7 = new ArrayList<>();
        List<String> nameFamily8 = new ArrayList<>();
        List<String> nameFamily9 = new ArrayList<>();
        List<String> nameFamily10 = new ArrayList<>();
        List<String> nameFamily11 = new ArrayList<>();

        nameFamily1.add("Честер Беннингтон");
        nameFamily1.add("Майк Шинода");
        nameFamily1.add("Феникс Фаррелл");
        nameFamily1.add("Джо Хан");
        nameFamily1.add("Брэд Делсон");
        nameFamily1.add("Роб Бурдон");
        nameFamily1.add("Марк Уэйкфилд");

        nameFamily2.add("Диана Арбенина,");
        nameFamily2.add("Светлана Сурганова");
        nameFamily2.add("Дмитрий Максимов");
        nameFamily2.add("Дмитрий Горелов");
        nameFamily2.add("Денис Жданов");
        nameFamily2.add("Сергей Макаров");

        nameFamily3.add("Билли Джо Армстронг");
        nameFamily3.add("Джейсон Уайт");
        nameFamily3.add("Тре Кул");
        nameFamily3.add("Майк Дёрнт");
        nameFamily3.add("Джейсон Фриз");
        nameFamily3.add("Джон Киффмейер");

        nameFamily4.add("Дэйв Грол");
        nameFamily4.add("Тейлор Хокинс");
        nameFamily4.add("Пэт Смир");
        nameFamily4.add("Нейт Мендел");
        nameFamily4.add("Крис Шифлетт");
        nameFamily4.add("Уильям Голдсмит");
        nameFamily4.add("Рами Джаффе");
        nameFamily4.add("Франц Стал");

        nameFamily5.add("Мэттью Беллами");
        nameFamily5.add("Доминик Ховард");
        nameFamily5.add("Крис Уолстенхолм");

        nameFamily6.add("Патрик Стамп");
        nameFamily6.add("Пит Вентц");
        nameFamily6.add("Энди Хёрли");
        nameFamily6.add("Джозеф Троман");
        nameFamily6.add("Майк Парешкувиц");

        nameFamily7.add("Дэн Рейнольдс");
        nameFamily7.add(" Уэйн Сермон");
        nameFamily7.add("Бен МакКи");
        nameFamily7.add("Дэниэл Плацман");

        nameFamily8.add("Аврил Лавин");

        nameFamily9.add("Райан Теддер");
        nameFamily9.add("Эдди Фишер");
        nameFamily9.add("Зак Филкинс");
        nameFamily9.add("Дрю Браун");
        nameFamily9.add("Брент Катцл");
        nameFamily9.add("Джеррод Беттис");
        nameFamily9.add("Тим Майерс");

        nameFamily10.add("Патрик Дж. Карни");

        nameFamily11.add("Билл Каулитц");
        nameFamily11.add("Том Каулитц");
        nameFamily11.add("Густав Шефер");
        nameFamily11.add("Георг Листинг");

        MusicBand musicBand1 = new MusicBand("Linkin park", 1996, nameFamily1);
        MusicBand musicBand2 = new MusicBand("Ночные снайперы", 1993, nameFamily2);
        MusicBand musicBand3 = new MusicBand("Green Day", 1987, nameFamily3);
        MusicBand musicBand4 = new MusicBand("Foo Fighters", 1994, nameFamily4);
        MusicBand musicBand5 = new MusicBand("Muse", 1994, nameFamily5);
        MusicBand musicBand6 = new MusicBand("Fall Out Boy", 2001, nameFamily6);
        MusicBand musicBand7 = new MusicBand("Imagine Dragons", 2008, nameFamily7);
        MusicBand musicBand8 = new MusicBand("Avril Lavigne", 2002, nameFamily8);
        MusicBand musicBand9 = new MusicBand("One Republic", 2002, nameFamily9);
        MusicBand musicBand10 = new MusicBand("The Black Keys", 2001, nameFamily10);
        MusicBand musicBan11 = new MusicBand("Tokio Hotel", 2001, nameFamily11);

        MusicBand.transferMembers(musicBand1, musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();

    }

}

