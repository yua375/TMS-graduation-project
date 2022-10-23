package service;

import entity.Person;
import exception.DBException;
import exception.ServiceException;


public interface UserService extends PersonService {

    void setPurchase(long itemId, int amount, Person person) throws DBException, ServiceException;
}
