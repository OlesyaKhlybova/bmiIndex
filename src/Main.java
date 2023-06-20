public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.6;
        double weight = 75;
        double bmiIndex = service.calculate(weight,height);
        System.out.println("ИМТ:"+ bmiIndex);
    }
}
