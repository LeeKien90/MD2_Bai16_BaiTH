package ra;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH_NUMBER = "C:\\Users\\askih\\OneDrive\\Desktop\\lam bai tap\\rikkei\\MD2_bai16_Th2\\src\\ra\\text.txt";
        String PATH_RESULT = "C:\\Users\\askih\\OneDrive\\Desktop\\lam bai tap\\rikkei\\MD2_bai16_Th2\\src\\ra\\result.txt";
        List<Integer> numbers = readAndWriteFile.readFile(PATH_NUMBER);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(PATH_RESULT, maxValue);
    }
}
