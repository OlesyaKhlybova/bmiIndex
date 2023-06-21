public class BmiService {
    public int calculate(double weight, double height) {
        double bmiIndex = weight / Math.pow(height, 2);
        // weight вес в кг
        // height рост в метрах
        return (int) bmiIndex;
    }
}
