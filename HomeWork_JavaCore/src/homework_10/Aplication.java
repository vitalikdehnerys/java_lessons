package homework_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
	
	//palindrome();
	//changeVowelNunber();
	
	//numberWordInSentence();	
	//numberSentenceInText();
	//mostRepeatedWordInSentence(); // most repeated in text will be as same as this method
	
	}
	
	public static void mostRepeatedWordInSentence()  {
		Scanner scanner = new Scanner(System.in);
		String sentence;
		String word="";
		int count=0;
		int maxCount=0;
		ArrayList<String> words = new ArrayList<String>();
			
			
		while(true) {
			System.out.println("Please enter sentence");
			sentence=scanner.nextLine();
			sentence=sentence.toLowerCase();
			for (int i = 0;i<sentence.length() ; i++) {
				if(((sentence.charAt(i))==' ')|
						((sentence.charAt(i))=='.')) {
					words.add(sentence.substring(0, i));
					sentence=sentence.substring(i+1);
					i=0;	
				}
			}
			for (int i = 0; i < words.size(); i++) {
				count=1;
				
				for (int j = i+1; j < words.size(); j++) {
					if(words.get(i).equals(words.get(j))) {
						count++;
					}
				}
				if(count>maxCount) {
					maxCount=count;
					word=words.get(i);
				}
			}
			System.out.println("Most repeated word: " + word);
		}
	}
	
	public static void changeVowelNunber() {
		Scanner scanner = new Scanner(System.in);
		String text;
		final Character [] vowelSounds = {'a','e','i','o','u','y'};
		while(true) {
			System.out.println("Please enter text :");
			text=scanner.nextLine();
			StringBuffer string = new StringBuffer(text);
			for(Character vowel: vowelSounds) {
				for(int i=0;i<string.length();i++) {
					if (string.charAt(i)==vowel) {
						string.setCharAt(i,'-');
					}
				}
				
			}
			System.out.println("New string : "+string);
		}
	}
	
	public static void numberSentenceInText() {
		Scanner scanner = new Scanner(System.in);
		String text;
		char point='.';
		while (true) {
			System.out.println("Please enter text");
			text=scanner.nextLine();
			int numberSentences=0;
			for (int i = 0; i < text.length(); i++) {
				if(text.charAt(i)==point) {
					numberSentences++;
				}
			}
			System.out.println("Numbers sentence equals to : "+numberSentences);
		}
	}
	
	public static void numberWordInSentence() {
		Scanner scanner = new Scanner(System.in);
		String sentence;
		char probile=' ';
		while (true) {
			System.out.println("Please enter sentence");
			sentence=scanner.nextLine();
			sentence=sentence.trim();
			int numberWord=0;
			for (int i = 0; i < sentence.length(); i++) {
				if(sentence.charAt(i)==probile) {
					numberWord++;
				}
			}
			numberWord+=1;
			System.out.println("Numbers word equals to : "+numberWord);
		}
	}
	
	public static void palindrome(){
		Scanner scanner = new Scanner(System.in);
		String word;
		String wordToLowerCase;
		while (true) {
			System.out.println("Plese enter word : ");
			word=scanner.next();
			if (word.length()==5) {
				wordToLowerCase=word.toLowerCase();
				if((wordToLowerCase.charAt(0)==wordToLowerCase.charAt(4))
						&(wordToLowerCase.charAt(1)==wordToLowerCase.charAt(3))) {
					System.out.println("Word '" +word+ "' is a palindrome!");
				
				}else {
					System.out.println("Word '" +word+ "' is not a palindrome!");
				}
			}else {
				System.out.println("Word '" +word+ "' is incorrect length");
			}
		}	
	}
}