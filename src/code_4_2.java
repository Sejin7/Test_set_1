public class code_4_2 {
    // Input integers
    int[] inputIntegers = {3, 29, 38, 12, 57, 74, 40, 85, 61};

    void solution_4_2() {
        int max = inputIntegers[0];
        int max_ind = 0;

        for(int i = 1; i < inputIntegers.length; i++) {
            if(max < inputIntegers[i]) {
                max = inputIntegers[i];
                max_ind = i;
            }
        }
        // 최대값 및 최대값의 번호 출력
        System.out.println(max);
        System.out.println(max_ind+1);
    }
}
