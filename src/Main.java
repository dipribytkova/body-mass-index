public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight_kg = 45;
        float height_sm = 1.57F;
        float index = service.calculate(weight_kg, height_sm); // должно получиться 18.26
        System.out.println(index);
    }
}