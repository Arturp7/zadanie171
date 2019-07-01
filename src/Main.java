import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Month grudzien = new Month("Grudzień", Season.WINTER);
        Month styczen = new Month("Styczeń", Season.WINTER);
        Month luty = new Month("Luty", Season.WINTER);
        Month marzec = new Month("Marzec", Season.SPRING);
        Month kwiecien = new Month("Kwiecień", Season.SPRING);
        Month maj = new Month("Maj", Season.SPRING);
        Month czerwiec = new Month("Czerwiec", Season.SUMMER);
        Month lipiec = new Month("Lipiec", Season.SUMMER);
        Month sierpien = new Month("Sierpień", Season.SUMMER);
        Month wrzesien = new Month("Wrzesien", Season.AUTUMN);
        Month pazdziernik = new Month("Pażdziernik", Season.AUTUMN);
        Month listopad = new Month("Pażdziernik", Season.AUTUMN);

        List<Month> months = Arrays.asList(styczen, luty, marzec, kwiecien, maj, czerwiec, lipiec, sierpien, wrzesien,
                pazdziernik, lipiec, sierpien, wrzesien, pazdziernik, listopad, grudzien);
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
