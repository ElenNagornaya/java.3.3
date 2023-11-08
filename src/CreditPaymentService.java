public class CreditPaymentService {
    public double calculate(double credit, double interestRate, double period) {
        double m = interestRate / 12 / 100;
        double coefficient = m * Math.pow(1 + m, period) / (Math.pow(1 + m, period) - 1);

        double result = credit * coefficient;
        int intValue = (int) result;
        return intValue;
    }

}
