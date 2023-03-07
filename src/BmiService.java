public class BmiService {
    public int calculate(float meters, int kilograms) {
        float index;
        index = kilograms / (meters * meters);
        return (int) index;
    }
}