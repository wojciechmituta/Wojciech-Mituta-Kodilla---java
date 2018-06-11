package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest

public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    InvoiceDao invoiceDao;
    private static final String NAME = "Kapcie";
    private static final String NUMBER = "Pierwsza";

    @Test
    public void testInvoiceDaoSave() {
        Product product = new Product(NAME);
        Item item1 = new Item(new BigDecimal(10), 10, new BigDecimal(10));
        Item item2 = new Item(new BigDecimal(20), 20, new BigDecimal(20));
        Item item3 = new Item(new BigDecimal(30), 30, new BigDecimal(30));

        Invoice invoice = new Invoice(NUMBER);

        item1.setProduct(product);
        item2.setProduct(product);
        item3.setProduct(product);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        productDao.save(product);
        invoiceDao.save(invoice);
        long result = invoiceDao.count();

        //Then
        Integer idProduct = product.getId();
        Integer idInvoice = invoice.getId();
        Assert.assertNotEquals(3, result);

        //CleanUp
        invoiceDao.delete(idInvoice);
    }
}
