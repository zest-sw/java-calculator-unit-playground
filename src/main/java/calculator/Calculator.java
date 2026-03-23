package calculator;


public class Calculator {

    int add(int num1, int num2) {
        return num1 + num2;
    }

    int substract(int num1, int num2) {
    return num1 - num2;
    }

    int multiply(int num1, int num2){
        return num1 * num2;
    }

    int divide(int num1, int num2){
        return num1 / num2;
    }

    int calculate_str(String input){

        String input_trimed = input.trim();
        String divider_char = ",|:";
        String target_value = input_trimed;

        boolean custom_divider = input_trimed.contains("//");

        if (custom_divider) {
            int endIndex = input_trimed.indexOf("\\n");
            int input_len = input_trimed.length();

            divider_char = input_trimed.substring(2, endIndex);

            target_value = input_trimed.substring(endIndex + 2, input_len);

        }

        String[] value_arr = target_value.split(divider_char);


        return sum(value_arr);
    }

    private int sum(String[] values) {
        int result = 0;
        for (String element : values) {
            if (element == null || element.isEmpty()) continue;

            try {
                int value_int = Integer.parseInt(element);
                if (value_int < 0) {
                    throw new RuntimeException("입력 값이 0보다 작습니다.");
                }
                result += value_int;
            } catch (NumberFormatException e) {
                // 요구사항에 따라 0을 반환하거나 예외를 던질 수 있음
                System.out.println("숫자가 아닌 값이 입력되었습니다: " + element);
                return 0;
            }
        }
        return result;
    }

}
