package alphabets;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {

		System.out.println("Enter an aplphabet ");
		Scanner sc = new Scanner(System.in);

		char letter = sc.next().charAt(0);
		switch (letter)
        {
            case 'a':	
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(letter + " Letter is vowel");
                break;
            default:
                System.out.println(letter + " Letter is consonant");
                break;
		}
	}
}
			
		