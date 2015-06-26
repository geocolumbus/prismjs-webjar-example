package com.tallgeorge.color.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ResultSet {

    /**
     * The unique row identifier.
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * The content type of the result.
     */
    @Column
    private String contentType;

    /**
     * The result data.
     */
    @Column(length = 4096)
    private String resultEntity;

    /**
     * Get the result.
     *
     * @return a string, the result.
     */
    public final String getResultEntity() {
        return resultEntity;
    }

    /**
     * Set the result.
     *
     * @param resultEntity a string, the result value to set.
     */
    public final void setResultEntity(final String resultEntity) {
        this.resultEntity = resultEntity;
    }

    /**
     * Get the content type.
     *
     * @return a string, the content type.
     */
    public final String getContentType() {
        return contentType;
    }

    /**
     * Set the content type.
     *
     * @param contentType a string, the content value to set.
     */
    public final void setContentType(final String contentType) {
        this.contentType = contentType;
    }
}
