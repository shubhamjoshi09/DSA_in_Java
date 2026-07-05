// public class Recursion1 {
//     // print number (1 to 5)
//    public static void printnumb(int n){
//      if(n==6){
//         return;
//      }
//      System.out.println(n);
//      printnumb(n+1);
//    }
//    public static void main(String args[]){
//       int n= 1;
//       printnumb(n);
//    }
// }

// public class Recursion1 {
//     // print number (5 to 1)
//    public static void printnumb(int n){
//      if(n==0){
//         return;
//      }
//      System.out.println(n);
//      printnumb(n-1);
//    }
//    public static void main(String args[]){
//       int n= 5;
//       printnumb(n);
//    }
// }

// Print sum of first n natural numbers 

// public class Recursion1{
//      public static void printSum (int i, int n, int sum){
//         if(i==n){
//             sum +=i;
//             System.out.println(sum);
//             return; 
//         }
//         sum +=i;
//         printSum (i+1, n, sum);
//         System.out.println(i);
//      }
//      public static void main(String args[]){
//         printSum(1 , 5, 0);
//      }
// }

// Print factorial of print numbers 

public class Recursion1{
    public static int calcfactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int fac_nm1 = calcfactorial(n-1);
        int fac_n = n * fac_nm1;
        return fac_n;
    }
    public static void main (String args[]){
        int n= 5;
        int ans = calcfactorial(n);
        System.out.println(ans);
    }
}