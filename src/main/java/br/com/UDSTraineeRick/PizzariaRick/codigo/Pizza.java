package br.com.UDSTraineeRick.PizzariaRick.codigo;

import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.UUID;

public class Pizza {
    @ApiModelProperty(hidden = true)
    private final UUID id;

    @ApiModelProperty(hidden = true)
    private final LocalDate data_cadastro;

    private String massa;
    private String queijo;
    private String molho;
    private String sabor;
    private Integer tempoDePreparo;

    public Pizza() {
        this.id = UUID.randomUUID();
        this.data_cadastro = LocalDate.now();
    }

    public Pizza(String massa, String queijo, String molho, String sabor, Integer tempoDePreparo) {
        this();
        this.massa = massa;
        this.queijo = queijo;
        this.molho = molho;
        this.sabor = sabor;
        this.tempoDePreparo = tempoDePreparo;
    }

    public UUID getId() {
        return id;
    }

    public LocalDate getData_cadastro() {
        return data_cadastro;
    }

    public String getMassa() {
        return massa;
    }

    public String getQueijo() {
        return queijo;
    }

    public String getMolho() {
        return molho;
    }

    public String getSabor() {
        return sabor;
    }

    public Integer getTempoDePreparo() {
        return tempoDePreparo;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setTempoDePreparo(Integer tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", data_cadastro=" + data_cadastro +
                ", massa='" + massa + '\'' +
                ", queijo='" + queijo + '\'' +
                ", molho='" + molho + '\'' +
                ", sabor='" + sabor + '\'' +
                ", tempoDePreparo=" + tempoDePreparo +
                '}';
    }
}



