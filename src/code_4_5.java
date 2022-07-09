import java.util.StringTokenizer;

public class code_4_5 {
    // input integers
    int n = 9;
    int[] intArr = {10, 20, 30, 40, 50 ,60, 70, 80, 90};

    void solution_4_5() {
        int max = intArr[0];
        for(int i = 1; i < intArr.length; i++) if(max < intArr[i]) max = intArr[i];

        float[] newScore = new float[intArr.length];
        float sum = 0F;
        for(int i = 0; i < intArr.length; i++) {
            newScore[i] = ((float)intArr[i]/max)*100;
            sum = sum + newScore[i];
        }

        float avg = sum/(float)intArr.length;
        System.out.println(avg);
    }
}
