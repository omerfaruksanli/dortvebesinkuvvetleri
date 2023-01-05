import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz : ");
        x = input.nextInt();

        for(int i=1; i<=x; i*=4){
            System.out.println("4'ün Kuvvetleri : " + i);
        }
        for (int i = 1; i<=x; i*=5){
            System.out.println("5'in Kuvvetleri : " + i);
        }
    }
}