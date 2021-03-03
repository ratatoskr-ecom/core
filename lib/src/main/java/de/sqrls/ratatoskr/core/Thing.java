package de.sqrls.ratatoskr.core;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.net.URL;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)

@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
/**
 * Closely build to schema.org/thing
 */
public class Thing extends BaseModel {

    /** "URL of this object**/
    URL url;

        /** additional type information**/
    String additionalType;

        /** name of this object**/
    String name;

        /** an image of this object**/
    URL image;

        /** description of this object**/
    String description;

        /** A CreativeWork or Event about this Thing.\n Inverse property: about.**/
    UUID subjectOf;



}