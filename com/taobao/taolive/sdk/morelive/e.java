package com.taobao.taolive.sdk.morelive;

import android.app.Application;
import android.os.Bundle;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.q;
import tb.bhc;
import tb.bhe;
import tb.cak;
import tb.kge;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MORE_FEATURE = "taolivesearch";
    public static final String TAG = "TaoliveRoomMoreManager";

    /* renamed from: a  reason: collision with root package name */
    private static e f21867a;
    private a b;
    private b c;
    private d e;
    private c f;
    private f h;
    private boolean g = false;
    private g d = com.taobao.appbundle.c.Companion.a().c();

    static {
        kge.a(1473564052);
    }

    private e() {
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("898719f9", new Object[0]);
        }
        if (f21867a == null) {
            f21867a = new e();
        }
        return f21867a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c != null) {
        } else {
            this.g = true;
        }
    }

    public void a(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else if (a(MORE_FEATURE)) {
            q.b(TAG, "installModuleMore isModuleMoreReady = true");
            com.alibaba.flexa.compat.c.a("com.taobao.taolivehome.api.TaoliveHomeSDK", new c.a() { // from class: com.taobao.taolive.sdk.morelive.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassLoaded(Class<?> cls) {
                    try {
                        ((cak) cls.newInstance()).init(application, null);
                        q.b(e.TAG, "installModuleMore onClassLoaded success class: " + cls);
                    } catch (Exception e) {
                        q.b(e.TAG, "installModuleMore onClassLoaded fail, Exception: " + e.getMessage());
                        e.printStackTrace();
                    }
                }

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassNotFound() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                    } else {
                        q.b(e.TAG, "installModuleMore onClassNotFound class: com.taobao.taolivehome.api.TaoliveHomeSDK");
                    }
                }
            });
        } else {
            q.b(TAG, "installModuleMore isModuleMoreReady = false startInstallLiveHome");
            b(application);
        }
    }

    public boolean a(String str) {
        g gVar;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : com.android.tools.bundleInfo.b.a().c(str) == null || !((gVar = this.d) == null || gVar.a() == null || !this.d.a().contains(str));
    }

    public void a(a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b320a7", new Object[]{this, aVar, bVar});
            return;
        }
        q.b(TAG, "bindRealLogic");
        this.b = aVar;
        this.c = bVar;
        b bVar2 = this.c;
        if (bVar2 != null) {
            d dVar = this.e;
            if (dVar != null) {
                bVar2.a(dVar);
            }
            c cVar = this.f;
            if (cVar != null) {
                this.c.a(cVar);
            }
        }
        if (!this.g) {
            return;
        }
        f fVar = this.h;
        if (fVar != null) {
            fVar.a(this.b);
        }
        this.g = false;
    }

    public a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1b8907ff", new Object[]{this}) : this.b;
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab21f09a", new Object[]{this, dVar});
            return;
        }
        this.e = dVar;
        b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.a(this.e);
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab217c3b", new Object[]{this, cVar});
            return;
        }
        this.f = cVar;
        b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.a(this.f);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        b bVar = this.c;
        if (bVar == null) {
            return false;
        }
        return bVar.a();
    }

    public d e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("ad8af6de", new Object[]{this}) : this.e;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.e = null;
        this.f = null;
        this.h = null;
        b bVar = this.c;
        if (bVar != null) {
            bVar.b();
        }
        this.g = false;
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab22d958", new Object[]{this, fVar});
        } else {
            this.h = fVar;
        }
    }

    private void b(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{this, application});
            return;
        }
        bhe.a a2 = bhe.a(application, "com.taobao.taolivehome.api.TaoliveHomeSDK");
        a2.a(new bhc.b<cak>() { // from class: com.taobao.taolive.sdk.morelive.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bhc.b
            public void a(cak cakVar, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("35478f09", new Object[]{this, cakVar, bundle});
                    return;
                }
                q.b(e.TAG, "startInstallLiveHome onInstantiate");
                cakVar.init(application, bundle);
            }

            @Override // tb.bhc.b
            public void a(String str, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                } else {
                    q.b(e.TAG, "startInstallLiveHome onFailure");
                }
            }
        });
        h.a(application).a(j.a().a(a2.a()).a());
    }
}
