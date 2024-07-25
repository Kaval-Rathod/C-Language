class Publication {
    private String title;
    private int price;

    public Publication(String t, int p) {
        title = t;
        price = p;
    }

    public String toString() {
        return String.format("title: %s, price: %d", title, price);
    }
}

class Book extends Publication {
    private String author;
    private int pages;

    public Book(String t, int p, String a, int pg) {
        super(t, p); // Call the superclass constructor
        author = a;
        pages = pg;
    }

    public String toString() {
        return super.toString() +
                String.format(", author: %s, pages: %d", author, pages);
    }
}

class library {
    public static void main(String[] args) {
        Book b = new Book("Halo", 255, "Sam", 125);
        System.out.println(b);
    }
}
