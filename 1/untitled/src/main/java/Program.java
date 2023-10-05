public class Program {

    /*
    Истомин СА группа 4832
    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    g. Не забываем про метод добавления фрукта в коробку.

    Формат сдачи: ссылка на гитхаб проект*/
    public static void main(String[] args) {

        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxApple = new Box<Apple>();
        Box<Orange> boxOrange = new Box<Orange>();
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);

        // в одну коробку нельзя сложить и яблоки, и апельсины (проверил работает)
        //boxOrange.addFruit(apple);

        System.out.println("Вес коробки с яблоками = " + boxApple.getWeight());
        System.out.println("Вес коробки с апельсинами = " + boxOrange.getWeight());

        if (boxApple.compare(boxOrange) == true) {
            System.out.println("Вес коробок с фруктами равен.");
        }
        else {
           System.out.println("Вес коробок с фруктами НЕ равен.");
        }

        boxApple.compare(boxOrange);

        Box<Apple> boxApple1 = new Box<Apple>();
        boxApple1.addFruit(apple);
        System.out.println("Вес до пересыпания из коробки в коробку:");
        System.out.println("Вес первой коробки с яблоками = " + boxApple.getWeight());
        System.out.println("Вес второй коробки с яблоками = " + boxApple1.getWeight());

        boxApple.transfer(boxApple1);
        System.out.println("Вес после пересыпания из коробки в коробку:");
        System.out.println("Вес первой коробки с яблоками = " + boxApple.getWeight());
        System.out.println("Вес второй коробки с яблоками = " + boxApple1.getWeight());

        //нельзя яблоки высыпать в коробку с апельсинами. (работает корректно)
        //boxApple.transfer(boxOrange);

    }

}
