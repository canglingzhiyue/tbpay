package com.taobao.themis.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class TMSResourceUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public enum ResourceType {
        ONLINE,
        BASE64,
        INTERNAL
    }

    static {
        kge.a(-1041555811);
    }

    public static ResourceType a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ResourceType) ipChange.ipc$dispatch("2ebed14", new Object[]{str}) : (str.startsWith(com.taobao.vessel.utils.b.HTTPS_SCHEMA) || str.startsWith("http:")) ? ResourceType.ONLINE : h.a(str) ? ResourceType.BASE64 : ResourceType.INTERNAL;
    }
}
