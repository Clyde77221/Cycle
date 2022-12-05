import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int range = service.SqrtRange(100, 9801);
        System.out.println(range);
    }
}