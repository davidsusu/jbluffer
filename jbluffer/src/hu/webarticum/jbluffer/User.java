package hu.webarticum.jbluffer;


public class User extends Entity {
    
    private String password;
    
    public Person getPerson() {
        return getAssociation("person", Person.class);
    }
    
    public String getUsername() {
        // XXX
        return getPerson().getEmail();
    }
    
    public String getPassword() {
        if (password == null) {
            password = Util.createStringByRegex("[a-z0-9]{8}");
        }
        return password;
    }
    
}
