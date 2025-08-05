package com.taobao.taolive.sdk.ui.media;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes8.dex */
public class a<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final T f21924a;
    private final InterfaceC0911a<T> b;
    private final AtomicInteger c;

    /* renamed from: com.taobao.taolive.sdk.ui.media.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0911a<T> {
        void a(a<T> aVar, int i);

        void b(a<T> aVar, int i);
    }

    static {
        kge.a(-1481405309);
    }

    public a(T t, InterfaceC0911a<T> interfaceC0911a) {
        this(t, interfaceC0911a, 1);
    }

    public a(T t, InterfaceC0911a<T> interfaceC0911a, int i) {
        this.f21924a = t;
        this.b = interfaceC0911a;
        this.c = new AtomicInteger(i);
    }

    public final T a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f21924a;
    }

    public final a<T> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("35887cd6", new Object[]{this});
        }
        this.c.incrementAndGet();
        return this;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        int decrementAndGet = this.c.decrementAndGet();
        if (decrementAndGet > 0) {
            return;
        }
        this.b.a(this, decrementAndGet);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        int decrementAndGet = this.c.decrementAndGet();
        if (decrementAndGet > 0) {
            return;
        }
        this.b.b(this, decrementAndGet);
    }
}
