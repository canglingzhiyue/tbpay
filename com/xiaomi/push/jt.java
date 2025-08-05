package com.xiaomi.push;

import com.xiaomi.push.ju;
import java.io.ByteArrayOutputStream;

/* loaded from: classes9.dex */
public class jt {

    /* renamed from: a  reason: collision with root package name */
    private jy f24581a;

    /* renamed from: a  reason: collision with other field name */
    private final kf f831a;

    /* renamed from: a  reason: collision with other field name */
    private final ByteArrayOutputStream f832a;

    public jt() {
        this(new ju.a());
    }

    public jt(ka kaVar) {
        this.f832a = new ByteArrayOutputStream();
        this.f831a = new kf(this.f832a);
        this.f24581a = kaVar.a(this.f831a);
    }

    public byte[] a(jn jnVar) {
        this.f832a.reset();
        jnVar.b(this.f24581a);
        return this.f832a.toByteArray();
    }
}
