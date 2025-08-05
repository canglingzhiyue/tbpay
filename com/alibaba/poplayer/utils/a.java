package com.alibaba.poplayer.utils;

import android.os.SystemClock;
import com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bzl;
import tb.cab;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LAUNCH_STEP_CONFIG_FETCH = 2;
    public static final int LAUNCH_STEP_CONFIG_PARSE = 3;
    public static final int LAUNCH_STEP_FIRST_PAGE = 4;
    public static final int LAUNCH_STEP_INIT_TASK = 1;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f3215a = new AtomicBoolean(false);
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final AtomicBoolean d = new AtomicBoolean(false);
    private String e = "";
    private final Map<Integer, Long[]> g = new ConcurrentHashMap();
    private InterfaceC0119a h;

    /* renamed from: com.alibaba.poplayer.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0119a {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f3216a;

        static {
            kge.a(-1357398783);
            f3216a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("275f5b08", new Object[0]) : f3216a;
        }
    }

    static {
        kge.a(-1873137618);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("275f5b08", new Object[0]) : b.a();
    }

    public void a(InterfaceC0119a interfaceC0119a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be57d225", new Object[]{this, interfaceC0119a});
        } else {
            this.h = interfaceC0119a;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f3215a.get() && this.b.get();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f3215a.get() && this.c.get();
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d.get();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.g.containsKey(Integer.valueOf(i))) {
        } else {
            Long[] lArr = new Long[2];
            lArr[0] = Long.valueOf(SystemClock.elapsedRealtime());
            this.g.put(Integer.valueOf(i), lArr);
        }
    }

    public void b(int i) {
        Long[] lArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (!this.g.containsKey(Integer.valueOf(i)) || (lArr = this.g.get(Integer.valueOf(i))) == null || lArr.length != 2 || lArr[0] == null || lArr[1] != null) {
        } else {
            lArr[1] = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            if (!this.b.compareAndSet(false, true)) {
                return;
            }
            c.c("sdkLifeCycle", "", "FirstTimeConfigReadyDispatcher.onActivityReady.mIsFirstActivityReady=" + this.b + ".mIsObserverConfigInited=" + this.f3215a);
            if (!b() || this.h == null) {
                return;
            }
            this.h.b();
        } catch (Throwable th) {
            c.a("FirstTimeConfigReadyDispatcher.onActivityReady.error.", th);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.d.get()) {
        } else {
            synchronized (a.class) {
                try {
                    c.c("triggerEvent", "", "PopMiscInfoFileHelper.loadLocalFiles.");
                    PopMiscInfoFileHelper.a().b();
                    com.alibaba.poplayer.info.frequency.b.e().a();
                    this.d.set(true);
                }
            }
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        try {
            if (!this.c.compareAndSet(false, true)) {
                return;
            }
            b(4);
            c.c("sdkLifeCycle", "", "FirstTimeConfigReadyDispatcher.eventUri=" + str + ".onFirstPageReady.mIsFirstPageReady=" + this.c + ".mIsObserverConfigInited=" + this.f3215a);
            if (!c() || this.h == null) {
                return;
            }
            this.h.a();
        } catch (Throwable th) {
            c.a("FirstTimeConfigReadyDispatcher.onFirstPageReady.error.", th);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            if (!this.f3215a.compareAndSet(false, true)) {
                return;
            }
            b(3);
            c.c("sdkLifeCycle", "", "FirstTimeConfigReadyDispatcher.onFirstTimePageObserverConfigInit.mIsFirstPageReady=" + this.c + ".mIsFirstActivityReady=" + this.b + ".mIsObserverConfigInited=" + this.f3215a);
            if (b() && this.h != null) {
                this.h.b();
            }
            if (!c() || this.h == null) {
                return;
            }
            this.h.a();
        } catch (Throwable th) {
            c.a("FirstTimeConfigReadyDispatcher.onFirstTimePageObserverConfigInit.error.", th);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("useNewConfig", String.valueOf(bzl.a().b().isConfigFetchOptEnable()));
            hashMap.put("newConfigFetchLocal", String.valueOf(bzl.a().b().isConfigFetchLocalEnable()));
            hashMap.put("launchType", this.e);
            hashMap.put("enableOpt", "true");
            a(1, "InitTaskCostTime", hashMap);
            a(2, "ConfigFetchCostTime", hashMap);
            a(3, "ConfigParseCostTime", hashMap);
            a(4, "FirstPageReadyCostTime", hashMap);
            cab.a("PopReady", hashMap);
            c.b("sdkLifeCycle", "", "InitReadyDispatcher.trackPopReady.trackMap=" + hashMap);
        } catch (Throwable th) {
            c.a("FirstTimeConfigReadyDispatcher.trackPopReady.error.", th);
        }
    }

    private void a(int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c673040", new Object[]{this, new Integer(i), str, map});
            return;
        }
        try {
            Long[] lArr = this.g.get(Integer.valueOf(i));
            if (lArr == null || lArr.length != 2) {
                return;
            }
            Long l = lArr[0];
            Long l2 = lArr[1];
            if (l == null || l2 == null || l2.longValue() < l.longValue()) {
                c.a("trackPopReadyStepItem.error.stepName=%s.stepFinishTime=%s.stepStartTime=%s.", str, l2, l);
            } else {
                map.put(str, String.valueOf(l2.longValue() - l.longValue()));
            }
        } catch (Throwable th) {
            c.a("trackPopReadyStepItem.error.", th);
        }
    }
}
