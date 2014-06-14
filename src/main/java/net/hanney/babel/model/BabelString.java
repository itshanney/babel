/*
 * Copyright (c) 2014. Babel Localization Tool.
 */

package net.hanney.babel.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Model that defines a String that is available for translation in Babel.
 * </p>
 * This is the core concept in Babel and represents a particular string
 * literal that must be translated into the Languages supported by the
 * particular Product.
 *
 * @author justin.hanney
 * @since 0.1.0
 */
public class BabelString implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long stringId;
    private String stringKey;
    private String defaultValue;
    private String context;
    private Date createDate;
    private boolean isActive;

    public BabelString() {
        super();
    }

    public Long getStringId() {
        return stringId;
    }

    public void setStringId(final Long stringId) {
        this.stringId = stringId;
    }

    public String getStringKey() {
        return stringKey;
    }

    public void setStringKey(final String stringKey) {
        this.stringKey = stringKey;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(final String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getContext() {
        return context;
    }

    public void setContext(final String context) {
        this.context = context;
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
                .append("stringId", getStringId())
                .append("stringKey", getStringKey())
                .append("defaultValue", getDefaultValue())
                .append("context", getContext())
                .append("createDate", getCreateDate())
                .append("isActive", getIsActive())
                .toString();
    }

}
