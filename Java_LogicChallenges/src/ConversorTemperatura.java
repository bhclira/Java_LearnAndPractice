public class ConversorTemperatura {
    public static void main(String[] args) {
        float tempCelsius = 32;
        float tempFahrenheit = 100;

        double conversorParaFarenheit = (tempCelsius * 1.8) + 32;
        System.out.println("A temperatura convertida para Fahrenheit foi: " + conversorParaFarenheit);

        double conversorParaCelsius = (tempFahrenheit - 32) / 1.8;
        conversorParaCelsius = (int) (conversorParaCelsius);

        System.out.println("A temperatura convertida de Fahrenheit para Celsius foi de: " + conversorParaCelsius + " graus.");
    }
}