package designpatterns.behavioral.chainofresponsibility.support;

import designpatterns.behavioral.chainofresponsibility.request.ServiceRequest;

public interface SupportService {
    public void handleRequest(ServiceRequest request);
}
