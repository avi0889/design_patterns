package designpatterns.behavioral.chainofresponsibility;


import designpatterns.behavioral.chainofresponsibility.level.ServiceLevel;
import designpatterns.behavioral.chainofresponsibility.request.ServiceRequest;
import designpatterns.behavioral.chainofresponsibility.support.*;

public class Main {
    public static void main(String[] args) {

        DirectorSupport directorSupport = new DirectorSupport();
        ManagerSupport managerSupport = new ManagerSupport();
        managerSupport.setNext(directorSupport);
        SupervisorSupport supervisorSupport = new SupervisorSupport();
        supervisorSupport.setNext(managerSupport);
        FrontDeskSupport frontDeskSupport = new FrontDeskSupport();
        frontDeskSupport.setNext(supervisorSupport);
        SupportServiceImpl supportService = new SupportServiceImpl();
        supportService.setHandler(frontDeskSupport);


        ServiceRequest request = new ServiceRequest();
        request.setType(ServiceLevel.LEVEL_ONE);
        supportService.handleRequest(request);
        System.out.println(request.getConclusion());

        request = new ServiceRequest();
        request.setType(ServiceLevel.LEVEL_THREE);
        supportService.handleRequest(request);
        System.out.println(request.getConclusion());

        request = new ServiceRequest();
        request.setType(ServiceLevel.INVALID_REQUEST);
        supportService.handleRequest(request);
        System.out.println(request.getConclusion());
    }
}
