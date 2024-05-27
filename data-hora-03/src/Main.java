import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeek = d04.minusDays(7); // 7 dias antes de d04
        LocalDate nextWeek = d04.plusDays(7);
        LocalDateTime pastWeekLDT = d05.minusDays(7); // 7 dias antes de d04
        LocalDateTime nextWeekLDT = d05.plusDays(7);
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);


        System.out.println("pastWeek: " + pastWeek);
        System.out.println("nextWeek: " + nextWeek);
        System.out.println("pastWeekLDT: " + pastWeekLDT);
        System.out.println("nextWeekLDT: " + nextWeekLDT);
        System.out.println("pastWeekInstant: " + pastWeekInstant);
        System.out.println("nextWeekInstant: " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeek.atTime(0, 0), d04.atStartOfDay()); // tem que converter pra LocalDateTime pra saber a hora do dia
        Duration t2 = Duration.between(pastWeekLDT, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant); // retorna data negativa pois a menor data esta na frente

        System.out.println("t1 dias: " + t1.toDays());
        System.out.println("t2 dias: " + t2.toDays());
        System.out.println("t3 dias: " + t3.toDays());
        System.out.println("t4 dias: " + t4.toDays());  // retorna data negativa pois a menor data esta na frente em t4

    }
}