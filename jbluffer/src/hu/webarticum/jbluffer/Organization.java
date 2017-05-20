package hu.webarticum.jbluffer;


public class Organization extends Entity {
    
    private String name;
    
    private String domain;
    
    public String getName() {
        if (name == null) {
            // TODO
            name = "Organization";
        }
        return name;
    }
    
    public String getDomain() {
        if (domain == null) {
            // TODO / XXX
            domain = Util.normalizeString(getName()) + ".org";
        }
        return domain;
    }
    
}
