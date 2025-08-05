package com.alibaba.analytics.core.config;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.any;
import tb.aob;
import tb.apr;
import tb.kge;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f2060a;

    static {
        kge.a(2028279856);
        f2060a = new HashMap();
    }

    public static synchronized void a(String str, String str2) {
        synchronized (i.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
                return;
            }
            Context k = aob.a().k();
            if (k == null) {
                k = any.d().e();
            }
            if (k == null) {
                return;
            }
            if (!TextUtils.isEmpty(str2) && str2.length() > 100000) {
                return;
            }
            f2060a.put(str, str2);
            String packageName = k.getPackageName();
            apr.b("UTConfigMgr", "postServerConfig packageName", packageName, "key", str, "value", str2);
            Intent intent = new Intent("com.alibaba.analytics.config.change");
            intent.setPackage(packageName);
            intent.putExtra("key", str);
            intent.putExtra("value", str2);
            k.sendBroadcast(intent);
        }
    }

    public static synchronized void a() {
        synchronized (i.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
                return;
            }
            for (Map.Entry<String, String> entry : f2060a.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
        }
    }
}
