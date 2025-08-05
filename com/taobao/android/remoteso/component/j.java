package com.taobao.android.remoteso.component;

import android.content.Context;
import android.support.v4.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.iid;
import tb.iie;
import tb.iiv;
import tb.ikq;
import tb.ikw;
import tb.iky;
import tb.riy;

/* loaded from: classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final k f14798a;
    private final String b;
    private final iiv<l, Void> f;
    private final f<l> c = new f<>();
    private final f<Integer> d = new f<>();
    private final Set<d> e = new CopyOnWriteArraySet();
    private volatile boolean g = false;
    private volatile int h = 0;
    private volatile long i = iky.a();

    /* loaded from: classes6.dex */
    public static final class a implements com.taobao.android.remoteso.component.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.remoteso.component.b
        public View a(o oVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("36f27578", new Object[]{this, oVar}) : new RemoErrorView(oVar.a());
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ iiv a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iiv) ipChange.ipc$dispatch("c9a474b5", new Object[]{jVar}) : jVar.f;
    }

    public static /* synthetic */ boolean a(j jVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9a8355d", new Object[]{jVar, new Boolean(z)})).booleanValue();
        }
        jVar.g = z;
        return z;
    }

    public static /* synthetic */ f b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("5b1c3031", new Object[]{jVar}) : jVar.c;
    }

    public static /* synthetic */ k c(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("a0bd736b", new Object[]{jVar}) : jVar.f14798a;
    }

    public static /* synthetic */ g d(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("e65eb58e", new Object[]{jVar}) : jVar.o();
    }

    public static /* synthetic */ f e(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("2bfff80e", new Object[]{jVar}) : jVar.d;
    }

    public j(k kVar, String str) {
        this.f14798a = kVar;
        this.b = str;
        n();
        this.f = (!i() || j()) ? new iie(this.e) : new iid(this.e);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (ikw.a((CharSequence) this.b, (CharSequence) "check")) {
        } else {
            d dVar = this.f14798a.f14803a.h;
            if (dVar == null) {
                ikq.a("RemoReqBO,addCallback", toString());
                return;
            }
            this.e.add(dVar);
            this.e.add(new d() { // from class: com.taobao.android.remoteso.component.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.remoteso.component.d
                public void a(l lVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fcc8199", new Object[]{this, lVar});
                    } else {
                        j.a(j.this, true);
                    }
                }
            });
        }
    }

    public k a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("62c470ba", new Object[]{this}) : this.f14798a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public f<l> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("9805f521", new Object[]{this}) : this.c;
    }

    public f<Integer> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("32a6b7a2", new Object[]{this}) : this.d;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.g;
    }

    public long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue() : iky.a() - this.i;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        for (Pair<String, List<String>> pair : this.f14798a.f14803a.f14804a) {
            if (pair != null && pair.second != null) {
                for (String str : pair.second) {
                    sb.append(str);
                    sb.append(",");
                }
            }
        }
        String sb2 = sb.toString();
        if (sb2.endsWith(",") && sb2.length() > 1) {
            return sb2.substring(0, sb2.length() - 1);
        }
        RSoLog.b("remo, reqBO allModules weired = " + sb2);
        return sb2;
    }

    public List<String> a(String str) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        HashSet hashSet = new HashSet();
        for (Pair<String, List<String>> pair : this.f14798a.f14803a.f14804a) {
            if (ikw.a((CharSequence) str, (CharSequence) pair.first) && (list = pair.second) != null) {
                hashSet.addAll(list);
            }
        }
        return new ArrayList(hashSet);
    }

    public Context h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("96c352e7", new Object[]{this});
        }
        Context context = this.f14798a.f14803a.b;
        if (context != null) {
            return context;
        }
        RSoLog.c("remo,context not set, request = " + this.f14798a);
        return LauncherRuntime.h;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.f14798a.f14803a.c;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.f14798a.f14803a.d;
    }

    public e l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("7accb8b", new Object[]{this});
        }
        e eVar = this.f14798a.f14803a.e;
        return eVar == null ? new b() : eVar;
    }

    public com.taobao.android.remoteso.component.b m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.remoteso.component.b) ipChange.ipc$dispatch("a24d8daf", new Object[]{this});
        }
        com.taobao.android.remoteso.component.b bVar = this.f14798a.f14803a.f;
        return bVar == null ? new a() : bVar;
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8dea1", new Object[]{this, dVar});
        } else {
            this.e.add(dVar);
        }
    }

    public void a(final l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc8199", new Object[]{this, lVar});
            return;
        }
        RSoLog.c("remo, updateResult, enter, " + this + ", result" + lVar);
        i.a(new Runnable() { // from class: com.taobao.android.remoteso.component.j.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                j.a(j.this).a(lVar);
                j.b(j.this).a((f) lVar);
                j.c(j.this);
                RSoLog.c("remo, updateResult, done, result=" + lVar);
            }
        });
    }

    public void a(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i > 0 && i - this.h <= 1) {
        } else {
            this.h = i;
            i.a(new Runnable() { // from class: com.taobao.android.remoteso.component.j.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    j.d(j.this).onProgressChanged(i);
                    j.e(j.this).a((f) Integer.valueOf(i));
                }
            });
        }
    }

    private g o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("d78f134c", new Object[]{this});
        }
        g gVar = this.f14798a.f14803a.g;
        return gVar == null ? new g() { // from class: com.taobao.android.remoteso.component.j.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.remoteso.component.g
            public void onProgressChanged(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5158474", new Object[]{this, new Integer(i)});
                }
            }
        } : gVar;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RemoReqBO@" + Integer.toHexString(hashCode()) + riy.BLOCK_START_STR + ", request=" + this.f14798a + '}';
    }

    /* loaded from: classes6.dex */
    public static final class b implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.remoteso.component.e
        public /* synthetic */ BaseRemoLoadingView a(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BaseRemoLoadingView) ipChange.ipc$dispatch("de940a22", new Object[]{this, context}) : b(context);
        }

        public RemoLoadingView b(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RemoLoadingView) ipChange.ipc$dispatch("12bdc090", new Object[]{this, context}) : new RemoLoadingView(context);
        }
    }
}
