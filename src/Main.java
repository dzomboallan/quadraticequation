import java.util.*;

public class Main {
    public static void main(String[] args) {
        double a,b,c,discriminant,root1,root2,realPart,imaginaryPart;

        System.out.println("Enter three numbers");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        discriminant = b*b-4*a*c;

        if(discriminant > 0){
            root1 = (-b + Math.sqrt(discriminant))/(2*a);
            root2 = (-b - Math.sqrt(discriminant))/(2*a);
            System.out.println("Two distinct roots.");
            System.out.println("root1= "+ root1 +" and root2= "+ root2);
        }else if(discriminant == 0){
            root1 = root2 = -b/(2*a);
            System.out.println("Roots are real and equal");
            System.out.println("root1 = root2 = " + root1);
        }else{
            realPart = -b/(2*a);
            imaginaryPart = Math.sqrt(-discriminant)/(2*a);
            System.out.println("Roots are imaginary");
            System.out.println("root1 = "+ realPart+ "+" + imaginaryPart + "and root2= "+realPart+ "+" + imaginaryPart);
        }
    }
}
