package hw.hw9.basic.task4;

/*
Напишите класс Temperature, который имеет два поля: значение температуры (double) и символ шкалы, либо 'C' для Цельсия,
либо 'F' для Фаренгейта. Убедитесь, что доступ к этим двум полям возможен только через методы-аксессоры (get/set) вне класса.

Конструкторы:
Класс должен иметь четыре конструктора:
один для каждого поля экземпляра (предположим, ноль градусов, если значение не указано, и Цельсий, если шкала не указана)
один с двумя параметрами для двух переменных экземпляра
конструктор по умолчанию (устанавливается на ноль градусов Цельсия).

Методы:
Два метода для возврата температуры: один для возврата градусов по Цельсию, другой для возврата градусов по Фаренгейту.
Для преобразования используйте следующие формулы:
degreesC = 5(degreesF - 32) / 9
degreesF = (9(degreesC/5) + 32

Три метода для установки полей: один для установки значения, один для установки шкалы ('F' или 'C'), и один для установки обоих.
Метод для возврата шкалы.
 */
public class Temperature {

    private double value;
    private Scale scale;

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

    public double getTemperatureInCelsius() {
        if (scale == Scale.C) {
            return (value - 32) * 5 / 9;
        } else {
            return value;
        }
    }

    public double getTemperatureInFahrenheit() {
        if (scale == Scale.F) {
            return value / 5 * 9 + 32;
        } else {
            return value;
        }
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(Scale scale) {
        this.scale = scale;
    }

    public void setTemperature(double value, Scale scale) {
        this.value = value;
        this.scale = scale;
    }

    public Scale getScale() {
        return scale;
    }

    @Override
    public String toString() {
        return "Temperature " +
                "value=" + value +
                ", scale=" + scale;
    }
}
