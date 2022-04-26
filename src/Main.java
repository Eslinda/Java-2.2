public class Main {

    public static void main(String[] args) {

        int balance = 100; // начальный баланс счета
        int refil = 1100; // сумма пополнения
        // int bonusP = 100; // стоимость бонуса
        int newBalance; // баланс после пополнеия счета
        int bonus; //бонус


        if (refil >= 1000) {
            bonus = refil / 100;
            newBalance = balance + refil + bonus;
            System.out.println("Ваш баланс составляет " + newBalance + " рублей");
            System.out.println("Количество полученных бонусных рублей " + bonus);

        } else {
            newBalance = balance + refil;
            bonus = 0;
            System.out.println("Ваш баланс составляет " + newBalance + " рублей");
            System.out.println("Количество полученных бонусных рублей " + bonus);
        }


    }
}
