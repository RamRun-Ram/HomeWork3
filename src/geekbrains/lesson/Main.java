package geekbrains.lesson;

import java.util.HashMap;

public class Main {
//    1. Создать массив с набором слов (10-20 слов,
//    должны встречаться повторяющиеся). Найти и вывести
//    список уникальных слов, из которых состоит массив (дубликаты не считаем).
//    Посчитать сколько раз встречается каждое слово.
//}

    public static void main(String[] args) {


        String[] build = {"стул", "стол", "дверь", "стул", "потолок", "люстра", "раковина", "дверь", "ванна", "лампочка", "диван", "дверь"};
        HashMap<String, Integer> hm = new HashMap<>();



        for (String x : build) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
            Integer res = hm.get(x);
            if (res > 1) {
                hm.remove(x);
                System.out.println(x +"=" + res);
            }

        }
        System.out.println(hm);

    }

}
