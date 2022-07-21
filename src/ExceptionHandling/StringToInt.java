package ExceptionHandling;

import java.util.Scanner;

public class StringToInt {

    public StringToInt() {
    }

    public String setString(String string) {
        return string;
    }

    public String stringInput() {
        System.out.println("input numbers from 0 to 10000");
        System.out.print("Input number: ");
        Scanner scannerObject = new Scanner(System.in);
        String str = setString(scannerObject.nextLine());
        return str;
    }

    public void throwExceptionIfStringCantBeParsed(String str){
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i)=='-' || str.charAt(i) < '0' || str.charAt(i) > '9')
                throw new InvalidNumberException();
            if(i>3){
                throw new LargeNumberException();
            }
        }
    }

    public int stringToInteger(String str){
        int num;
        throwExceptionIfStringCantBeParsed(str);
        num = Integer.parseInt(str);
        System.out.println("Entered number: " + num);
        return num;
    }
}
