package designpatterns.behavioral.chainofresponsibility.support;

import designpatterns.behavioral.chainofresponsibility.level.ServiceLevel;
import designpatterns.behavioral.chainofresponsibility.request.ServiceRequest;

public class DirectorSupport implements SupportService {

    private SupportService next = null;

    public SupportService getNext() {
        return next;
    }

    public void setNext(SupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getType() == ServiceLevel.LEVEL_FOUR) {
            request.setConclusion("Director solved level four reuqest !!");
        } else {
            if (next != null) {
                next.handleRequest(request);
            } else {
                request.setConclusion("Your problem is none of our business");
                throw new IllegalArgumentException("Your problem is none of our business :: " + request.getType());
            }
        }
    }
}
