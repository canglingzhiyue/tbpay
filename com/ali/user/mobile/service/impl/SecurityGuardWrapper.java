package com.ali.user.mobile.service.impl;

import android.content.Context;
import android.content.ContextWrapper;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.service.StorageService;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import tb.kge;

/* loaded from: classes2.dex */
public class SecurityGuardWrapper implements StorageService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SecurityGuardWrapper";
    private static SecurityGuardManager mSecurityGuardManager;

    static {
        kge.a(-752851141);
        kge.a(1565331868);
        mSecurityGuardManager = null;
    }

    @Override // com.ali.user.mobile.service.StorageService
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (mSecurityGuardManager != null) {
        } else {
            try {
                mSecurityGuardManager = SecurityGuardManager.getInstance(new ContextWrapper(context));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private SecurityGuardManager getSecurityGuardManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecurityGuardManager) ipChange.ipc$dispatch("e7fb8de8", new Object[]{this});
        }
        if (mSecurityGuardManager == null) {
            init(DataProviderFactory.getApplicationContext());
        }
        return mSecurityGuardManager;
    }

    @Override // com.ali.user.mobile.service.StorageService
    public String getAppKey(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19695938", new Object[]{this, new Integer(i)});
        }
        try {
            return getSecurityGuardManager().getStaticDataStoreComp().getAppKeyByIndex(i, "");
        } catch (Throwable th) {
            LoginTLogAdapter.e("SecurityGuardWrapper", "can't get appkey from blackbox." + th.getMessage());
            return "";
        }
    }

    @Override // com.ali.user.mobile.service.StorageService
    public void put(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fc7a2a", new Object[]{this, str, str2});
            return;
        }
        try {
            IDynamicDataStoreComponent dynamicDataStoreComp = getSecurityGuardManager().getDynamicDataStoreComp();
            if (dynamicDataStoreComp == null) {
                return;
            }
            dynamicDataStoreComp.putStringDDpEx(str, str2, 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.service.StorageService
    public String get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6158a19", new Object[]{this, str});
        }
        try {
            IDynamicDataStoreComponent dynamicDataStoreComp = getSecurityGuardManager().getDynamicDataStoreComp();
            return dynamicDataStoreComp != null ? dynamicDataStoreComp.getStringDDpEx(str, 0) : "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    @Override // com.ali.user.mobile.service.StorageService
    public void remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{this, str});
            return;
        }
        try {
            getSecurityGuardManager().getDynamicDataStoreComp().removeStringDDpEx(str, 0);
        } catch (Throwable unused) {
        }
    }
}
