package com.jiajunzhang.invoicecreateor.model.invoice;

import com.jiajunzhang.invoicecreateor.repository.InvoiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
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
        // TODO: add E-Mail send
        return invoiceRepository.save(invoice);
    }
    public Invoice updateInvoice(Invoice invoice){
        Invoice findInvoice = invoiceRepository.findById(invoice.getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invoice not found "+ invoice.getId()));
        //invoice.setCart();
        // TODO: check what values need to be updated
        // update logic etc.
        return findInvoice;
    }
}
