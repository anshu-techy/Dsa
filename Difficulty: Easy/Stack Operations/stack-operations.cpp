class myStack {
private:
    vector<int> st;

public:
    // Insert an element at the top
    void push(int x) {
        st.push_back(x);
    }

    // Remove the top element
    void pop() {
        if (!st.empty())
            st.pop_back();
    }

    // Return the top element
    int peek() {
        if (st.empty())
            return -1;
        return st.back();
    }

    // Check if stack is empty
    bool isEmpty() {
        return st.empty();
    }

    // Return size of stack
    int getSize() {
        return st.size();
    }
};
