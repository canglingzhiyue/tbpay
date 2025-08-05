package com.ut.secbody;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.securityjni.GlobalInit;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent;
import tb.kge;

@Deprecated
/* loaded from: classes9.dex */
public class SecurityMatrix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2085324223);
    }

    public static boolean dataReceive(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d8fe9ae", new Object[]{str})).booleanValue();
        }
        ISecurityBodyComponent securityBodyComp = SecurityGuardManager.getInstance(GlobalInit.getGlobalContext()).getSecurityBodyComp();
        if (securityBodyComp == null) {
            return false;
        }
        return securityBodyComp.putUserTrackRecord(str);
    }
}
