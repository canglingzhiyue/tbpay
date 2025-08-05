package com.alipay.mobile.security.bio.service;

import com.alipay.mobile.security.bio.api.BioCallback;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.SignHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes3.dex */
public class BioAppManager extends BioService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, BioAppDescription> f5804a;
    private HashMap<String, BioCallback> b;

    public static /* synthetic */ Object ipc$super(BioAppManager bioAppManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 548948747) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((BioServiceManager) objArr[0]);
            return null;
        }
    }

    @Override // com.alipay.mobile.security.bio.service.BioService
    public void onCreate(BioServiceManager bioServiceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b84b0b", new Object[]{this, bioServiceManager});
            return;
        }
        super.onCreate(bioServiceManager);
        this.f5804a = new HashMap<>();
        this.b = new HashMap<>();
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        UUID randomUUID = UUID.randomUUID();
        return SignHelper.MD5(System.currentTimeMillis() + "_" + (Math.random() * 10000.0d) + randomUUID.toString());
    }

    public String put(BioAppDescription bioAppDescription, BioCallback bioCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd5bdd8d", new Object[]{this, bioAppDescription, bioCallback});
        }
        String a2 = a();
        BioLog.d("BioAppManager", "put() appTag=" + a2);
        bioAppDescription.setTag(a2);
        this.f5804a.put(a2, bioAppDescription);
        this.b.put(a2, bioCallback);
        return a2;
    }

    public BioAppDescription getBioAppDescription(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioAppDescription) ipChange.ipc$dispatch("ec64a43e", new Object[]{this, str});
        }
        BioLog.d("BioAppManager", "get() appTag=" + str);
        return this.f5804a.get(str);
    }

    public BioCallback getBioCallback(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioCallback) ipChange.ipc$dispatch("f2c31125", new Object[]{this, str}) : this.b.get(str);
    }

    @Override // com.alipay.mobile.security.bio.service.BioService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.f5804a.clear();
        this.b.clear();
        super.onDestroy();
    }
}
