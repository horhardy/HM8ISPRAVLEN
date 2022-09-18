public class Main {

    public static void main(String[] args) {
        Author author = new Author ("VADIM","Bakumets");
        Book books = new Book("It", 2015, author);
        System.out.println("books =" + books.name);
        System.out.println("books =" + books.year);
        System.out.println("author =" + author.nameAuthor + " " + author.surnameAuthor);




    }

}