package designpatterns.structural.bridge.remote;

import designpatterns.structural.bridge.tv.ITV;

public abstract class AbstractRemoteControl {

    private ITV tv;

    public AbstractRemoteControl(ITV tv){
        this.tv = tv;
    }

    public void turnOn(){
        tv.on();
    }

    public void turnOff(){
        tv.off();
    }

    public void setChannel(int channel){
        tv.switchChannel(channel);
    }
}
