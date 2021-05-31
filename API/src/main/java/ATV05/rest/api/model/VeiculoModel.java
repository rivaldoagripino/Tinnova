package ATV05.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "veiculos")
public class VeiculoModel {

    @Id
    public Integer codigo;

    @Column(nullable = false, length = 50)
    public String veiculos;

    @Column(nullable = false, length = 30)
    public String marca;

    @Column(nullable = false, length = 50)
    public String descricao;

    @Column(nullable = false, length = 50)
    public Integer ano;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(String veiculos) {
        this.veiculos = veiculos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
