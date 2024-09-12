package com.Paynet.AssignmentPaynetCRUD.successhandlers;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class OAuth2LoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        // Retrieve the OAuth2User (the authenticated user details)
        OAuth2User oAuth2User = (OAuth2User) authentication.getPrincipal();

        // Logging the user attributes
        System.out.println("User Attributes: " + oAuth2User.getAttributes());

        // Optionally, you can extract GitHub-specific info or perform post-login actions
        Integer githubId = oAuth2User.getAttribute("id");
        String email = oAuth2User.getAttribute("email");

        // Logging the GitHub-specific details for testing
        System.out.println("GitHub ID: " + githubId);
        System.out.println("Email: " + email);

        // Redirecting to a default page after successful login
        // new JWTTokenAuthentication(oauth2User.gethUserattributes("login"));
        super.onAuthenticationSuccess(request, response, authentication);
    }
}