// https://www.codingninjas.com/studio/problems/stack-implementation-using-array_8230854?challengeSlug=striver-sde-challenge&leftPanelTab=0

/*
 * Use an array to store the elements of the stack.
 * Use a variable to store the top of the stack.
 * Time Complexity: O(1)
 * Space Complexity: O(N)
 */

public class StaImplementationUsingArray82 {
    static class Stack {
        int top = -1;
        int size;
        int[] arr;

        Stack(int capacity) {
            size = capacity;
            arr = new int[capacity];
        }

        public void push(int num) {
            if (isFull() == 1)
                return;
            top++;
            arr[top] = num;
        }

        public int pop() {
            if (isEmpty() == 1)
                return -1;
            return arr[top--];
        }

        public int top() {
            if (isEmpty() == 1)
                return -1;
            return arr[top];
        }

        public int isEmpty() {
            if (top == -1)
                return 1;
            return 0;
        }

        public int isFull() {
            if (top == size - 1)
                return 1;
            return 0;
        }
    }
}
