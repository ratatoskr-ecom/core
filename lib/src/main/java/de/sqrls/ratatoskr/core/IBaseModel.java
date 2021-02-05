package de.sqrls.ratatoskr.core;

import cc.dividebyzero.spring.foundations.IBaseObject;

import java.time.ZonedDateTime;
import java.util.UUID;

public interface IBaseModel extends IBaseObject<UUID> {

    public UUID getId();

    public void setId(UUID id);

    public ZonedDateTime getCreatedAt() ;
    public void setCreatedAt(ZonedDateTime createdAt);
    public String getCreatedBy();
    public void setCreatedBy(String createdBy);

    public ZonedDateTime getUpdatedAt();

    public void setUpdatedAt(ZonedDateTime updatedAt);

    public String getUpdatedBy();

    public void setUpdatedBy(String updatedBy);

    public ZonedDateTime getDeletedAt();

    public void setDeletedAt(ZonedDateTime deletedAt);

    public String getDeletedBy();

    public void setDeletedBy(String deletedBy);

    public boolean isDeleted();

    public void setDeleted(boolean deleted);

    public UUID getOwner();

    public void setOwner(UUID owner);

    public UUID getTenantId();

    public void setTenantId(UUID tenantId);

    public int getWeightage();

    public void setWeightage(int weightage);
}
