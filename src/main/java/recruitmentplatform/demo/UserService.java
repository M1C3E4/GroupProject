package recruitmentplatform.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Service
public class UserService {

    private UserRepository userRepository;
    private ObjectMapper objectMapper;


    @GetMapping("/users")
    public ResponseEntity getUsers() throws JsonProcessingException {
        List<EntityUser> userList = userRepository.findAll();
        return ResponseEntity.ok(objectMapper.writeValueAsString(userList));
    }

    @PostMapping("/users")
    public ResponseEntity addUser(@RequestBody EntityUser entityUser){
        EntityUser savedUser = userRepository.save(entityUser);
        return ResponseEntity.ok(savedUser);
    }
}


