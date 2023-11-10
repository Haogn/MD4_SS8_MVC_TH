package rikkei.acdemy.service;

import rikkei.acdemy.model.Customers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomersServiceIMPL implements ICustomersService {

    private static Map<Integer, Customers> customerss ;
    static {
        customerss = new HashMap<>();
        customerss.put(1, new Customers(1, "John", "john@rikkei.academy", "Hanoi"));
        customerss.put(2, new Customers(2, "Bill", "bill@rikkei.academy", "Danang"));
        customerss.put(3, new Customers(3, "Alex", "alex@rikkei.academy", "Saigon"));
        customerss.put(4, new Customers(4, "Adam", "adam@rikkei.academy", "Beijin"));
        customerss.put(5, new Customers(5, "Sophia", "sophia@rikkei.academy", "Miami"));
        customerss.put(6, new Customers(6, "Rose", "rose@rikkei.academy", "Newyork"));
    }
    @Override
    public List<Customers> findAll() {
        return new ArrayList<>(customerss.values());
    }

    @Override
    public void save(Customers customers) {
        customerss.put(customers.getId(),customers);
    }

    @Override
    public Customers findById(int id) {
        return customerss.get(id);
    }

    @Override
    public void update(int id, Customers customers) {
        customerss.put(id, customers);
    }

    @Override
    public void remove(int id) {
        customerss.remove(id);
    }
}
