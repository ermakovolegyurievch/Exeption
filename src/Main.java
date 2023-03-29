public class Main {

    public static void main(String[] args) {
        errorProcessing("qwe", "asdд", "asd");
    }

    public static void errorProcessing(String login, String password, String confirmPassword) {
        try {
            UserData.checkUserData(login, password, confirmPassword);

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}

