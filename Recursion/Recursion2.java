// public class Recursion2 {
//     public static void printfib(int a, int b, int n ){
//         if(n==0){
//             return;
//         }
//         int c = a+b;
//         System.out.println(c);
//         printfib(b, c, n-1);
//     }
//     public static void main (String args[]){
//          int a = 0 ; 
//          int b = 1 ;
//          System.out.println(a);
//          System.out.println(b);
//          int n = 7; 
//          printfib(a, b, n-2);
//     }
// }

// pow (x^n)

// public class Recursion2 {

//     public static int calcpower(int x, int n) {

//         if (n == 0) {
//             return 1;
//         }

//         if (x == 1) {
//             return 1;
//         }

//         int xPowNm1 = calcpower(x, n - 1);
//         int xPow = x * xPowNm1;

//         return xPow;
//     }

//     public static void main(String args[]) {

//         int x = 2;
//         int n = 5;

//         int ans = calcpower(x, n);

//         System.out.println(ans);
//     }
// }
public class Recursion2 {

    public static int calcpower(int x, int n) {

        if (n == 0) {
            return 1;
        }
        if (x == 1) {
            return 1;
        }
        if (n%2 == 0){
            return calcpower(x, n/2) * calcpower( x, n/2);
        }
        else {
            return calcpower(x, n/2) * calcpower(x , n/2) *  x;
        }
    }


    public static void main(String args[]) {

        int x = 2;
        int n = 5;

        int ans = calcpower(x, n);

        System.out.println(ans);
    }
}