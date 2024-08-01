package BST;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BST<Integer> map = new BST<Integer>();
        map.add(40);
        map.add(45);
        map.add(55);
        map.add(32);
        map.add(29);
        map.add(37);
        map.add(46);
        System.out.println(map.root);


        List<Integer> list = map.preorder(map.root);
        List<Integer> list1 = map.inorder(map.root);
        List<Integer> list2= map.postorder(map.root);
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
    }
}
