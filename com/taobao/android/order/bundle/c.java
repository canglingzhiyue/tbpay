package com.taobao.android.order.bundle;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import tb.huz;
import tb.hva;
import tb.hvb;
import tb.hvd;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f14536a;
    private HashSet<Context> b = new HashSet<>(4);

    static {
        kge.a(-748159575);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        if (f14536a == null) {
            f14536a = new c(context);
        }
        f14536a.c(context);
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        c cVar = f14536a;
        if (cVar == null) {
            return;
        }
        cVar.d(context);
    }

    private c(Context context) {
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
        } else {
            this.b.add(context);
        }
    }

    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
            return;
        }
        this.b.remove(context);
        if (!this.b.isEmpty()) {
            return;
        }
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        hvd.INSTANCE.b("NAME_SPACE_BABEL_ORDER");
        hvb.INSTANCE.b("NAME_SPACE_BABEL_ORDER");
        huz.INSTANCE.b("NAME_SPACE_BABEL_ORDER");
        hva.INSTANCE.b("NAME_SPACE_BABEL_ORDER");
        f14536a = null;
    }
}
