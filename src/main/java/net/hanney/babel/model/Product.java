/*
 * Copyright (c) 2014. Babel Localization Tool.
 */

package net.hanney.babel.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Model that defines a Product within Babel that has {@link BabelString}s
 * that will be translated.
 *
 * @author justin.hanney
 * @since 0.1.0
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="products")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "product_code", length = 16)
    private String productCode;

    @Column(name = "product_name", length = 128)
    private String productName;

    @Column(name = "description", length = 256)
    private String description;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "is_active")
    private boolean isActive;

    public Product() {
        super();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(final String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(final String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(final Date createDate) {
        this.createDate = createDate;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(final boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("productCode", getProductCode())
                .append("productName", getProductName())
                .append("description", getDescription())
                .append("createDate", getCreateDate())
                .append("isActive", getIsActive())
                .toString();
    }

}
