public class code_4_6 {
    int num = 5;
    String str = "OXOXOXOXOXOXOX";

    void solution_4_6() {
        int count = 0;
        int plus = 0;
        String str2 = "";
        int firInd = str.indexOf("O"); // firInd = 0;

        if(firInd == -1) count = 0;
        else {
            for (int k = firInd; k < str.length(); k++) {
                str2 = String.valueOf(str.charAt(k));
                if (str2.equals("O")) {
                    plus++;
                    count = count + plus;
                } else plus = 0;
            }
        }
        System.out.println(count);
    }
}
