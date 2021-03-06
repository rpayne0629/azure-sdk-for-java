/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ProactiveDetectionConfigurations;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationInsightsComponentProactiveDetectionConfiguration;

class ProactiveDetectionConfigurationsImpl extends WrapperImpl<ProactiveDetectionConfigurationsInner> implements ProactiveDetectionConfigurations {
    private final InsightsManager manager;

    ProactiveDetectionConfigurationsImpl(InsightsManager manager) {
        super(manager.inner().proactiveDetectionConfigurations());
        this.manager = manager;
    }

    public InsightsManager manager() {
        return this.manager;
    }

    private ApplicationInsightsComponentProactiveDetectionConfigurationImpl wrapModel(ApplicationInsightsComponentProactiveDetectionConfigurationInner inner) {
        return  new ApplicationInsightsComponentProactiveDetectionConfigurationImpl(inner, manager());
    }

    @Override
    public Observable<ApplicationInsightsComponentProactiveDetectionConfiguration> listAsync(String resourceGroupName, String resourceName) {
        ProactiveDetectionConfigurationsInner client = this.inner();
        return client.listAsync(resourceGroupName, resourceName)
        .flatMap(new Func1<List<ApplicationInsightsComponentProactiveDetectionConfigurationInner>, Observable<ApplicationInsightsComponentProactiveDetectionConfigurationInner>>() {
            @Override
            public Observable<ApplicationInsightsComponentProactiveDetectionConfigurationInner> call(List<ApplicationInsightsComponentProactiveDetectionConfigurationInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ApplicationInsightsComponentProactiveDetectionConfigurationInner, ApplicationInsightsComponentProactiveDetectionConfiguration>() {
            @Override
            public ApplicationInsightsComponentProactiveDetectionConfiguration call(ApplicationInsightsComponentProactiveDetectionConfigurationInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ApplicationInsightsComponentProactiveDetectionConfiguration> getAsync(String resourceGroupName, String resourceName, String configurationId) {
        ProactiveDetectionConfigurationsInner client = this.inner();
        return client.getAsync(resourceGroupName, resourceName, configurationId)
        .map(new Func1<ApplicationInsightsComponentProactiveDetectionConfigurationInner, ApplicationInsightsComponentProactiveDetectionConfiguration>() {
            @Override
            public ApplicationInsightsComponentProactiveDetectionConfiguration call(ApplicationInsightsComponentProactiveDetectionConfigurationInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
