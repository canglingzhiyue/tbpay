package com.taobao.android.weex_ability.xr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.core.splitinstall.m;
import com.alibaba.android.split.core.splitinstall.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.appbundle.c;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.tao.TaoPackageInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURE = "TB3DSpace";

    /* renamed from: a */
    private g f15975a;
    private boolean b = false;
    private boolean c = false;
    private int d = Integer.MIN_VALUE;
    private List<WeakReference<C0617a>> e;

    /* loaded from: classes6.dex */
    public interface b {
        void a();

        void b();
    }

    static {
        kge.a(-854092797);
    }

    public static /* synthetic */ int a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e86620ee", new Object[]{aVar})).intValue() : aVar.d;
    }

    public static /* synthetic */ void a(a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a65a050", new Object[]{aVar, bVar});
        } else {
            aVar.a(bVar);
        }
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("245eb13d", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.b = z;
        return z;
    }

    public static /* synthetic */ g b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("5249a65a", new Object[]{aVar}) : aVar.f15975a;
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e74b1a9c", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.c = z;
        return z;
    }

    public static /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : d();
    }

    public a() {
        try {
            this.f15975a = c.Companion.a().c();
            this.e = new ArrayList(4);
            if (this.f15975a != null) {
                return;
            }
            com.taobao.android.weex_framework.util.g.b("XRInitializer", "fatal error. failed to get split manager.");
        } catch (Throwable th) {
            com.taobao.android.weex_framework.util.g.b("XRInitializer", "fatal error. failed to create XRInitializer: " + th.getMessage());
        }
    }

    public void a(Context context, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("538edab5", new Object[]{this, context, bVar});
        } else if (this.b) {
            com.taobao.android.weex_framework.util.g.f("XRInitializer", "already loaded...");
        } else if (com.android.tools.bundleInfo.b.a().c("TB3DSpace") == null) {
            a(bVar);
        } else if (this.f15975a == null) {
            bVar.b();
            com.taobao.android.weex_framework.util.g.f("XRInitializer", "failed to fetch(code: 0x001)");
        } else if (a("TB3DSpace")) {
            a(bVar);
        } else {
            this.b = true;
            LocalBroadcastManager.getInstance(context.getApplicationContext()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.weex_ability.xr.XRInitializer$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    a.a(a.this, bVar);
                    a.a(a.this, false);
                    LocalBroadcastManager.getInstance(context2.getApplicationContext()).unregisterReceiver(this);
                }
            }, new IntentFilter("TB3DSPACE_INSTALL_SUCCESS"));
            Nav.from(context.getApplicationContext()).toUri("taobao://go/installxrspace3d");
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (this.f15975a == null || this.e.isEmpty()) {
                return;
            }
            for (WeakReference<C0617a> weakReference : this.e) {
                C0617a c0617a = weakReference.get();
                if (c0617a != null) {
                    this.f15975a.b(c0617a);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void a(final b bVar) {
        try {
            Class.forName("com.taobao.android.weex.plugin.xr.XREnvironment").getDeclaredMethod(TBPlayerConst.TBPlayerMethodSetup, Runnable.class, Runnable.class).invoke(null, new Runnable() { // from class: com.taobao.android.weex_ability.xr.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (bVar == null) {
                    } else {
                        a.b(a.this, true);
                        bVar.a();
                    }
                }
            }, new Runnable() { // from class: com.taobao.android.weex_ability.xr.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (bVar == null) {
                    } else {
                        a.b(a.this, false);
                        bVar.b();
                    }
                }
            });
        } catch (Throwable th) {
            bVar.b();
            com.taobao.android.weex_framework.util.g.c("XRInitializer", "failed to inject xr os environment because of " + th.getMessage(), th);
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.f15975a == null) {
            return false;
        }
        if ("212200".equals(TaoPackageInfo.sTTID)) {
            return true;
        }
        return com.android.tools.bundleInfo.b.a().c(str) != null && this.f15975a.a().contains(str);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c;
    }

    /* renamed from: com.taobao.android.weex_ability.xr.a$a */
    /* loaded from: classes6.dex */
    public static class C0617a implements o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private final WeakReference<a> f15978a;
        private final b b;

        static {
            kge.a(-1278670972);
            kge.a(-1887429869);
        }

        @Override // com.alibaba.android.split.core.listener.b
        public /* synthetic */ void onStateUpdate(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd17bbbe", new Object[]{this, mVar});
            } else {
                a(mVar);
            }
        }

        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("398f1780", new Object[]{this, mVar});
                return;
            }
            a aVar = this.f15978a.get();
            if (aVar == null) {
                com.taobao.android.weex_framework.util.g.f("XRInitializer", "fatal error. host object recycled...");
            } else if (!a.c()) {
                com.taobao.android.weex_framework.util.g.f("XRInitializer", "fatal error. onStateUpdate called on wrong thread: " + Thread.currentThread().getName());
            } else if (mVar.a() != a.a(aVar)) {
            } else {
                try {
                    int b = mVar.b();
                    if (b == 5) {
                        this.b.a();
                        a.b(aVar).b(this);
                    } else if (b == 6) {
                        this.b.b();
                        a.b(aVar).b(this);
                        com.taobao.android.weex_framework.util.g.f("XRInitializer", "failed to fetch(code: 0x002)");
                    }
                    List<String> g = mVar.g();
                    com.taobao.android.weex_framework.util.g.a("XRInitializer", "update fetch state: " + mVar.b() + " | " + g.toString());
                } catch (Throwable th) {
                    com.taobao.android.weex_framework.util.g.a("XRInitializer", "unknown error:" + th.getMessage());
                }
            }
        }
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : Looper.getMainLooper() == Looper.myLooper();
    }
}
