public class array {
    public static void main(String[] args){
        MyArray test =new MyArray();
        test.addNo(42);
        test.addNo(43);
        System.out.println("how much data is in my array " + test.getCurrentIndex());
        System.out.println("what is the size of my array " + test.numbers.length);

    }

  //  public static boolean toString(int[] secondArray) {

}

class MyArray{
    private int arraySize =10;
    public int[] numbers = new int[arraySize];
    private int currentIndex = 0; //companion variable

    public void addNo(int no)
    {

        numbers[currentIndex++] = no;
    }

    public int getCurrentIndex()
    {
        return currentIndex;
    }

    public int getNumbersByindex(int index)
    {
        if(index<0 || index>=arraySize)
            return -1; //report error
        return numbers[index];
    }
}