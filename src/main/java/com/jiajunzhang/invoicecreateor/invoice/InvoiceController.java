package com.jiajunzhang.invoicecreateor.invoice;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {
    private InvoiceService invoiceService;
    @GetMapping("/all")
    public List<Invoice> getAllInvoices(){
        return invoiceService.getAll();
    }
    @GetMapping("/{id}")
    public Invoice getInvoice(@PathVariable Long id){
       return invoiceService.getInvoice(id);
    };
    @PostMapping
    public Invoice invoice(@RequestBody Invoice body){
        return invoiceService.createInvoice(body);
    }

    @PutMapping("/{id}")
    public Invoice updateInvoice(@RequestBody Invoice body){
        return invoiceService.updateInvoice(body);
    }
}
