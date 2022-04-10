package com.jiudian.manage.model;

public class Room {
    // 房间id
    private Integer roomid;
    // 房间位置
    private String local;
    // 房间价格
    private Double money;
    // 房间状态(0.停用，1.未预定，2.已预定，3.待清扫)
    private Integer state;
    // 类型
    private Integer type;

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local == null ? null : local.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}