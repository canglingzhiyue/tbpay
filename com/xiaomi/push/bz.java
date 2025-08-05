package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.cg;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public class bz implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private String f24388a;

    /* renamed from: a  reason: collision with other field name */
    private WeakReference<Context> f153a;

    public bz(String str, WeakReference<Context> weakReference) {
        this.f24388a = str;
        this.f153a = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        WeakReference<Context> weakReference = this.f153a;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return;
        }
        if (cm.a(this.f24388a) <= by.f151a) {
            com.xiaomi.channel.commonutils.logger.b.b("=====> do not need clean db");
            return;
        }
        cc a2 = cc.a(this.f24388a);
        cb a3 = cb.a(this.f24388a);
        a2.a(a3);
        a3.a(ca.a(context, this.f24388a, 1000));
        cg.a(context).a((cg.a) a2);
    }
}
