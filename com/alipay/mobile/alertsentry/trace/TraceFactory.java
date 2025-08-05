package com.alipay.mobile.alertsentry.trace;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class TraceFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f5336a = new ConcurrentHashMap<>();

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        f5336a.remove(str);
    }
}
