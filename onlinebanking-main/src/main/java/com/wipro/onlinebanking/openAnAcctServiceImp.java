package com.wipro.onlinebanking;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class openAnAcctServiceImp implements openAnAcctService {

	@Autowired
    private openAnAcctRepository openAnAcctRepository;

	@Override
    public openAnAcct createopenAnAcct(openAnAcct openAnAcct) {
        return openAnAcctRepository.save(openAnAcct);
    }
    @Override
    public List < openAnAcct > getAllopenAnAcct() {
        return this.openAnAcctRepository.findAll();
    }
}
