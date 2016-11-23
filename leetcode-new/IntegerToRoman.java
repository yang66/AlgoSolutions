/*
Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.
 */
public class IntegerToRoman {

    public String intToRoman(int num) {
        Map<Integer, Character> map = new HashMap<Integer, Character>();
        map.put(1, 'I');
        map.put(5, 'V');
        map.put(10, 'X');
        map.put(50, 'L');
        map.put(100, 'C');
        map.put(500, 'D');
        map.put(1000, 'M');
        String result = "";
        for (int base = 1; base <= num; base *= 10) {
            int last = num / base % 10;
            if (last == 0) {
                continue;
            }
            String tmp = "";
            int mod5 = last % 5;
            if (1 <= mod5 && mod5 <= 3) {
                for (int i = 1; i <= mod5; ++i) {
                    tmp += map.get(base);
                }
                if (last > 5) {
                    tmp = "" + map.get(5 * base) + tmp;
                }
            } else if (mod5 == 0) {
                tmp = "" + map.get(5 * base);
            } else if (mod5 == 4){
                if (last == 4) {
                    tmp = "" + map.get(base) + map.get(5 * base);
                } else if (last == 9) {
                    tmp = "" + map.get(base) + map.get(10 * base);
                }
            }
            result = tmp + result;
        }
        return result;
    }

}
