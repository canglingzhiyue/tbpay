package com.taobao.android.dinamicx.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1470643386);
    }

    public abstract void a(String str, String str2, String str3, String str4, String str5, String str6, Map<String, Object> map, Map<String, Object> map2);

    public abstract void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map);

    public abstract void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7);
}
