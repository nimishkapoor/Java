import java.util.*;
class HashMapDemo
{
   public static void main(String args[])
   {
       HashMap< String,Integer> hm = 
                            new HashMap< String,Integer>();
       hm.put("a", new Integer(100));
       hm.put("b", new Integer(200));
       hm.put("c", new Integer(300));
       hm.put("d", new Integer(400));
 
       // Returns Set view     
       Set< Map.Entry< String,Integer> > st = hm.entrySet();   
 
       for (Map.Entry< String,Integer> me:st)
       {
           System.out.print(me.getKey()+":");
           System.out.println(me.getValue());
       }
   }
}

// public Object put(Object key, Object value) :- is used to insert an entry in this map.
//public void putAll(Map map) :- is used to insert the specified map in this map.
//public Object remove(Object key) :- is used to delete an entry for the specified key.
//public Object get(Object key) :- is used to return the value for the specified key.
//public boolean containsKey(Object key) :- is used to search the specified key from this map.
//public Set keySet() :- returns the Set view containing all the keys.
//public Set entrySet() :- returns the Set view containing all the keys and values.
