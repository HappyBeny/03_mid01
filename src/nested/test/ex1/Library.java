package nested.test.ex1;

public class Library {
    private Book[] books;
    private int count;

    public Library(int number){
        books = new Book[number];
        count = 0;
    }

    public void addBook(String title, String author){
        if (count < books.length){
            books[count++] = new Book(title,author);
        } else {
            System.out.println("저장 공간이 부족합니다");
        }
    }

    public void showBooks(){
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < count; i++) {
            System.out.println("도서 제목 : " + books[i].title + ", 저자 : " + books[i].author);
        }
    }

    private static class Book{
        private String title;
        public String author;

        public Book(String name, String author){
            this.title = name;
            this.author = author;
        }
    }
}
