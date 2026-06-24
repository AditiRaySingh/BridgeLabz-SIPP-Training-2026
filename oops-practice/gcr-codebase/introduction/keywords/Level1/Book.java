class Book {
    static String libraryName = "Central Library";

    String title;
    String author;
    final int isbn;

    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void display() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(isbn);
    }

    public static void main(String[] args) {
        Book b = new Book("Java", "James", 1234);

        if (b instanceof Book) {
            displayLibraryName();
            b.display();
        }
    }
}