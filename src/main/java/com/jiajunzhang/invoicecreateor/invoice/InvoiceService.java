package com.jiajunzhang.invoicecreateor.invoice;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@AllArgsConstructor
@Service
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;
    public List<Invoice> getAll(){
        return invoiceRepository.findAll();
    }
    public Invoice getInvoice(Long id){
        return invoiceRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invoice not found with ID: " + id));
    }
    public Invoice createInvoice(Invoice invoice){
        return invoiceRepository.save(invoice);
    }
    public Invoice updateInvoice(Invoice invoice){
        Invoice findInvoice = invoiceRepository.findById(invoice.getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invoice not found "+ invoice.getId()));
        //invoice.setCart();
        // update logic etc.
        return findInvoice;
    }
}
