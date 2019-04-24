package myMetods;

public class MyMetods {
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static boolean isRangeCorrect(int value, int first, int second) {
        if (value >= first && value<=second) {
            return true;
        }else return false;

    }
}
