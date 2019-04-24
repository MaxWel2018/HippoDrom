package hippo;

import myrand.MyMetods;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game {
    // Здесь будет творится весь треш
    Scanner scanner = new Scanner(System.in);
    static Pattern pattern = Pattern.compile("[A-Za-z]{3,16}");
    static Matcher matcher;

    private int count = 0;
    private static Game thisGame = new Game();

    public static Game getThisGame() {
        return thisGame;
    }

    private Game() {

    }

    public static List<Horse> horseList;
    //    public static List<Player> playerList;
    Player player;
    public static Bank bank;
    public static List<Hippodrome> hippodromeList;
    private Hippodrome currentHippo;


    public void run() {
        hippodromeList = Hippodrome.toCreateHippodromes();
        horseList = Horse.toCreateHorse();
//        playerList = Player.toCreatePlayer();
        bank = Bank.getInstance();
        gameMenu();


    }

    void gameMenu() {
        addNewPlayers();
        System.out.println("Какой гипподром хочете  посетитить ?\n ");
        showHippo();
        while (setHippo()) ;


    }

    private void addNewPlayers() {
        System.out.println("Добро Пожаловать на онлайн Гипподромы!");
        String name;
        int monet = 0;
        int tempForMonet;
        do {
            System.out.println("Введите своё имя: ");
            name = scanner.nextLine();
            matcher = pattern.matcher(name);
        } while (!matcher.matches());
        System.out.println("Сколько бабла взяли ?");
        do {
             tempForMonet = scanner.nextInt();
            if (MyMetods.isRangeCorrect(tempForMonet, 2000, 2_000_000)) {
                monet    = tempForMonet;
            }else {
                System.out.println("Ошибка ввода :) С  собой можно взять не больше 2 000 000 и не меньше 2000.\n  Повторите попытку:)");
            }
        } while (!MyMetods.isRangeCorrect(tempForMonet, 0, 2_000_000));
        player = new Player.Builder().nameSetDefalt(name).moneySetDefalt(monet).build();
    }



    private void showHippo() {
        hippodromeList.forEach(o -> {
            System.out.println(count + " " + o);
            count++;
        });
    }

    private boolean setHippo() {
        switch (scanner.nextInt()) {
            case 0:
                if (player.getMoney() >= hippodromeList.get(0).getMinAmountOfMoneyToEnter()) {
                    currentHippo = hippodromeList.get(0);
                }
                break;
            case 1:
                if ((player.getMoney() >= hippodromeList.get(1).getMinAmountOfMoneyToEnter())) {
                    currentHippo = hippodromeList.get(1);
                }

                break;

            case 2:
                if ((player.getMoney() >= hippodromeList.get(2).getMinAmountOfMoneyToEnter())) {
                    currentHippo = hippodromeList.get(2);
                }
                break;
            case 3:
                if ((player.getMoney() >= hippodromeList.get(3).getMinAmountOfMoneyToEnter())) {
                    currentHippo = hippodromeList.get(3);
                }
                break;
            default:
                System.out.println("Неправильный выбор!Повторите Ввод!");
                return true;

        }
        return false;
    }
}





