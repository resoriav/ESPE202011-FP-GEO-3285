import java.util.Scanner;
public class main{
    public static void main(String[] args){ 
    
  int n= 0;
  Scanner scanner = new Scanner(System.in);
  System.out.printf("Please enter a number ---> ");
  int number = scanner.nextInt(); 
        System.out.println("You entered--->" +number);
        if (number %2==0)
        {
            System.out.println("number " +number+ " even");
        }else {
            System.out.println("number " +number+ " odd");
        }

    }}