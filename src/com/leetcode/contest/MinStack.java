package com.leetcode.contest;

class MinStack {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];

	/** initialize your data structure here. */
	public MinStack() {
		top = -1;
	}

	public void push(int x) {
		if (top < (MAX - 1)) {
			a[++top] = x;
		}
	}

	public void pop() {
		if (top >= 0)
			top--;
	}

	public int top() {
		if (top >= 0)
			return a[top];
		else
			return 0;
	}

	public int getMin() {
		int min = Integer.MAX_VALUE;
		if (top < 0)
			min = 0;
		else {

			for (int i = 0; i <= top; i++) {
				if (min > a[i])
					min = a[i];
			}

		}
		return min;
	}
}