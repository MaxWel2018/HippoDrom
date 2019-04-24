package hippo;

import myMetods.MyMetods;

import java.util.ArrayList;
import java.util.List;

public class Horse {
    private String name;
    private int maxSpeed;
    private int minSpeed;
    private  int currentSpeed;

    public Horse(String name, int minSpeed, int maxSpeed) { // Создаём лошадь
        this.name = name;   // Cделаем ввид что все данные воодятся правильно (ибо они создаются не пользователем )
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
    }

    public void setCurrentSpeed( ) { // устанавливаем Скорость с которой поедит в данном забеге
        this.currentSpeed = MyMetods.rnd(minSpeed, maxSpeed);
    }

    public String getName() {
        return name;
        }
        // Создаём Коней
    public static List toCreateHorse() {
       List<Horse> horseList=new ArrayList<Horse>();

        horseList.add(new Horse("Hero", 30, 56));
        horseList.add(new Horse("Black Star", 40, 52));
        horseList.add(new Horse("Tony Stark", 35, 59));
        horseList.add(new Horse("Hugo", 28, 64));
        horseList.add(new Horse("Face", 32, 54));
        horseList.add(new Horse("Favorite", 30, 55));
        horseList.add(new Horse("Sunny", 35, 60));
        return horseList;
    }
}
