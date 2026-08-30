class Solution {
    public int calPoints(String[] ops) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < ops.length; i++) {

            if (ops[i].equals("C")) {
                st.pop();
            }

            else if (ops[i].equals("D")) {
                st.push(st.peek() * 2);
            }

            else if (ops[i].equals("+")) {
                int first = st.pop();
                int second = st.peek();

                st.push(first);
                st.push(first + second);
            }

            else {
                st.push(Integer.parseInt(ops[i]));
            }
        }

        int sum = 0;

        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}