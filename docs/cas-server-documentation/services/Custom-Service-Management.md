---
layout: default
title: CAS - Custom Service Registry
category: Services
---

{% include variables.html %}

# Custom Service Registry

If you wish to design your own implementation of a service registry, you will need to inject your implementation into CAS as such:

```java
package org.apereo.cas.support;

@Configuration("myConfiguration")
@EnableConfigurationProperties(CasConfigurationProperties.class)
public class MyConfiguration implements ServiceRegistryExecutionPlanConfigurer {

  @Bean
  @RefreshScope(proxyMode = ScopedProxyMode.DEFAULT)
  public ServiceRegistryDao serviceRegistry() {
      ...
  }
  
  @Override
  public void configureServiceRegistry(final ServiceRegistryExecutionPlan plan) {
    plan.registerServiceRegistry(serviceRegistry());
  }
}
```

At a minimum, your overlay will need to include the following modules:

{% include_cached casmodule.html group="org.apereo.cas" module="cas-server-core-services" %}

[See this guide](../configuration/Configuration-Management-Extensions.html) to learn more about how to register configurations into the CAS runtime.
