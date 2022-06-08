public class ConvertFarToCel {
    private Temperature temperature;

    public Temperature converter(Temperature temperature) {
        temperature.measureUnit = "C";
        temperature.degree = (temperature.degree - 32) / 1.8;
        return temperature;
    }

}
