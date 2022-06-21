package com.wipro.onlinebanking;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class openAnAcctController {

	@Autowired
    private openAnAcctService openAnAcctService;

    @GetMapping("/openAnAcct")
    public ResponseEntity < List < openAnAcct >> getAllopenAnAcct() {
        return ResponseEntity.ok().body(openAnAcctService.getAllopenAnAcct());
    }
    
    @PostMapping("/openAnAcct")
    public ResponseEntity < openAnAcct > createopenAnAcct(@RequestBody openAnAcct openAnAcct) {
        return ResponseEntity.ok().body(this.openAnAcctService.createopenAnAcct(openAnAcct));
    }
}
