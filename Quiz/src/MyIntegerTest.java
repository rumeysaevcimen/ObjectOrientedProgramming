public class MyIntegerTest {
        public static void main(String[] args) {
            MyInteger num1 = new MyInteger(5);
            MyInteger num2 = new MyInteger(2);

            System.out.println("sayı1 tek mi? " + num1.isOdd());
            System.out.println("sayı2 çift mi? " + num2.isEven());

            System.out.println("11 asal mı? " + MyInteger.isPrime(11));

            System.out.println("sayı1, 5'e eşit mi? " + num1.equals(5));
            System.out.println("sayı2, sayı1'e eşit mi? " + num2.equals(num1));
        }
    }
