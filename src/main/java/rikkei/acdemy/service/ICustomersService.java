package rikkei.acdemy.service;



import rikkei.acdemy.model.Customers;

import java.util.List;

public interface ICustomersService {
    List<Customers> findAll();
    void save(Customers customers);
    Customers findById(int id) ;
    void update(int id , Customers customers);
    void remove(int id) ;
}
