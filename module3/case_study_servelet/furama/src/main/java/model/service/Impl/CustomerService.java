package model.service.Impl;

import model.bean.Customer;
import model.repository.ICustomerRepository;
import model.repository.Impl.CustomerRepository;
import model.service.ICustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {
    ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> selectFindAll() {
        return customerRepository.selectFindAll();
    }

    @Override
    public Customer selectCustomer(int id) {
        return customerRepository.selectCustomer(id);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return customerRepository.updateCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(int id) {
        return customerRepository.deleteCustomer(id);
    }

    @Override
    public List<String> insertCustomer(Customer customer) {
        List<String> stringList = new ArrayList<>();
        return stringList;
    }

    @Override
    public List<Customer> search(String search) {
        return customerRepository.search(search);
    }
}
