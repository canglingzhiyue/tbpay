package com.alibaba.analytics.core.config;

import android.text.TextUtils;
import com.alibaba.analytics.core.config.f;
import com.android.alibaba.ip.runtime.IpChange;
import tb.apr;
import tb.kge;
import tb.rqd;

/* loaded from: classes.dex */
public class t implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "xmodule";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f2075a;

    static {
        kge.a(-811532973);
        kge.a(-2114741388);
        f2075a = true;
    }

    public t() {
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
        apr.b("XmoduleConfigListener", "parseConfig value", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if ("0".equalsIgnoreCase(str)) {
            f2075a = false;
        } else {
            f2075a = true;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : rqd.bXmodule && f2075a;
    }
}
