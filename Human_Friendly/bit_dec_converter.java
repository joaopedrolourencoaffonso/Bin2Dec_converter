package bit_converter;
import static java.lang.Math.pow;
import java.util.Scanner;

public class bit_dec_converter {

	public static void main(String[] args) {
		System.out.println("Type a binary number: ");
		Scanner sc = new Scanner(System.in);
		String binario = sc.nextLine();
		sc.close();
		String[] vetor = binario.split("");
		
		int tamanho = vetor.length;
		int i = 0;
		double total = 0;
		double temp = 0;

		while (i<tamanho) {
			switch (vetor[i]) {
			case "1":
				temp = 1;
				break;
				
			case "0":
				temp = 0;
				break;
			
			default:
				temp = 5;
			}
			
			if (temp == 5) {
				break;
			} else {
				System.out.println(temp + " * 2^(" + (tamanho - i - 1) + ")" + " = " + temp*Math.pow(2, tamanho - i - 1));
				total = total + temp*Math.pow(2, tamanho - i - 1);
				i++;
			}
		}
		if (temp != 5) {
			System.out.println("The value is: " + total);
		} else {
			System.out.println(binario);
			System.out.println("Sorry, but you typed something wrong.");
			System.out.println("Only 1's and 0's are allowed.");
		}

	}

}
