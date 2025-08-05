package com.taobao.search.refactor;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.common.util.r;
import com.taobao.tao.timestamp.TimeStampManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.htg;
import tb.kge;
import tb.nvr;

/* loaded from: classes7.dex */
public class e extends htg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private nvr f19304a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean k;
    private boolean l;
    private StringBuilder m;
    private String n;
    private String p;
    private String q;
    private int r;
    private HashSet<String> o = new HashSet<>();
    private final boolean i = r.cC();
    private final Map<String, String> j = new HashMap();

    static {
        kge.a(1553024431);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -955963047:
                super.a((List) objArr[0]);
                return null;
            case 96532833:
                return new Integer(super.g());
            case 97456367:
                super.h();
                return null;
            case 771706853:
                super.b((com.taobao.android.meta.data.a) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public final void a(nvr nvrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fdaaee", new Object[]{this, nvrVar});
        } else {
            this.f19304a = nvrVar;
        }
    }

    public final nvr y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nvr) ipChange.ipc$dispatch("c7afef9c", new Object[]{this}) : this.f19304a;
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public final int z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ccb7f4", new Object[]{this})).intValue() : this.b;
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public final void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final int A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a97c3b", new Object[]{this})).intValue() : this.f;
    }

    public final void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final int B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3b793bc", new Object[]{this})).intValue() : this.g;
    }

    public final void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public final int C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3c5ab3d", new Object[]{this})).intValue() : this.h;
    }

    public final void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d3132", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public final boolean Z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("509c7e5", new Object[]{this})).booleanValue() : this.k;
    }

    public final void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public final boolean ah() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab552532", new Object[]{this})).booleanValue() : this.l;
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d7103", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public final StringBuilder ai() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StringBuilder) ipChange.ipc$dispatch("ff4a87ca", new Object[]{this}) : this.m;
    }

    public final String aj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("87758670", new Object[]{this}) : this.n;
    }

    public final String ak() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dfb410f", new Object[]{this}) : this.p;
    }

    public final String al() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9480fbae", new Object[]{this}) : this.q;
    }

    public final Map<String, String> D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("53c795c0", new Object[]{this}) : this.j;
    }

    @Override // tb.htg, com.taobao.android.meta.data.a
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        super.h();
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.b = 0;
    }

    @Override // com.taobao.android.meta.data.a
    public void a(List<BaseCellBean> cellList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, cellList});
            return;
        }
        kotlin.jvm.internal.q.c(cellList, "cellList");
        super.a(cellList);
        this.r = cellList.size();
    }

    public final void am() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9b9ab3", new Object[]{this});
            return;
        }
        StringBuilder sb = this.m;
        this.p = sb != null ? sb.toString() : null;
        this.q = this.n;
        this.n = null;
        this.m = null;
        this.o.clear();
    }

    public final void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (str == null || i >= this.r || this.o.contains(str)) {
        } else {
            this.o.add(str);
            if (this.n == null) {
                TimeStampManager instance = TimeStampManager.instance();
                kotlin.jvm.internal.q.a((Object) instance, "TimeStampManager.instance()");
                this.n = String.valueOf(instance.getCurrentTimeStamp());
            }
            StringBuilder sb = this.m;
            if (sb == null) {
                this.m = new StringBuilder();
            } else {
                if (sb == null) {
                    kotlin.jvm.internal.q.a();
                }
                sb.append(",");
            }
            StringBuilder sb2 = this.m;
            if (sb2 == null) {
                kotlin.jvm.internal.q.a();
            }
            sb2.append(str);
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        this.f += this.d;
        this.g += this.c;
        this.h += this.e;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    @Override // tb.htg
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        if (this.i && a().totalResult <= 0) {
            return Integer.MAX_VALUE;
        }
        return super.g();
    }

    @Override // tb.htg, com.taobao.android.meta.data.a
    public void b(com.taobao.android.meta.data.a combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dff4fe5", new Object[]{this, combo});
            return;
        }
        kotlin.jvm.internal.q.c(combo, "combo");
        super.b(combo);
        this.r = combo.w().size();
        this.f19304a = ((e) combo).f19304a;
    }

    public final void c(com.taobao.android.meta.data.a combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a72366", new Object[]{this, combo});
            return;
        }
        kotlin.jvm.internal.q.c(combo, "combo");
        this.j.putAll(((e) combo).j);
    }
}
