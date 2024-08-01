package BST;

public class MyNode<T> {
    // 1 node gồm
    T value;
    MyNode<T> left;
    MyNode<T> right;

    public MyNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
