package bit_converter;
import static java.lang.Math.pow;

public class bit_dec_converter {
	public static void main(String[] args) {
		String[] vetor = args[0].split("");
		
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
				total = total + temp*Math.pow(2, tamanho - i - 1);
				i++;
			}
		}
		if (temp != 5) {
			System.out.println(total);
		} else {
			System.out.println("Error: " + args[0] + " contain numbers different from '1' and '0'");
		}

	}

}
