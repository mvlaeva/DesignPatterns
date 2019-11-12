package behavioral.chainofresponsibility;

public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        Director brayen = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        brayen.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        brayen.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        brayen.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        brayen.handleRequest(request);
    }
}
