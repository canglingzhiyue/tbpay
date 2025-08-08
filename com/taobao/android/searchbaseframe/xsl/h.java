package com.taobao.android.searchbaseframe.xsl;

import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.message.message_open_api.ICallService;
import com.taobao.search.common.util.i;
import tb.kge;

/* loaded from: classes6.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f15029a;
    private long b;
    private long c;
    private long d;
    private long e;
    private int f;
    private long g;
    private long h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private boolean m;

    static {
        kge.a(1509136346);
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f15029a = str;
        }
    }

    public final void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public final void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public final void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }

    public final void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad402139", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f9d8", new Object[]{this, new Long(j)});
        } else {
            this.g = j;
        }
    }

    public final void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9d277", new Object[]{this, new Long(j)});
        } else {
            this.h = j;
        }
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public final void g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25eab16", new Object[]{this, new Long(j)});
        } else if (this.k > 0) {
        } else {
            this.k = j;
            a();
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (StringUtils.isEmpty(this.f15029a)) {
        } else {
            AppMonitor.register("tbsearch", "xslStats", MeasureSet.create().addMeasure(i.b.MEASURE_ONCREATE).addMeasure("init").addMeasure("downloadPage").addMeasure("render").addMeasure("dataCost").addMeasure("downloadTemplate").addMeasure("total"), DimensionSet.create().addDimension("pageName").addDimension("preload").addDimension(ICallService.KEY_NEED_INIT));
            AppMonitor.Stat.commit("tbsearch", "xslStats", DimensionValueSet.create().setValue("pageName", this.f15029a).setValue("preload", String.valueOf(this.l)).setValue(ICallService.KEY_NEED_INIT, String.valueOf(this.m)), MeasureValueSet.create().setValue(i.b.MEASURE_ONCREATE, this.e - this.b).setValue("init", this.c - this.d).setValue("downloadPage", this.i).setValue("render", this.f).setValue("dataCost", this.k - this.g).setValue("downloadTemplate", this.j).setValue("total", this.k - this.b));
            k.d("xslStats", toString(), new Object[0]);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "onCreate to dataFinish:" + (this.k - this.b) + "\n -onCreate cost:" + (this.e - this.b) + "\n  --init cost:" + (this.c - this.b) + "\n -onCreateEnd to renderFinish:" + (this.g - this.e) + "\n  -- downloadPage cost:" + this.i + "\n  -- render cost:" + this.f + "\n -renderFinish to dataFinish:" + (this.k - this.g) + "\n  --renderFinish to receiveData:" + (this.h - this.g) + "\n  --receiveData to dataFinish:" + (this.k - this.h) + "\n    ---template cost:" + this.j + '\n';
    }
}
