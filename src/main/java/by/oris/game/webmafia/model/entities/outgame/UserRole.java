package by.oris.game.webmafia.model.entities.outgame;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "user_roles")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_role_id",unique = true, nullable = false)
    private int id;
    private String name;
    @OneToMany
    private Set<User> users;
}
