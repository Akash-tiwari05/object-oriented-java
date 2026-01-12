package SwitchStatement;


public class quarterOfMonth {
    public static void main(String[] args) {
        String month = "May";
        System.out.println(quarter(month));
    }
    public static String quarter(String month){

        switch (month){
            case "January", "February", "March" ->{
                return "1st Quarter";
            }
            case "April", "May", "June" ->{
                return "2nd Quarter";
            }
            case "July", "August", "September" ->{
                return "3rd Quarter";
            }
            default -> {
                return "4th Quarter";
            }
        }
    }
}
