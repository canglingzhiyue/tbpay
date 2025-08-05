package com.xiaomi.push;

import com.xiaomi.push.ju;

/* loaded from: classes9.dex */
public class jr {

    /* renamed from: a  reason: collision with root package name */
    private final jy f24580a;

    /* renamed from: a  reason: collision with other field name */
    private final kh f830a;

    public jr() {
        this(new ju.a());
    }

    public jr(ka kaVar) {
        this.f830a = new kh();
        this.f24580a = kaVar.a(this.f830a);
    }

    public void a(jn jnVar, byte[] bArr) {
        try {
            this.f830a.a(bArr);
            jnVar.a(this.f24580a);
        } finally {
            this.f24580a.k();
        }
    }
}
