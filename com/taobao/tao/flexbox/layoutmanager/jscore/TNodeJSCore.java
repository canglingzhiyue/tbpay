package com.taobao.tao.flexbox.layoutmanager.jscore;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.a;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.w;
import com.taobao.tao.flexbox.layoutmanager.event.b;
import java.io.UnsupportedEncodingException;
import tb.oec;
import tb.ogg;
import tb.ogh;

/* loaded from: classes8.dex */
public class TNodeJSCore implements com.taobao.tao.flexbox.layoutmanager.ac.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String b;

    /* renamed from: a  reason: collision with root package name */
    public g f20406a;
    private AC c;
    private boolean d = false;
    private c e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes8.dex */
    public interface AC {
        void _c(String str);

        long _nanotime();
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 0 || i == 1) {
            return 3;
        }
        if (i == 2) {
            return 5;
        }
        return i != 3 ? 4 : 6;
    }

    public static /* synthetic */ AC a(TNodeJSCore tNodeJSCore, AC ac) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AC) ipChange.ipc$dispatch("cdb1f21d", new Object[]{tNodeJSCore, ac});
        }
        tNodeJSCore.c = ac;
        return ac;
    }

    public static /* synthetic */ c a(TNodeJSCore tNodeJSCore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("5ba4e0c5", new Object[]{tNodeJSCore}) : tNodeJSCore.e;
    }

    public static /* synthetic */ c a(TNodeJSCore tNodeJSCore, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("e01aa14f", new Object[]{tNodeJSCore, cVar});
        }
        tNodeJSCore.e = cVar;
        return cVar;
    }

    public static /* synthetic */ String a(TNodeJSCore tNodeJSCore, ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b933720", new Object[]{tNodeJSCore, abVar}) : tNodeJSCore.a(abVar);
    }

    public static /* synthetic */ boolean a(TNodeJSCore tNodeJSCore, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c99f06ff", new Object[]{tNodeJSCore, new Boolean(z)})).booleanValue();
        }
        tNodeJSCore.d = z;
        return z;
    }

    public static /* synthetic */ AC b(TNodeJSCore tNodeJSCore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AC) ipChange.ipc$dispatch("5edeacc7", new Object[]{tNodeJSCore}) : tNodeJSCore.c;
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : b;
    }

    public static /* synthetic */ boolean c(TNodeJSCore tNodeJSCore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("373fea3b", new Object[]{tNodeJSCore})).booleanValue() : tNodeJSCore.d;
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        if (i == 2) {
            a.a().m().b("TNodeJS", str);
        } else if (i == 3) {
            a.a().m().c("TNodeJS", str);
        } else if (i == 4) {
            a.a().m().a("TNodeJS", str);
        } else if (i == 5) {
            a.a().m().d("TNodeJS", str);
        } else if (i == 6) {
            a.a().m().e("TNodeJS", str);
        }
        this.f20406a.b().d().appendJSLog(i, str, false);
    }

    public static void b() {
        byte[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        String str = null;
        if (!TextUtils.isEmpty(b)) {
            return;
        }
        synchronized (TNodeJSCore.class) {
            ogh.a("loadCoreJS");
            String obj = a.a().u().a("TNodeCoreURL", "").toString();
            if (!TextUtils.isEmpty(obj) && (a2 = a.a().p().a(obj)) != null && a2.length > 0) {
                try {
                    str = new String(a2, 0, a2.length, "utf-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = oec.a("entry.html", ab.a());
            }
            b = a(str);
            ogh.b();
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return ";(function (module) { return (function (nativeModule, module) {" + str + "; return module.exports; })(module, module);  });";
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.ac.c
    public void a(final Context context, final g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e4e6be", new Object[]{this, context, gVar});
            return;
        }
        this.f20406a = gVar;
        final long nanoTime = System.nanoTime();
        gVar.b().b(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TNodeJSCore.a(TNodeJSCore.this, new AC() { // from class: com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.AC
                    public void _c(String str) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("c9d8375", new Object[]{this, str});
                            return;
                        }
                        ogh.a("dispatch JSMessage");
                        gVar.b(str);
                        ogh.b();
                    }

                    @Override // com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.AC
                    public long _nanotime() {
                        IpChange ipChange3 = $ipChange;
                        return ipChange3 instanceof IpChange ? ((Number) ipChange3.ipc$dispatch("f2995b", new Object[]{this})).longValue() : System.nanoTime();
                    }
                });
                TNodeJSCore tNodeJSCore = TNodeJSCore.this;
                TNodeJSCore.a(tNodeJSCore, new JSIImpl(tNodeJSCore));
                ogg.a("initJSCore");
                ogh.a("initJSCore");
                c a2 = TNodeJSCore.a(TNodeJSCore.this);
                g gVar2 = gVar;
                a2.initJSCore(gVar2, gVar2.b().E());
                ogh.b();
                TNodeJSCore.b();
                ogg.a("initJSContext");
                ogh.a("initJSContext");
                TNodeJSCore.a(TNodeJSCore.this).initJSContext(context, this, TNodeJSCore.c(), TNodeJSCore.b(TNodeJSCore.this), TNodeJSCore.a(TNodeJSCore.this, gVar.b()));
                ogh.b();
                w.a(gVar.b(), (aa) null, System.nanoTime() - nanoTime, "JSICore", true);
            }
        });
    }

    private String a(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("725263d1", new Object[]{this, abVar});
        }
        String f = abVar.f();
        if (TextUtils.isEmpty(f) && abVar.A() != null) {
            f = abVar.A().W().f20296a;
        }
        return TextUtils.isEmpty(f) ? "unknown" : f;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.ac.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f20406a.b().b(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TNodeJSCore.a(TNodeJSCore.this).destroy();
                    TNodeJSCore.a(TNodeJSCore.this, true);
                }
            });
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.ac.c
    public void a(String str, final String str2, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3a87a7", new Object[]{this, str, str2, bVar});
        } else {
            this.f20406a.b().b(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (TNodeJSCore.c(TNodeJSCore.this)) {
                            ogg.c("tnode jscore is destroyed");
                            return;
                        }
                        try {
                            ogh.a("dispatch JS");
                            TNodeJSCore.a(TNodeJSCore.this).dispatchJS(str2);
                            ogh.b();
                            if (!(bVar instanceof com.taobao.tao.flexbox.layoutmanager.event.a)) {
                                return;
                            }
                            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.3.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        ((com.taobao.tao.flexbox.layoutmanager.event.a) bVar).a();
                                    }
                                }
                            });
                        } catch (Exception e) {
                            e.printStackTrace();
                            ogh.b();
                            if (!(bVar instanceof com.taobao.tao.flexbox.layoutmanager.event.a)) {
                                return;
                            }
                            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.3.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        ((com.taobao.tao.flexbox.layoutmanager.event.a) bVar).a();
                                    }
                                }
                            });
                        }
                    } catch (Throwable th) {
                        if (bVar instanceof com.taobao.tao.flexbox.layoutmanager.event.a) {
                            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.3.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        ((com.taobao.tao.flexbox.layoutmanager.event.a) bVar).a();
                                    }
                                }
                            });
                        }
                        throw th;
                    }
                }
            });
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.ac.c
    public void a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.f20406a.b().b(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ogg.a("register JS Module:" + str);
                        ogh.a("register JS Module:" + str);
                        if (!TNodeJSCore.a(TNodeJSCore.this).applyModule(str, g.c(str2))) {
                            TNodeJSCore.this.a("$.register", g.c(str, str2), null);
                        }
                        ogh.b();
                    } catch (Throwable th) {
                        ogh.b();
                        th.printStackTrace();
                    }
                }
            });
        }
    }
}
