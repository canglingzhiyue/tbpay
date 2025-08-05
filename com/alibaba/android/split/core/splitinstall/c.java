package com.alibaba.android.split.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bhm;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static long e;
    private static long f;

    /* renamed from: a  reason: collision with root package name */
    public final m f2463a;
    public final Intent b;
    public final Context c;
    public final f d;
    private com.alibaba.android.split.j g = (com.alibaba.android.split.j) com.alibaba.android.split.a.a((Class<? extends Object>) com.alibaba.android.split.j.class, new Object[0]);

    public m a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("79ff36c0", new Object[]{this}) : this.f2463a;
    }

    static {
        kge.a(188377298);
        e = 0L;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        f.a(this.d, this.f2463a, 5, 0, 0);
        e = 0L;
        f = 0L;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            f.a(this.d, this.f2463a, 4, 0, 0);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        e = System.currentTimeMillis();
        f.a(this.d, this.f2463a, 10, 0, 0);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        c();
        for (String str : this.f2463a.g()) {
            if (bhm.a().a(str) == 1) {
                bhm.a().b().a(str, 2);
                if (e != 0) {
                    this.g.a(str, true, "verify", System.currentTimeMillis() - e, 0, "", com.alibaba.android.split.core.splitcompat.j.h().i());
                }
            }
        }
        f = System.currentTimeMillis();
        if (!this.b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.b.putExtra("triggered_from_app_after_verification", true);
            LocalBroadcastManager.getInstance(this.c).sendBroadcast(this.b);
            return;
        }
        this.d.a().d("Splits copied and verified more than once.", new Object[0]);
    }

    public void a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        if (i == 10) {
            for (String str2 : this.f2463a.g()) {
                this.g.a(str2, false, i, 0L, i2, str, com.alibaba.android.split.core.splitcompat.j.h().i());
            }
        }
        f.a(this.d, this.f2463a, 6, -201, i2);
    }

    public c(f fVar, m mVar, Intent intent, Context context) {
        this.d = fVar;
        this.f2463a = mVar;
        this.b = intent;
        this.c = context;
    }
}
