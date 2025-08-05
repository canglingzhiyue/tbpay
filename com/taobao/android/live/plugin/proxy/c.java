package com.taobao.android.live.plugin.proxy;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicInteger g;

    /* renamed from: a  reason: collision with root package name */
    private boolean f14093a = false;
    private boolean b = false;
    private Map<String, IProxy> c = new HashMap();
    private Map<String, IProxy> d = new HashMap();
    private final CopyOnWriteArraySet<a> e = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<b> f = new CopyOnWriteArraySet<>();

    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a();
    }

    /* renamed from: com.taobao.android.live.plugin.proxy.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0541c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f14094a;

        static {
            kge.a(-369280315);
            f14094a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("2b0a88e7", new Object[0]) : f14094a;
        }
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue();
        }
        return 233333;
    }

    static {
        kge.a(-657897013);
        g = new AtomicInteger(2);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("2b0a88e7", new Object[0]) : C0541c.a();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f14093a;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        g.decrementAndGet();
        if (g.get() > 0 || this.f14093a) {
            return;
        }
        this.f14093a = z;
        if (!this.f14093a) {
            return;
        }
        e.h();
        synchronized (this) {
            Iterator<a> it = this.e.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null) {
                    next.a();
                    e.c("[FlexaLiveRemoteX#setATypeInstalled]  onATypePluginInstalled  listener-0" + ResponseProtocolType.COMMENT + next.getClass().toString());
                }
            }
            this.e.clear();
        }
    }

    public Map<String, IProxy> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        e.h();
        return this.c;
    }

    public void a(Map<String, IProxy> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        Map<String, IProxy> map2 = this.c;
        if (map2 != null && map2.size() > 0) {
            if (map == null || map.size() <= 0) {
                return;
            }
            this.c.putAll(map);
            return;
        }
        this.c = map;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.b;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.b) {
        } else {
            this.b = z;
            if (!this.b) {
                return;
            }
            e.h();
            synchronized (this) {
                Iterator<b> it = this.f.iterator();
                while (it.hasNext()) {
                    b next = it.next();
                    if (next != null) {
                        next.a();
                        e.c("[FlexaLiveRemoteX#setBTypeInstalled]  onBTypePluginInstalled  listener-0" + ResponseProtocolType.COMMENT + next.getClass().toString());
                    }
                }
                this.f.clear();
            }
        }
    }

    public Map<String, IProxy> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this});
        }
        e.h();
        return this.d;
    }

    public void b(Map<String, IProxy> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        Map<String, IProxy> map2 = this.d;
        if (map2 != null && map2.size() > 0) {
            return;
        }
        this.d = map;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de17444", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.e.add(aVar);
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de1e8a3", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.f.add(bVar);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (!this.e.isEmpty()) {
            this.e.clear();
        }
        if (this.f.isEmpty()) {
            return;
        }
        this.f.clear();
    }
}
