import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

//         Nao fiz nada ainda :P
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt01); // da pra botar diretamente o formater no lugar da variavel. -> DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt02);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

//        System.out.println("d01: " + d01); // o programa entende como se fosse d01.toString() pois esta concatenando com string :D
//        System.out.println("d02: " + d02);
//        System.out.println("d03: " + d03.toString()); // botei toString() mas nao precisa :P
//        System.out.println("d04: " + d04);
//        System.out.println("d05: " + d05);
//        System.out.println("d06: " + d06);
//        System.out.println("d07: " + d07);
//        System.out.println("d08: " + d08);
//        System.out.println("d09: " + d09);
//        System.out.println("d10: " + d10);
//        System.out.println("d11: " + d11);

        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyy");
        DateTimeFormatter fmt04 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
        DateTimeFormatter fmt05 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt06 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt07 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("--- fmt03 ---");
        System.out.println("d04: " + d04.format(fmt03)); // maneira de formatar data pra texto de maneira personalizada :o
        System.out.println("d04: " + fmt03.format(d04));
        System.out.println("d04: " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyy")));

        System.out.println("--- fmt04 ---");
        System.out.println("d05: " + d05.format(fmt03));
        System.out.println("d05: " + d05.format(fmt04));

        System.out.println("--- fmt05 ---");
        System.out.println("d06: " + fmt05.format(d06));

        System.out.println("--- fmt06 ---");
        System.out.println("d05: " + d05.format(fmt06));

        System.out.println("--- fmt07 ---");
        System.out.println("d06: " + fmt07.format(d06)); // mesma coisa que so imprimir o d06 com ou sem o toString pois ele ja converte pra string no formato ISO


    }
}