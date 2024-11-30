//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //objects - Beka
        //menu - Elzar



//        Client[] clients = {
//                new Client("Анна Смирнова", 100, 25),
//                new Client("Иван Иванов", 50, 30),
//                new Client("Елена Кузнецова", 75, 22),
//                new Client("Олег Васильев", 40, 35),
//                new Client("Мария Петрова", 90, 28),
//                new Client("Алексей Сидоров", 60, 45),
//                new Client("Светлана Орлова", 80, 33),
//                new Client("Дмитрий Кузьмин", 70, 40),
//                new Client("Ольга Зайцева", 110, 26),
//                new Client("Павел Морозов", 30, 50)
//        };



        Client[] clients = {
                new Client("Анна Смирнова", 25, 100),
                new Client("Иван Иванов", 30, 50),
                new Client("Елена Кузнецова", 22, 750),
                new Client("Олег Васильев", 20, 300),
                new Client("Мария Петрова", 39, 2800),
                new Client("Алексей Сидоров", 60, 3999),
                new Client("Светлана Орлова", 20, 8999),
                new Client("Дмитрий Кузьмин", 33, 788),
                new Client("Ольга Зайцева", 12, 788),
                new Client("Павел Морозов", 18, 900)
        };


        Book[] books = {
                new Book("Война и мир", "Лев Толстой", 1225, "Роман", LocalDate.of(1869, 1, 1), false),
                new Book("1984", "Джордж Оруэлл", 328, "Антиутопия", LocalDate.of(1949, 6, 8), false),
                new Book("Преступление и наказание", "Федор Достоевский", 671, "Роман", LocalDate.of(1866, 11, 15), false),
                new Book("Мастер и Маргарита", "Михаил Булгаков", 500, "Роман", LocalDate.of(1967, 5, 1),false),
                new Book("Гарри Поттер и философский камень", "Дж. К. Роулинг", 223, "Фэнтези", LocalDate.of(1997, 6, 26), true),
                new Book("Улисс", "Джеймс Джойс", 730, "Роман", LocalDate.of(1922, 2, 2), false),
                new Book("Маленький принц", "Антуан де Сент-Экзюпери", 96, "Сказка", LocalDate.of(1943, 4, 6),false),
                new Book("Зеленая миля", "Стивен Кинг", 400, "Драма", LocalDate.of(1996, 3, 28),false),
                new Book("Атлант расправил плечи", "Айн Рэнд", 1168, "Философия", LocalDate.of(1957, 10, 10),false),
                new Book("Старик и море", "Эрнест Хемингуэй", 127, "Рассказ", LocalDate.of(1952, 9, 1), true)
        };

//        Bron[] reservations = new Bron[10];
//
//
//        for (int i = 0; i < clients.length; i++) {
//            Book book = books[i % books.length];
//            if (!book.isAvailable()) {
//                book.setAvailable(true);
//                reservations[i] = new Bron(clients[i], book, LocalDate.now(), LocalDate.now().plusDays(7));
//            }
//        };
//
//        for (Bron reservation : reservations) {
//            if (reservation != null) {
//                reservation.getBook().setAvailable(false);
//                System.out.println("Бронирование завершено для книги: " + reservation.getBook().getTitle());
//            }
//        }
    }
}