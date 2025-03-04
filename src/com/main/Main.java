package com.main;
// Импорт из других пакетов
import com.main.enums.DayOfWeek;
import com.main.enums.TypeOfCar;
import com.main.example.Car;
import com.main.example.CarQueue;
import com.main.example.Truck;
import com.main.interfaces.CarService;
import com.main.forms.ContactApps;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.*;

class SomeThreads extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

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
//        mapExample();
//        enumSet();
//        enumMap();
//        oopExample();
//        truckCraete();
//        contactFormExample();
//        exceptionExample();
//        fileReadExample();
        threadExample();
    }

    public static void threadExample() {
        SomeThreads thread1 = new SomeThreads();
        SomeThreads thread2 = new SomeThreads();
        thread1.start();
        thread2.start();
    }

    public static void fileReadExample() {
        BufferedReader br = null; // Важно закрыть поток после использования
        try {
            File file = new File("newFile.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.println("Hello World!");
            pw.println("This is a new line.");
            pw.close();

            br = new BufferedReader(new FileReader("newFile.txt"));
            String line;
            while ((line = br.readLine())!= null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            if (br!= null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }

    public static void exceptionExample() {
        try {
            int a = 5, b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block"); // Используется для закрытия ресурсов, например, потоков или базы данных
        }
    }

    public static void contactFormExample() {
        ContactApps form = new ContactApps();
        form.setVisible(true);

    }

    // СТАТИЧНЫЕ МЕТОДЫ - СТАТИЧНЫЕ ПОЛЯ
    public static void truckCraete() {
        Truck audi = new Truck("Audi", 300, 20000);
        Truck ford = new Truck("Ford", 220, 18000);
        Truck bmw = new Truck("BMW", 250, 15000, new byte[]{1, 2, 3});
    }

    // Перегрузка info() info(String message)
    public static void info() {
        System.out.println("This is a reboot example");
    }
    public static void info(String message) {
        System.out.println("Message: " + message);
    }

    public static void oopExample() {
        // ОШИБКА ИЗ-ЗА АБСТРАКТНОГО КЛАССА Transport. Нельзя создавать экземпляр абстрактного класса
        // Transport bmw = new Transport("BMW", 250, 15000, new byte[]{1, 2, 3});
        Truck audi = new Truck("Audi", 300, 20000);
        //Transport ford = new Transport("Ford", 220, 18000);
        //bmw.getTransport();

        audi.loadCargo("cargo1");
        audi.setTransport("Audi", 310, 21000, new byte[]{7, 8, 9});
        audi.getTransport();
        audi.setTransport("Audi", 230, 19000, new byte[]{4, 5, 6}, true);
        audi.getTransport();
        audi.getEngineInfo();
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

    public static void enumSet(){
        EnumSet<DayOfWeek> hollidays = EnumSet.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
        System.out.println(hollidays);
    }

    public static void enumMap(){
        List<Car> sport = new ArrayList<Car>();
        sport.add(new Car("BMW", 2019, 40000));
        sport.add(new Car("Toyota", 2020, 25000));

        List<Car> miniVan = new ArrayList<Car>();
        miniVan.add(new Car("Audi", 2021, 35000));
        miniVan.add(new Car("NIVA", 2021, 33000));

        EnumMap<TypeOfCar, List<Car>> carMap = new EnumMap<>(TypeOfCar.class);
        carMap.put(TypeOfCar.HATCHBACK,sport);
        carMap.put(TypeOfCar.SEDAN, miniVan);
        iterateMap(carMap); // порядок вставки по ключам не сохраняется
    }

    public static void iterateMap(@NotNull Map map){
        System.out.println();
        Iterator<Map.Entry<TypeOfCar,Car>> iterotor = map.entrySet().iterator(); // TypeOfCar - ключ, Car - значение
        while (iterotor.hasNext()){
            Map.Entry<TypeOfCar, Car> carEntry = iterotor.next(); // TypeOfCar - ключ, Car - значение
            System.out.println("Key: " + carEntry.getKey() + ", Value: " + carEntry.getValue());
        }
    }
}
