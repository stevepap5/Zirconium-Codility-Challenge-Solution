

// you can also use imports, for example:
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B, int F) {
        // write your code in Java SE 8
        
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int i,j,sum=0;
        
    for (i=0;i<A.length;i++){
        
        map.put(i,A[i]-B[i]);
    }
    map=sortByValue(map);
    // for (Map.Entry<Integer, Integer> ena : map.entrySet()) { 
    //         System.out.println("Key = " + ena.getKey() +  
    //                       ", Value = " + ena.getValue()); 
    //     } 
    j=0;
    
    for(Integer en : map.keySet()){
        
        if(j<A.length-F){
            sum=sum+B[en];
        }
        else{
            
            sum=sum+A[en];
        }
        j++;
    }
    
    return sum;
    
        
    }
    
    
    
      public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<Integer, Integer> > list = 
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
}

