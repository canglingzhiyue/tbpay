package com.taobao.monitor.impl.data.battery;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.util.e;
import com.taobao.monitor.performance.cpu.g;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import tb.mpi;
import tb.riy;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f18160a;
    private String b;
    private long c;
    private g d;
    private List<g> e;
    private float f;
    private long[] g;

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("eefc581b", new Object[0]) : new b();
    }

    public b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b515a911", new Object[]{this, str});
        }
        this.f18160a = str;
        return this;
    }

    public b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("495418b0", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public b a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4cb582a7", new Object[]{this, new Long(j)});
        }
        this.c = j;
        return this;
    }

    public b a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a802a165", new Object[]{this, gVar});
        }
        this.d = gVar;
        return this;
    }

    public b a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("2f20ae2b", new Object[]{this, new Float(f)});
        }
        this.f = f;
        return this;
    }

    public b a(long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("df7a046c", new Object[]{this, jArr});
        }
        this.g = jArr;
        return this;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            mpi.c("BatteryDumper", a(false));
        }
    }

    private String a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{this, new Boolean(z)});
        }
        e eVar = new e();
        eVar.b();
        long max = Math.max(1L, this.c / 1000);
        eVar.a("BatteryDumper").a((Object) "| ").a((Object) "pid=").a(Integer.valueOf(Process.myPid())).a().a((Object) "flag=").a((Object) this.f18160a).a().a((Object) "type=").a((Object) this.b).b().a((Object) "| ").a((Object) "BatteryTemp=").a(Float.valueOf(this.f)).a().a((Object) "during(seconds)=").a(Long.valueOf(max)).a().a((Object) "diff(jiffies)=").a(Long.valueOf(this.d.k)).a().a((Object) "avg(jiffies/seconds)=").a(new Formatter().format("%.2f", Double.valueOf((this.d.k * 1.0d) / max))).b();
        List<g> list = this.e;
        if (list == null) {
            list = new ArrayList<>();
        }
        Collections.sort(list);
        eVar.b("thread").a("desc", "(status)name(tid)\tavg/total").a("inc_thread_num", String.valueOf(a(list))).a("cur_thread_num", String.valueOf(list.size()));
        for (Iterator<g> it = (z ? list : list.subList(0, Math.min(list.size(), 10))).iterator(); it.hasNext(); it = it) {
            g next = it.next();
            eVar.c().a((Object) riy.BRACKET_START_STR).a((Object) (next.j ? riy.PLUS : Constants.WAVE_SEPARATOR)).a((Object) "/").a((Object) next.e).a((Object) riy.BRACKET_END_STR).a((Object) next.d).a((Object) riy.BRACKET_START_STR).a(Long.valueOf(next.c)).a((Object) riy.BRACKET_END_STR).a().a(Long.valueOf(next.k / max)).a((Object) "/").a(Long.valueOf(next.k)).a((Object) " jiffies").b();
        }
        if (!z && list.size() > 10) {
            eVar.a((Object) "|\t\t......\n");
        }
        long[] jArr = this.g;
        if (jArr != null && jArr.length == 2) {
            eVar.b("network").c().a((Object) "uid=").a(Integer.valueOf(Process.myUid())).b().c().a((Object) "Rx(received)=").a(new Formatter().format("%.2f", Double.valueOf(this.g[0] / 1048576.0d))).a((Object) "M").b().c().a((Object) "Tx(transmitted)=").a(new Formatter().format("%.2f", Double.valueOf(this.g[1] / 1048576.0d))).a((Object) "M").b();
        }
        eVar.d();
        return eVar.toString();
    }

    private int a(List<g> list) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c705294c", new Object[]{this, list})).intValue();
        }
        if (list == null) {
            return 0;
        }
        for (g gVar : list) {
            if (gVar != null && gVar.j) {
                i++;
            }
        }
        return i;
    }
}
