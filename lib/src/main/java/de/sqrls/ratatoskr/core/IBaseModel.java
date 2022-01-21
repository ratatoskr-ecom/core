package de.sqrls.ratatoskr.core;

import cc.dividebyzero.spring.foundations.IBaseObject;

import java.time.ZonedDateTime;
import java.util.UUID;
/**
 * This file is part of Ratatoskr ECOM.
 * Copyright (C) 2020  SQRL SOLUTIONS UG
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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

    public UUID getOwnerId();

    public void setOwnerId(UUID owner);

    public UUID getTenantId();

    public void setTenantId(UUID tenantId);

    public int getWeightage();

    public void setWeightage(int weightage);
}
