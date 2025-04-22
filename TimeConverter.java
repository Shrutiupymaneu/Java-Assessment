public class TimeConverter {
    public static String convertSeconds(long totalSeconds) {
        long days = totalSeconds / 86400;
        long hours = (totalSeconds % 86400) / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;
        return days + " Day(s) " + hours + " Hour(s) " + minutes + " Minute(s) " + seconds + " Second(s)";
    }

    public static void main(String[] args) {
        long totalSeconds = 100000; 
        String result = convertSeconds(totalSeconds);
        System.out.println(result);
    }
}