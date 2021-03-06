/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the Backend WebProxy Server to use in the Request to Backend.
 */
public class BackendProxyContract {
    /**
     * WebProxy Server AbsoluteUri property which includes the entire URI
     * stored in the Uri instance, including all fragments and query strings.
     */
    @JsonProperty(value = "url", required = true)
    private String url;

    /**
     * Username to connect to the WebProxy server.
     */
    @JsonProperty(value = "username")
    private String username;

    /**
     * Password to connect to the WebProxy Server.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get webProxy Server AbsoluteUri property which includes the entire URI stored in the Uri instance, including all fragments and query strings.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set webProxy Server AbsoluteUri property which includes the entire URI stored in the Uri instance, including all fragments and query strings.
     *
     * @param url the url value to set
     * @return the BackendProxyContract object itself.
     */
    public BackendProxyContract withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get username to connect to the WebProxy server.
     *
     * @return the username value
     */
    public String username() {
        return this.username;
    }

    /**
     * Set username to connect to the WebProxy server.
     *
     * @param username the username value to set
     * @return the BackendProxyContract object itself.
     */
    public BackendProxyContract withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get password to connect to the WebProxy Server.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set password to connect to the WebProxy Server.
     *
     * @param password the password value to set
     * @return the BackendProxyContract object itself.
     */
    public BackendProxyContract withPassword(String password) {
        this.password = password;
        return this;
    }

}
