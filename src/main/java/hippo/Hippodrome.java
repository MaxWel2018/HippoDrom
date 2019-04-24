package hippo;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private final String name; // имя гиподрома
    private final String city; // город проведения
    private final int roadLength; // Длинна забега
    private final int minAmountOfMoneyToEnter;
    private final int minBet;

    @Override
    public String toString() {
        return "Hippodrome: " +
                name +
                "\n \t City: " + city +
                "\n \t Length road: " + roadLength +
                "\n \t Minimum amount of money to enter: " + minAmountOfMoneyToEnter +
                "\n \t Minimum bet: " + minBet +
                "\n";
    }

    public int getMinAmountOfMoneyToEnter() {
        return minAmountOfMoneyToEnter;
    }

    public int getMinBet() {
        return minBet;
    }

    public Hippodrome(String name, String city, int roadLength, int minAmountOfMoneyToEnter, int minBet) {
        if (!name.isEmpty()) { // в идеале тут бы регу замутить
            this.name = name;
        } else {
            this.name = "DefaultName";
        }
        if (!city.isEmpty()) {
            this.city = city;
        } else {
            this.city = "DefaultCountry";
        }
        if (roadLength > 0) {
            this.roadLength = roadLength;
        } else {
            this.roadLength = 0;
        }
        if (minAmountOfMoneyToEnter >= 0) {
            this.minAmountOfMoneyToEnter = minAmountOfMoneyToEnter;
        } else {
            this.minAmountOfMoneyToEnter = 0;

        }
        if (minBet > 0) {

            this.minBet = minBet;
        } else {
            this.minBet = 200;
        }

    }

    //Создаём Гиподромы
    public static List toCreateHippodromes(){
        List<Hippodrome> hippodromeList = new ArrayList<Hippodrome>();
        hippodromeList.add(new Hippodrome("Bada-Boom", "Santa-Barbara", 1300, 2000, 100));
        hippodromeList.add(new Hippodrome("Big Ban", "New-York", 1500, 3000, 350));
        hippodromeList.add(new Hippodrome("Apple", "San-Francisco", 1000, 4000, 450));
        hippodromeList.add(new Hippodrome("Horse_House", "Santa-Monika", 1300, 5000, 600));
        return hippodromeList;
    }
}
