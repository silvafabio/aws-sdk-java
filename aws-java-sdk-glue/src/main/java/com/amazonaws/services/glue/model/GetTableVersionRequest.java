/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTableVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTableVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the table. For Hive compatibility, this name is entirely lowercase.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The ID value of the table version to be retrieved.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by
     *        default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by
     *         default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by
     *        default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableVersionRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @param databaseName
     *        The database in the catalog in which the table resides. For Hive compatibility, this name is entirely
     *        lowercase.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @return The database in the catalog in which the table resides. For Hive compatibility, this name is entirely
     *         lowercase.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @param databaseName
     *        The database in the catalog in which the table resides. For Hive compatibility, this name is entirely
     *        lowercase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableVersionRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the table. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @param tableName
     *        The name of the table. For Hive compatibility, this name is entirely lowercase.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @return The name of the table. For Hive compatibility, this name is entirely lowercase.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @param tableName
     *        The name of the table. For Hive compatibility, this name is entirely lowercase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableVersionRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The ID value of the table version to be retrieved.
     * </p>
     * 
     * @param versionId
     *        The ID value of the table version to be retrieved.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The ID value of the table version to be retrieved.
     * </p>
     * 
     * @return The ID value of the table version to be retrieved.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The ID value of the table version to be retrieved.
     * </p>
     * 
     * @param versionId
     *        The ID value of the table version to be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableVersionRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTableVersionRequest == false)
            return false;
        GetTableVersionRequest other = (GetTableVersionRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public GetTableVersionRequest clone() {
        return (GetTableVersionRequest) super.clone();
    }

}
