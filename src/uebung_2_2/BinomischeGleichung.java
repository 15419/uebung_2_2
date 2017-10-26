/**
 * 
 */
package uebung_2_2;

/**
 * @author 15419
 *
 */
public class BinomischeGleichung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 8;
		double b = 3;
		
		double links = ((a+b)*(a+b));
		double rechts = (Math.pow(a,  2)+(2*a*b)+Math.pow(b, 2));
		
		System.out.println("links=" +links+ " und rechts" +rechts);
	}

}
