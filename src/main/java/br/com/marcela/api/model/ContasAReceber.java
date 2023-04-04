package br.com.marcela.api.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "contasareceber")

public class ContasAReceber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private Date dataconta;
    private BigDecimal valorconta;

    @ManyToOne
    @JoinColumn(name = "idconta")
    private Cliente cliente;

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContasAReceber that = (ContasAReceber) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataconta() {
        return dataconta;
    }

    public void setDataconta(Date dataconta) {
        this.dataconta = dataconta;
    }

    public BigDecimal getValorconta() {
        return valorconta;
    }

    public void setValorconta(BigDecimal valorconta) {
        this.valorconta = valorconta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}