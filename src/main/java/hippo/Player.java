package hippo;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private int money;
    private boolean setHorse[] = new boolean[Game.horseList.size()];

    @Override
    public String toString() {
        return "Player: " + name +
                ", money = " + money;
    }

    public static class Builder {
        private String name = "Bot";
        private int money = 2000;

        public Builder() {

        }

        public Builder moneySetDefalt(int val) {

            money = val;
            return this;
        }

        public Builder nameSetDefalt(String val) {
            name = val;
            return this;
        }

        public Player build() {
            return new Player(this);
        }


    }


    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public Player(Builder builder) {
        name = builder.name;
        money = builder.money;
    }


    public void setMoney(int money) {
        this.money = money;
    }

    // Ставка
    public int placeAbet(int size) {
        return size;
    }

    //Создаём Героев
//    public static List toCreatePlayer() {
//        List<Player> playerList = new ArrayList<Player>();
//        playerList.add(new Player.Builder().build());
//        playerList.add(new Player.Builder().build());
//        playerList.add(new Player.Builder().build());
//        playerList.add(new Player.Builder().build());
//        return playerList;
//    }

    // Выбор Лошади

    void setHorse(int N) {
        for (int i = 0; i < setHorse.length; i++) {
            setHorse[i] = false;

        }
        setHorse[N] = true;

    }
}