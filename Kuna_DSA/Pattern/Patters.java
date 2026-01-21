package Pattern;

public class Patters {
    public static void main(String[] args) {
        //p1(5);
        //p2(5);
        //p3(5);
        //p4(5);
        p5(5);
    }

       
            // *
            // * * 
            // * * *
            // * * * *
            // * * * * *
    static void p1(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


            // * * * * *
            // * * * *
            // * * * 
            // * *
            // *
    static void p2(int n) {
        for(int i = n-1; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

            // *
            // * * 
            // * * *
            // * * * *
            // * * * * *
            // * * * *
            // * * * 
            // * *
            // *
    static void p3(int n) {
        for(int i = 1; i < n * 2; i++) {
            int star = i > n ? 2 * n - i : i;
            for(int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

                //         1 
                //       2 1 2 
                //     3 2 1 2 3
                //   4 3 2 1 2 3 4
                // 5 4 3 2 1 2 3 4 5
    static void p4(int n) {
        for(int row = 1; row <= n; row++) {
            for(int spc = 0; spc < n - row; spc++) {
                System.out.print("  ");
            }
            for(int j = row; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for(int j = 2; j <= row; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

            // 5 5 5 5 5 5 5 5 5 
            // 5 4 4 4 4 4 4 4 5 
            // 5 4 3 3 3 3 3 4 5
            // 5 4 3 2 2 2 3 4 5
            // 5 4 3 2 1 2 3 4 5
            // 5 4 3 2 2 2 3 4 5
            // 5 4 3 3 3 3 3 4 5
            // 5 4 4 4 4 4 4 4 5
            // 5 5 5 5 5 5 5 5 5
     static void p5(int n) {
        int org = n;
        n = 2 * n - 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                int num = org - Math.min(Math.min(i, j), Math.min(n -1 - i, n - 1 - j));
                System.out.print(num + " ");
            }
        System.out.println();
        }
    }
}
