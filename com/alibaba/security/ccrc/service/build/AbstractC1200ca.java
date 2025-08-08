package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alibaba.security.ccrc.service.build.ca  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1200ca {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3296a = "参数异常";
    public static final String b = "不支持的方法";
    public static final String c = "调用成功";
    public static final String d = "调用异常";

    public static void a(InterfaceC1203da interfaceC1203da, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7234176", new Object[]{interfaceC1203da, map});
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("message", "调用成功");
        if (interfaceC1203da == null) {
            return;
        }
        interfaceC1203da.onSuccess(hashMap);
    }

    public abstract boolean a(Context context, String str, String str2, InterfaceC1203da interfaceC1203da);

    public static void a(InterfaceC1203da interfaceC1203da, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f16d02c", new Object[]{interfaceC1203da, str, map});
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!StringUtils.isEmpty(str)) {
            hashMap.put("message", str);
        }
        if (interfaceC1203da == null) {
            return;
        }
        interfaceC1203da.a(hashMap);
    }
}
