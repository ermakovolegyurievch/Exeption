public class UserData {
    public static void checkUserData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (checkInsert(login)) {
            throw new WrongLoginException("Не корректный ввод логина");
        }

        if (login.length() > 20) {
            throw new WrongLoginException("Слишком много символов");
        }

        if (checkInsert(password) || password.length() > 20) {
            throw new WrongLoginException("Не корректный ввод логина");
        }

        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

    public static boolean checkInsert(String str) {
        return !str.matches("^[a-zA-Z_0-9]+$");
    }
}