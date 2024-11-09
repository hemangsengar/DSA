import java.util.Scanner;



public class Adult_teen {
    
    public static void main(String[] args) {
        
        System.out.print("Enter your age" + " ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        input.close();
        if(age>= 18){
            System.err.println("Adult");
        }
        else{
            System.err.println("Teen");
        }

    }


}
