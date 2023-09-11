public class Multiples {
    public static void main(String[] args) {

        multiples(10);

    }

    public static void multiples(int i) {

        int j = 0;
        i--;

        while (i > 0) {

            if (i % 3 == 0 || i % 5 == 0) {

                j++;

            }

            i--;
        }

        System.out.println(j);
    }
}
