package com.taobao.android.dinamicx.videoc;

import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;
import tb.fqi;
import tb.fxu;
import tb.fxv;
import tb.fxw;
import tb.fxy;
import tb.fye;
import tb.fyf;
import tb.fyg;
import tb.fyh;
import tb.fyi;
import tb.fyj;
import tb.fyk;
import tb.fyn;
import tb.fyt;
import tb.kge;

/* loaded from: classes5.dex */
public class a implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final DXVideoControlConfig<fxw> f11940a;
    private final Map<RecyclerView, Pair<fyt<Integer, ?>, fxy<?, ?>>> b = new WeakHashMap();
    private final String c;

    static {
        kge.a(-880227393);
        kge.a(2028149408);
    }

    public a(DXVideoControlConfig<fxw> dXVideoControlConfig, String str) {
        this.f11940a = dXVideoControlConfig;
        this.c = str;
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void a(RecyclerView recyclerView, DXVideoControlConfig<fxw> dXVideoControlConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af1251bf", new Object[]{this, recyclerView, dXVideoControlConfig});
        } else {
            a(recyclerView, dXVideoControlConfig, null);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void a(RecyclerView recyclerView, DXVideoControlConfig<fxw> dXVideoControlConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6429c9", new Object[]{this, recyclerView, dXVideoControlConfig, str});
        } else if (this.b.containsKey(recyclerView)) {
        } else {
            if (str != null) {
                if (dXVideoControlConfig == this.f11940a) {
                    dXVideoControlConfig = DXVideoControlConfig.b();
                }
                dXVideoControlConfig.a(str);
            }
            b(recyclerView, dXVideoControlConfig);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void a(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b95e0", new Object[]{this, recyclerView, str});
            return;
        }
        fyt<Integer, ?> f = f(recyclerView);
        if (f == null) {
            return;
        }
        f.a(str);
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
        } else {
            b(recyclerView, (String) null);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void b(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f1b1a21", new Object[]{this, recyclerView, str});
            return;
        }
        fyt<Integer, ?> f = f(recyclerView);
        if (f == null) {
            return;
        }
        if (str == null) {
            f.e();
        } else {
            f.e(str);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void c(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92aa9e62", new Object[]{this, recyclerView, str});
            return;
        }
        fyt<Integer, ?> f = f(recyclerView);
        if (f == null) {
            return;
        }
        if (str == null) {
            f.f();
        } else {
            f.f(str);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1012817", new Object[]{this, recyclerView});
        } else {
            d(recyclerView, null);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void d(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("863a22a3", new Object[]{this, recyclerView, str});
            return;
        }
        fyt<Integer, ?> f = f(recyclerView);
        if (f == null) {
            return;
        }
        if (str == null) {
            f.b();
        } else {
            f.c(str);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void c(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba1ea98", new Object[]{this, recyclerView});
        } else {
            e(recyclerView, null);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void e(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c9a6e4", new Object[]{this, recyclerView, str});
            return;
        }
        fyt<Integer, ?> f = f(recyclerView);
        if (f == null) {
            return;
        }
        if (str == null) {
            f.c();
        } else {
            f.d(str);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void d(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1642ad19", new Object[]{this, recyclerView});
        } else {
            f(recyclerView, null);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void f(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d592b25", new Object[]{this, recyclerView, str});
            return;
        }
        fxy<?, ?> g = g(recyclerView);
        if (g == null) {
            return;
        }
        if (str == null) {
            g.a();
        } else {
            g.a(str);
        }
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (Pair<fyt<Integer, ?>, fxy<?, ?>> pair : this.b.values()) {
            ((fyt) pair.first).a();
        }
        this.b.clear();
    }

    @Override // com.taobao.android.dinamicx.videoc.c
    public void e(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e36f9a", new Object[]{this, recyclerView});
            return;
        }
        fyt<Integer, ?> f = f(recyclerView);
        if (f != null) {
            f.a();
        }
        this.b.remove(recyclerView);
    }

    private fyt<Integer, ?> f(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fyt) ipChange.ipc$dispatch("fb07d22a", new Object[]{this, recyclerView});
        }
        Pair<fyt<Integer, ?>, fxy<?, ?>> pair = this.b.get(recyclerView);
        if (pair != null) {
            return (fyt) pair.first;
        }
        return null;
    }

    private fxy<?, ?> g(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fxy) ipChange.ipc$dispatch("28e06963", new Object[]{this, recyclerView});
        }
        Pair<fyt<Integer, ?>, fxy<?, ?>> pair = this.b.get(recyclerView);
        if (pair != null) {
            return (fxy) pair.second;
        }
        return null;
    }

    private void b(RecyclerView recyclerView, DXVideoControlConfig<fxw> dXVideoControlConfig) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7770765e", new Object[]{this, recyclerView, dXVideoControlConfig});
            return;
        }
        fyf fyfVar = new fyf(dXVideoControlConfig.e());
        Comparator<fxw> f = dXVideoControlConfig.f();
        if (f == null) {
            boolean z2 = dXVideoControlConfig.n() && dXVideoControlConfig.h() == 2;
            if (dXVideoControlConfig.h() == 1 || z2) {
                f = new fyh();
            } else {
                f = new fyg();
            }
        }
        if (dXVideoControlConfig.g() == 1) {
            z = true;
        }
        fyj fyjVar = new fyj(fyfVar, f, z, dXVideoControlConfig.j());
        if (dXVideoControlConfig.h() == 3 && dXVideoControlConfig.i() != 1) {
            throw new RuntimeException("使用了 DXPlayControlOrder.LOOP_* 策略，maxPlayingVideo 必须设置为 1; 当前 maxPlayingVideo: " + dXVideoControlConfig.i());
        }
        fye fyeVar = new fye(recyclerView, fyjVar, new fyi(dXVideoControlConfig.i()), dXVideoControlConfig, fqi.K() ? new fyk(dXVideoControlConfig.c()) : null);
        fyn.a aVar = new fyn.a(recyclerView, new fxu(fyeVar, dXVideoControlConfig.k(), dXVideoControlConfig.l(), dXVideoControlConfig.m(), dXVideoControlConfig.n(), this.c));
        for (String str : fyeVar.b()) {
            aVar.a(new fxv(fyeVar, dXVideoControlConfig.c(), dXVideoControlConfig.m()), dXVideoControlConfig.d(), str);
        }
        this.b.put(recyclerView, new Pair<>(aVar.a(), fyeVar));
    }
}
