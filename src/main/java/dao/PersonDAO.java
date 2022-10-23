package dao;

import entity.Person;


public interface PersonDAO extends Dao{

    Person get(long id);

    Person getByName(String login);

    long create(Person account);

    void deleteAll();
}
