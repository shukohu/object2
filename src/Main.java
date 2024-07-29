//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author rowling = new Author("J.K", "Rowling");

        Book harryPotter = new Book("Harry Potter", rowling, 1997);
        System.out.println(harryPotter);
        System.out.println(harryPotter.getAuthor().getName() + " " + harryPotter.getAuthor().getLastName());
        System.out.println(harryPotter.getTitle() +" " + harryPotter.getPublished());
        harryPotter.setPublished(1997);
        System.out.println(harryPotter.getPublished());

        Author green = new Author("John", "Green");
        Book theFaultInOurStars = new Book("The Fault in Our Stars", green, 2012);
        System.out.println(theFaultInOurStars.getAuthor().getName() + " " + theFaultInOurStars.getAuthor().getLastName());
        System.out.println(theFaultInOurStars.getTitle() + " " + theFaultInOurStars.getPublished());

        System.out.println(" ");
        System.out.println(theFaultInOurStars.getPublished()== theFaultInOurStars.getPublished());
        System.out.println(theFaultInOurStars.equals((theFaultInOurStars)));
        System.out.println(green.equals(green));
    }
}