package com.taobao.monitor.impl.trace;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a<LISTENER> implements m<LISTENER> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Class b = a();

    /* renamed from: a  reason: collision with root package name */
    public final List<LISTENER> f18168a = new ArrayList();

    /* renamed from: com.taobao.monitor.impl.trace.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected interface InterfaceC0725a<LISTENER> {
        void a(LISTENER listener);
    }

    @Override // com.taobao.monitor.impl.trace.m
    public final void a(final LISTENER listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, listener});
        } else if ((this instanceof g) || listener == null || !c(listener)) {
        } else {
            a(new Runnable() { // from class: com.taobao.monitor.impl.trace.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.this.f18168a.contains(listener)) {
                    } else {
                        a.this.f18168a.add(listener);
                    }
                }
            });
        }
    }

    private boolean c(LISTENER listener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a8844ca", new Object[]{this, listener})).booleanValue() : a(listener, this.b);
    }

    private boolean a(LISTENER listener, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb5e957d", new Object[]{this, listener, cls})).booleanValue();
        }
        if (cls != null) {
            return cls.isInstance(listener);
        }
        return false;
    }

    private Class a() {
        Type[] actualTypeArguments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("5d842d15", new Object[]{this});
        }
        if (com.taobao.monitor.impl.common.d.f18153a) {
            return Object.class;
        }
        try {
            Type genericSuperclass = getClass().getGenericSuperclass();
            if ((genericSuperclass instanceof ParameterizedType) && (actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments()) != null && actualTypeArguments.length != 0) {
                return (Class) actualTypeArguments[0];
            }
            return Object.class;
        } catch (Throwable unused) {
            return Object.class;
        }
    }

    @Override // com.taobao.monitor.impl.trace.m
    public final void b(final LISTENER listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, listener});
        } else if ((this instanceof g) || listener == null) {
        } else {
            a(new Runnable() { // from class: com.taobao.monitor.impl.trace.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.this.f18168a.remove(listener);
                    }
                }
            });
        }
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            com.taobao.monitor.impl.common.e.a().d().post(runnable);
        }
    }

    public final void a(final InterfaceC0725a<LISTENER> interfaceC0725a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1efd9cc", new Object[]{this, interfaceC0725a});
        } else {
            a(new Runnable() { // from class: com.taobao.monitor.impl.trace.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (LISTENER listener : a.this.f18168a) {
                        interfaceC0725a.a(listener);
                    }
                }
            });
        }
    }
}
