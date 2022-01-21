package de.sqrls.ratatoskr.core;


import cc.dividebyzero.spring.foundations.IBaseObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

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
@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class BaseModel implements IBaseModel {

   /**UUID of object**/
    UUID id;

   /**creation time of this object**/
    ZonedDateTime createdAt;

   /**creator (person or machine)**/
    String createdBy;


   /**timestamp of last update**/
    ZonedDateTime updatedAt;

   /**updatedy by person or machine**/
    String updatedBy;


   /**timestamp of deletion**/
    ZonedDateTime deletedAt;

   /**deleted by machine or person**/
    String deletedBy;


   /**mark this object as deleted**/
   @Builder.Default
    boolean isDeleted = false;

    UUID ownerId;
    UUID tenantId;

   /**the weightage or sort key of this object**/
    int weightage;
}
