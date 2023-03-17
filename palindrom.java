import java.util.Scanner;

public class palindrom {
      public static void main(String[] args) {
            int no,real,rev=0;
            System.out.println("\nEnter no to check Palindrome : ");
            Scanner sc = new Scanner(System.in);
            no = sc.nextInt();
            real = no;
            while (no>0)
            {
                  int rem = no%10;
                  no/=10;
                  rev=rev*10+rem;
            }
            if(rev==real) System.out.println("Yes");
            else    System.out.println("NO");
      }
}
