import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int published;

    public Book(String title, Author author, int published) {
        this.title = title;
        this.published = published;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublished() {
        return this.published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "Название: " + title + " Автор: " + author.toString() + ". " + "Год издания: " + published;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return published == book.published && Objects.equals(title, book.title) && Objects.equals(book, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, published, author);
    }

}