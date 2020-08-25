package com.book.contacts.controller;

import com.book.contacts.DTO.LoginDTO;
import com.book.contacts.model.UserModel;
import com.book.contacts.repository.UserRepo;
import com.book.contacts.security.TokenUtils;
import com.book.contacts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import  com.book.contacts.model.ChangePasswordData;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepo userRepo;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;


   
    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    TokenUtils tokenUtils;

    @CrossOrigin
    @PostMapping(value = "/api/login")
    public ResponseEntity<String> login(@RequestBody LoginDTO loginDTO) {
        try {
            UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
                    loginDTO.getUsername(), loginDTO.getPassword());
            Authentication authentication = authenticationManager.authenticate(token);
            UserDetails details = userDetailsService.loadUserByUsername(loginDTO.getUsername());
            System.out.println(details.toString());
            return new ResponseEntity<String>(tokenUtils.generateToken(details),
                    HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<String>("Invalid login", HttpStatus.BAD_REQUEST);
        }
    }
    @CrossOrigin
    @PostMapping("/api/password")
    public ResponseEntity<?> changePass(@RequestBody ChangePasswordData changePasswordData){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserModel userModel = userRepo.findByUsername(authentication.getName());
        if(bCryptPasswordEncoder.matches(changePasswordData.getOldPassword(),userModel.getPassword())){
            userModel.setPassword(bCryptPasswordEncoder.encode(changePasswordData.getNewPassword()));
            userRepo.save(userModel);
            return  new ResponseEntity<>(HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    @CrossOrigin
    @GetMapping("api/user")
    public ResponseEntity<?> getAll(){

        return  new ResponseEntity<List<UserModel>>(userService.getALl(), HttpStatus.OK);

    }
}
