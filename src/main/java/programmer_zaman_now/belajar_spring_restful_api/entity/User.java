package programmer_zaman_now.belajar_spring_restful_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    private String username;

    private String password;

    private String name;

    private String token;

    @Column(name = "token_expired_at")
    private Long tokenExpiredAt;

    @OneToMany(mappedBy = "user") // 1 user bisa banyak kontak
    private List<Contact> contacts;
}
