package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.j;
import com.taobao.android.remoteso.resolver2.k;
import com.taobao.android.remoteso.status.RSoStatus;
import com.taobao.android.remoteso.status.c;
import java.io.File;

/* loaded from: classes.dex */
public class iiz implements iia {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijd f29061a;
    private final iju b;
    private final c c;
    private final ijk d;

    public static /* synthetic */ ihz a(iiz iizVar, String str, ijo ijoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihz) ipChange.ipc$dispatch("73bcba1", new Object[]{iizVar, str, ijoVar}) : iizVar.a(str, ijoVar);
    }

    public static /* synthetic */ void a(iiz iizVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("752dcf52", new Object[]{iizVar, str, str2});
        } else {
            iizVar.a(str, str2);
        }
    }

    public iiz(ijd ijdVar, iju ijuVar, ijk ijkVar, c cVar) {
        this.f29061a = ijdVar;
        this.b = ijuVar;
        this.d = ijkVar;
        this.c = cVar;
    }

    @Override // tb.iia
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (ikw.a((CharSequence) str)) {
            return false;
        }
        try {
            k c = this.d.a(str).c();
            if (c.i()) {
                return ((Boolean) this.c.a(c.b(), new c.a<Boolean>() { // from class: tb.iiz.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // com.taobao.android.remoteso.status.c.a
                    public /* synthetic */ Boolean b(RSoStatus rSoStatus, c.InterfaceC0566c interfaceC0566c) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("2d8b2ec7", new Object[]{this, rSoStatus, interfaceC0566c}) : a(rSoStatus, interfaceC0566c);
                    }

                    public Boolean a(RSoStatus rSoStatus, c.InterfaceC0566c interfaceC0566c) {
                        IpChange ipChange2 = $ipChange;
                        boolean z = true;
                        if (ipChange2 instanceof IpChange) {
                            return (Boolean) ipChange2.ipc$dispatch("14fbb207", new Object[]{this, rSoStatus, interfaceC0566c});
                        }
                        if (rSoStatus != RSoStatus.LOADED_IN_MEMORY) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                })).booleanValue();
            }
        } catch (Throwable th) {
            ikq.a("isLoaded,error", th);
        }
        return false;
    }

    @Override // tb.iia
    public ihz b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihz) ipChange.ipc$dispatch("7d1d49d8", new Object[]{this, str});
        }
        try {
            if (this.f29061a.a(str)) {
                RSoLog.d("load -> failure , lib in config is disabled, libName=" + str);
                return ihz.a(str, 4003);
            }
            return a(str, this.d.a(str));
        } catch (Throwable th) {
            RSoLog.a("loader, load error:", th);
            return ihz.a(str, RSoException.error(4001, th));
        }
    }

    @Override // tb.iia
    public ihz c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihz) ipChange.ipc$dispatch("7dc9f577", new Object[]{this, str});
        }
        try {
            if (this.f29061a.a(str)) {
                return ihz.a(str, 4003);
            }
            return a(str, this.d.b(str));
        } catch (Throwable th) {
            RSoLog.a("loader, loadSync error:", th);
            return ihz.a(str, RSoException.error(4012, th));
        }
    }

    @Override // tb.iia
    public void a(final String str, final ihy ihyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9dcb28", new Object[]{this, str, ihyVar});
            return;
        }
        try {
            if (this.f29061a.a(str)) {
                RSoLog.d("loadAsync ->  lib in config is disabled, libName=" + str);
                ihyVar.onLoadFinished(ihz.a(str, 4003));
                return;
            }
            this.d.a(str, new ijm() { // from class: tb.iiz.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ijm
                public void onFinish(ijo ijoVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("559f7a1b", new Object[]{this, ijoVar});
                        return;
                    }
                    try {
                        ihyVar.onLoadFinished(iiz.a(iiz.this, str, ijoVar));
                    } catch (Throwable th) {
                        ihyVar.onLoadFinished(ihz.a(str, RSoException.error(4010, th)));
                    }
                }
            });
        } catch (Throwable th) {
            RSoLog.a("loader, loadAsync error:", th);
            ihyVar.onLoadFinished(ihz.a(str, RSoException.error(4011, th)));
        }
    }

    private ihz a(String str, ijo ijoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihz) ipChange.ipc$dispatch("5384cdb7", new Object[]{this, str, ijoVar});
        }
        RSoLog.c("loadPullResult, enter, lib=" + str);
        long a2 = iky.a();
        k c = ijoVar.c();
        SoIndexData.SoFileInfo g = c.g();
        if (((Boolean) this.c.a(c.b(), new c.a<Boolean>() { // from class: tb.iiz.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Boolean, java.lang.Object] */
            @Override // com.taobao.android.remoteso.status.c.a
            public /* synthetic */ Boolean b(RSoStatus rSoStatus, c.InterfaceC0566c interfaceC0566c) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("2d8b2ec7", new Object[]{this, rSoStatus, interfaceC0566c}) : a(rSoStatus, interfaceC0566c);
            }

            public Boolean a(RSoStatus rSoStatus, c.InterfaceC0566c interfaceC0566c) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    return (Boolean) ipChange2.ipc$dispatch("14fbb207", new Object[]{this, rSoStatus, interfaceC0566c});
                }
                if (rSoStatus != RSoStatus.LOADED_IN_MEMORY) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        })).booleanValue()) {
            RSoLog.c("loadPullResult, already loaded, lib=" + str + ", cost=" + (iky.a() - a2));
            return ihz.a(str).a(g.getMajorVersion(), g.getMinorVersion()).b(c.f());
        } else if (c.i()) {
            for (k kVar : ijoVar.d()) {
                a(kVar, kVar.a(), kVar.c());
            }
            RSoLog.c("loadPullResult, success, lib=" + str + ", cost=" + (iky.a() - a2));
            return ihz.a(str).a(g.getMajorVersion(), g.getMinorVersion()).b(c.f());
        } else {
            RSoException e = c.e();
            if (e == null) {
                e = RSoException.error(4001, c.a() + " needed by " + str + " load failed");
            }
            RSoLog.c("loadPullResult, resolve failed, lib=" + str + ", cost=" + (iky.a() - a2));
            return ihz.a(str, e).b(c.f());
        }
    }

    private void a(k kVar, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc567e3f", new Object[]{this, kVar, str, str2});
            return;
        }
        final j b = kVar.b();
        this.c.a(b, new c.a<Void>() { // from class: tb.iiz.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
            @Override // com.taobao.android.remoteso.status.c.a
            public /* synthetic */ Void b(RSoStatus rSoStatus, c.InterfaceC0566c interfaceC0566c) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("2d8b2ec7", new Object[]{this, rSoStatus, interfaceC0566c}) : a(rSoStatus, interfaceC0566c);
            }

            public Void a(RSoStatus rSoStatus, c.InterfaceC0566c interfaceC0566c) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("11d50cb3", new Object[]{this, rSoStatus, interfaceC0566c});
                }
                if (rSoStatus == RSoStatus.LOADED_IN_MEMORY) {
                    RSoLog.c("doLoad -> already loaded = " + str2);
                    return null;
                }
                if (rSoStatus == RSoStatus.LOADING) {
                    ikq.a("doLoad,loading", b + " " + rSoStatus);
                }
                try {
                    RSoLog.c("doLoad -> libFullPath = " + str2);
                    if (ikw.a((CharSequence) str2)) {
                        throw new IllegalStateException(str + "'s libFullPath is empty, wtf?");
                    }
                    interfaceC0566c.a(RSoStatus.LOADING);
                    iiz.a(iiz.this, str, str2);
                    RSoLog.c("doLoad -> finish, libFullPath = " + str2);
                    interfaceC0566c.a(RSoStatus.LOADED_IN_MEMORY);
                    return null;
                } catch (Throwable th) {
                    ikq.a("doLoad -> failed", str + str2 + th);
                    interfaceC0566c.a(RSoStatus.LOAD_FAILED);
                    throw RSoException.error(4021, th);
                }
            }
        });
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (!this.b.d()) {
            System.load(str2);
            RSoLog.c("SWSoLoaderCore, succ load in other process, " + str + ",  libPath " + str2);
        } else {
            try {
                RSoLog.c("SWSoLoaderCore, performLoad enter " + str);
                File a2 = ijw.a(this.b.a(), "nativeLib");
                iyk.a(iyk.class.getClassLoader(), a2);
                ijw.a(new File(str2), a2);
                System.loadLibrary(str);
                RSoLog.c("SWSoLoaderCore, succ loadLibrary " + str);
            } catch (Throwable th) {
                ikq.a("SWSoLoaderCore,loadLibrary", str, th);
                System.load(str2);
                RSoLog.c("SWSoLoaderCore, succ load " + str + ",  libPath " + str2);
            }
        }
    }
}
