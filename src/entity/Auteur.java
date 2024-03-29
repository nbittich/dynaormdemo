/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import be.bittich.dynaorm.annotation.MetaColumn;
import be.bittich.dynaorm.annotation.PrimaryKey;
import be.bittich.dynaorm.annotation.TableFromDB;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author Nordine
 */
@TableFromDB(tableName = "auteurs")
public class Auteur {

    @PrimaryKey(autoGenerated = true)
    private long id;
    private String nom;
    private String prenom;
    @MetaColumn(columnName = "date_naiss")
    private Date dateNaiss;
    @MetaColumn(columnName = "created_at")
    private Date createdAt;
    @MetaColumn(columnName = "updated_at")
    private Date updatedAt;
    private List<Citation> citations = new ArrayList<Citation>();

    public Auteur(long id) {
        this.id = id;
    }

    public Auteur(long id, String nom, String prenom, Date dateNaiss, Date createdAt, Date updatedAt) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public List<Citation> getCitations() {
        return citations;
    }

    public void setCitations(List<Citation> listCitations) {
        this.citations = listCitations;
    }

    public Auteur() {
    }

    public Auteur(Long id, String nom, String prenom, Date dateNaiss, Date createdAt, Date updatedAt) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the dateNaiss
     */
    public Date getDateNaiss() {
        return dateNaiss;
    }

    /**
     * @param dateNaiss the dateNaiss to set
     */
    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    /**
     * @return the createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt the updatedAt to set
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
