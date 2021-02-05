package de.sqrls.ratatoskr.core;


import cc.dividebyzero.spring.foundations.IBaseObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.ZonedDateTime;
import java.util.UUID;

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

    UUID owner;
    UUID tenantId;

   /**the weightage or sort key of this object**/
    int weightage;
}
