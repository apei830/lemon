package com.mossle.auth.domain;

// Generated by Hibernate Tools
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Oper .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "AUTH_OPER")
public class Oper implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private String name;

    /** null. */
    private Integer mask;

    /** null. */
    private Character code;

    /** null. */
    private String descn;

    /** null. */
    private String scopeId;

    /** . */
    private Set<Perm> perms = new HashSet<Perm>(0);

    public Oper() {
    }

    public Oper(String name, Integer mask, Character code, String descn,
            String scopeId, Set<Perm> perms) {
        this.name = name;
        this.mask = mask;
        this.code = code;
        this.descn = descn;
        this.scopeId = scopeId;
        this.perms = perms;
    }

    /** @return null. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @Column(name = "NAME", length = 50)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "MASK")
    public Integer getMask() {
        return this.mask;
    }

    /**
     * @param mask
     *            null.
     */
    public void setMask(Integer mask) {
        this.mask = mask;
    }

    /** @return null. */
    @Column(name = "CODE", length = 1)
    public Character getCode() {
        return this.code;
    }

    /**
     * @param code
     *            null.
     */
    public void setCode(Character code) {
        this.code = code;
    }

    /** @return null. */
    @Column(name = "DESCN", length = 200)
    public String getDescn() {
        return this.descn;
    }

    /**
     * @param descn
     *            null.
     */
    public void setDescn(String descn) {
        this.descn = descn;
    }

    /** @return null. */
    @Column(name = "SCOPE_ID", length = 50)
    public String getScopeId() {
        return this.scopeId;
    }

    /**
     * @param scopeId
     *            null.
     */
    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "oper")
    public Set<Perm> getPerms() {
        return this.perms;
    }

    /**
     * @param perms
     *            .
     */
    public void setPerms(Set<Perm> perms) {
        this.perms = perms;
    }
}
