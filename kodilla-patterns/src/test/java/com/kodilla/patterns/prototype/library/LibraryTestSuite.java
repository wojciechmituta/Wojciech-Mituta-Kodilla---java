package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Book book1 = new Book("abc", "abcd", LocalDate.of(1991, 2, 1));
        Book book2 = new Book("asdf", "asdfgh", LocalDate.of(2005, 6, 18));
        Book book3 = new Book("yhgjhgh", "hjhfkkjgf", LocalDate.of(2010, 5, 10));
        Book book4 = new Book("uhjkhgfgdf", "vjvcfdsdf", LocalDate.of(1956, 3, 29));
        Book book5 = new Book("fssfskmrlkmr", "eeew", LocalDate.of(1987, 3, 15));
        Book book6 = new Book("lkjkhg", "hhjnmbvf", LocalDate.of(1999, 2, 9));

        Library library = new Library("bookList");

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);
        library.getBooks().add(book6);

        //When
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("bookList 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("bookList 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(book6);

        //Then
        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, clonedLibrary.getBooks().size());
        Assert.assertEquals(6, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), clonedLibrary.getBooks());
    }
}
