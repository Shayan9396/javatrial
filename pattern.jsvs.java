import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows of the pattern; ");
        int num = sc.nextInt();
        int i,j;
        for( i=0;i<=num;i++){
            for( j=0;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
