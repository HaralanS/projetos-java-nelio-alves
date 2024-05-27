package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Program {

    public static void main(String[] args) throws ParseException {

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat fmt02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

//        LocalDate localDate = LocalDate.parse(dateInput, fmt01);
//        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        LocalDateTime localDate = LocalDateTime.parse("21/06/2018 13:05:44", fmt01);
        Date date = Date.from(localDate.atZone(ZoneId.systemDefault()).toInstant());

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(date, "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        p1.addComment(c1);
        p1.addComment(c2);

        date = fmt02.parse("28/07/2018 23:14:19");
        Post p2 = new Post(date, "Good night guys", "See you tomorrow", 5);
        p2.addComment(new Comment("Good night"));
        p2.addComment(new Comment("May the Force be with you"));


        System.out.println();
        System.out.println(p1);
        System.out.println();
        System.out.println(p2);


//        System.out.println(p1.getTitle());
//        System.out.println(p1.getLikes() + " Likes - " + p1.getMoment().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().format(fmt01));
////        System.out.println(p1.getMoment().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().format(fmt01));
//        System.out.println(p1.getContent());
//        System.out.println("Comments: ");
//        for(Comment c: p1.getComments()) {
//            System.out.println(c.getText());
//        }
//        System.out.println();
//
//        System.out.println(p2.getTitle());
//        System.out.println(p2.getLikes() + " Likes - " + fmt02.format(p2.getMoment()));
////        System.out.println(p2.getMoment().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().format(fmt01));
////        System.out.println(fmt02.format(p2.getMoment()));
//        System.out.println(p2.getContent());
//        System.out.println("Comments: ");
//        for(Comment c: p2.getComments()) {
//            System.out.println(c.getText());
//        }
//        System.out.println(p1.getComments());
    }
}
