/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2017_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.notificationhubs.v2017_04_01.implementation.SharedAccessAuthorizationRuleResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.notificationhubs.v2017_04_01.implementation.NotificationHubsManager;
import java.util.List;
import java.util.Map;

/**
 * Type representing NamespaceSharedAccessAuthorizationRuleResource.
 */
public interface NamespaceSharedAccessAuthorizationRuleResource extends HasInner<SharedAccessAuthorizationRuleResourceInner>, Indexable, Refreshable<NamespaceSharedAccessAuthorizationRuleResource>, Updatable<NamespaceSharedAccessAuthorizationRuleResource.Update>, HasManager<NotificationHubsManager> {
    /**
     * @return the claimType value.
     */
    String claimType();

    /**
     * @return the claimValue value.
     */
    String claimValue();

    /**
     * @return the createdTime value.
     */
    String createdTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the keyName value.
     */
    String keyName();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the modifiedTime value.
     */
    String modifiedTime();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * @return the revision value.
     */
    Integer revision();

    /**
     * @return the rights value.
     */
    List<AccessRights> rights();

    /**
     * @return the secondaryKey value.
     */
    String secondaryKey();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the NamespaceSharedAccessAuthorizationRuleResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNamespace, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of NamespaceSharedAccessAuthorizationRuleResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a NamespaceSharedAccessAuthorizationRuleResource definition.
         */
        interface Blank extends WithNamespace {
        }

        /**
         * The stage of the namespacesharedaccessauthorizationruleresource definition allowing to specify Namespace.
         */
        interface WithNamespace {
           /**
            * Specifies resourceGroupName, namespaceName.
            * @param resourceGroupName The name of the resource group
            * @param namespaceName The namespace name
            * @return the next definition stage
            */
            WithProperties withExistingNamespace(String resourceGroupName, String namespaceName);
        }

        /**
         * The stage of the namespacesharedaccessauthorizationruleresource definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties Properties of the Namespace AuthorizationRules
            * @return the next definition stage
            */
            WithCreate withProperties(SharedAccessAuthorizationRuleProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<NamespaceSharedAccessAuthorizationRuleResource> {
        }
    }
    /**
     * The template for a NamespaceSharedAccessAuthorizationRuleResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<NamespaceSharedAccessAuthorizationRuleResource>, UpdateStages.WithProperties {
    }

    /**
     * Grouping of NamespaceSharedAccessAuthorizationRuleResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the namespacesharedaccessauthorizationruleresource update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Properties of the Namespace AuthorizationRules
             * @return the next update stage
             */
            Update withProperties(SharedAccessAuthorizationRuleProperties properties);
        }

    }
}
