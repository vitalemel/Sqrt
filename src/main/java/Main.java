import ru.netology.sqr.SQRService;

public class Main {

    public static  void main(String[] args) {
        SQRService service = new SQRService();
        int min =200;
        int max =300;
        int count =0;
        int myCount = service.calculateSQR (200,300);

        System.out.println(myCount);

    }
}
