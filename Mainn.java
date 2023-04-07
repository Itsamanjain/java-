import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "orange" -> System.out.println("very sour fruit");
            //case "banana" -> System.out.println("good for bones");
            case "papaya" -> System.out.println("a tropical fruit with a sweet and musky flavor");
            case "dragonfruit" -> System.out.println("unique-looking and refreshing");
            case "mangosteen" -> System.out.println("a sweet and tangy fruit with a tough outer shell");
            case "lychee" -> System.out.println("a small fruit with a delicate flavor and texture");
            case "passionfruit" -> System.out.println("tangy and exotic, often used in desserts");
            case "guava" -> System.out.println("a tropical fruit with a sweet and tangy flavor");
            case "fig" -> System.out.println("sweet and soft, often used in jams and spreads");
            case "persimmon" -> System.out.println("sweet and flavorful, often used in baking");
            case "coconut" -> System.out.println("a versatile fruit used in many dishes and drinks");
            case "avocado" -> System.out.println("creamy and nutritious, often used in salads and dips");
            case "blackberry" -> System.out.println("juicy and tart, often used in baked goods and jams");
            case "blueberry" -> System.out.println("sweet and tangy, often used in muffins and pancakes");
            case "banana" -> System.out.println("a great source of potassium");
            case "apple" -> System.out.println("an apple a day keeps the doctor away");
            //case "orange" -> System.out.println("rich in vitamin C");
            case "pineapple" -> System.out.println("tropical and juicy");
            case "watermelon" -> System.out.println("refreshing and hydrating");
            case "grape" -> System.out.println("delicious and versatile");
            case "kiwi" -> System.out.println("small but packed with nutrition");
            case "strawberry" -> System.out.println("sweet and fragrant");
            case "peach" -> System.out.println("juicy and fuzzy");
            case "pear" -> System.out.println("crunchy and flavorful");
            case "cherry" -> System.out.println("a tasty snack, but watch out for the pit!");
            case "grapes" -> System.out.println("very tiny but good fruits");
            default -> System.out.println("not a defind fruit");

        }

    }

}
