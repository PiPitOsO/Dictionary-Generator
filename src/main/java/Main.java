import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Генератор словаря\n");
        System.out.println("Введите слова через запятую:"); // запросил для красивого ввода

        conclusion(Arrays.asList(crushing(simplification(new Scanner(System.in).nextLine()))));

        System.out.println("\nКонец\n");
    }

    public static String simplification(String text) { // чистая функция
        return text.replaceAll(",", ""); // удалим для упрощения деления
    }

    public static String[] crushing(String text) { // чистая функция
        return text.split("\\s+"); // может дрожащей рукой будет нажат не 1 пробел
    }

    public static void conclusion(List<String> list) { // монада
        list.stream()
                .sorted()                                  // сортировка по алфавиту
                .forEach(x -> System.out.print(x + " "));  // вывод с пробелами между слов
    }
}