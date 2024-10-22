package Employee.management.service;


import org.springframework.stereotype.Service;

import Employee.management.dto.UserRegistrationDto;
import Employee.management.model.User;

@Service
public interface UserService{
  User save(UserRegistrationDto registrationDto);
}
