
class duplicate{

    boolean a_duplucate(char x[]){

        for(int i=0;i<x.length;i++){

            for(int j=i+1;j< x.length;j++){

                if(x[i]==x[j])
                    return false;

            }

        }
        return true;
    }

}

public class ArrayDuplicates {

    public static void main(String[]args){

        duplicate d=new duplicate();
        String s ="abcdefghi";
        
        if(d.a_duplucate(s.toLowerCase().toCharArray())){
            System.out.println("Array contains no duplicate Characters");
        }
        else
            System.out.println("Array contains duplicate Characters");

    }

}
