import java.lang.reflect.Array;

public class Main
{
    public static void main(String[] args) {
//        Container container = new Container();
//        container.count += 7843;
        System.out.println(sumDigits(1111));

    }

    public static Integer sumDigits(Integer number) {
        String numStr = Integer.toString(number);
        char[] chars = numStr.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum = sum + Character.getNumericValue(chars[i]);
        }
        return sum;
    }
}

    //Реализовать метод sumDigits, чтобы он считал сумму цыфр в числе number, используя 3 метода:
    // Integer.toString(), .charAt() и Length(). Вывести в консоль результат.
