package com.wipro.onlinebanking;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface loginRepository extends MongoRepository < login, Long>{

}
