package ajou.withme.main.Service;

import ajou.withme.main.Repository.UserRepository;
import ajou.withme.main.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User findUserByUid(String uid) {
        return userRepository.findByUid(uid);
    }

    public List<User> findUserByNamePhone(String name, String phone) {
        return userRepository.findByNamePhone(name, phone);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
