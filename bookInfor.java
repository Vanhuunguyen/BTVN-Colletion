package BTVN_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class bookInfor {
    Book bk = new Book();
    public ArrayList<Book> bookList = new ArrayList<>();
    public void themSach (Book bk){
        this.bookList.add(bk);
    }
    public Book findBookByIsbn(String isbn) {
        for (Book bk : bookList) {
            if (isbn.equals(bk.getIsbn())) {
                return bk;
            }
        }
        return null;
    }
    public Book upDate(String isbn) {
        for (Book bk : bookList) {
            if (isbn.equals(bk.getIsbn())) {
                bk.getAuthor();
                bk.getTitle();
                bk.getYearPublished();

            } else
                System.out.println("k co sach nay");

        }
        return null;
    }
    public void xoaBook (String isbn){
            Book bk = upDate(isbn);
            if (bk != null) {
                bookList.remove(bk);
            } else
                System.out.println("k co sach nay");
    }

    public void timBangAuthor(String author) {
        for (Book bk : bookList) {
            if (author.equals(bk.getAuthor())) {
                System.out.println(bk);
            }
        }
    }
    public void sapXep(){
        bookList.sort(Comparator.comparingInt(Book::getYearPublished));
    }


}
