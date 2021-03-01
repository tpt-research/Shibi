/**
 * Open European Public Transit Format (OEPTF)
 * An european standard for public transit.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: tristan.marsell@axitera.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package de.zwei.shibi.model.restyprotobuf

/**
 * Error body for error responses
 * @param reason Shows reason of error
 * @param stacktrace OPTIONAL: Shows complete stacktrace
 */
data class Error(
    /* Shows reason of error */
    val reason: kotlin.String,
    /* OPTIONAL: Shows complete stacktrace */
    val stacktrace: kotlin.String? = null
)