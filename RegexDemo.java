import java.util.regex.Pattern;

class RegexDemo {
    public static void main(String[] args) {
        String[] emails = {"satish@gmail.com", "lokesh_12@gmail.com", "surya-.@gmail.com"};
        String regex = "^[\\w-\\.]+[@][\\w-\\.]+\\.[a-z]{2,3}$";
        for(String email : emails) {
            if(isValid(email, regex)){
                System.out.println("Valid email: "+email);
            }
        }
    }

    public static boolean isValid(String email, String regex) {
        return Pattern.matches(regex, email);
    }
}