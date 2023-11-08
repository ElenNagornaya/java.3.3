public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        //double credit = 1_000_000;
        //double interestRate = 9.9;
        //double period = 36;
        //double annuityPayment = service.calculate(credit, interestRate, period);
        //int payment = (int) annuityPayment;
        //System.out.println(payment);

        System.out.println();
        System.out.println("Кредит сроком на 12 месяцев, размер аннуитетного платежа: ");
        System.out.println(service.calculate(1_000_000, 9.9, 12));

        System.out.println();
        System.out.println("Кредит сроком на 24 месяца, размер аннуитетного платежа: ");
        System.out.println(service.calculate(1_000_000, 9.9, 24));

        System.out.println();
        System.out.println("Кредит сроком на 36 месяцев, размер аннуитетного платежа: ");
        System.out.println(service.calculate(1_000_000, 9.9, 36));

    }
}