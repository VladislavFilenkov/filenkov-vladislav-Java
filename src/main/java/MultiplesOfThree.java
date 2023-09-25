public class MultiplesOfThree {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4, 33, -6};

        for (int i : arr) {
            if ((i != 0) && (i % 3) == 0){
                System.out.println(i);
            }
        }
    }
}
