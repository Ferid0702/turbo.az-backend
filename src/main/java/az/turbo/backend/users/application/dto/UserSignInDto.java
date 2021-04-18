package az.turbo.backend.users.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserSignInDto {
    @NotBlank(message = "Username is required!")
    @Email(message = "Invalid email format!")
    private String username;

    @NotBlank(message = "Password is required!")
    private String password;
}
