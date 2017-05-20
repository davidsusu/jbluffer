package hu.webarticum.jbluffer;

import java.util.HashMap;
import java.util.Map;

public class Entity {
    
    private Map<String, Entity> associations = new HashMap<String, Entity>();
    
    @SuppressWarnings("unchecked")
    public <T extends Entity> T getAssociation(String key, Class<T> cls) {
        T associatedEntity;
        if (associations.containsKey(key)) {
            associatedEntity = (T)associations.get(key);
        } else {
            try {
                associatedEntity = cls.newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            associations.put(key, associatedEntity);
        }
        return associatedEntity;
    }
    
}
