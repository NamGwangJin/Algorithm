import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while (n>=1 && n<=1000) {
            if (n%2==0){
                System.out.println(n+" is even");
                break;
            } else{
                System.out.println(n+" is odd");
                break;
            }
        }
    }
}