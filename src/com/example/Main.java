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
        // Быстрее работает с удалением и добавлением элементов. Двусвязный список
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
//        queQueExample();
        mapExample();
    }

    public static void queQueExample() {
        // Создаём сервис для работы с автомобилями
        CarService carService = new CarQueue(true);

        // Добавляем автомобили в очередь
        carService.addCar(new Car("Toyota", 2020, 25000));
        carService.addCar(new Car("BMW", 2019, 40000));
        carService.addCar(new Car("Audi", 2021, 35000));

        // Выводим очередь (отсортированную по цене)
        System.out.println("Cars in queue (sorted by price):");
        carService.printQueue();

        // Извлекаем автомобили из очереди
        System.out.println("\nProcessing cars:");
        Car nextCar;
        while ((nextCar = carService.getNextCar()) != null) {
            System.out.println("Processing: " + nextCar);
        }
    }
    public static void mapExample(){
        HashMap<String, Car> hashMap = new HashMap<String,Car>();
        hashMap.put("test",new Car("BMW", 2019, 40000));
        hashMap.put("key",new Car("Toyota", 2020, 25000));
        hashMap.put("niva",new Car("NIVA", 2021, 33000));
        iterateMap(hashMap); // порядок вставки по ключам не сохраняется

        TreeMap<String, Car> treeMap = new TreeMap<String,Car>();
        treeMap.put("test",new Car("BMW", 2019, 40000));
        treeMap.put("key",new Car("Toyota", 2020, 25000));
        treeMap.put("niva",new Car("NIVA", 2021, 33000));
        iterateMap(treeMap); // сортировка по ключам

        LinkedHashMap<String, Car> linkedHashMap = new LinkedHashMap<String,Car>();
        linkedHashMap.put("test",new Car("BMW", 2019, 40000));
        linkedHashMap.put("key",new Car("Toyota", 2020, 25000));
        linkedHashMap.put("niva",new Car("NIVA", 2021, 33000));
        iterateMap(linkedHashMap); // сохраняет порядок вставки: test key niva ORDERED
    }
    public static void iterateMap(Map map){
        System.out.println();
        Iterator<Map.Entry<String,Car>> iterotor = map.entrySet().iterator();
        while (iterotor.hasNext()){
            Map.Entry<String, Car> carEntry = iterotor.next();
            System.out.println("Key: " + carEntry.getKey() + ", Value: " + carEntry.getValue());
        }
    }
}
