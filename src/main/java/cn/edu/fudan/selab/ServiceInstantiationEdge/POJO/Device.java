package cn.edu.fudan.selab.ServiceInstantiationEdge.POJO;

import cn.edu.fudan.selab.ServiceInstantiationEdge.Util.Enable;

public class Device {

    private int deviceId;
    private Enable enable;
    private Process process;


    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public void setEnable(Enable enable) {
        this.enable = enable;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public Enable getEnable() {
        return enable;
    }
}
