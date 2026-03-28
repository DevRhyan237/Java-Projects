import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String args[]){
        char[] op = {'A', 'P', 'I'};
        char first, second, third;
        int value = 1;
        Random random = new Random();
        int randomIndex = random.nextInt(op.length);
        Scanner scanner = new Scanner(System.in);
        char randomChar = op[randomIndex];
        System.out.println("_ _ _");
        System.out.println("Informe a primeira letra:");
        first = scanner.next().charAt(0);
        if(first == randomChar){
            System.out.printf("%c _ _",randomChar);
            System.out.println("Acertou!");
        }else{
            System.out.println("Errou!");
            break;
        }
        System.out.println("Informe a segunda letra:");
        second = scanner.next().charAt(0);
        if(second == randomChar){
            System.out.printf("%c %c _",randomChar,randomChar);
            System.out.println("Acertou!");
        }else{
            System.out.println("Errou!");
            break;
        }
        System.out.println("Informe a terceira letra:");
        third = scanner.next().charAt(0);
         if(third == randomChar){
            System.out.printf("%c %c %c",randomChar,randomChar,randomChar);
            System.out.println("Parabens, voce completou o jogo!");
            break;
        }else{
            System.out.println("Errou!");
            break;
        }
        scanner.close();
    }
}       
