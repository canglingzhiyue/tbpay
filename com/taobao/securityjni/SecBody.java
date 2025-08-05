package com.taobao.securityjni;

import android.content.ContextWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent;
import com.taobao.wireless.security.sdk.staticdatastore.IStaticDataStoreComponent;
import tb.kge;

@Deprecated
/* loaded from: classes8.dex */
public class SecBody {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ISecurityBodyComponent proxy;
    private IStaticDataStoreComponent staticDataStoreComp;

    static {
        kge.a(-1155336010);
    }

    public SecBody(ContextWrapper contextWrapper) {
        SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(contextWrapper);
        if (securityGuardManager != null) {
            this.proxy = securityGuardManager.getSecurityBodyComp();
            this.staticDataStoreComp = securityGuardManager.getStaticDataStoreComp();
        }
    }

    public String getSecBodyData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bae26da8", new Object[]{this, str});
        }
        if (this.proxy == null || str == null || str.length() <= 0) {
            return null;
        }
        String GetGlobalAppKey = GlobalInit.GetGlobalAppKey();
        if (GetGlobalAppKey == null) {
            GetGlobalAppKey = this.staticDataStoreComp.getAppKeyByIndex(0);
        }
        return this.proxy.getSecurityBodyData(str, GetGlobalAppKey);
    }
}
