package com.sclaer.lld.srp;

//to save file across different Databases
public interface InvoiceSaver {
    void save(Invoice invoice, String fileName);
}
