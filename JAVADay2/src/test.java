public class test {
    public static void main(String[] args) {
        int i = 1;
        while (i < 5) {
            if (i % 3 != 0) {
                System.out.println(i);
                i++;
                continue;
            }
            System.out.println("Hello");
            i++;
        }
    }
}
