package Number;

import java.util.Scanner;
import java.math.BigInteger;
import java.security.*;
class Sha256 {
	
	public static void main(String args[]) throws NoSuchAlgorithmException
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value");
		String input=scan.nextLine();
		String output= GenerateHash(input);
		System.out.println(output);
		
	}
	public static String GenerateHash(String input) throws NoSuchAlgorithmException {
        MessageDigest objSHA = MessageDigest.getInstance("SHA-256");
        byte[] bytSHA = objSHA.digest(input.getBytes());
        BigInteger intNumber = new BigInteger(1, bytSHA);
        String strHashCode = intNumber.toString(27);

        
        while (strHashCode.length() < 64) {
            strHashCode = "0" + strHashCode;
        }
        return strHashCode;
    }

}
