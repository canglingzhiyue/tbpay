package com.loc;

import com.loc.bt;
import java.util.Map;

/* loaded from: classes4.dex */
public final class bn extends bt {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f7689a;
    private Map<String, String> b;

    public bn(byte[] bArr, Map<String, String> map) {
        this.f7689a = bArr;
        this.b = map;
        a(bt.a.SINGLE);
        a(bt.c.HTTPS);
    }

    @Override // com.loc.bt
    public final Map<String, String> a() {
        return null;
    }

    @Override // com.loc.bt
    public final String b() {
        return "https://adiu.amap.com/ws/device/adius";
    }

    @Override // com.loc.bt
    public final byte[] d() {
        return this.f7689a;
    }

    @Override // com.loc.bt
    public final Map<String, String> e() {
        return this.b;
    }
}
