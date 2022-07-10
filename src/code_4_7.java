public class code_4_7 {
    int[] intArr = {3, 70, 90, 80};

    void solution_4_7() {
        int numStu = intArr[0];
        float avgStu = 0;
        int sumStu = 0;
        int countStu = 0;

        for(int j = 1; j <= numStu; j++) sumStu = sumStu + intArr[j];
        avgStu = (float)sumStu / numStu;

        for(int j = 1; j <= numStu; j++) if(intArr[j] > avgStu) countStu++;
        System.out.println((float)countStu/numStu * 100 + "%");
    }
}
