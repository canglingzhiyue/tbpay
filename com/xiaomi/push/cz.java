package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes9.dex */
public class cz implements gv, hd {

    /* renamed from: a  reason: collision with root package name */
    private Context f24412a;

    public cz(Context context) {
        this.f24412a = context;
    }

    @Override // com.xiaomi.push.gv
    public void a(gf gfVar) {
        if (gfVar == null || gfVar.a() != 0 || !"PING".equals(gfVar.m1962a())) {
            dk.b(this.f24412a);
        } else {
            dk.d(this.f24412a);
        }
    }

    @Override // com.xiaomi.push.gv, com.xiaomi.push.hd
    /* renamed from: a */
    public void mo1982a(hh hhVar) {
        dk.b(this.f24412a);
    }

    @Override // com.xiaomi.push.gv, com.xiaomi.push.hd
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo1982a(hh hhVar) {
        return true;
    }
}
