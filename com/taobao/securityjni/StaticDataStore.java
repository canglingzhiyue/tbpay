package com.taobao.securityjni;

import android.content.ContextWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.securityjni.tools.DataContext;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.staticdatastore.IStaticDataStoreComponent;
import tb.kge;

@Deprecated
/* loaded from: classes8.dex */
public class StaticDataStore {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int APP_KEY_TYPE = 1;
    public static final int EXTRA_KEY_TYPE = 3;
    public static final int INVALID_KEY_TYPE = 4;
    public static final int SECURITY_KEY_TYPE = 2;
    private IStaticDataStoreComponent proxy;

    static {
        kge.a(-400601940);
    }

    @Deprecated
    public String getMMPid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9a2fe4", new Object[]{this});
        }
        return null;
    }

    @Deprecated
    public String getTtid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this});
        }
        return null;
    }

    public StaticDataStore(ContextWrapper contextWrapper) {
        SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(contextWrapper);
        if (securityGuardManager != null) {
            this.proxy = securityGuardManager.getStaticDataStoreComp();
        }
    }

    @Deprecated
    public String getAppKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("49079005", new Object[]{this}) : getAppKey(new DataContext(0, null));
    }

    public String getAppKey(DataContext dataContext) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc232d8a", new Object[]{this, dataContext});
        }
        if (dataContext == null) {
            return null;
        }
        if (dataContext.index >= 0) {
            i = dataContext.index;
        }
        return getAppKeyByIndex(i);
    }

    public String getExtraData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ab8ec8b", new Object[]{this, str});
        }
        IStaticDataStoreComponent iStaticDataStoreComponent = this.proxy;
        if (iStaticDataStoreComponent != null && str != null) {
            return iStaticDataStoreComponent.getExtraData(str);
        }
        return null;
    }

    public int getKeyType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee1c47", new Object[]{this, str})).intValue();
        }
        IStaticDataStoreComponent iStaticDataStoreComponent = this.proxy;
        if (iStaticDataStoreComponent != null && str != null) {
            return iStaticDataStoreComponent.getKeyType(str);
        }
        return 4;
    }

    public String getAppKeyByIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de3a5a2b", new Object[]{this, new Integer(i)});
        }
        IStaticDataStoreComponent iStaticDataStoreComponent = this.proxy;
        if (iStaticDataStoreComponent != null && i >= 0 && i <= 8) {
            return iStaticDataStoreComponent.getAppKeyByIndex(i);
        }
        return null;
    }
}
