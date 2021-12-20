package led;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> answer = new ArrayList<String>();
        sc.nextLine();
        for(int i = 0; i < N; i++) {
        	
        	String V = sc.nextLine();        	
        	
        	answer.add(quantifyLeds(separateDigits(V)) + " leds");
        	
        }
        
        for(String a : answer) {
        	System.out.println(a);
        }
        
        sc.close();

	}
	
	public static char[] separateDigits(String num) {
	
		int lenght = num.length();
		char[] vetorDigits = new char[lenght];
		
		for(int i = 0; i < lenght; i++) {
			vetorDigits[i] =  num.charAt(i);
		}
		
		return vetorDigits;
	}
	
	public static int quantifyLeds(char[] vetNum){
		
		int quantify = 0;
		
		for(int i = 0; i < vetNum.length; i++) {
		
			switch(vetNum[i]){
            	case '0': case '6': case '9':
            		quantify += 6;
            		break;
            	case '1':
            		quantify += 2;
            		break;
            	case '2': case '3': case '5':
            		quantify += 5;
            		break;
            	case '4':
             		quantify += 4;
             		break;
            	case '7':
             		quantify += 3;
             		break;
            	case '8':
             		quantify += 7;
             		break;
			}
			
		}
		
        return quantify;
    }

}
