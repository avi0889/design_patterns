package designpatterns.structural.bridge;


import designpatterns.structural.bridge.remote.LogitechRemoteControl;
import designpatterns.structural.bridge.tv.ITV;
import designpatterns.structural.bridge.tv.SonyTV;

public class Main {
    public static void main(String[] args){
        ITV tv = new SonyTV();
        LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
        lrc.setChannelKeyboard(100);
    }
}
