import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Calculator {
    static Scanner scanner = new Scanner(System.in);
    //You have to explain why do you need this field

    public static String arabicToRoman(int x) {
        Map<String,String> map2 = new HashMap<>();
        {
            map2.put("1", "I");
            map2.put("2", "II");
            map2.put("3", "III");
            map2.put("4", "IV");
            map2.put("5", "V");
            map2.put("6", "VI");
            map2.put("7", "VII");
            map2.put("8", "VIII");
            map2.put("9", "IX");
            map2.put("10", "X");
        }
        int y = 0;
        String x1 = Integer.toString(y);
        if (x>=1 && x <=10){
            y = x;
            x1 = Integer.toString(y);
            return (map2.get(x1));
        } else if (x>= 11 && x <= 20) {
            y = x-10;
            x1 = Integer.toString(y);
            return ("X" + map2.get(x1));
        } else if (x>=21 && x <= 30) {
            y = x-20;
            x1 = Integer.toString(y);
            return ("XX" + map2.get(x1));
        } else if (x>=31 && x <= 39) {
            y = x-30;
            x1 = Integer.toString(y);
            return ("XXX" + map2.get(x1));
        } else if (x == 40) {
            return ( "XL");
        } else if (x>=41 && x <= 49) {
            y = x-40;
            x1 = Integer.toString(y);
            return ("XL" + map2.get(x1));
        } else if (x == 50){
            return ( "L");
        }else if (x>=51 && x <= 60) {
            y = x-50;
            x1 = Integer.toString(y);
            return ("L" + map2.get(x1));
        } else if (x>=61 && x <= 70) {
            y = x-60;
            x1 = Integer.toString(y);
            return ("LX" + map2.get(x1));
        } else if (x>=71 && x <= 80) {
            y = x-70;
            x1 = Integer.toString(y);
            return ("LXX" + map2.get(x1));
        } else if (x>=81 && x <= 89) {
            y = x-80;
            x1 = Integer.toString(y);
            return ("LXXX" + map2.get(x1));
        }else if (90 == x){
            return ("XC");
        } else if (x>=91 && x <= 99) {
            y = x-90;
            x1 = Integer.toString(y);
            return ("XC" + map2.get(x1));
        }else if (x == 100){
            return ( "C");
        }
        return x1;
    }


     public static void main(String[] args) throws Exception{
        // The code should be more modular! You must divide this method into several methods
         Map<String,String> map = new HashMap<>();
         {
             map.put("I", "1");
             map.put("II", "2");
             map.put("III", "3");
             map.put("IV", "4");
             map.put("V", "5");
             map.put("VI", "6");
             map.put("VII", "7");
             map.put("VIII", "8");
             map.put("IX", "9");
             map.put("X", "10");
         }

         Scanner s = new Scanner(System.in);
        //Rule number one: don't forget to close the scanner
         String s1 = s.nextLine();
         String min = "-";

         // A few errors are handled, but this does not provide any additional information to the user. Why?
         if ((s1.contains("1") || s1.contains("2") || s1.contains("3") || s1.contains("4") || s1.contains("5") || s1.contains("6") || s1.contains("7") || s1.contains("8") || s1.contains("9")) && (s1.contains("I") || s1.contains("V") || s1.contains("X"))) {
             throw new Exception("throws Exception");
         }
         if (!(s1.contains("+") || s1.contains("/") || s1.contains("-") || s1.contains("*"))){
             throw new Exception("throws Exception");
         }
         if (s1.contains(".") || s1.contains(",")){
             throw new Exception("throws Exception");
         }
         if (min.indexOf(s1.charAt(0)) != -1){
             throw new Exception("throws Exception");
         }
         String s2 = s1;
         s1 = s1.replace("+", " ");
         s1 = s1.replace("-", " ");
         s1 = s1.replace("/", " ");
         s1 = s1.replace("*", " ");
         String[] words = s1.split(" ");
         if (words.length != 2){
             throw new Exception("throws Exception");
         }
         if (s2.contains("V") || s2.contains("I") || s2.contains("X")){
            words[1] = map.get(words[1]);
            words[0] = map.get(words[0]);
         }

         int num1 = Integer.parseInt(words[0]);
         int num2 = Integer.parseInt(words[1]);
         if (num2 > 10 || num1 > 10 || num2 < 1 || num1 < 1){
             throw new Exception("throws Exception");
         }

         if (s2.contains("+")) {
             int rez = num1 + num2;
             if (s2.contains("V") || s2.contains("I") || s2.contains("X")){
                 String result = arabicToRoman(rez);
                 System.out.println(result);
             }else {
             System.out.println(rez);}
         }
         if (s2.contains("-")) {
             int rez = num1 - num2;
             if ((s2.contains("V") || s2.contains("I") || s2.contains("X")) && (rez < 1)){
                 throw new Exception("throws Exception");
             }
             if (s2.contains("V") || s2.contains("I") || s2.contains("X")){
                 String result = arabicToRoman(rez);
                 System.out.println(result);
             }else {
             System.out.println(rez);}
         }
         if (s2.contains("*")) {
             int rez = num1 * num2;
             if (s2.contains("V") || s2.contains("I") || s2.contains("X")){
                 String result = arabicToRoman(rez);
                 System.out.println(result);
             }else {
             System.out.println(rez);}
         }
         if (s2.contains("/")) {
             int rez = num1 / num2;
             if (s2.contains("V") || s2.contains("I") || s2.contains("X")){
                 String result = arabicToRoman(rez);
                 System.out.println(result);
             }else {
             System.out.println(rez);}
         }
     }
}
