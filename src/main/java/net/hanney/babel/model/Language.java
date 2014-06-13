/*
 * Copyright (c) 2014. Babel Localization Tool.
 */

package net.hanney.babel.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Model that defines a Language into which {@link BabelString}s may be translated.
 * </p>
 * Since Babel supports multiple {@link Product}s, which may have different Language
 * requirements. The user is free to choose which Languages a Product supports.
 *
 * @author justin.hanney
 * @since 0.1.0
 */
public class Language implements Serializable {

    private static final long serialVersionUID = 1L;

    private String languageCode;
    private String description;
    private Date createDate;
    private Boolean isActive;

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
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
                .append("languageCode", getLanguageCode())
                .append("description", getDescription())
                .append("createDate", getCreateDate())
                .append("isActive", getIsActive())
                .toString();
    }

}
