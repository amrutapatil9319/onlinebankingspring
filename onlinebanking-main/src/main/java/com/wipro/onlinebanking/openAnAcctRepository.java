package com.wipro.onlinebanking;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface openAnAcctRepository extends MongoRepository < openAnAcct, Long>{

}
