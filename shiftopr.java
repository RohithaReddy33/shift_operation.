import java.util.Scanner;
public class shiftopr {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int input =scanner.nextInt();
        System.out.println(input<<1);
        System.out.println(input>>1);
        scanner.close();  
    }   
}
