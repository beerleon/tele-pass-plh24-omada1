/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author leon
 */
@Entity
@Table(name = "VEHICLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehicle.findAll", query = "SELECT v FROM Vehicle v"),
    @NamedQuery(name = "Vehicle.findById", query = "SELECT v FROM Vehicle v WHERE v.id = :id"),
    @NamedQuery(name = "Vehicle.findByRegNumber", query = "SELECT v FROM Vehicle v WHERE v.regNumber = :regNumber"),
    @NamedQuery(name = "Vehicle.findByModelName", query = "SELECT v FROM Vehicle v WHERE v.modelName = :modelName")})
public class Vehicle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "REG_NUMBER")
    private String regNumber;
    @Column(name = "MODEL_NAME")
    private String modelName;
    @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "ID")
    @ManyToOne
    private VehicleCategory categoryId;
    @JoinColumn(name = "PROGRAM_ID", referencedColumnName = "ID")
    @ManyToOne
    private Program programId;
    @JoinColumn(name = "FACTORY_ID", referencedColumnName = "ID")
    @ManyToOne
    private Factory factoryId;
    @JoinColumn(name = "CUST_ID", referencedColumnName = "ID")
    @ManyToOne
    private Customer custId;
    @JoinColumn(name = "COLOR_ID", referencedColumnName = "ID")
    @ManyToOne
    private Color colorId;
    @JoinColumn(name = "CARD_ID", referencedColumnName = "ID")
    @ManyToOne
    private Card cardId;

    public Vehicle() {
    }

    public Vehicle(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public VehicleCategory getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(VehicleCategory categoryId) {
        this.categoryId = categoryId;
    }

    public Program getProgramId() {
        return programId;
    }

    public void setProgramId(Program programId) {
        this.programId = programId;
    }

    public Factory getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Factory factoryId) {
        this.factoryId = factoryId;
    }

    public Customer getCustId() {
        return custId;
    }

    public void setCustId(Customer custId) {
        this.custId = custId;
    }

    public Color getColorId() {
        return colorId;
    }

    public void setColorId(Color colorId) {
        this.colorId = colorId;
    }

    public Card getCardId() {
        return cardId;
    }

    public void setCardId(Card cardId) {
        this.cardId = cardId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehicle)) {
            return false;
        }
        Vehicle other = (Vehicle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Vehicle[ id=" + id + " ]";
    }
    
}
