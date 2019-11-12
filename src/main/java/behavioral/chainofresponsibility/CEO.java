package behavioral.chainofresponsibility;

public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO can do anything they want");
    }
}
