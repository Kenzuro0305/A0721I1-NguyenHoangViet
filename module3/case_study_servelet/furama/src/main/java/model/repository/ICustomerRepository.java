package model.repository;

import model.bean.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> selectFindAll();
    Customer selectCustomer(int id);
    boolean updateCustomer(Customer customer);
    boolean deleteCustomer(int id);
    List<String> insertCustomer(Customer customer);
    List<Customer> search(String search);
}
