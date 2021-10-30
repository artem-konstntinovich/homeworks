
package bookauthorclassesexample;


public class Book {

    public Book(String title, int yearWritting, int yearPublish, Author author, String publisher) {
        this.title = title;
        this.yearWritting = yearWritting;
        this.yearPublish = yearPublish;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", yearWritting=" + yearWritting + ", yearPublish=" + yearPublish + ", author=" + author + ", publisher=" + publisher + '}';
    }

    public String getTitle() {
        return title;
    }

    public int getYearWritting() {
        return yearWritting;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    String title;
    int yearWritting;
    int yearPublish;// кандидат на список или массив
    Author author;// кандидат на список или массив
    String publisher;
}
