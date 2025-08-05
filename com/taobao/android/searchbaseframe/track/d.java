package com.taobao.android.searchbaseframe.track;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.RequestStats;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile long A;
    public volatile long B;
    public volatile long C;
    public volatile boolean D;
    public volatile long e;
    public volatile long f;
    public volatile long g;
    public volatile long h;
    public volatile long i;
    public volatile long j;
    public volatile int k;
    public volatile int l;
    public volatile boolean m;
    public volatile int n;
    public volatile String o;
    public volatile String p;
    public volatile RequestStats q;
    public volatile long s;
    public volatile long t;
    public volatile long u;
    public volatile long w;
    public volatile long x;
    public volatile long y;
    public volatile boolean r = false;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f15010a = false;
    public volatile boolean b = false;
    public volatile boolean v = false;
    public volatile boolean z = false;
    public volatile String c = "search";
    public volatile String d = "search";

    static {
        kge.a(794606166);
    }

    public d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("443c996b", new Object[]{this});
        }
        d dVar = new d();
        dVar.e = this.e;
        dVar.f = this.f;
        dVar.g = this.g;
        dVar.h = this.h;
        dVar.i = this.i;
        dVar.j = this.j;
        dVar.k = this.k;
        dVar.l = this.l;
        dVar.t = this.t;
        dVar.u = this.u;
        dVar.s = this.s;
        return dVar;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "time_all_ui:" + (this.u - this.s) + "\ntime_all:" + this.g + "\n- time_mtop:" + this.h + "\n--  time_oneway_aserver:" + this.q.oneWayTime + "\n--  time_parse:" + this.i + "\n--  time_template:" + this.j + "\n- time_dispatch:" + (this.C - this.B) + "\n- time_setup_page:" + this.A + "\n- time_render:" + (this.u - this.t);
    }
}
