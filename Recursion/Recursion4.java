public class Recursion4 {
    public static void printRev(String Str, int idx){
        if(idx==0){
            System.out.println(Str.charAt(idx));
            return;
        }

        System.out.print(Str.charAt(idx));
        printRev(Str, idx-1);
    }
    public static void main(String agrs[]){
        String Str = "abcd";
        printRev(Str, Str.length()-1);
    }
}
