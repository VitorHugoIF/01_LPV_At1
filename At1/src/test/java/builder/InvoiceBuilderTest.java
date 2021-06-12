/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class InvoiceBuilderTest {

    public InvoiceBuilderTest() {
    }

    @Test
    public void testNumberException() {
        try {
            InvoiceBuilder invoiceBuilder = new InvoiceBuilder();

            Invoice invoice = invoiceBuilder
                    .setCustomerName("Cliente teste")
                    .setIssueDate("2021-06-06")
                    .setProviderName("Fornecedor teste")
                    .setDueDate("2021-07-06")
                    .setValue(100.56)
                    .build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número inválido", e.getMessage());
        }
    }

    @Test
    public void testDueDateException() {
        try {
            InvoiceBuilder invoiceBuilder = new InvoiceBuilder();

            Invoice invoice = invoiceBuilder
                    .setCustomerName("Cliente teste")
                    .setIssueDate("2021-06-06")
                    .setProviderName("Fornecedor teste")
                    .setValue(100.56)
                    .setNumber("0001")
                    .build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data inválida", e.getMessage());
        }
    }

    @Test
    public void testValueException() {
        try {
            InvoiceBuilder invoiceBuilder = new InvoiceBuilder();

            Invoice invoice = invoiceBuilder
                    .setCustomerName("Cliente teste")
                    .setIssueDate("2021-06-06")
                    .setProviderName("Fornecedor teste")
                    .setDueDate("2021-07-06")
                    .setNumber("0001")
                    .build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("valor inválido", e.getMessage());
        }
    }

    @Test
    public void testValidInvoice() {
        InvoiceBuilder invoiceBuilder = new InvoiceBuilder();

        Invoice invoice = invoiceBuilder
                .setCustomerName("Cliente teste")
                .setIssueDate("2021-06-06")
                .setProviderName("Fornecedor teste")
                .setValue(100.56)
                .setDueDate("2021-07-06")
                .setNumber("0001")
                .build();

        assertNotNull(invoice);
    }
}
