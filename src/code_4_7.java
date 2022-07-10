public class code_4_7 {
    int[] intArr = {7, 100, 95, 90, 80, 70, 60, 50};

    void solution_4_7() {
        int numStu = intArr[0];
        float avgStu = 0;
        int sumStu = 0;
        int countStu = 0;

        for(int j = 1; j <= numStu; j++) sumStu = sumStu + intArr[j];
        avgStu = (float)sumStu / numStu;

        for(int j = 1; j <= numStu; j++) if(intArr[j] > avgStu) countStu++;
        System.out.println(String.format("%.3f",(float)countStu/numStu * 100) + "%");
    }
}
