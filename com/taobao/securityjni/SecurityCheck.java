package com.taobao.securityjni;

import android.content.ContextWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.securityjni.tools.DataContext;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.SecurityGuardParamContext;
import com.taobao.wireless.security.sdk.indiekit.IIndieKitComponent;
import java.util.HashMap;
import tb.kge;

@Deprecated
/* loaded from: classes8.dex */
public class SecurityCheck {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SecurityGuardManager manager;
    private IIndieKitComponent proxy;

    static {
        kge.a(929562251);
    }

    public int validateFileSignature(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91f798be", new Object[]{this, str, str2, str3})).intValue();
        }
        return -1;
    }

    public SecurityCheck(ContextWrapper contextWrapper) {
        this.manager = SecurityGuardManager.getInstance(contextWrapper);
        SecurityGuardManager securityGuardManager = this.manager;
        if (securityGuardManager != null) {
            this.proxy = securityGuardManager.getIndieKitComp();
        }
    }

    public String getCheckSignature(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f2639e9", new Object[]{this, str});
        }
        DataContext dataContext = new DataContext();
        dataContext.index = 0;
        return getCheckSignature(str, dataContext);
    }

    public String getCheckSignature(String str, DataContext dataContext) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd253a6e", new Object[]{this, str, dataContext});
        }
        if (this.proxy != null && str != null && dataContext != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("timestamp", str);
            SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
            securityGuardParamContext.paramMap = hashMap;
            securityGuardParamContext.requestType = 1;
            if (dataContext.extData != null && !"".equals(dataContext.extData)) {
                securityGuardParamContext.appKey = new String(dataContext.extData);
            } else {
                if (dataContext.index >= 0) {
                    i = dataContext.index;
                }
                dataContext.index = i;
                String appKeyByIndex = this.manager.getStaticDataStoreComp().getAppKeyByIndex(dataContext.index);
                if (appKeyByIndex != null && !"".equals(appKeyByIndex)) {
                    securityGuardParamContext.appKey = appKeyByIndex;
                }
            }
            return this.proxy.indieKitRequest(securityGuardParamContext);
        }
        return null;
    }

    public String indieKitRequest(SecurityGuardParamContext securityGuardParamContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82233b7", new Object[]{this, securityGuardParamContext});
        }
        IIndieKitComponent iIndieKitComponent = this.proxy;
        if (iIndieKitComponent != null) {
            return iIndieKitComponent.indieKitRequest(securityGuardParamContext);
        }
        return null;
    }

    public int reportSusText(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4805758", new Object[]{this, str, str2})).intValue();
        }
        throw new UnsupportedOperationException();
    }
}
