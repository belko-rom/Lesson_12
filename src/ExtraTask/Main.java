package ExtraTask;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите произвольный текст: ");
        String input = scanner.nextLine();

        String documentPattern = "\\d{4}-\\d{4}-\\d{2}";
        String emailPattern = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}";
        String phonePattern = " \\+\\(\\d{2}\\)\\d{7}";

        Pattern patternDocument = Pattern.compile(documentPattern);
        Pattern patternEmail = Pattern.compile(emailPattern);
        Pattern patternPhone = Pattern.compile(phonePattern);

        Matcher matcherDocument = patternDocument.matcher(input);
        Matcher matcherEmail = patternEmail.matcher(input);
        Matcher matcherPhone = patternPhone.matcher(input);

        while (matcherEmail.find()) {
            System.out.println("email: " + matcherEmail.group());
        }

        while (matcherDocument.find()) {
            System.out.println("document number: " + matcherDocument.group());
        }

        while (matcherPhone.find()) {
            System.out.println("phone: " + matcherPhone.group());
        }
    }
}
