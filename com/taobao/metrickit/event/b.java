package com.taobao.metrickit.event;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final Map<Integer, List<d>> f18079a;
    private final Handler b;
    private boolean c;
    private final int[] d;
    private volatile boolean e;
    private boolean f;

    /* renamed from: lambda$2yEA1ZK-Jkd5z-vZsyfvMYKpG04 */
    public static /* synthetic */ void m1160lambda$2yEA1ZKJkd5zvZsyfvMYKpG04(b bVar, int i, Map map) {
        bVar.c(i, map);
    }

    public static /* synthetic */ void lambda$M6JwTfjIrsWzVlFfEGrRZTSzcYc(b bVar, int i, d dVar) {
        bVar.c(i, dVar);
    }

    public static /* synthetic */ void lambda$aT1VHi8hTsScYYx7nPF7k8m3vvM(b bVar, int i, d dVar) {
        bVar.d(i, dVar);
    }

    public abstract String a();

    public abstract void a(MetricContext metricContext);

    public abstract int[] b();

    public abstract void c();

    public b(Handler handler) {
        this.f18079a = new HashMap();
        this.c = true;
        this.e = true;
        this.b = handler;
        this.d = b();
    }

    public b(int[] iArr, Handler handler) {
        this.f18079a = new HashMap();
        this.c = true;
        this.e = true;
        this.d = iArr;
        this.b = handler;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.c = false;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.e = false;
        }
    }

    public void a(final int i, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f27b77", new Object[]{this, new Integer(i), dVar});
        } else if (!com.taobao.metrickit.utils.a.a(this.d, i)) {
        } else {
            this.b.post(new Runnable() { // from class: com.taobao.metrickit.event.-$$Lambda$b$aT1VHi8hTsScYYx7nPF7k8m3vvM
                @Override // java.lang.Runnable
                public final void run() {
                    b.lambda$aT1VHi8hTsScYYx7nPF7k8m3vvM(b.this, i, dVar);
                }
            });
        }
    }

    public /* synthetic */ void d(int i, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b02494", new Object[]{this, new Integer(i), dVar});
            return;
        }
        List<d> list = this.f18079a.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList<>();
            this.f18079a.put(Integer.valueOf(i), list);
        }
        if (list.contains(dVar)) {
            return;
        }
        list.add(dVar);
    }

    public void b(final int i, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a31b3d6", new Object[]{this, new Integer(i), dVar});
        } else {
            this.b.post(new Runnable() { // from class: com.taobao.metrickit.event.-$$Lambda$b$M6JwTfjIrsWzVlFfEGrRZTSzcYc
                @Override // java.lang.Runnable
                public final void run() {
                    b.lambda$M6JwTfjIrsWzVlFfEGrRZTSzcYc(b.this, i, dVar);
                }
            });
        }
    }

    public /* synthetic */ void c(int i, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe70ec35", new Object[]{this, new Integer(i), dVar});
            return;
        }
        List<d> list = this.f18079a.get(Integer.valueOf(i));
        if (list == null) {
            return;
        }
        list.remove(dVar);
    }

    public void a(final int i, final Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
        } else if (!com.taobao.metrickit.utils.a.a(this.d, i)) {
        } else {
            if (this.c) {
                this.b.post(new Runnable() { // from class: com.taobao.metrickit.event.-$$Lambda$b$2yEA1ZK-Jkd5z-vZsyfvMYKpG04
                    {
                        b.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        b.m1160lambda$2yEA1ZKJkd5zvZsyfvMYKpG04(b.this, i, map);
                    }
                });
            } else {
                b(i, a(map));
            }
        }
    }

    public /* synthetic */ void c(int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fb298c", new Object[]{this, new Integer(i), map});
        } else {
            b(i, a(map));
        }
    }

    private Map<String, ?> a(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map}) : Collections.emptyMap().equals(map) ? map : Collections.unmodifiableMap(map);
    }

    private void b(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c62340b", new Object[]{this, new Integer(i), map});
            return;
        }
        List<d> list = this.f18079a.get(Integer.valueOf(i));
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.e) {
            TLog.loge("MetricKit.EventSource", "Event: " + EventCenter.a(i) + " Data: " + new JSONObject(map).toString());
        }
        for (d dVar : list) {
            dVar.a(i, map);
        }
    }

    public Handler f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("9c1ea3b9", new Object[]{this}) : this.b;
    }

    public void b(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfe7915", new Object[]{this, metricContext});
        } else if (this.f) {
        } else {
            a(metricContext);
            this.f = true;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.f) {
        } else {
            c();
            this.f = false;
        }
    }
}
