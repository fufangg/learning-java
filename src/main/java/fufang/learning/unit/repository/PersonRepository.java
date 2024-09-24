package fufang.learning.unit.repository;

import fufang.learning.unit.data.Person;

public interface PersonRepository {

    Person selectById(String id);

    void insert(Person person);
}
