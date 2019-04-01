package cn.edu.fudan.selab.ServiceInstantiationEdge.POJO;

public class Node {

    private int nodeId;
    private String nodeDesc;
    private int state;
    private int serviceId;

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public void setNodeDesc(String nodeDesc) {
        this.nodeDesc = nodeDesc;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getNodeId() {
        return nodeId;
    }

    public String getNodeDesc() {
        return nodeDesc;
    }

    public int getState() {
        return state;
    }

    public int getServiceId() {
        return serviceId;
    }
}
