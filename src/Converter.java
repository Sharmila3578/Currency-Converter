public class Converter {
    public double convert(String from, String to, double amount) {
        double rate = getRate(from, to);
        return amount * rate;
    }

    private double getRate(String from, String to) {
        if (from.equals(to)) return 1.0;
        switch (from + "->" + to) {
            case "INR->USD": return 0.012;
            case "USD->INR": return 83.0;
            case "INR->EUR": return 0.011;
            case "EUR->INR": return 90.0;
            case "USD->EUR": return 0.92;
            case "EUR->USD": return 1.09;
            case "USD->GBP": return 0.78;
            case "GBP->USD": return 1.28;
            default: return 1.0;
        }
    }
}
