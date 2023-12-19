package baitap7;

public class Book {
    String id;
    String title;
    String author;
    String category;
    String publisher;
    int year;

    public Book() {
    }

    public Book(String id, String title, String author, String category, String publisher, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.publisher = publisher;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    //    Mã sách id
//    Tên sách title
//    Tác giả author
//    Thể loại category
//    Nhà xuất bản publisher
//    Năm xuất bản year

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }



    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", category=" + category +
                ", publiser=" + publisher +
                ", email='" + year + '\'' +
                '}';
    }
}
