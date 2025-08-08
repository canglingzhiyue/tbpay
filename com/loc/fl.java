package com.loc;

import mtopsdk.common.util.StringUtils;
import java.util.Map;

/* loaded from: classes4.dex */
public final class fl extends r {

    /* renamed from: a  reason: collision with root package name */
    Map<String, String> f7796a = null;
    Map<String, String> b = null;
    String c = "";
    byte[] d = null;
    private String e = null;

    @Override // com.loc.bt
    public final Map<String, String> a() {
        return this.f7796a;
    }

    public final void a(Map<String, String> map) {
        this.f7796a = map;
    }

    public final void a(byte[] bArr) {
        this.d = bArr;
    }

    @Override // com.loc.bt
    public final String b() {
        return this.c;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void b(Map<String, String> map) {
        this.b = map;
    }

    @Override // com.loc.r, com.loc.bt
    public final String c() {
        return !StringUtils.isEmpty(this.e) ? this.e : super.c();
    }

    public final void c(String str) {
        this.e = str;
    }

    @Override // com.loc.bt
    public final byte[] d() {
        return this.d;
    }

    @Override // com.loc.bt
    public final Map<String, String> e() {
        return this.b;
    }
}
