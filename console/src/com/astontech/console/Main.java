package com.astontech.console;

import java.util.*;



public class Main {

    public static void main(String[] args) {
        //LessonFundamentalsLAB();
        //LessonFizzBuzzLAB();
        //LessonCalculatorLab();
       // Test myTest = new Test();
    }

    //#1 - New Private Static Method
    private static void LessonFundamentalsLAB() {

        //#2 - a variable is data stored in memory with an assigned data type
        // get num 1-10 and add 1.75
        System.out.println("Enter number 1-10: ");
        Scanner myScan = new Scanner(System.in);
        int i = myScan.nextInt();
        if (i <= 10 && i >= 1) {
            System.out.println(i + 1.75);
        } else {
            System.out.println("Fucked Up?");
        }

        //#3 8 data types (primitives)
        //byte is an 8bit signed twos complement integer
        byte bMin = -128, bMax = 127;

        //short is a 16bit signed twos complement integer
        short sMin = -32768, sMax = 32767;

        //int is a 32bit signed twos complement integer
        int iMin = -2 ^ 31, iMax = (2 ^ 31) - 1;

        //long is a 64bit signed twos complement integer
        long lMin = -2 ^ 63, lMax = (2 ^ 63) - 1;

        //float is a single-precision 32bit IEEE 754 floating point ....
        float f;

        //double is a double-precision 64bit IEEE 754 floating point (decimal values)
        double d = 1.1;

        //boolean has only 2 possible values - true / false
        boolean bTrue = true, bFalse = false;

        //char is a single 16bit unicode character
        char cMin = 0, cMax = 65535;

        String msg = String.format("Byte Min: %d \nByte Max: %d \nShort Min: %d \nShort Max: %d" +
                        "\nInt Min: %d \nInt Max: %d \nLong Min: %d \nLong Max: %d \nFloat Min: %f \n Float Max: %f" +
                        "\nChar Min: %s \nChar Max: %s",
                Byte.MIN_VALUE, Byte.MAX_VALUE, Short.MIN_VALUE, Short.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE,
                Long.MIN_VALUE, Long.MAX_VALUE, Float.MIN_VALUE, Float.MAX_VALUE,
                Character.MIN_VALUE, Character.MAX_VALUE);


        System.out.println(msg);

        //5 - Create a list, populate w values and iterate thru the list

        List<String> myList = new ArrayList<String>();
        for (int z = 0; z <= 10; z++) {
            myList.add("string " + z);
        }

        for (String myStr : myList) {
            System.out.println(myStr);
        }

        //6 - create variables of appropriate data types
        String gameName = "Lottery";
        int[] winNum = new int[10];
        int jackpot = 11455667;
        Date drawDate = new Date();

        for (int b = 0; b < winNum.length; b++) {
            winNum[b] = (int) (Math.random() * 20 + 1);
        }

        String lotto = String.format("The Game of %s was won today: %s" +
                        "\n the winning numbers were %s" +
                        "\n and you won $%d",
                gameName, drawDate, Arrays.toString(winNum), jackpot);

        System.out.println(lotto);


    }

    private static void LessonFizzBuzzLAB(){
    /*
    OOP LAB1
    1 - Create a New Method
    2 - Write a loop
     */
        for (int i = 0; i<=100; i++){
            if (i%3 == 0){
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else if (i%15 == 0){
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static void LessonCalculatorLab() {
        // 3 - create another method
        // 4 - Prompt user for input and reads

        try{

            List<String> calArray = new ArrayList<>();

            Scanner reader = new Scanner(System.in);

            //int n = reader.nextInt();
            for( int i = 0; i<=1; i++){
                System.out.println("Enter a number between 0-9: ");
                String s = reader.nextLine();
                //System.out.println(i);
                while (Integer.parseInt(s) > 9 || Integer.parseInt(s) < 0){
                    System.out.println("INVALID \n Please enter a number between 0-9: ");
                    s = reader.nextLine();
                }
                calArray.add(s);
            }

            boolean isWrk = false;

            System.out.println("Please enter an operator (+ - / *): " );
            String opIn = reader.nextLine();

            while(!isWrk){
                //char opIn = reader.next().charAt(0);
                if (opIn.matches("[-+*/]")){
                    isWrk=true;
                } else {
                    isWrk=false;
                    System.out.println("INVALID \n Enter Correct Op: ");
                    opIn = reader.nextLine();
                }
            }
            char c = opIn.charAt(0);
            int first = Integer.parseInt(calArray.get(0)), second = Integer.parseInt(calArray.get(1)), answer = 0;
            switch (c){
                case '+': answer = first + second; break;
                case '-': answer = first - second; break;
                case '/': answer = first / second; break;
                case '*': answer = first * second; break;
            }

            System.out.println("Answer to " + first + opIn + second + " is: " + answer);
            reader.close();

        }catch (Exception ex){
            System.out.println("You hit the exception " + ex.toString());
        }

    }
}
