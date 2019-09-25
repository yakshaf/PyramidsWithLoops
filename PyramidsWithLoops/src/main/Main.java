/* 
 * Yuru Gong
 * gongyr@mail.uc.edu
 * Assignment 04
 * Due Date: 09/26/2019
 * Description: Printing pyramids using loops. The outcome should be:
        1
       222
      33333
     4444444
    555555555 
 * Citations:
 * Course: IS4010
 */
package main;

public class Main {

	public static void main(String[] args) {
		int lines = 5;
		for (int i = 1; i <= lines; i++) {  //print lines
			
			for (int j = 1; j <=lines - i; j++) {  //print spaces before the number
				System.out.print(" ");
			}
			for (int j = 1; j <= i*2-1; j++) { //print number
				System.out.print(i); 
			}
			for (int j = 1; j <=lines-i; j++) { //print spaces after the number
				System.out.print(" ");
			}

			System.out.println(""); //print on a new line every time
		}
	}
}
