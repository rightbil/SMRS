package dev.cs.studentreportcard.security;
import org.springframework.security.core.userdetails.UserDetailsService;
public interface UserService extends UserDetailsService {
    User findByEmail(String email);
    User save(UserRegistrationDto registration);
}