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
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;
    private static final String NAME = "Kapcie";
    private static final String NUMBER = "Pierwsza";


    @Test
    public void itemTest() {
        //Given
        Product product = new Product(NAME);
        Invoice invoice = new Invoice(NUMBER);
        Item item1 = new Item(new BigDecimal(10), 10, new BigDecimal(10));


        product.getItems().add(item1);
        item1.setProduct(product);
        invoice.getItems().add(item1);
        item1.setInvoice(invoice);

        //When
        //productDao.save(product);
        //invoiceDao.save(invoice);
        itemDao.save(item1);
        int id = item1.getId();

        //Then
        Assert.assertNotEquals(1, id);
    }
}
