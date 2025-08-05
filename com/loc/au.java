package com.loc;

import com.loc.bt;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class au extends r {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f7667a;
    private String b;

    public au(byte[] bArr, String str) {
        this.b = "1";
        this.f7667a = (byte[]) bArr.clone();
        this.b = str;
        a(bt.a.SINGLE);
        a(bt.c.HTTP);
    }

    @Override // com.loc.bt
    public final Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/zip");
        hashMap.put("Content-Length", String.valueOf(this.f7667a.length));
        return hashMap;
    }

    @Override // com.loc.bt
    public final String b() {
        String c = x.c(ag.b);
        byte[] a2 = x.a(ag.f7650a);
        byte[] bArr = new byte[a2.length + 50];
        System.arraycopy(this.f7667a, 0, bArr, 0, 50);
        System.arraycopy(a2, 0, bArr, 50, a2.length);
        return String.format(c, "1", this.b, "1", "open", s.a(bArr));
    }

    @Override // com.loc.bt
    public final byte[] d() {
        return this.f7667a;
    }

    @Override // com.loc.bt
    public final Map<String, String> e() {
        return null;
    }

    @Override // com.loc.bt
    public final boolean h() {
        return false;
    }
}
