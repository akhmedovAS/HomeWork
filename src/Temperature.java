public class Temperature {

    public double degree;
    public String measureUnit;

    public Temperature(int degree, String measureUnit) {
        this.degree = degree;
        this.measureUnit = measureUnit;
    }

    public String toString() {
        return "Градусы: " + degree + " Единица измерения: " + measureUnit;
    }

}
