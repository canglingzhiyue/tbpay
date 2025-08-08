package com.alibaba.analytics.core.config;

import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.config.f;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class v implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "ut_max_len_kb";

    /* renamed from: a  reason: collision with root package name */
    private static v f2077a;
    private int b = 40960;

    static {
        kge.a(1520184735);
        kge.a(-2114741388);
    }

    public v() {
        f.a().a(KEY, this);
        a(KEY, f.a().a(KEY));
    }

    public static synchronized v a() {
        synchronized (v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (v) ipChange.ipc$dispatch("afc32f2a", new Object[0]);
            }
            if (f2077a == null) {
                f2077a = new v();
            }
            return f2077a;
        }
    }

    @Override // com.alibaba.analytics.core.config.f.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            int i = 40;
            int a2 = a(str2, 40);
            if (a2 > 40) {
                i = a2;
            }
            this.b = i << 10;
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    private int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }
}
