import java.util.Random;

class task3 {
    public static void main(String[] args) {
        final int DAYS_IN_WEEK = 7;
        int[] trati = new int[DAYS_IN_WEEK];
        Random random = new Random();

        for (int i = 0; i < DAYS_IN_WEEK; i++) {
            trati[i] = 500 + random.nextInt(4501);
        }

        int rasxodi = 0;
        System.out.println("Расходы за неделю:");
        for (int i = 0; i < DAYS_IN_WEEK; i++) {
            System.out.println("День " + (i + 1) + ": " + trati[i]);
            rasxodi += trati[i];
        }

        System.out.println("Общая сумма расходов за неделю: " + rasxodi);
    }
}