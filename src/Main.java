import java.util.*;

public class Main {
    public static void main(String[] args) {
        // HashMap
        Map<String, String> students = new TreeMap<>();
        // thêm vào / chỉnh sửa theo key
        students.put("S002","Mai Xuan Sang");
        students.put("S001","Huỳnh Công Tính");
        students.put("S003","Hồ Xuân Hùng");
//        students.put("S003","Hung");

        // xóa theo key
//        students.remove("S001");
        System.out.println(students);
        // phương thuc khác
        // Duyệt map theo entry
        for (Map.Entry<String,String> entry : students.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

        // duyệt theo key
//        for (String key : students.keySet()){
//            System.out.println(key+" - "+students.get(key));
//        }
//
//        // duyệt theo values
//        for (String value : students.values()){
//            System.out.println(value);
//        }


        TreeMap<Student, String> stringMap = new TreeMap<>((o1, o2) -> o2.getId()-o1.getId());
        Student s1 = new Student(1,"Mai Xuan Sang");
        Student s2 = new Student(2,"Huynh Cong Tinh");
        Student s3 = new Student(5,"Mỹ Trân");
        Student s4 = new Student(4,"Mỹ Huyền");
        Student s5 = new Student(3,"Thanh Quang");
        stringMap.put(s1,"088083467354");
        stringMap.put(s2,"098083467354");
        stringMap.put(s3,"0980883497354");
        stringMap.put(s5,"0989983354");
        stringMap.put(s4,"09348567354");
        System.out.println(stringMap);

        // s3,4,5,2,1 -> ascending của key : Student


        // khi danh sách được sắp xếp thì hỗ trợ thuật toán tìm kiếm nhị phân
       Student lowerS5 = stringMap.lowerKey(s5); // null
        System.out.println(lowerS5);

        // Tree

     }
}