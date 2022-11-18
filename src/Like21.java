public class Like21 {
    public class Kata{
        public static int[] beggars(int[] values, int n) {
            int[] result;

            if (n < 1) {//return empty array
                result = new int[0];
            } else {
                result = new int[n];
                for (int i = 0; i < values.length; i++) {

                    // add value to currently queued element
                    result[i % n] += values[i];
                }
            }

            return result;
        }
    }
}
