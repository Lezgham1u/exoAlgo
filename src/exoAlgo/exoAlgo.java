package exoAlgo;

import java.util.Arrays;

public class exoAlgo {
	public static void main(String[] args) {
		int[] A = {0,1,2,3,4,5,6,8,9};
		int i = 2;
		splitRevConcatArray(A,i);
		
		
	}
	/**
	 * méthode principale qui fait tous le travail (split + reverse + concatenate)
	 * 
	 * @param A  'le tableau de départ'
	 * @param sizeToReverse 'le nombre d'élement à la fin du tableau qu'on souhaîte inversé'
	 * @return
	 */
	
	public static int[] splitRevConcatArray(int[] A, int sizeToReverse) {
		//System.out.println(A[4]);
		int len = A.length;
		int[] fullArray = new int [len];
		
		int[] remainArray = new int [len - sizeToReverse];
		int[] toReverseArray = new int [sizeToReverse];
		int[] reversedArray = new int [sizeToReverse];


		for(int i = 0; i<len ; i++) {
			if(i < remainArray.length) {
				remainArray[i] = A[i];
			}
			else {
				toReverseArray[i-remainArray.length] = A[i];
			}
			
		}
		
		System.out.println(Arrays.toString(remainArray));
		System.out.println(Arrays.toString(toReverseArray));
		
		reversedArray = reverseArray(toReverseArray);
		System.out.println(Arrays.toString(reversedArray));	
		
		fullArray = concatenateArray(remainArray,reversedArray);
		System.out.println(Arrays.toString(fullArray));	
		return fullArray;

	}
	/**
	 * la fonction qui renverse un tableau
	 * 
	 * @param A 'un tableau qu'on souhaite inversé
	 * @return
	 */
	public static int[] reverseArray(int[] A) {
		int len = A.length - 1;
		
		for(int i = 0; i<A.length/2 ; i++) {
			int temp = A[i];
			A[i] = A[len];
			A[len] = temp;
			len--;
			
		}
		return A;
	}
		/**
		 * une fonction qui concaténe 2 tableaux
		 * 
		 * @param A   le 1er tableau
		 * @param B	  le 2eme tableau
		 * @return
		 */
	public static int[] concatenateArray(int[] A, int[] B) {
		int n = A.length + B.length;
		int[] fullArray = new int [n];
		int i = 0;
		for(int element : A) {
			fullArray[i] = element ;
			i++;
			}
		for(int element : B) {
			
			fullArray[i] = element;
			i++;
		}
		
		return fullArray;	
	}
	
}
