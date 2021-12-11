import java.util.Arrays;
import java.util.Scanner;
public class dialogue {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        char [] valor = a.nextLine().toCharArray();
        char [] reverse = new char[valor.length];
        for (int i = 0;i < valor.length;i++){
            reverse[i] = valor[valor.length-1-i];
        }
        if (Arrays.equals(reverse, valor)){
            System.out.println("capicua");
        }
        else {
            System.out.println("no capicua");
        }
}}
