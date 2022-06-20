package calc;


import java.util.Scanner;

public class newq {
    static String[] q = new String[3];
    static String[] masRim;
    static String[] aramNum;
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        try {
            System.out.println("enter virogeniy");
            String g = b.nextLine();
            char[] w = g.toCharArray();
            String t = "";
            for (int i = 0, j = 0; i < w.length; i++) {
                if (w[i] != ' ') {
                    t += w[i];
                }
                if (w[i] == ' ' || i == w.length - 1) {
                    q[j] = t;
                    t = "";

                    j++;
                }
            }
            if (q.length != 3) {
                throw new ArrayIndexOutOfBoundsException("There are too many values in the array");
            }
            if (Integer.parseInt("0") < 0 || Integer.parseInt("2") < 0) {
            }
            if (Integer.parseInt("2") > 10 || Integer.parseInt("0") > 10) {
            }


        } catch (ArrayIndexOutOfBoundsException s) {
            System.out.println("There are too many values in the array);
        }

        switch (q[1]) {
            case "+":
            case "-":
            case "*":
            case "/":
                break;
            default:
               throw new IllegalArgumentException("the format of the mathematical operation does not satisfy the task - two operands and one operator");
        }
                String[] aramNum = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10","11"};

                for (int i = 0; i < aramNum.length; i++) {
                    for (int j = 0; j < aramNum.length; j++) {
                        if (q[0].equals(aramNum[i]) && q[2].equals(aramNum[j])) {
                           mas();
                        }
                    }
                }
                masRim = new String[]{"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                        "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                        "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                        "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                        "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                        "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                        "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", " ", "C"};

                for (int i = 0; i < masRim.length; i++)
                    for (int j = 0; j < masRim.length; j++) {
                        if (q[0].equals(masRim[i]) && q[2].equals(masRim[j])) {
                            mas2();
                        }
                    }
                for (int i = 0; i < masRim.length; i++)
                    for (int j = 0; j < aramNum.length; j++) {
                        if (q[0].equals(masRim[i]) && q[2].equals(aramNum[j]) || q[2].equals(masRim[i]) && q[0].equals(aramNum[j])) {
                            throw new NumberFormatException("enter arab and Rim");
                        }
                    }
        }
    public static void mas() {
        arabs v = new arabs(q);
        v.arab();
    }
    public static void mas2() {
        rim z = new rim(q, masRim);
        z.index();
    }
}




















































