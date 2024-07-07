import java.util.Scanner;
public class SegundoGrau {
    public static void main (String[] args){
        double a = 0;
        double b = 0;
        double c = 0;
        
        // O usuário irá informar os valores da equação, tal como ax^2 + bx + c = 0.
        Scanner in = new Scanner (System.in);
        System.out.println(" Insira o valor de A:");
        a = in.nextDouble();
        System.out.println("Insira o valor de B:");
        b = in.nextDouble();
        System.out.println("Insira o valor de C:");
        c = in.nextDouble();
        
        double Delta = b * b - 4 * a * c;
        System.out.println("O delta é: " + Delta);
        // Receberá o valor de delta e, caso a equação apresente raízes reais, receberá também o valor das raízes.
        if (Delta > 0) {
            double x1 = (-b + Math.sqrt(Delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(Delta)) / (2 * a);
            System.out.println("As raízes da equação são: " + x1 + " e " + x2);
        } else if (Delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A equação tem uma raíz duplicada: " + x);
        } else {
            System.out.println("A equação não tem raízes reais.");
        }
    }
    
    }
