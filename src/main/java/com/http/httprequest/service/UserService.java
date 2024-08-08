package com.http.httprequest.service;

import com.http.httprequest.dto.UserDTO;
import com.http.httprequest.entity.User;
import com.http.httprequest.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

        @Autowired
        private UserRepo userRepo;

        @Autowired
        private ModelMapper modelMapper;

        public UserDTO saveUser(UserDTO userDTO){
            userRepo.save(modelMapper.map(userDTO, User.class));
            return userDTO;
        }


}
