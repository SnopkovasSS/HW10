//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
public class App {
    public static <Author> void main(String[] args) {
        Author author1 = new Author();
        Author author2 = new Author();

        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        // Изменим год публикации
        book1.setPublicationYear(1870);
        System.out.println("Обновлённый год публикации: " + book1.getPublicationYear());

        // Сравнение авторов и книг
        System.out.println("Автор 1 равен автору 2? " + author1.equals(author2));
        System.out.println("Книга 1 равна книге 2? " + book1.equals(book2));
    }
}