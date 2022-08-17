package com.jiajunzhang.invoicecreateor.repository;

import com.jiajunzhang.invoicecreateor.model.invoice.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
