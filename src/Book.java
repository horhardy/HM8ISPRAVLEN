public class Book {
    String name;

    int year;
    //String nameAuthor;
   // String surnameAuthor;



    public Book(String name,  int year) {
        this.name = name;
        this.year = year;
        //this.nameAuthor = nameAuthor;
        //this.surnameAuthor = surnameAuthor;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public int setYear() {
        return year;
    }
}