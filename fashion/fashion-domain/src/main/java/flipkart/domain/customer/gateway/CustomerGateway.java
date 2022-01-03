package flipkart.domain.customer.gateway;

import flipkart.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
