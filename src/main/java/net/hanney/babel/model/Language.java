/*
 * Copyright (c) 2014. Babel Localization Tool.
 */

package net.hanney.babel.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
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
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="languages")
public class Language implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "language_code", length = 16)
    private String languageCode;

    @Column(name = "language_name", length = 128)
    private String languageName;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "is_active")
    private boolean isActive;

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(final String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(final String languageName) {
        this.languageName = languageName;
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
                .append("languageCode", getLanguageCode())
                .append("languageName", getLanguageName())
                .append("createDate", getCreateDate())
                .append("isActive", getIsActive())
                .toString();
    }

}
