import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("alex");
        list.add("bob");
        list.add("hara");
        list.add("ca");
        list.add(2, "Metido :P");

        for (String el : list) {
            System.out.println(el);
        }

        System.out.println("List size: " + list.size());
        System.out.println("--------------------------");

        list.remove("hara");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String el : list) {
            System.out.println(el);
        }
        System.out.println("--------------------------");

        System.out.println("Index of ca: " + list.indexOf("ca"));

        list.add("Homer");
        list.add("Batman");
        list.add("Lebowski");
        list.add("Thor");
        list.add("Bart");
        for (String el : list) {
            System.out.println(el);
        }

        System.out.println("--------------------------");


        List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());

        for (String el : result) {
            System.out.println(el);
        }

        String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);

        System.out.println("--------------------------");
        System.out.println("Primeiro elemento comcecando com B: " + name);


    }
}