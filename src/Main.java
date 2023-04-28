import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public enum Month {
    JANUARY, // 0
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER,
  }

   enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN,
  }
  public static Season monthToSeason(Month month) {
    return switch (month) {
      case DECEMBER, JANUARY, FEBRUARY -> Season.WINTER;
      case MARCH, APRIL, MAY -> Season.SPRING;
      case JUNE, JULY, AUGUST -> Season.SUMMER;
      case SEPTEMBER, OCTOBER, NOVEMBER -> Season.AUTUMN;
    };
  }

  public static void main(String[] args) {
    // в программе созданный enum можно использовать, как новый класс - как новый тип переменной
    // (как int, String и т.д.)
    Map<Month, Integer> daysPerMonth = new HashMap<>();
    daysPerMonth.put(Month.JANUARY, 31);
    daysPerMonth.put(Month.FEBRUARY, 28); // год не високосный
    daysPerMonth.put(Month.MARCH, 31);
    daysPerMonth.put(Month.APRIL, 30);
    daysPerMonth.put(Month.MAY, 31);
    daysPerMonth.put(Month.JUNE, 30);
    daysPerMonth.put(Month.JULY, 31);
    daysPerMonth.put(Month.AUGUST, 31);
    daysPerMonth.put(Month.SEPTEMBER, 30);
    daysPerMonth.put(Month.OCTOBER, 31);
    daysPerMonth.put(Month.NOVEMBER, 30);
    daysPerMonth.put(Month.DECEMBER, 31);

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the month: ");
    String month = scanner.next(); // месяц "как ввели"
    scanner.close();
    // enum.valueOf("ЗНАЧЕНИЕ") либо вернёт нам соответствующее значение по его названию,
    // либо выбросит исключение IllegalArgumentException
    Month monthKey = Month.valueOf(month.toUpperCase()); // месяц "как ключ словаря"
    // enum.ordinal() возвращает индекс значения в перечислении
    System.out.println(month + " has " + daysPerMonth.get(monthKey) + " days");
    System.out.println("Month " + month + " is a Season " + monthToSeason(monthKey));

    //May
    //May has 31 days
    //Month May is a Season SPRING

  }
}



