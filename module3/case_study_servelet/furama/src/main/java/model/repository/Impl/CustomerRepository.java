package model.repository.Impl;

import model.bean.Customer;
import model.repository.ICustomerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String SELECT_ALL_CUSTOMER = "SELECT * FROM customer;";
    private static final String INSERT_CUSTOMER = "INSERT INTO CUSTOMER(customer_name,customer_birthday,custmer_gender,customer_id_card,customer_phone,customer_email,customer_address,customer_type_id) values(?,?,?,?,?,?,?,?);";
    private static final String SELECT_CUSTOMER_BY_ID = "SELECT * FROM CUSTOMER WHERE customer_id = ?";

    @Override
    public List<Customer> selectFindAll() {
        Connection connection = BaseRepository.getConnection();
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("customer_id");
                int typeId = rs.getInt("customer_type_id");
                String name = rs.getString("customer_name");
                String birthday = rs.getString("customer_birthday");
                boolean gender = rs.getBoolean("custmer_gender");
                String id_card = rs.getString("customer_id_card");
                String phone = rs.getString("customer_phone");
                String email = rs.getString("customer_email");
                String address = rs.getString("customer_address");
                Customer customer = new Customer(id, name, birthday, gender, id_card, phone, email, address, typeId);
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customerList;
    }

    @Override
    public Customer selectCustomer(int id) {
        return null;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return false;
    }

    @Override
    public boolean deleteCustomer(int id) {
        return false;
    }

    @Override
    public List<String> insertCustomer(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> search(String search) {
        return null;
    }
}
