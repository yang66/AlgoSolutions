/*
 *
 */
public class CountingBits {

    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 1; i <= num; ++i) {
            result[i] = result[i / 2] + (i % 2 != 0 ? 1 : 0);
        }
        return result;
    }

}
