public class BmiService {
    public float calculate(float weight_kg, float height_sm) {
        return weight_kg/(height_sm * height_sm);
    }
}
