package calc;

public class arabs {
   static String[] q;
    public arabs(String[] t) {
        this.q = t;
    }
    public static void arab() {
        int number_one = Integer.parseInt(q[0]);
        int number_two = Integer.parseInt(q[2]);

        if (Integer.parseInt(q[0]) > 10 || Integer.parseInt(q[2]) > 10){
            throw new IllegalArgumentException("Enter a number from 1 to 10");
        }

        {
            if (q[1].equals("-")) {
                System.out.println(number_one - number_two);
            } else if (q[1].equals("+")) {
                System.out.println(number_one + number_two);
            } else if (q[1].equals("*")) {
                System.out.println(number_one * number_two);
            } else if (q[1].equals("/")) {
                System.out.println(number_one / number_two);



            } else {
                throw new IllegalArgumentException("the format of the mathematical operation does not satisfy the task - two operands and one operator");
            }
        }
    }
}









