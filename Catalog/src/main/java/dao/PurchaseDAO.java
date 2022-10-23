package dao;

import entity.Purchase;

import java.util.List;


public interface PurchaseDAO extends Dao{

    Purchase get(long id);

    List<Purchase> getAll();

    long create(Purchase purchase);

    void deleteAll();
}
