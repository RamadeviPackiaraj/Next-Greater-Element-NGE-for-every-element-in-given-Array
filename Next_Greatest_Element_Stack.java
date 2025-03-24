//time O(n) space O(n)
import java.util.ArrayList;
import java.util.Stack;
public class Next_Greatest_Element_Stack{
    public static ArrayList<Integer> nextGreatest(int[] arr){
        int n=arr.length;
        ArrayList<Integer> arli=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            arli.add(-1);
        }
        //st.peek =top of the stack
        //traverse from right to left
        for(int i=n-1;i>=0;i--){
            while((!st.isEmpty())&&st.peek()<=arr[i]){
                st.pop();
            }
            //if the list is not empty the peek element will be the greatest element 
            if(!st.isEmpty()){
                arli.set(i,st.peek());
            }
            st.push(arr[i]);
        }
        return arli;
    }
    public static void main(String[] args){
        int[] arr={ 6,2 ,4,8,1};
        ArrayList<Integer> neww=nextGreatest(arr);
        for(int ans:neww){
            System.out.print(ans+" ");
        }
    }
}