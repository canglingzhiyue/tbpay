package com.alibaba.analytics.core.sync;

import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.config.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Constants;
import com.ut.device.UTDevice;
import tb.aob;
import tb.apr;
import tb.aqc;
import tb.kge;

/* loaded from: classes.dex */
public class t implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static t f2115a;
    private int b;
    private int c;
    private int e;
    private int g;
    private boolean d = false;
    private boolean f = false;
    private boolean h = false;

    static {
        kge.a(-1819339315);
        kge.a(-2114741388);
    }

    public static synchronized t a() {
        synchronized (t.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t) ipChange.ipc$dispatch("165efaf3", new Object[0]);
            }
            if (f2115a == null) {
                f2115a = new t();
            }
            return f2115a;
        }
    }

    private t() {
        this.b = 0;
        this.c = 0;
        this.e = 0;
        this.g = 0;
        String utdid = UTDevice.getUtdid(aob.a().k());
        if (utdid == null || utdid.equals(Constants.UTDID_INVALID)) {
            this.b = 0;
        } else {
            this.b = Math.abs(aqc.a(utdid)) % 10000;
        }
        apr.b("SampleSipListener", "zstdRandomNumber", Integer.valueOf(this.b));
        this.c = a(com.alibaba.analytics.core.config.f.a().a("zstd"), 0);
        this.e = a(com.alibaba.analytics.core.config.f.a().a("ut_sample_zstd"), 0);
        this.g = a(com.alibaba.analytics.core.config.f.a().a("ut_options_len"), 0);
        com.alibaba.analytics.core.config.f.a().a("zstd", this);
        com.alibaba.analytics.core.config.f.a().a("ut_sample_zstd", this);
        com.alibaba.analytics.core.config.f.a().a("ut_options_len", this);
    }

    @Override // com.alibaba.analytics.core.config.f.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        apr.b("TnetSipHostPortMgr", "key", str, "value", str2);
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return;
        }
        if ("zstd".equalsIgnoreCase(str)) {
            this.c = a(com.alibaba.analytics.core.config.f.a().a("zstd"), 0);
        }
        if ("ut_sample_zstd".equalsIgnoreCase(str)) {
            this.e = a(com.alibaba.analytics.core.config.f.a().a("ut_sample_zstd"), 0);
        }
        if (!"ut_options_len".equalsIgnoreCase(str)) {
            return;
        }
        this.g = a(com.alibaba.analytics.core.config.f.a().a("ut_options_len"), 0);
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

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        apr.b("", "zstdRandomNumber", Integer.valueOf(this.b), "zstdSample", Integer.valueOf(this.c));
        return this.b < this.c;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b < this.e;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.b < this.g;
    }
}
