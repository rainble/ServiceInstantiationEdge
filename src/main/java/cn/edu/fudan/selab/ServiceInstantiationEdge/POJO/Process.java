package cn.edu.fudan.selab.ServiceInstantiationEdge.POJO;

import java.util.List;

public class Process {

    private int processId;
    private List<Node> activities;
    private List<Flow> flowList;

    public int getProcessId() {
        return processId;
    }

    public List<Node> getActivities() {
        return activities;
    }

    public List<Flow> getFlowList() {
        return flowList;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public void setActivities(List<Node> activities) {
        this.activities = activities;
    }

    public void setFlowList(List<Flow> flowList) {
        this.flowList = flowList;
    }
}
