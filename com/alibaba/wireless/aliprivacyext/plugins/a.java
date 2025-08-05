package com.alibaba.wireless.aliprivacyext.plugins;

import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.alibaba.wireless.aliprivacy.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommendation.TBRecommendPrivacy;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f4247a = new AtomicBoolean(false);

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f4247a.get()) {
        } else {
            try {
                q.a("WVPrivacyManager", (Class<? extends e>) ApWindVanePlugin.class);
                q.a("TBRecommendPrivacy", (Class<? extends e>) TBRecommendPrivacy.class, false);
                f4247a.set(true);
            } catch (Throwable unused) {
                c.b("ApPluginManager", "register WindWane plugin failed");
            }
        }
    }
}
