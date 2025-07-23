package com.example.apitest.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "sso_user_test")
public class SsoUserTestEntity {
    @Id
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "request_date" , nullable = false)
    private Date requestDate;

    @Column(name = "ssotype",length = 50)
    private String ssotype;

    @Column(name = "systemid",length = 50)
    private String systemid;

    @Column(name = "systemname",length = 250)
    private String systemname;

    @Column(name = "systemtransactions",length = 250)
    private String systemtransactions;

    @Column(name = "systemprivileges",length = 250)
    private String systemprivileges;

    @Column(name = "systemusergroup",length = 50)
    private String systemusergroup;

    @Column(name = "systemlocationgroup",length = 50)
    private String systemlocationgroup;

    @Column(name = "userid",length = 200)
    private String userid;

    @Column(name = "userfullname",length = 500)
    private String userfullname;

    @Column(name = "userrdofficecode",length = 250)
    private String userrdofficecode;

    @Column(name = "userofficecode",length = 250)
    private String userofficecode;

    @Column(name = "clientlocation",length = 250)
    private String clientlocation;

    @Column(name = "locationmachinenumber",length = 500)
    private String locationmachinenumber;

    @Column(name = "tokenid",length = 1000)
    private String tokenid;


    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getSsotype() {
        return ssotype;
    }

    public void setSsotype(String ssotype) {
        this.ssotype = ssotype;
    }

    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    public String getSystemname() {
        return systemname;
    }

    public void setSystemname(String systemname) {
        this.systemname = systemname;
    }

    public String getSystemtransactions() {
        return systemtransactions;
    }

    public void setSystemtransactions(String systemtransactions) {
        this.systemtransactions = systemtransactions;
    }

    public String getSystemprivileges() {
        return systemprivileges;
    }

    public void setSystemprivileges(String systemprivileges) {
        this.systemprivileges = systemprivileges;
    }

    public String getSystemusergroup() {
        return systemusergroup;
    }

    public void setSystemusergroup(String systemusergroup) {
        this.systemusergroup = systemusergroup;
    }

    public String getSystemlocationgroup() {
        return systemlocationgroup;
    }

    public void setSystemlocationgroup(String systemlocationgroup) {
        this.systemlocationgroup = systemlocationgroup;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserfullname() {
        return userfullname;
    }

    public void setUserfullname(String userfullname) {
        this.userfullname = userfullname;
    }

    public String getUserrdofficecode() {
        return userrdofficecode;
    }

    public void setUserrdofficecode(String userrdofficecode) {
        this.userrdofficecode = userrdofficecode;
    }

    public String getUserofficecode() {
        return userofficecode;
    }

    public void setUserofficecode(String userofficecode) {
        this.userofficecode = userofficecode;
    }

    public String getClientlocation() {
        return clientlocation;
    }

    public void setClientlocation(String clientlocation) {
        this.clientlocation = clientlocation;
    }

    public String getLocationmachinenumber() {
        return locationmachinenumber;
    }

    public void setLocationmachinenumber(String locationmachinenumber) {
        this.locationmachinenumber = locationmachinenumber;
    }

    public String getTokenid() {
        return tokenid;
    }

    public void setTokenid(String tokenid) {
        this.tokenid = tokenid;
    }




}
