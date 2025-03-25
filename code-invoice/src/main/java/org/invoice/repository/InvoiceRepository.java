package org.invoice.repository;
import org.invoice.model.Invoice;
import org.invoice.model.Product;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InvoiceRepository implements PanacheRepository<Invoice> {
}
