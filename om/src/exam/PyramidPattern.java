package exam;

public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5, a = 0;
        for(int i = 1; i <= rows; ++i, a = 0) {
            for(int j = 1; j <= rows - i; ++j) {
                System.out.print("  ");
            }
            while(a != 2 * i - 1) {
                System.out.print("* ");
                ++a;
            }
            System.out.println();
        }
    }
}