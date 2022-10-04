public class Main {
    public static void main(String[] args) {
        int ticketPrice = 200;
        int bonusStep = 20;
        int bonusMiles;
        bonusMiles = ticketPrice / bonusStep;

        System.out.println("Ваш вонус за купленный билет на сумму " + ticketPrice + " рубль(ей) составил " + bonusMiles + " миль(ю/и)");
    }
}