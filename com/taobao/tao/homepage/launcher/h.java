package com.taobao.tao.homepage.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.ksk;
import tb.lap;
import tb.lar;
import tb.nvs;
import tb.ojd;
import tb.opf;
import tb.oqc;

/* loaded from: classes.dex */
public class h extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2111836751);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        if (str.hashCode() == -193894180) {
            super.a((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.homepage.launcher.b
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        this.f20600a.a("HomeLoadCacheLauncher", 1);
        if (a(hashMap)) {
            lap.a("LauncherTask", "HomeLoadCacheLauncher", "HomeLoadCacheLauncher.offline switcher on");
            return;
        }
        super.a(application, hashMap);
        if (!com.taobao.homepage.utils.n.o() && !com.taobao.homepage.utils.n.g()) {
            this.f20600a.b("HomeLoadCacheLauncher");
            return;
        }
        if (com.taobao.homepage.utils.n.n().v()) {
            com.taobao.android.home.component.utils.e.e("HomeLoadCacheLauncher", "loadCacheAsyncByMaxThread");
            b();
            a(application);
        } else {
            com.taobao.android.home.component.utils.e.e("HomeLoadCacheLauncher", "loadCacheAsync");
            a();
        }
        this.f20600a.b("HomeLoadCacheLauncher");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            this.f20600a.a("launcherPreLoadCache", 2);
            this.f20600a.a("loadCacheAsync", 2);
            ksk j = oqc.j();
            ArrayList arrayList = new ArrayList();
            arrayList.add(oqc.a().l());
            arrayList.add(j.f30287a);
            opf opfVar = new opf() { // from class: com.taobao.tao.homepage.launcher.HomeLoadCacheLauncher$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.opf
                public void a(List<String> list, List<String> list2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
                    } else {
                        h.this.f20600a.b("loadCacheAsync");
                    }
                }
            };
            com.taobao.android.home.component.utils.e.e("HomeLoadCacheLauncher", "run task on subThread");
            com.taobao.tao.homepage.d.f(j.f30287a).a(arrayList, opfVar);
        } catch (Throwable th) {
            try {
                TLog.loge("HomeLoadCacheLauncher", "LauncherPreLoadCache error", th);
            } finally {
                this.f20600a.b("launcherPreLoadCache");
            }
        }
    }

    private void a(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        try {
            com.taobao.android.home.component.utils.e.e("HomeLoadCacheLauncher", "loadCacheAsyncByMaxThread");
            this.f20600a.a("launcherPreLoadCache", 2);
            this.f20600a.a("loadCacheAsyncByMaxThread", 2);
            ksk j = oqc.j();
            ArrayList arrayList = new ArrayList();
            arrayList.add(j.f30287a);
            arrayList.add(oqc.a().l());
            final int size = arrayList.size();
            final com.taobao.prefork.b bVar = new com.taobao.prefork.b();
            bVar.g();
            com.taobao.tao.homepage.d.f(j.f30287a).a(arrayList, new nvs() { // from class: com.taobao.tao.homepage.launcher.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private AtomicInteger e = new AtomicInteger();

                @Override // tb.nvs
                public void a(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a0373d58", new Object[]{this, str, awesomeGetContainerInnerData});
                        return;
                    }
                    com.taobao.android.home.component.utils.e.e("HomeLoadCacheLauncher", "cache onLoadSuccess : " + str);
                    lar.a("launcher_cache_end_" + str);
                    lar.b("launcher_cache_end_" + str);
                    if (this.e.incrementAndGet() == size) {
                        h.this.f20600a.b("loadCacheAsyncByMaxThread");
                    }
                    if (oqc.a().d(str)) {
                        ojd.a().d();
                    }
                    bVar.a(application, str);
                }
            });
            lar.a("launcher_cache_start");
            lar.b("launcher_cache_start");
        } finally {
            try {
                this.f20600a.b("launcherPreLoadCache");
                this.f20600a.b("HomeLoadCacheLauncher");
            } catch (Throwable th) {
            }
        }
        this.f20600a.b("launcherPreLoadCache");
        this.f20600a.b("HomeLoadCacheLauncher");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.taobao.tao.homepage.launcher.h$2] */
    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (com.taobao.homepage.utils.n.n().H() || com.taobao.homepage.utils.i.a()) {
        } else {
            new Thread("homePreCreateHomeView") { // from class: com.taobao.tao.homepage.launcher.h.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    ojd a2;
                    int i;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (com.taobao.homepage.utils.n.n().g()) {
                        a2 = ojd.a();
                        i = 3;
                    } else {
                        a2 = ojd.a();
                        i = 2;
                    }
                    a2.a(i);
                    ojd.a().b();
                    ojd.a().c();
                }
            }.start();
        }
    }
}
