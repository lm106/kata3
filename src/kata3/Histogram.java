package kata3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Luzma
 * @version 28-10-2020 
 * @since Práctica Laboratorio
 */
class Histogram<T> {
    private final Map<T, Integer> map = new HashMap<>();
    
    public Integer get(T key){
        return map.get(key);
    }
    
    public Set<T> keySet(){
        return map.keySet();
    }
    
    public void increment(T key){
        map.put(key, map.containsKey(key)? map.get(key) +1 : 1);
    }
}
