import java.util.Scanner;
public class Main{																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    	System.out.print("１人目の身長を入力してください");
        double height = scanner.nextDouble();
        System.out.print("１人目体重を入力してください");
        double weight = scanner.nextDouble();
        scanner.close();
        System.out.printf("１人目のBMI値は%.2fです%n", weight / Math.pow(height / 100, 2));
    }
}



