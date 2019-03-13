package com.adv.pojo;

import java.util.Date;

public class TakesTables {
    private Integer id;

    private String materials;

    private String takesName;

    private Integer takesNumber;

    private Long price;

    private Date takesDate;

    private String application;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials == null ? null : materials.trim();
    }

    public String getTakesName() {
        return takesName;
    }

    public void setTakesName(String takesName) {
        this.takesName = takesName == null ? null : takesName.trim();
    }

    public Integer getTakesNumber() {
        return takesNumber;
    }

    public void setTakesNumber(Integer takesNumber) {
        this.takesNumber = takesNumber;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Date getTakesDate() {
        return takesDate;
    }

    public void setTakesDate(Date takesDate) {
        this.takesDate = takesDate;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application == null ? null : application.trim();
    }
}