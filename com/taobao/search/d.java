package com.taobao.search;

import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.lang.reflect.Method;
import tb.imn;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Class f19051a;
    private static boolean b;

    public static /* synthetic */ Class a(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("684f8e82", new Object[]{cls});
        }
        f19051a = cls;
        return cls;
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b();
        }
    }

    public static /* synthetic */ void b(imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc77d14f", new Object[]{imnVar});
        } else {
            c(imnVar);
        }
    }

    static {
        kge.a(1343743152);
        b = false;
    }

    public static void a(final imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf4cace", new Object[]{imnVar});
        } else if (f19051a != null) {
        } else {
            try {
                com.alibaba.flexa.compat.c.a("com.taobao.taowise.extension.TaoWiseInit", new c.a() { // from class: com.taobao.search.d.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.flexa.compat.c.a
                    public void onClassLoaded(Class<?> cls) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                            return;
                        }
                        d.a(cls);
                        d.b(imn.this);
                    }

                    @Override // com.alibaba.flexa.compat.c.a
                    public void onClassNotFound() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                        } else {
                            d.a();
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (b) {
        } else {
            h.a(Globals.getApplication()).a(j.a().a("taowise_android_aar").a());
            b = true;
        }
    }

    private static void c(imn imnVar) {
        try {
            Class cls = f19051a;
            if (cls == null) {
                return;
            }
            Method method = cls.getMethod("init", imn.class);
            method.setAccessible(true);
            method.invoke(null, imnVar);
        } catch (Throwable unused) {
        }
    }
}
