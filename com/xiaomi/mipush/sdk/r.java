package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.eb;
import com.xiaomi.push.ic;
import com.xiaomi.push.ip;
import com.xiaomi.push.jb;

/* loaded from: classes9.dex */
public class r implements eb {

    /* renamed from: a  reason: collision with root package name */
    private Context f24335a;

    public r(Context context) {
        this.f24335a = context;
    }

    @Override // com.xiaomi.push.eb
    public String a() {
        return b.m1665a(this.f24335a).d();
    }

    @Override // com.xiaomi.push.eb
    public void a(jb jbVar, ic icVar, ip ipVar) {
        ao.a(this.f24335a).a((ao) jbVar, icVar, ipVar);
    }
}
