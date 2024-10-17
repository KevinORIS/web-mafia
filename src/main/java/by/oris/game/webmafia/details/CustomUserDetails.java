package by.oris.game.webmafia.details;

import java.util.Collection;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {

    private String email;
    private String name;
    private Collection<? extends GrantedAuthority> authorities;
    private String password;

    public CustomUserDetails(String email, String name, Collection<? extends GrantedAuthority> authorities,
                             String password) {
        this.email = email;
        this.name = name;
        this.authorities = authorities;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}