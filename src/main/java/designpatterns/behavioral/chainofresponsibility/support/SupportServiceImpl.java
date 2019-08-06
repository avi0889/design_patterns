package designpatterns.behavioral.chainofresponsibility.support;

import designpatterns.behavioral.chainofresponsibility.request.ServiceRequest;

public class SupportServiceImpl implements SupportService {

    private SupportService handler = null;

    public SupportService getHandler() {
        return handler;
    }

    public void setHandler(SupportService handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        handler.handleRequest(request);
    }
}
