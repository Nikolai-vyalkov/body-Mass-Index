public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        long weight = 60;
        double height = 1.8;
        double ITM = service.calculate(weight,height );
        System.out.println(ITM);
    }
}

