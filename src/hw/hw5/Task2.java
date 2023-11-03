package hw.hw5;

//2. Магазин предоставит скидку в 10%, если стоимость купленного товара будет больше 5000.
// Если стоимость товара ниже 5000, то стоимость остается без изменений. Вычислите и выведите итоговую стоимость покупки для пользователя.
public class Task2 {
    public static void main(String[] args) {
        double price = 10000.0;
        double promo1 = 5000.0;
        int discount = 10;

        if (price > promo1) {
            price = price - price * discount / 100;
            System.out.println("Sale 10 %");
        }
        System.out.println("Price: " + price);
    }
}
