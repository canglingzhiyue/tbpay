package com.alipay.mobile.security.bio.service.local.apsecurity;

import android.content.Context;
import com.alipay.mobile.security.bio.service.local.LocalService;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class ApSecurityService extends LocalService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_APDIDTOKEN = "com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService.ApdidToken";
    public static String b = "";

    public abstract String getApDidToken();

    public abstract void init(Context context);

    public static String getStaticApDidToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3b154a8c", new Object[0]) : b;
    }

    public static void setStaticApDidToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d6956a", new Object[]{str});
        } else {
            b = str;
        }
    }
}
