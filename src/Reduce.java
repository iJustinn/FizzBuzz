public class Reduce {
    public static void main(String[] args) {

        reduce(100);

    }

    public static void reduce(int i) {

        int j = 0;

        while (i != 0) {
            if (i % 2 == 0) {

                j++;
                i = i / 2;

            } else {

                j++;
                i--;

            }
        }

        System.out.println(j);
    }
}
