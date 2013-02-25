package org.aerogear.todo.server.rest;

import org.jboss.aerogear.security.auth.AuthenticationManager;
import org.jboss.aerogear.security.model.AeroGearUser;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.logging.Logger;

@Stateless
public class LoginEndpoint {

    private static final Logger LOGGER = Logger.getLogger(LoginEndpoint.class.getSimpleName());

    @Inject
    private AuthenticationManager authenticationManager;

    public void index() {
        LOGGER.info("Login page!");
    }

    public AeroGearUser login(AeroGearUser user) {
        authenticationManager.login(user);
        return user;
    }

    public void logout() {
        LOGGER.info("User logout!");
        authenticationManager.logout();
    }

}
