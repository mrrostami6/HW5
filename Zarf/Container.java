package TrainingHW5.Zarf;

public class Container {
    private int[] listOfNumbers;
    private int counter = 0;

    public Container(int size){
        listOfNumbers = new int[size];
    }

    public void addNumber(int number){
        if (counter < listOfNumbers.length)
            listOfNumbers[counter++] = number;
        else
            System.out.println("There is no size !!!");
    }

    public void sort(){
        for (int i = 0; i < listOfNumbers.length; i++) {
            for (int j = 0; j < listOfNumbers.length - 1; j++) {
                if (listOfNumbers[j] > listOfNumbers[j + 1]){
                    int temp = listOfNumbers[j];
                    listOfNumbers[j] = listOfNumbers[j + 1];
                    listOfNumbers[j + 1] = temp;
                }
            }
        }
    }

    public void sortDesc(){
        for (int i = 0; i < listOfNumbers.length; i++) {
            for (int j = 0; j < listOfNumbers.length - 1; j++) {
                if (listOfNumbers[j] < listOfNumbers[j + 1]){
                    int temp = listOfNumbers[j];
                    listOfNumbers[j] = listOfNumbers[j + 1];
                    listOfNumbers[j + 1] = temp;
                }
            }
        }
    }

    public void removeElement(int index){
        int[] deletedArray = new int[listOfNumbers.length - 1];
        int counter = 0;
        for (int i = 0; i < listOfNumbers.length; i++) {
            if (i == index)
                continue;
            deletedArray[counter++] = listOfNumbers[i];
        }
        this.setListOfNumbers(deletedArray);
    }

    public void removeElement(Integer element){
        int[] deletedArray = new int[listOfNumbers.length - 1];
        int counter = 0;
        for (int num : listOfNumbers) {
            if (element == num)
                continue;
            deletedArray[counter++] = num;
        }
        this.setListOfNumbers(deletedArray);
    }

    private int[] sortForSearch(int[] arr){
        int[] array = new int[arr.length];
        System.arraycopy(arr, 0, array, 0, arr.length);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public int findElement(int element){
        int[] array = sortForSearch(this.getListOfNumbers());
        int first = 0, last = array.length - 1;
        int mid = (first + last) / 2;
        while (first <= last){
            if (array[mid] == element)
                return mid;
            else if (array[mid] < element)
                first = mid + 1;
            else
                last = mid - 1;

            mid = (first + last) / 2;
        }
        return -1;
    }

    private void setListOfNumbers(int[] listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public int[] getListOfNumbers() {
        return listOfNumbers;
    }

}
