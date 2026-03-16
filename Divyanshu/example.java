import java.util.Scanner;
public class example {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number:");
        int n1=sc.nextInt();
        System.out.print("Enter second number:");
        int n2=sc.nextInt();
        
        System.out.println("""
        Enter choices as follows:
            1 for addition
            2 for subtraction
            3 for multiplication
            4 for division
        """);
        int key=sc.nextInt();
        switch(key){
            case 1:
                System.out.print(n1+n2);
                break;
            
            case 2:
                System.out.print(n1-n2);
                break;
            
            case 3:
                System.out.print(n1*n2);
                break;
            
            case 4:
                System.out.print(n1/n2);
                break;
            
            default:
                System.out.println("Invalid entry");
        
        }
    }
}
