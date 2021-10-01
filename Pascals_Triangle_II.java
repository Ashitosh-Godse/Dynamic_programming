package DynamicProgramming;
import java.util.*;
public class Pascals_Triangle_II {
public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> res,prev=null;  //ArrayList for storing row values of curr row and previous row
        for(int i=0;i<rowIndex+1;i++){
            res=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                
                if(j==0 || j==i){
                    res.add(1);   // first and last element of each row must be 1
                }
                else{
                    res.add(prev.get(j-1)+prev.get(j));  //else we add the values of previous rows
                }
            }
            prev=res;
            a.add(res);
        }
        return a.get(rowIndex);
        
    }

}
