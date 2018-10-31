public class ChooseSort {
    public enum sortDirection {
        INCREASING,
        DECREASING
    }

    /**
     * The method arranges the array in the selected order, allowing you to choose the direction.
     *
     * @param array     REQUIRE to have 1 or more elements.
     * @param direction REQUIRE to be valid (INCREASE, DECREASE).
     */
    public void chooseSort(int[] array, sortDirection direction) {
        switch (direction) {
            case INCREASING:
                ascendingSort(array);
                break;
            case DECREASING:
                descendingSort(array);
                break;
            default:
                System.out.println("Input is invalid");
                break;
        }
    }

    private void ascendingSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                swap(array, j, j - 1);
                j--;
            }
        }
    }

    private void descendingSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] > array[j - 1]) {
                swap(array, j, j - 1);
                j--;
            }
        }
    }

    private void swap(int[] array, int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

}
