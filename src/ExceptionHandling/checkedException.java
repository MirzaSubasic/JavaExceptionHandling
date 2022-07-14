package ExceptionHandling;

import java.util.Scanner;

public class checkedException {

    public checkedException() {
    }

    public String setString() {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("input numbers from 0 to 10000");
        System.out.print("Input number: ");
        String str = scannerObject.nextLine();
        return str;
    }
    public int StringToInteger(){
        int num;
        String str = setString();
        try {
            for (int i=0; i<str.length(); i++){
                if(str.charAt(i)=='-' || str.charAt(i) < '0' || str.charAt(i) > '9')
                    throw new invalidNumberException();
                if(i>3){
                    throw new largeNumberException();
                }
            }
            num = Integer.parseInt(str);
            System.out.println("Input is correct");
            return num;
        }
        catch (invalidNumberException | largeNumberException e){}
        return 0;
    }
}
