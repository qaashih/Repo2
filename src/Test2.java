public class Test2 {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран

        int clientBill = 300;
        int addBill = 2200;


        int bonus;
        if (addBill > 1000) {
            bonus = addBill / 100;
        } else {
            bonus = 0;
        }


        int totalBull = clientBill + addBill + bonus;

        System.out.println("итоговая сумма на счету клиента " + totalBull);

    }
}
