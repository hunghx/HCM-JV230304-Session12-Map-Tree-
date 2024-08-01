package BST;

import java.util.ArrayList;
import java.util.List;

public class BST<T extends Comparable<T>> {
    MyNode<T> root;

    public BST() {
        this.root = null ;
    }

    public void add(T value){
        // check trùng giá trị
        // tạo node

        root = addRecursive(root,value);

    }
    private MyNode<T> addRecursive(MyNode<T> current,T value){ // thêm dẹ qui
        if (current == null){
            // thêm vào vị trí nảy
           return new MyNode<>(value);
        }

        // kiểm tra xem giá trị cần chèn < hay > giá trị current
        // nếu < hơn
        if (value.compareTo(current.value) < 0){
            // duyệt bên tra current
            current.left = addRecursive(current.left,value);
        }
        else if (value.compareTo(current.value) >0){
            current.right= addRecursive(current.right, value);
        }else {
            System.out.println("Đã có ph tu trong map");
            return current;
        }
        return  current;
    }
    public List<T> preorder(MyNode<T> current) {
        List<T> list = new ArrayList<>();
        if (current != null) {
            list.add(current.value);
            list.addAll(preorder(current.left));
            list.addAll(preorder(current.right));
        }
        return list;
    }
    public List<T> inorder(MyNode<T> current) {
        List<T> list = new ArrayList<>();
        if (current != null) {
            list.addAll(inorder(current.left));
            list.add(current.value);
            list.addAll(inorder(current.right));
        }
        return list;
    }
    public List<T> postorder(MyNode<T> current) {
        List<T> list = new ArrayList<>();
        if (current != null) {
            list.addAll(postorder(current.left));
            list.addAll(postorder(current.right));
            list.add(current.value);
        }
        return list;
    }
}
