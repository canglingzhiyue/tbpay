package com.taobao.android.weex;

import android.app.Application;
import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.bridge.WeexPlatformCommonBridge;
import com.taobao.android.weex.c;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex_framework.MUSEngine;
import tb.jux;
import tb.kge;

/* loaded from: classes6.dex */
public class d implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f15862a;

        static {
            kge.a(-1370932078);
            f15862a = new d();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("85e6d9b1", new Object[0]) : f15862a;
        }
    }

    static {
        kge.a(921699486);
        kge.a(166661470);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("85e6d9b1", new Object[0]) : a.a();
    }

    @Override // com.taobao.android.weex.c
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else {
            MUSEngine.initApplicationSync(application);
        }
    }

    @Override // com.taobao.android.weex.c
    public void a(Application application, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2f4e5", new Object[]{this, application, aVar});
        } else {
            MUSEngine.initApplicationAsync(application, aVar == null ? null : new MUSEngine.a() { // from class: com.taobao.android.weex.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.MUSEngine.a
                public void afterInitFinished() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2eae6f25", new Object[]{this});
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.weex.c
    public void b(String str, Class<? extends WeexModule> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d214a62a", new Object[]{this, str, cls});
        } else {
            jux.a(str, cls);
        }
    }

    public void a(String str, Class<? extends WeexInnerModule> cls, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b43df4", new Object[]{this, str, cls, strArr});
        } else {
            jux.a(str, cls, strArr);
        }
    }

    @Override // com.taobao.android.weex.c
    public void a(String str, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{this, str, cls});
        } else {
            com.taobao.android.weex_framework.ui.m.a(str, new com.taobao.android.weex_framework.platform.c(cls));
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        Application c = c();
        if (c == null) {
            return;
        }
        b(c);
    }

    public static boolean b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76721b1a", new Object[]{application})).booleanValue();
        }
        if (com.taobao.android.weex_framework.m.b != null && MUSEngine.isInitDone() && MUSEngine.isApplicationInitDone()) {
            return false;
        }
        MUSEngine.initApplicationSync(application);
        return true;
    }

    public static Application c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("4bc1c139", new Object[0]);
        }
        try {
            return (Application) GlobalAppRuntimeInfo.getContext().getApplicationContext();
        } catch (Throwable th) {
            com.taobao.android.weex_framework.util.g.c("getGlobalApplication", th);
            return null;
        }
    }

    @Override // com.taobao.android.weex.c
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : com.taobao.android.weex_framework.util.p.b();
    }

    @Override // com.taobao.android.weex.c
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : com.taobao.android.weex_framework.m.a("system", "userAgent");
    }

    @Override // com.taobao.android.weex.c
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            WeexPlatformCommonBridge.updateGlobalSystemEnv(str);
        }
    }

    @Override // com.taobao.android.weex.c
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : com.taobao.android.weex_framework.util.k.b(str);
    }
}
