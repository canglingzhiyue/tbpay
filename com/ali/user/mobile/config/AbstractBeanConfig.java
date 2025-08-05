package com.ali.user.mobile.config;

import com.ali.user.mobile.service.ServiceConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class AbstractBeanConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> beanMap = new ConcurrentHashMap();

    static {
        kge.a(-865015623);
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.beanMap.put(ServiceConstants.ServiceInterface.STORAGE_SERVICE, "com.ali.user.mobile.service.impl.SecurityGuardWrapper");
        }
    }

    public String getBeanClassName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("acb07cf2", new Object[]{this, str});
        }
        if (this.beanMap.isEmpty()) {
            init();
        }
        return this.beanMap.get(str);
    }
}
