public class code_4_3 {
    int[] inputIntegers = {150, 266, 427};

    void solution_4_3() {
        String numStr = Integer.toString(inputIntegers[0] * inputIntegers[1] * inputIntegers[2]);
        for(int i = 0; i <= 9; i++) System.out.println(countChar(numStr, Integer.toString(i)));
    }

    // 특정 문자가 포함된 개수 반환
    int countChar(String str, String ch) {
        // 찾고자하는 문자열을 대상 string에서 지우고, 지워진 개수를 반환
        return str.length() - str.replace(ch, "").length();
    }
    /** String.valueOf() → Object값을 String으로 변환한다는 점에서 toString과 동일한 기능하지만,
     ** 파라미터가 null이면 문자열 'null'을 반환 (toString은 NullPointerException, NPE 발생) **/
}
