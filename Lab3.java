import java.util.Scanner;

class Books {
    String name;
    String author;
    int price;
    int numPages;

    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String toString() {
        String name,author,price,numPages;
        name = "Book name: " + this.name + "\n" ;
        author = "Author name: " + this.author + "\n" ;
        price ="Price: " + this.price + "\n" ;
        numPages= "Number of pages: " + this.numPages + "\n";   
        return name + author + price + numPages;
    }
}

class Lab3 {
    public static void main(String[] args) {
        System.out.println("PUNEETH GIRI B T");
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of Books: ");
        int n;
        n = s.nextInt();

        Books b[];
        b = new Books[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");

            System.out.println("Name: ");
            String name = s.next();

            System.out.println("Author: ");
            String author = s.next();

            System.out.println("Price: ");
            int price = s.nextInt();

            System.out.println("Number of Pages: ");
            int numPages = s.nextInt();

            b[i] = new Books(name, author, price, numPages);
        }
        System.out.println("Details of Books: \n");
        for(int i = 0; i < n; i++) {
            System.out.println(b[i].toString());
        }

    }
}
