public class TimeCalc {
    public static void main(String[] args) {
        String HHMM = args[0];
        String hoursStr = "" + HHMM.charAt(0) + HHMM.charAt(1);
        String mintuesStr = "" + HHMM.charAt(3) + HHMM.charAt(4);
        int hours = Integer.parseInt(hoursStr);
        int minutes = Integer.parseInt(mintuesStr);

        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);
        
        if (newHours < 10 & newMinutes < 10) System.out.println("0" + newHours + ":0" + newMinutes);
        else if (newHours < 10 & newMinutes >= 10) System.out.println("0" + newHours + ":" + newMinutes);
        else if (newHours >= 10 & newMinutes <= 10) System.out.println(newHours + ":0" + newMinutes);
        else System.out.println(newHours + ":" + newMinutes);


    }
}
