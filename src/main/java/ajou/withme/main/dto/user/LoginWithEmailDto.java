package ajou.withme.main.dto.user;

import lombok.Data;

@Data
public class LoginWithEmailDto {
    private String email;
    private String pwd;
}