package com.alibaba.ha.bizerrorreporter;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bxy;
import tb.bxz;
import tb.byy;
import tb.bzh;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Long f3117a;
    public String b;
    public BizErrorSampling c;
    private bxy d;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static e f3118a = new e();

        public static /* synthetic */ e a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("d5052598", new Object[0]) : f3118a;
        }
    }

    private e() {
        this.d = new bxy();
        this.f3117a = Long.valueOf(System.currentTimeMillis());
        this.b = null;
        this.c = null;
    }

    public static synchronized e a() {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("d5052598", new Object[0]);
            }
            return a.a();
        }
    }

    public void a(Context context, com.alibaba.ha.bizerrorreporter.module.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2d304d", new Object[]{this, context, aVar});
            return;
        }
        try {
            if (com.alibaba.motu.tbrest.d.a().f3151a != null && com.alibaba.motu.tbrest.d.a().c != null) {
                if (aVar == null) {
                    return;
                }
                this.d.a(new bxz(context, aVar));
                return;
            }
            Log.e(d.LOGTAG, "you need init rest send service");
        } catch (Exception e) {
            Log.e(d.LOGTAG, "adapter err", e);
        }
    }

    public String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        String str = this.b;
        if (str != null) {
            return str;
        }
        String a2 = byy.a();
        if (bzh.a((CharSequence) a2)) {
            a2 = byy.a(context);
        }
        this.b = a2;
        return a2;
    }
}
