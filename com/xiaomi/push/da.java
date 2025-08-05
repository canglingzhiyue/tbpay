package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes9.dex */
public class da implements gv, hd {

    /* renamed from: a  reason: collision with root package name */
    private Context f24413a;

    public da(Context context) {
        this.f24413a = context;
    }

    @Override // com.xiaomi.push.gv
    public void a(gf gfVar) {
        if (gfVar == null || gfVar.a() != 0 || !"PING".equals(gfVar.m1962a())) {
            dk.a(this.f24413a);
        } else {
            dk.c(this.f24413a);
        }
    }

    @Override // com.xiaomi.push.gv, com.xiaomi.push.hd
    /* renamed from: a */
    public void mo1982a(hh hhVar) {
        dk.a(this.f24413a);
    }

    @Override // com.xiaomi.push.gv, com.xiaomi.push.hd
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo1982a(hh hhVar) {
        return true;
    }
}
