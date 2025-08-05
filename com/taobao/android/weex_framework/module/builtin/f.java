package com.taobao.android.weex_framework.module.builtin;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.p;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final WeakHashMap<Activity, a> f16045a;

    static {
        kge.a(534942671);
        f16045a = new WeakHashMap<>();
    }

    private static synchronized a a(Activity activity) {
        synchronized (f.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("56cd233b", new Object[]{activity});
            }
            a aVar = f16045a.get(activity);
            if (aVar == null) {
                aVar = new a();
                f16045a.put(activity, aVar);
            }
            return aVar;
        }
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, Set<p>> f16046a;
        private final Map<p, Set<String>> b;

        static {
            kge.a(2066838673);
        }

        private a() {
            this.f16046a = new HashMap();
            this.b = new HashMap();
        }

        public synchronized void a(p pVar, String str, MUSValue mUSValue) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5938fdc", new Object[]{this, pVar, str, mUSValue});
                return;
            }
            Set<p> set = this.f16046a.get(str);
            if (set == null) {
                return;
            }
            for (p pVar2 : set) {
                if (pVar != pVar2) {
                    ((MUSDKInstance) pVar2).dispatchEvent(str, mUSValue);
                }
            }
        }

        public synchronized void a(String str, p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84edcb9b", new Object[]{this, str, pVar});
                return;
            }
            Set<p> set = this.f16046a.get(str);
            if (set == null) {
                set = new HashSet<>();
                this.f16046a.put(str, set);
            }
            set.add(pVar);
            Set<String> set2 = this.b.get(pVar);
            if (set2 == null) {
                set2 = new HashSet<>();
                this.b.put(pVar, set2);
            }
            set2.add(str);
        }

        public synchronized void b(String str, p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8af196fa", new Object[]{this, str, pVar});
                return;
            }
            Set<p> set = this.f16046a.get(str);
            if (set != null) {
                set.remove(pVar);
            }
            Set<String> set2 = this.b.get(pVar);
            if (set2 != null) {
                set2.remove(str);
            }
        }

        public synchronized void a(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11e8b525", new Object[]{this, pVar});
                return;
            }
            Set<String> set = this.b.get(pVar);
            if (set != null) {
                for (String str : set) {
                    Set<p> set2 = this.f16046a.get(str);
                    if (set2 != null) {
                        set2.remove(pVar);
                    }
                }
                this.b.remove(pVar);
            }
        }
    }

    public static void a(MUSModule mUSModule, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b737a2fe", new Object[]{mUSModule, str, mUSValue});
            return;
        }
        Context uIContext = mUSModule.getInstance().getUIContext();
        if (!(uIContext instanceof Activity)) {
            return;
        }
        a((Activity) uIContext).a(mUSModule.getInstance(), str, mUSValue);
    }

    public static void a(MUSModule mUSModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f19fdd1", new Object[]{mUSModule, str});
            return;
        }
        Context uIContext = mUSModule.getInstance().getUIContext();
        if (!(uIContext instanceof Activity)) {
            return;
        }
        a((Activity) uIContext).a(str, mUSModule.getInstance());
    }

    public static void b(MUSModule mUSModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42c82892", new Object[]{mUSModule, str});
            return;
        }
        Context uIContext = mUSModule.getInstance().getUIContext();
        if (!(uIContext instanceof Activity)) {
            return;
        }
        a((Activity) uIContext).b(str, mUSModule.getInstance());
    }

    public static void a(MUSModule mUSModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ba97c7", new Object[]{mUSModule});
            return;
        }
        Context uIContext = mUSModule.getInstance().getUIContext();
        if (!(uIContext instanceof Activity)) {
            return;
        }
        a((Activity) uIContext).a(mUSModule.getInstance());
    }
}
