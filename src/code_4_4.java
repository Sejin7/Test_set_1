import java.util.Arrays;

public class code_4_4 {
    int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    void solution_4_4() {
        int[] modRes = new int[10];
        for(int i = 0; i < 10; i++) modRes[i] = input[i]%42;
        System.out.println(differentNum(modRes));
    }

    int differentNum(int[] intArr) {
        int count = 1;

        // Array 오름차순 정렬 (1, 2, 3, 4, 5, 6, ...)
        Arrays.sort(intArr);
        for(int i = 0; i < intArr.length - 1; i++) {
            if(intArr[i] != intArr[i+1]) count++;
        }
        return count;
    }
}
