package ExceptionHandling;

import java.util.Scanner;

public class checkedException {

    public checkedException() {
    }

    public String setString(String string) {
        return string;
    }
    public int StringToInteger(){
        int num=0;
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("input numbers from 0 to 10000");
        System.out.print("Input number: ");
        String str = setString(scannerObject.nextLine());
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
        }
        catch (invalidNumberException | largeNumberException e){
            e.getMessage();
            System.out.println("Try again");
            System.out.print("Input number: ");
            String str1 = setString(scannerObject.nextLine());
            num = Integer.parseInt(str1);
        }
        return num;
    }
}
