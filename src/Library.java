import java.util.Arrays;
import java.time.LocalDate;
public class Library {
    private String name;
    private String address;
    private String balance;
    private Book[] books;
    private Bron[] brons;
    private Client[] clients;

    public Library(String name, String address, String balance, Book[] books, Bron[] brons, Client[] clients) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.books = books;
        this.brons = brons;
        this.clients = clients;
    }


    // посмотреть доступные книги - Нурис
    // посмотреть занятые книги - Марсель
    // Забронировать книгу - Ринат
    // Вернуть книгу - Алтынайreturn
    public Library(String fio, String nameOfBook, LocalDate nowDate) {
        for(int i =0; i < clients.length; i++){
            while(fio.equalsIgnoreCase(clients[i].getFullName()) && nameOfBook.equalsIgnoreCase(books[i].getTitle())){
                if(nowDate.isAfter(brons[i].getEndDate())){
                    int dayNow = nowDate.getDayOfMonth();
                    int dayOfLimit = brons[i].getEndDate().getDayOfMonth();
                    int Raznica = dayOfLimit - dayNow;
                    int SummaShtrafa = Raznica*100;
                    clients[i].setBalance(clients[i].getBalance() - SummaShtrafa);
                }else{
                    books[i].setAvailable(true);
                }
            }

        }
    }
    // Выход - я


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Bron[] getBrons() {
        return brons;
    }

    public void setBrons(Bron[] brons) {
        this.brons = brons;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Library: " +
                "name='" + name + '\n' +
                "address='" + address +  '\n' +
                "balance='" + balance +  '\n' +
                "books=" + Arrays.toString(books) +  '\n' +
                "brons=" + Arrays.toString(brons) +  '\n' +
                "clients=" + Arrays.toString(clients) ;
    }
}
