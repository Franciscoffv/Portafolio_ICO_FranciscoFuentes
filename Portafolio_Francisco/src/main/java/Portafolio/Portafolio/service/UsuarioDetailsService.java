package Portafolio.Portafolio.service;

import org.springframework.security.core.userdetails.*;

/**
 *
 * @author jeshu
 */
public interface UsuarioDetailsService {
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}