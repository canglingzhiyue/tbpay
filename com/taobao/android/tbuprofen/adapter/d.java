package com.taobao.android.tbuprofen.adapter;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.adapter.anr.i;
import com.taobao.android.tbuprofen.common.f;
import com.taobao.android.tbuprofen.g;
import com.taobao.android.tbuprofen.h;
import com.taobao.android.tbuprofen.plugin.DefaultPlugin;
import com.taobao.android.tbuprofen.plugin.PluginCapacity;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f15478a;
    private g b;
    private DefaultPlugin c;
    private e d;
    private TBHeapDumper e;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static d f15480a = new d();
    }

    static {
        kge.a(-1060575794);
    }

    public static /* synthetic */ e a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("e75f134d", new Object[]{dVar}) : dVar.d;
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("431035d2", new Object[0]) : a.f15480a;
    }

    private d() {
        this.f15478a = false;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public synchronized boolean a(Context context, com.taobao.android.tbuprofen.adapter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e133716b", new Object[]{this, context, aVar})).booleanValue();
        } else if (this.f15478a) {
            return true;
        } else {
            com.taobao.android.tbuprofen.log.c.d("TBProfHelper", "init", new Object[0]);
            this.f15478a = true;
            if (aVar.h) {
                h.a(new b());
            }
            TBProfConfig.a(context);
            com.taobao.android.tbuprofen.log.c.a(new f(TBProfConfig.a(0)));
            if (TBProfConfig.h() && !aVar.e && !TBProfConfig.i()) {
                com.taobao.android.tbuprofen.log.c.a("TBProfHelper", "Can not auto start TBP in local mode.", new Object[0]);
                return false;
            }
            if (aVar.f == null) {
                aVar.f = new e(context, aVar);
            }
            this.d = aVar.f;
            b(context, aVar);
            c(context, aVar);
            i.a(context, aVar);
            return this.f15478a;
        }
    }

    public boolean b(Context context, com.taobao.android.tbuprofen.adapter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a13d20a", new Object[]{this, context, aVar})).booleanValue();
        }
        this.b = g.a(context, TBProfConfig.a()).a(this.d).a(TBProfConfig.a(1), TBProfConfig.a(2)).a(TBProfConfig.d()).b(TBProfConfig.j()).c(TBProfConfig.k()).a();
        if (this.b.a()) {
            this.f15478a = b();
        }
        return this.f15478a;
    }

    public void c(Context context, com.taobao.android.tbuprofen.adapter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f432a5", new Object[]{this, context, aVar});
            return;
        }
        if (aVar.g == null) {
            aVar.g = TBProfConfig.l();
        }
        if (!aVar.g.isEnable) {
            return;
        }
        this.e = new TBHeapDumper(context, this.c, aVar);
        this.e.a();
        this.e.b();
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        com.taobao.android.tbuprofen.log.c.e("TBProfHelper", "initPlugin", new Object[0]);
        this.c = new DefaultPlugin(this.b, TBProfConfig.c());
        boolean c = this.c.c();
        if (c) {
            this.c.setArgs(TBProfConfig.a(3).ordinal(), TBProfConfig.j(), TBProfConfig.k());
            this.c.a(new com.taobao.android.tbuprofen.plugin.c() { // from class: com.taobao.android.tbuprofen.adapter.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tbuprofen.plugin.c
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    com.taobao.android.tbuprofen.log.c.e("TBProfHelper", "Class Prepared: " + str, new Object[0]);
                }

                @Override // com.taobao.android.tbuprofen.plugin.c
                public void a(String str, String str2, String str3, long j, StackTraceElement[] stackTraceElementArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b315f37f", new Object[]{this, str, str2, str3, new Long(j), stackTraceElementArr});
                    } else if (d.a(d.this) == null || stackTraceElementArr == null) {
                    } else {
                        try {
                            d.a(d.this).a(str, str2, str3, j, stackTraceElementArr);
                        } catch (Exception e) {
                            com.taobao.android.tbuprofen.log.c.a("TBProfHelper", e, "onBigMemAlloc error", new Object[0]);
                        }
                    }
                }

                @Override // com.taobao.android.tbuprofen.plugin.c
                public void a(Throwable th, StackTraceElement stackTraceElement, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c2e26f53", new Object[]{this, th, stackTraceElement, str});
                    } else {
                        com.taobao.android.tbuprofen.log.c.b("TBProfHelper", String.format("Catch Exception at %s.\n%s", str, Log.getStackTraceString(th)), new Object[0]);
                    }
                }

                @Override // com.taobao.android.tbuprofen.plugin.c
                public void a(String str, int i, StackTraceElement[] stackTraceElementArr, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("26eac75c", new Object[]{this, str, new Integer(i), stackTraceElementArr, str2});
                    } else if (d.a(d.this) == null || stackTraceElementArr == null) {
                    } else {
                        try {
                            d.a(d.this).a(str, i, stackTraceElementArr, str2);
                        } catch (Exception e) {
                            com.taobao.android.tbuprofen.log.c.a("TBProfHelper", e, "onMainThreadLongBlock error", new Object[0]);
                        }
                    }
                }
            });
            String[] e = TBProfConfig.e();
            if (e != null) {
                for (String str : e) {
                    com.taobao.android.tbuprofen.log.c.e("TBProfHelper", "cap=" + str, new Object[0]);
                    this.c.a(PluginCapacity.parse(str), true);
                }
            }
        } else {
            com.taobao.android.tbuprofen.log.c.b("TBProfHelper", "plugin load failed!", new Object[0]);
            this.c = null;
        }
        return c;
    }
}
