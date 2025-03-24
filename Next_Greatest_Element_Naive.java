////greater element using 2 loops
import java.util.ArrayList;
public class Next_Greatest_Element_Naive{
    static ArrayList<Integer> nextLargestElement(int[] arr){
        int n=arr.length;
        ArrayList<Integer> arli=new ArrayList<>();
        for(int i=0;i<n;i++){
            arli.add(-1);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    arli.set(i,arr[j]);
                    break;//exit a loop once the greater element is find
                }
            }
    }
    return arli;
}
public static void main(String[] args){
    int[] arr={6, 8, 0, 1, 3 };
    ArrayList<Integer> arli=nextLargestElement(arr);
    for(int x:arli){
        System.out.print(x+" ");
    }
}
}