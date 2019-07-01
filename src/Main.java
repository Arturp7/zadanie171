import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils util = new Utils();
        List<Month> months= util.months();

        Season[] seasons = Season.values();

        System.out.println("Podaj nazwę pory roku");
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();

        Season season = null;
        try {
            season = Season.valueOf(scan);
        } catch (IllegalArgumentException e) {
            for (Season season1 : seasons) {
                if (season1.getTranslation().equalsIgnoreCase(scan)) {
                    season = season1;
                    break;
                }
            }
        }
        if (season != null){
            for (Month month : months) {
                if (month.getSeason() == season) {
                    System.out.println(month);
                }
            }
        }else {
            System.out.println("Wpisz prawidłową porę roku");
        }

    }
}
