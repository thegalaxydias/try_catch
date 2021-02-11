package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)  throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();
        in.close();

        try {


            if (a >= 0 && a < 18) {
                throw new Exception ("from 0 to 17");

            }
            else if (a > 17 && a < 66) {
                throw new Exception ("from 18 to  65");
            }
            else if (a > 65){
                throw new Exception ("more than 65");
            }
            else if (a <0 )
                throw new Exception ("Error!");

        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}

