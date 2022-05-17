package kyle.hawkins.springsecurityjwt.models;

public class AuthenticationResponse {
    public String getJwt() {
        return jwt;
    }

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    private final String jwt;
}
