public class UserData {

    public static String savePass;

    public static void CheckUserData(String login, String password, String confirmPassword) {
        if (CheckInsert(login)) {
            System.out.println("Не корректный ввод логина");
        }
        if (login.length() > 20) try {
            throw new WrongLoginException("Слишком много символов");
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        }
        if (CheckInsert(password) || password.length() > 20) {
            System.out.println("Не корректный ввод пароля");
        } else {
            savePass = password;
        }
        try {
            if (!confirmPassword.equals(savePass))
                throw new WrongPasswordException("Пароли не совпадают");
        } catch (WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean CheckInsert(String str) {
        return !str.matches("^[a-zA-Z_0-9]+$");
    }
}