package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes9.dex */
public class dh implements gt {

    /* renamed from: a  reason: collision with root package name */
    private Context f24420a;

    public dh(Context context) {
        this.f24420a = context;
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar) {
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar, int i, Exception exc) {
        db.a(this.f24420a, gqVar.m1985a(), i);
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar, Exception exc) {
    }

    @Override // com.xiaomi.push.gt
    public void b(gq gqVar) {
        db.m1804a(this.f24420a);
    }
}
