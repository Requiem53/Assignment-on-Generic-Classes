import Map.MyMap;

public class Main {
    public static void main(String[] args) {
        MyMap<Object, Object> myMap = new MyMap<>();

        myMap.put(200, 201);
        myMap.put(300, 301);
        myMap.put(400, 401);

        myMap.put(1,12);
        System.out.println(myMap.keys);
        System.out.println(myMap.values);
        myMap.put(1,15);
        System.out.println(myMap.keys);
        System.out.println(myMap.values);

        System.out.println(myMap.get(1));
        System.out.println(myMap.get(100));

        System.out.println(myMap.remove(1));
        System.out.println(myMap.remove(100));

        System.out.println(myMap.keys);
        System.out.println(myMap.values);


//        Arithmetic<Number> arith;
//        Scanner sc = new Scanner(System.in);
//
//        double num1 = 5.90;
//        float num2 = 0f;
//        int num3 = 59;
//        short num4 = 58;
//        long num5 = 100L;
//
//        arith = new Arithmetic<Number>(num5, num2);
//
//        System.out.println(arith.add());
//        System.out.println(arith.subtract());
//        System.out.println(arith.multiply());
//        System.out.println(arith.divide());
//        System.out.println(arith.getMin());
//        System.out.println(arith.getMax());

    }
}