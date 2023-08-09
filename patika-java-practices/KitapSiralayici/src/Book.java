public class Book implements Comparable {
    String name;
    int pageNumber;
    String author;
    String publisher;
    int publishYear;
    int edition;
    double price;
    int id;
    public Book(String name, int pageNumber, String author, String publisher, int publishYear, int edition, double price, int id) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.edition = edition;
        this.price = price;
        this.id = id;
    }
    @Override
    public int compareTo(Object o) {
        Book b = (Book) o;
        if(this.name.compareTo(b.name) < 0){
            return -1;
        }
        else if(this.name.compareTo(b.name) > 0){
            return 1;
        }
        return 0;
    }
    
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageNumber=" + pageNumber +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishYear=" + publishYear +
                ", edition=" + edition +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public int getPageNumber() {
      return pageNumber;
    }
}
