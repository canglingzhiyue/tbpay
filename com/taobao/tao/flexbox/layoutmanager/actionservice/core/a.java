package com.taobao.tao.flexbox.layoutmanager.actionservice.core;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Context f19960a;

    static {
        kge.a(1829094137);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (f19960a != null || context == null) {
        } else {
            f19960a = context.getApplicationContext();
        }
    }

    public static synchronized Context a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("75941360", new Object[0]);
            }
            if (f19960a == null) {
                f19960a = android.taobao.windvane.config.a.f;
            }
            return f19960a;
        }
    }
}
