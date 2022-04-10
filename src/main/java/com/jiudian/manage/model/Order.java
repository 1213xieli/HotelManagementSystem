package com.jiudian.manage.model;

import java.util.Date;

public class Order {
    // 订单id
    private Integer orderid;
    // 住房姓名
    private String householdname;
    // id
    private String id;
    // 开始时间，
    private Date starttime;
    // 结束时间，
    private Date endtime;
    // 总价格，当
    private Double money;
    // 前状态(已付款，待付款，已入住，未入住，已取消)
    private Integer state;
    // 房间id
    private Integer roomid;
    // 用户id
    private Integer userid;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getHouseholdname() {
        return householdname;
    }

    public void setHouseholdname(String householdname) {
        this.householdname = householdname == null ? null : householdname.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}