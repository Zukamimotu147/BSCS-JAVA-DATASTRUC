package Activity1;

public class User {
    protected int userID;
    protected String username;
    protected String email;
    

    public int getUserID() {
        return userID;
    }
    
    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    

    public void logIn() {
        System.out.println("User has logged in");
        System.out.println("UserID: " + getUserID());
        System.out.println("Username: " + getUsername());
        System.out.println("Email: " + getEmail());
    }

    public void logOut() {
        System.out.println("User has logged out");
    }

    
}
