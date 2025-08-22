package murach.data;

import murach.business.User;

public class UserDB {

    // phương thức giả lập lưu user
    public static int insert(User user) {
        // ở đây ta chỉ in ra để kiểm tra, sau này có thể kết nối DB
        System.out.println("Saving user to database:");
        System.out.println("Name: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Email: " + user.getEmail());

        return 1; // giả sử thành công
    }
}
