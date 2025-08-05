package com.alipay.mobile.security.bio.service.impl;

import android.content.Context;
import com.alipay.mobile.security.bio.module.MicroModule;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioService;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.local.NotImplementedException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class BioServiceManagerForTest extends BioServiceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, BioService> c;

    @Override // com.alipay.mobile.security.bio.service.BioServiceManager
    public int preLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd8c2a23", new Object[]{this})).intValue();
        }
        return 0;
    }

    public BioServiceManagerForTest(Context context, String str) {
        super(context, str);
        this.c = new HashMap();
    }

    @Override // com.alipay.mobile.security.bio.service.BioServiceManager
    public <T> T getBioService(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("e6bc0a9f", new Object[]{this, cls}) : (T) getBioService(cls.getName());
    }

    @Override // com.alipay.mobile.security.bio.service.BioServiceManager
    public <T> T getBioService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("993012de", new Object[]{this, str});
        }
        T t = (T) this.c.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    @Override // com.alipay.mobile.security.bio.service.BioServiceManager
    public <T extends BioService> T putBioService(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d9df999a", new Object[]{this, str, cls});
        }
        throw new NotImplementedException("this is a test stub BioServiceManager, can only putBioService with created instance");
    }

    public <T extends BioService> T putBioServiceForTest(String str, BioService bioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("16ddd2f4", new Object[]{this, str, bioService});
        }
        BioService remove = this.c.remove(str);
        if (remove != null) {
            remove.destroy();
        }
        this.c.put(str, bioService);
        return bioService;
    }

    @Override // com.alipay.mobile.security.bio.service.BioServiceManager
    public String startBioActivity(BioAppDescription bioAppDescription, MicroModule microModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("226dec4e", new Object[]{this, bioAppDescription, microModule});
        }
        throw new NotImplementedException("this is a test stub BioServiceManager, cannot do startBioActivity");
    }

    @Override // com.alipay.mobile.security.bio.service.BioServiceManager
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.c.clear();
        }
    }
}
