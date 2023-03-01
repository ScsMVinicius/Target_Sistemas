	
	import java.util.Scanner;

	public class InverterString {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite uma string: ");
	        String String = sc.nextLine();
	        String StringInvertida = inverteString(String);
	        System.out.println("A string invertida é: " + StringInvertida);
	        sc.close();
	    }

	    public static String inverteString(String inputString) {
	        int length = inputString.length();
	        StringBuilder outputBuilder = new StringBuilder(length);
	        for (int i = length - 1; i >= 0; i--) {
	            outputBuilder.append(inputString.charAt(i));
	        }
	        return outputBuilder.toString();
	    }

	}



