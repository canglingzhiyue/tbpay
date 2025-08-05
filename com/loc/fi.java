package com.loc;

import com.alipay.mobile.common.transport.httpdns.DnsUtil;
import com.amap.api.location.AMapLocation;

@ba(a = com.taobao.android.msoa.c.TAG)
/* loaded from: classes4.dex */
public class fi {
    @bb(a = "a2", b = 6)

    /* renamed from: a  reason: collision with root package name */
    private String f7793a;
    @bb(a = "a3", b = 5)
    private long b;
    @bb(a = DnsUtil.DOMAIN_GROUP, b = 6)
    private String c;
    private AMapLocation d;

    public final AMapLocation a() {
        return this.d;
    }

    public final void a(long j) {
        this.b = j;
    }

    public final void a(AMapLocation aMapLocation) {
        this.d = aMapLocation;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final String b() {
        return this.c;
    }

    public final void b(String str) {
        this.f7793a = str;
    }

    public final String c() {
        return this.f7793a;
    }

    public final long d() {
        return this.b;
    }
}
