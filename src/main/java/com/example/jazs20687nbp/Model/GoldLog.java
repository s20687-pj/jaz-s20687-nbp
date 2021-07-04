package com.example.jazs20687nbp.Model;

import com.example.jazs20687nbp.Model.ENUM.Material;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@ApiModel("Logi do bazy danych")
@Table(name = "nbp")
public class GoldLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "Unikalne ID", dataType = "Long")
    private Integer ID;
    @ApiModelProperty(value = "Surowiec", dataType = "String", example = "GOLD")
    @Enumerated(EnumType.STRING)
    private Material material;
    @ApiModelProperty(value = "Początek zakresu", dataType = "LocalDate", example = "2021-07-04")
    private LocalDate datastart;
    @ApiModelProperty(value = "Koniec zakresu", dataType = "LocalDate", example = "2021-07-04")
    private LocalDate datakoniec;

    @ApiModelProperty(value = "Średni kurs", dataType = "Double", example = "1234 zł")
    private Double kurs;
    @ApiModelProperty(value = "Data wykonanego zapytania", dataType = "Date", example = "2021-07-04 20:21:00")
    private Date zapytanie;

    public GoldLog() {
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public LocalDate getDatastart() {
        return datastart;
    }

    public void setDatastart(LocalDate datastart) {
        this.datastart = datastart;
    }

    public LocalDate getDatakoniec() {
        return datakoniec;
    }

    public void setDatakoniec(LocalDate datakoniec) {
        this.datakoniec = datakoniec;
    }

    public Double getKurs() {
        return kurs;
    }

    public void setKurs(Double kurs) {
        this.kurs = kurs;
    }

    public Date getZapytanie() {
        return zapytanie;
    }

    public void setZapytanie(Date zapytanie) {
        this.zapytanie = zapytanie;
    }

    public GoldLog(Integer ID, Material material, LocalDate datastart, LocalDate datakoniec, Double kurs, Date zapytanie) {
        this.ID = ID;
        this.material = material;
        this.datastart = datastart;
        this.datakoniec = datakoniec;
        this.kurs = kurs;
        this.zapytanie = zapytanie;
    }
}
