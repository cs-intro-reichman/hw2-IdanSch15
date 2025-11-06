//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0];
                name = name.toUpperCase();
                int times = Integer.parseInt(args[1]);
                int lenName = name.length();
                int i = 0;
                String letters = ("AEFHILMNORSX");
                
                while (i < lenName) {
                        String add = ("an ");
                        char c = name.charAt(i);
                        if (letters.indexOf(c) == -1) add = "a ";

                        System.out.println("give me " + add + c + ": " + c + "!");
                        i ++;
                }
                
                System.out.println("What does that spell?");

                while (times > 0) {
                        System.err.println(name + "!!!");     
                        times --;   
                }

        }
}
