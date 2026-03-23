package calculator;


public class Calculator {

    int add(int num1, int num2) {
        return num1 + num2;
    }

    int subtract(int num1, int num2) {
    return num1 - num2;
    }

    int multiply(int num1, int num2){
        return num1 * num2;
    }

    int divide(int num1, int num2){
        return num1 / num2;
    }

    int calculate_str(String input){
        int result = 0;

        String input_trimed = input.trim();

        Boolean custom_divider = input_trimed.contains("//");

        if (custom_divider) {
            int endIndex = input_trimed.indexOf("\\n");
            int input_len = input_trimed.length();

            String custom_divider_char = input_trimed.substring(2, endIndex);

            String value = input_trimed.substring(endIndex + 2, input_len);

            String[] value_arr = value.split(custom_divider_char);

            for (String element:value_arr) {
                if (element == null || element.isEmpty()) return 0;

                try {
                    int value_int = Integer.parseInt(element);
                    if (value_int <0){
                        throw new RuntimeException("입력 값이 0보다 작습니다.");
                    }

                    result += value_int;
                } catch (NumberFormatException e) {
                    System.out.println("숫자가 아닌 값이 입력되었습니다.: " + e);
                    return 0;
                }


            }

        }
        else {
            String[] value_arr = input_trimed.split("[,:]");

            for (String element:value_arr) {
                if (element == null || element.isEmpty()) return 0;

                try {
                    int value_int = Integer.parseInt(element);
                    if (value_int <0){
                        throw new RuntimeException("입력 값이 0보자 작습니다.");
                    }

                    result += value_int;
                } catch (NumberFormatException e) {
                    System.out.println("숫자가 아닌 값이 입력되었습니다.: " + e);
                    return 0;
                }


            }

        }




        return result;
    }

}
