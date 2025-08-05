package com.taobao.android.remoteso.status;

import com.taobao.android.remoteso.resolver2.j;

/* loaded from: classes6.dex */
public interface c {

    /* loaded from: classes6.dex */
    public interface a<V> {
        V b(RSoStatus rSoStatus, InterfaceC0566c interfaceC0566c);
    }

    /* loaded from: classes6.dex */
    public interface b {
        boolean a(RSoStatus rSoStatus);
    }

    /* renamed from: com.taobao.android.remoteso.status.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC0566c {
        void a(RSoStatus rSoStatus);
    }

    <T> T a(j jVar, a<T> aVar);

    void a(j jVar, b bVar);
}
