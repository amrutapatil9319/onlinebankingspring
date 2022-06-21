package com.wipro.onlinebanking;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class loginServiceImp implements loginService {

	@Autowired
    private loginRepository loginRepository;

	@Override
    public login createlogin(login login) {
        return loginRepository.save(login);
    }
    @Override
    public List < login > getAlllogin() {
        return this.loginRepository.findAll();
    }

}
