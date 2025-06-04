package org.example.model.ContaBancariaGlobal.Cartoes;

import org.example.enums.TipoCartao;


import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Cartao {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String codigoCV;
    @Column
    private Integer limiteCartao;

    @ElementCollection(targetClass = TipoCartao.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "cartao_tipo_cartao", joinColumns = @JoinColumn(name = "cartao_id"))
    @Column(name = "tipo_cartao")
    private List<TipoCartao> tipoCartaoList;

    public Cartao(String codigoCV, Integer limiteCartao) {
        super();
        this.codigoCV = codigoCV;
        this.limiteCartao = limiteCartao;

    }

    public Cartao() {
    }

    public String getCodigoCV() {
        return codigoCV;
    }

    public void setCodigoCV(String codigoCV) {
        this.codigoCV = codigoCV;
    }


    public List<TipoCartao> getTipoCartaoList() {
        return tipoCartaoList;
    }

    public void setTipoCartaoList(List<TipoCartao> tipoCartaoList) {
        this.tipoCartaoList = tipoCartaoList;
    }

    public Integer getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(Integer limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cartao cartao = (Cartao) o;
        return Objects.equals(codigoCV, cartao.codigoCV) && Objects.equals(tipoCartaoList, cartao.tipoCartaoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoCV, tipoCartaoList);
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "codigoCV='" + codigoCV + '\'' +
                ", tipoCartaoList=" + tipoCartaoList +
                '}';
    }
}
