package com.alibaba.analytics.core.sync;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.config.f;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aob;
import tb.apg;
import tb.apr;
import tb.aqb;
import tb.kge;

/* loaded from: classes2.dex */
public class c implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_HTTPS_HOST_PORT = "utanalytics_https_host";

    /* renamed from: a  reason: collision with root package name */
    public static c f2098a;
    private String b = "https://h-adashx.ut.taobao.com/upload";

    static {
        kge.a(1949153426);
        kge.a(-2114741388);
    }

    public static synchronized c a() {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("165ef8e4", new Object[0]);
            }
            if (f2098a == null) {
                f2098a = new c();
            }
            return f2098a;
        }
    }

    public c() {
        try {
            Context k = aob.a().k();
            if (k != null) {
                a(apg.a(k, TAG_HTTPS_HOST_PORT));
                a(aqb.a(k, TAG_HTTPS_HOST_PORT));
            }
            a(com.alibaba.analytics.core.config.f.a().a(TAG_HTTPS_HOST_PORT));
            com.alibaba.analytics.core.config.f.a().a(TAG_HTTPS_HOST_PORT, this);
        } catch (Throwable unused) {
        }
    }

    @Override // com.alibaba.analytics.core.config.f.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            a(str2);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.b = com.taobao.search.common.util.k.HTTPS_PREFIX + str + "/upload";
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        apr.b("", "mHttpsUrl", this.b);
        return this.b;
    }
}
