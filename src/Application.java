import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos número você vai digitar: ");
		int n =sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Digite um número:");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		System.out.print("valores = ");
		int soma = 0;
		double media = 0;
		for(int i = 0; i <arr.length; i ++) {
			System.out.print( + arr[i]+ " ");
			soma += arr[i];
			
		}
			media = soma / n;
		System.out.print("\nSoma: "+soma);
		System.out.println("\nMedia: "+media);
		
		
		sc.close();

	}

}
