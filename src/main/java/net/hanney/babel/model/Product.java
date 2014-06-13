/*
 * Copyright (c) 2014. Babel Localization Tool.
 */

package net.hanney.babel.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Model that defines a Product within Babel that has {@link BabelString}s
 * that will be translated.
 *
 * @author justin.hanney
 * @since 0.1.0
 */
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long productId;
    private String productName;
    private String description;
    private Date createDate;
    private boolean isActive;

    public Product() {
        super();
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("productId", getProductId())
                .append("productName", getProductName())
                .append("description", getDescription())
                .append("createDate", getCreateDate())
                .append("isActive", getIsActive())
                .toString();
    }

}
