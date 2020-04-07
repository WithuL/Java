public class Test {

    private static String  userName = "admin";
    private static String  passWord = "123456";

    public static void main(String[] args) {
        try {
            login("admind",123);
        } catch (UserError userError) {
            userError.printStackTrace();
        } catch (PassWordErrow passWordErrow) {
            passWordErrow.printStackTrace();
        }
    }

    public static void login(String userName,int passWord) throws UserError,PassWordErrow {
        if(!(Test.userName).equals(userName)) {
            throw new UserError("用户名错误");
        }
        if(!(Test.userName).equals(passWord)) {
            throw new PassWordErrow("登录密码错误");
        }
        System.out.println("登陆成功");
    };
}
.
class UserError extends Exception {
    public UserError(String message) {
        super(message);
    }
}

class PassWordErrow extends Exception {
    public PassWordErrow(String pass) {
        super(pass);
    }
}