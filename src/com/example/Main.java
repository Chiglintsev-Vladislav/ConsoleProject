package com.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Comments
        /*BIG Comments*/
        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.nextLine();
        System.out.println("Hello \" World \\ !" + a + b);
        System.out.println("Переменные и типы данных");
        byte age = 127; // 1 byte -128 127
        short num1 = 30000; // 2 byte -32768 32767
        int num2 = 3333333; // 4 byte
        long num3 = 333333333; // 8 byte
        float num4 = 33.33333f; // 4 byte
        double num5 = 33.333333333d; // 8 byte
        char ch = '&'; // 1 symbol
        String str = "Hello World";
        System.out.println(str);
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("Данные от пользователя");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String username = sc1.nextLine();
        System.out.println("Привет " + username);
        int n = sc1.nextInt();
        byte byte1 = sc1.nextByte();
        boolean bool1 = sc1.nextBoolean();
        float num1 = 50, num2 = 40;
        float res = num1/num2;
        res += 10;
        res ++;
        res --;
        System.out.println(res);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        float n = sc.nextFloat();
        System.out.print("Enter the number: ");
        float c = sc.nextFloat();
        float result1 = n+c;
        float result2 = n-c;
        float result3 = n*c;
        float result4 = n/c;
        float result5 = n%c;
        System.out.println("The result is +: "+result1+" The result is -: "+result2+" The result is *: "+result3+" The result is /: "+result4+" The result is %: "+result5);

        // Условные конструкции
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Doing: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();
        int result = 0;
        switch (action) {
            case "+":
                result = number + number2;
                System.out.println(result);
                break;
            case "-":
                result = number - number2;
                System.out.println(result);
                break;
            case "*":
                result = number * number2;
                System.out.println(result);
                break;
            case "/":
                result = number / number2;
                System.out.println(result);
                break;
            case "%":
                result = number % number2;
                System.out.println(result);
                break;
            default:
                System.out.println("The action is not recognized");
        }
        // Циклы
        for (float i = 1000; i>1; i/=2 ) {
            if (i%2 == 0) continue;
            System.out.println(i);
        }
        int i=0;
        while (i!=10){
            System.out.print(i + " ");
            i++;
        }
        i=0;
        do {
            System.out.println(i);
            i++;
        } while (i!=10);

        // Массивы данных
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N: ");
        int N = sc.nextInt();
        int[] array1 = new int[N];
        float[] array2 = new float[]{1.23f, 12.3f, 3.21f};
        System.out.println(array2[0]);
        System.out.print("Enter the Array: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        for (int j : array1) {
            System.out.print(j + " ");
        }
        System.out.println();
        var min = Arrays.stream(array1).min();
        System.out.println(min.isPresent() ? min.getAsInt() : "Not found");
        System.out.print("Enter the Multidimensional T and F: ");
        int T = sc.nextInt();
        int F = sc.nextInt();
        int[][] marray = new int[T][F];
        System.out.println("Enter the Multidimensional Array: ");
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < F; j++) {
                marray[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < F; j++) {
                System.out.print(marray[i][j] + " ");
            }
            System.out.println();
        }

        //Коллекции Java <<Interface>>Collection: <<Interface>>Map <<Interface>>Queue <<Interface>>Set <<Interface>>List
        // ArrayList LinkedList - Структуры данных. Сильно напрягают память, лучше использовать массивы. List можно обращаться к объектам по индексу.
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        list.add(sc.nextLine());
        for (String s : list) {
            System.out.println(s);
        }
        list.addFirst(" ABOBA");
        System.out.println(list);
        System.out.println(list.getFirst());
        list.removeFirst();
        System.out.println(list);
        list.clear();
        // Быстрее работает с удалением и добавлением элементов
        LinkedList<Float> linked = new LinkedList<Float>();
        linked.addFirst(3.14f);
        linked.addFirst(2.718f);
        linked.addFirst(1.718f);
        for (int i = 0; i < linked.size(); i++) {
            System.out.println(linked.get(i));
        }
        */
        example();
    }

    public static void example() {
        //Интерфейс Set имеет преимущество в скорости. Нельзя получить элементы по индексу. Перебор - Итератор или Цикл.
        hashSetExample(); // Создание случайного набора. Самая простая и быстрая коллекция.
        //treeSetExample(); // Сортировка набора по возрастанию. Самый медленный. SORTED
        //linkedHashSetExample(); // ORDERED notSORTED. Упорядоченный набор. Хранит порядок вставки. В каком добавляли, в таком и выводит.


    }

    public static void hashSetExample() {
        Set<Car> cars = new HashSet(); // Generics ТИПИЗАЦИЯ
        Car car1 = new Car("BMW");
        Car car2 = new Car("Audi");
        Car car3 = new Car("Toyota");
        Car car4 = new Car("Nissan");
        Car car5 = new Car("Nissan"); // Создаем объекты класса Car
        Car car6 = new MiniCar("Mini Cooper"); // Дочерний тип
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5); // Добавляем дубликаты
        cars.add(car6);

        Iterator<Car> iterator = cars.iterator(); // Вызываем Итератор для прохода по коллекции
        while (iterator.hasNext()) {
            Car car = iterator.next();
            //System.out.println(car.getName());
            car.drive();
        }


    }

    public static void treeSetExample() {
        Set<Integer> tree = new TreeSet<Integer>();
        tree.add(11);
        tree.add(2);
        tree.add(30);
        tree.add(400);
        tree.add(50);
        tree.add(36);
        tree.add(70);
        Iterator<Integer> iterator = tree.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " "); // next преобразует в String
        }
    }

    public static void linkedHashSetExample() {
        Set<Integer> linked = new LinkedHashSet<>();
        linked.add(11);
        linked.add(2);
        linked.add(30);
        linked.add(400);
        linked.add(50);
        Iterator<Integer> iterator = linked.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

}
