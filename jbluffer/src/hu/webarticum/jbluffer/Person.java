package hu.webarticum.jbluffer;

public class Person extends Entity {
    
    private String firstname;
    
    private String surname;
    
    private String email;
    
    public String getFirstname() {
        if (firstname == null) {
            // TODO
            firstname = "Firstname";
        }
        return firstname;
    }

    public String getSurname() {
        if (surname == null) {
            // TODO
            surname = "Surname";
        }
        return surname;
    }
    
    public String getName() {
        // XXX
        return getFirstname() + " " + getSurname();
    }
    
    public Organization getEmployer() {
        return getAssociation("employer", Organization.class);
    }
    
    public String getEmail() {
        if (email == null) {
            email =
                Util.normalizeString(getFirstname()) + "." +
                Util.normalizeString(getSurname()) + "@" +
                getEmployer().getDomain()
            ;
        }
        return email;
    }
    
}
