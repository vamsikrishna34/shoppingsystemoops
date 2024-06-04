import java.util.HashMap;
import java.util.Map;

public class user {
    private String username;
    private String password;

    
    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}


public class User {
    private static User instance;
    private Map<String, user> userDatabase;

    
    private User() {
        userDatabase = new HashMap<>();
    }

    
    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    
    public boolean authenticateUser(String username, String password) {
        if (userDatabase.containsKey(username)) {
            user user = userDatabase.get(username);
            return user.getPassword().equals(password);
        }
        return false;
    }

    
    public void addUser(user user) {
        userDatabase.put(user.getUsername(), user);
    }
}
