package com.alibaba.android.split.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.bgu;
import tb.kge;

/* loaded from: classes.dex */
public final class f extends com.alibaba.android.split.core.listener.a<m> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static f b;
    private final Handler c;
    private final q d;

    static {
        kge.a(458372326);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static synchronized f a(Context context) {
        synchronized (f.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("7ecfbdf", new Object[]{context});
            }
            if (b == null) {
                b = new f(context, SplitLoaderHolder.INSTANCE);
            }
            return b;
        }
    }

    private f(Context context, q qVar) {
        super((bgu) com.alibaba.android.split.a.b(bgu.class, "SplitInstallListenerRegistry"), new IntentFilter("com.alibaba.android.split.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.c = new Handler(Looper.getMainLooper());
        this.d = qVar;
    }

    @Override // com.alibaba.android.split.core.listener.a
    public final void a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9cc1d", new Object[]{this, context, intent});
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        final m a2 = n.a(bundleExtra);
        p pVar = this.d.get();
        if (a2.b() == 3 && pVar != null) {
            a((f) a2);
            if (com.alibaba.android.split.core.splitcompat.j.h().d) {
                pVar.load(a2.j(), new c(this, a2, intent, context));
            } else {
                com.alibaba.android.split.core.splitcompat.j.h().d = true;
            }
        } else if (a2.b() == 12) {
        } else {
            if (a2.b() == 5 || a2.b() == 6) {
                this.c.post(new Runnable() { // from class: com.alibaba.android.split.core.splitinstall.f.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            f.this.a((f) a2);
                        }
                    }
                });
            } else {
                a((f) a2);
            }
        }
    }

    private final void a(m mVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347dd723", new Object[]{this, mVar, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.c.post(new s(this, mVar, i, i2, i3));
        com.alibaba.android.split.k.a().a(new n(mVar.a(), i, i2, i3, mVar.e(), mVar.f(), mVar.g(), mVar.h(), mVar.i(), (ArrayList) mVar.j()));
    }

    public static void a(f fVar, m mVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e74a15e2", new Object[]{fVar, mVar, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            fVar.a(mVar, i, i2, i3);
        }
    }

    public bgu a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bgu) ipChange.ipc$dispatch("f02c24e", new Object[]{this}) : this.f2434a;
    }
}
