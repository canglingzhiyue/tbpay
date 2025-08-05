package com.taobao.android.detail.ttdetail.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.MessageQueue;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class br {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(606058281);
    }

    public static Drawable a(boolean z, boolean z2) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("593c73d2", new Object[]{new Boolean(z), new Boolean(z2)});
        }
        Drawable drawable = null;
        odg.t r = odg.r();
        if (r != null) {
            drawable = r.a(z, z2);
        }
        if (drawable != null) {
            return drawable;
        }
        if (z) {
            f = 0.0f;
        } else {
            f = e.e() ? 0.5f : 1.0f;
        }
        return new com.taobao.android.detail.ttdetail.widget.d().a(f);
    }

    public static Drawable b(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("60a1a8f1", new Object[]{new Boolean(z), new Boolean(z2)});
        }
        Drawable drawable = null;
        odg.t r = odg.r();
        if (r != null) {
            drawable = r.b(z, z2);
        }
        return drawable == null ? new com.taobao.android.detail.ttdetail.widget.c() : drawable;
    }

    public static Drawable a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("1e792452", new Object[0]);
        }
        odg.t r = odg.r();
        if (r == null) {
            return null;
        }
        return r.a();
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        odg.t r = odg.r();
        if (r != null) {
            return r.b();
        }
        return f.a(8.0f);
    }

    public static Drawable c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("ccb50610", new Object[0]);
        }
        odg.t r = odg.r();
        if (r == null) {
            return null;
        }
        return r.c();
    }

    public static Drawable d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("23d2f6ef", new Object[0]);
        }
        odg.t r = odg.r();
        if (r == null) {
            return null;
        }
        return r.d();
    }

    public static Drawable e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("7af0e7ce", new Object[0]);
        }
        odg.t r = odg.r();
        if (r == null) {
            return null;
        }
        return r.e();
    }

    public static boolean a(final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        final odg.t r = odg.r();
        if (r == null) {
            return false;
        }
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.taobao.android.detail.ttdetail.utils.br.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                }
                odg.t.this.a(context, str);
                return false;
            }
        });
        return true;
    }
}
