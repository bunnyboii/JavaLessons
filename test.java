public class test{
    public static void main(String[] args){
        int[] myarray = new int[5];
        for(int y=2; y<=10; y=y+2){
            myarray[((y-2)/2)] = y;
           // System.out.println(y);
        }

        for(int i  = 0; i <5; i++){
            System.out.println(myarray[i]);
        }
    }
}