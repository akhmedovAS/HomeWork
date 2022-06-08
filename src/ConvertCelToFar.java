public class ConvertCelToFar extends ConvertFarToCel {

    @Override
    public Temperature converter(Temperature temperature) {
        temperature.measureUnit = "F";
        temperature.degree = (temperature.degree + 32) * 1.8;
        return temperature;
    }
}
