package com.taobao.android.layoutmanager.container;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.o;
import java.lang.reflect.Method;
import tb.kge;
import tb.ohc;

/* loaded from: classes5.dex */
public class g implements o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Class f13212a;
    private static Method b;

    static {
        kge.a(1557164446);
        kge.a(-2143680776);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            f13212a = Class.forName("com.taobao.fscrmid.nav.ShotVideoNavProcessor");
            b = ohc.a("setNavStartTime", f13212a, (Class<?>[]) new Class[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.o
    public void b() {
        try {
            if (b == null) {
                return;
            }
            b.invoke(null, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
