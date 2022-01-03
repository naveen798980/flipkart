package flipkart.domain.customer.gateway;

import flipkart.domain.customer.Customer;
import flipkart.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
