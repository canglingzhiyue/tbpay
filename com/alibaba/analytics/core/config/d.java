package com.alibaba.analytics.core.config;

import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.config.f;
import com.android.alibaba.ip.runtime.IpChange;
import tb.apr;
import tb.kge;

/* loaded from: classes2.dex */
public class d implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "spdy_close_callback";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f2055a;

    static {
        kge.a(1636315322);
        kge.a(-2114741388);
        f2055a = false;
    }

    public d() {
        a(f.a().a(KEY));
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
            return;
        }
        apr.b("SpdyCloseCallbackConfigListener", "parseConfig value", str);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        if ("1".equalsIgnoreCase(str)) {
            f2055a = true;
        } else {
            f2055a = false;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f2055a;
    }
}
