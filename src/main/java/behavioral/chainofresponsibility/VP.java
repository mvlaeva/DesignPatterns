package behavioral.chainOfResponsibility;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() < 1500) {
                System.out.println("VPs can approve purchases less than 1500");
            } else {
                successor.handleRequest(request);
            }
        }
    }
}