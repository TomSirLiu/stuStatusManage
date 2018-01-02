package cn.sirLiu.model;

public class Manager {
    private Integer managerId;

    private String managerName;

    private String managerSex;

    private String managerLivingAddress;

    public Manager(Integer managerId, String managerName, String managerSex, String managerLivingAddress) {
        this.managerId = managerId;
        this.managerName = managerName;
        this.managerSex = managerSex;
        this.managerLivingAddress = managerLivingAddress;
    }

    public Manager() {
        super();
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
    }

    public String getManagerSex() {
        return managerSex;
    }

    public void setManagerSex(String managerSex) {
        this.managerSex = managerSex == null ? null : managerSex.trim();
    }

    public String getManagerLivingAddress() {
        return managerLivingAddress;
    }

    public void setManagerLivingAddress(String managerLivingAddress) {
        this.managerLivingAddress = managerLivingAddress == null ? null : managerLivingAddress.trim();
    }
}