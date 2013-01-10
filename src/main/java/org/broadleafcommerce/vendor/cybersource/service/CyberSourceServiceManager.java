/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.vendor.cybersource.service;

import java.util.List;

import org.broadleafcommerce.vendor.cybersource.service.message.CyberSourceRequest;

/**
 * 
 * @author jfischer
 *
 */
public interface CyberSourceServiceManager {

    public abstract List<CyberSourceService> getRegisteredServices();

    public abstract void setRegisteredServices(List<CyberSourceService> registeredServices);

    public abstract String getMerchantId();

    public abstract void setMerchantId(String merchantId);

    public abstract String getServerUrl();

    public abstract void setServerUrl(String serverUrl);

    public abstract String getLibVersion();

    public abstract void setLibVersion(String libVersion);

    public abstract CyberSourceService getValidService(CyberSourceRequest request);

}