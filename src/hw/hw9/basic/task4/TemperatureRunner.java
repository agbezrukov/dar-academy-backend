package hw.hw9.basic.task4;

/*
public Temperature() {
        this.value = 0.0;
        this.scale = Scale.C;
    }

    public Temperature(double value) {
        this.value = value;
        this.scale = Scale.C;
    }

    public Temperature(Scale scale) {
        this.value = 0.0;
        this.scale = scale;
    }

    public Temperature(double value, Scale scale) {
        this.value = value;
        this.scale = scale;
    }
 */
public class TemperatureRunner {
    public static void main(String[] args) {

        Temperature temperature1 = new Temperature();
        Temperature temperature2 = new Temperature(36.4);
        Temperature temperature3 = new Temperature(Scale.F);
        Temperature temperature4 = new Temperature(80.8, Scale.F);

        System.out.println(temperature1);
        System.out.println(temperature2);
        System.out.println(temperature3);
        System.out.println(temperature4);

        System.out.println(temperature3.getTemperatureInCelsius());
        System.out.println(temperature3.getTemperatureInFahrenheit());

    }
}
