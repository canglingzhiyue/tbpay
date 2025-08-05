package com.alibaba.wireless.aliprivacyext.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f4242a = "参数异常";
    public static final String b = "不支持的类型";
    public static final String c = "调用成功";
    public static final String d = "调用失败";

    public void a(com.alibaba.wireless.aliprivacyext.plugins.b bVar, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b1b0a0f", new Object[]{this, bVar, str, map});
            return;
        }
        HashMap hashMap = new HashMap(2);
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("message", str);
        }
        if (bVar == null) {
            return;
        }
        bVar.a(hashMap);
    }

    public abstract boolean a(Context context, String str, String str2, com.alibaba.wireless.aliprivacyext.plugins.b bVar);

    public void b(com.alibaba.wireless.aliprivacyext.plugins.b bVar, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b31a686e", new Object[]{this, bVar, str, map});
            return;
        }
        HashMap hashMap = new HashMap(2);
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("message", str);
        }
        if (bVar == null) {
            return;
        }
        bVar.b(hashMap);
    }
}
