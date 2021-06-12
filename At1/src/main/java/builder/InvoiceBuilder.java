/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author vitor.marcelino
 */
public class InvoiceBuilder {

    private Invoice invoice;
    
    public InvoiceBuilder() {
        this.invoice = new Invoice();
    }
    
    public Invoice build() {
        if (invoice.getNumber() == null || invoice.getNumber().equals("")) {
            throw new IllegalArgumentException("Número inválido");
        }
        
        if (invoice.getDueDate() == null || invoice.getDueDate().equals("")) {
            throw new IllegalArgumentException("Data inválida");
        }
        
        if (invoice.getValue() == null || invoice.getValue() < 0) {
            throw new IllegalArgumentException("valor inválido");
        }
        
        return invoice;
    }
    
    public InvoiceBuilder setNumber(String number) {
        invoice.setNumber(number);
        return this;
    }
    
    public InvoiceBuilder setDueDate(String dueDate) {
        invoice.setDueDate(dueDate);
        return this;
    }
    
    public InvoiceBuilder setIssueDate(String issueDate) {
        invoice.setIssueDate(issueDate);
        return this;
    }
    
    public InvoiceBuilder setValue(Double value) {
        invoice.setValue(value);
        return this;
    }
    
    public InvoiceBuilder setCustomerName(String customerName) {
        invoice.setCustomerName(customerName);
        return this;
    }
    
    public InvoiceBuilder setProviderName(String providerName) {
        invoice.setProviderName(providerName);
        return this;
    }
}
