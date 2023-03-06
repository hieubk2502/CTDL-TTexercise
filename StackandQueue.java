public class StackandQueue {
    public int[] array;
    public int SIZE;
    public int topIndex;
    StackandQueue(int size){
        SIZE =size;
        array = new int[SIZE];
        topIndex=-1;
    }


    public boolean push(int value){
        if (!isFull()){
            topIndex++;
            array[topIndex] =value;
        }
        return false;
    }
    public int pop(){
        if(!isEmpty()){
            int value = array[topIndex];
            topIndex--;
            return value;
        }
        return -1;
    }
    public boolean isFull(){
        return topIndex==SIZE-1;
    }
    public  boolean isEmpty(){
        return topIndex<0;
    }

    public static void main(String[] args) {

    }

}
