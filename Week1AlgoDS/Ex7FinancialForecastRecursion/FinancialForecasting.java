public class FinancialForecasting {
    public static double toPredictFutureValue(double val, double gr, int y) {
        if (y == 0) {
            return val;
        }
        return toPredictFutureValue(val * (1 + gr), gr, y - 1);
    }

    public static void main(String[] args) {
        double initialValue = 14000;
        double growthRate = 0.35;
        int years = 10;
        double futureValue = toPredictFutureValue(initialValue, growthRate, years);
        System.out.printf("Future value after %d years: %.2f\n", years, futureValue);
    }
}
