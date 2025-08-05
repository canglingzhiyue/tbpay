package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.srp.ui.list.SrpStateCell;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.refactor.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.p;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class noz extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private noz f31618a;
    private boolean b;
    private noz h;
    private boolean l;
    private boolean n;
    private String o;
    private JSONObject p;
    private JSONObject q;
    private int s;
    private int t;
    private String u;
    private String v;
    private Boolean w;
    private boolean x;
    private boolean z;
    private final List<BaseCellBean> c = new ArrayList(1);
    private final List<BaseCellBean> d = new ArrayList(1);
    private final List<BaseCellBean> e = new ArrayList(1);
    private final List<BaseCellBean> f = new ArrayList(1);
    private final List<BaseCellBean> g = new ArrayList();
    private boolean i = true;
    private int j = -1;
    private boolean k = true;
    private boolean m = true;
    private HashMap<String, Object> r = new HashMap<>();
    private int y = -1;

    static {
        kge.a(371934456);
    }

    public static /* synthetic */ Object ipc$super(noz nozVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 97456367:
                super.h();
                return null;
            case 110385661:
                super.v();
                return null;
            case 441941092:
                super.a((a) objArr[0]);
                return null;
            case 442060256:
                super.a((com.taobao.android.meta.data.e) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public final noz F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (noz) ipChange.ipc$dispatch("3f4be460", new Object[]{this}) : this.f31618a;
    }

    public final boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue() : this.b;
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public final List<BaseCellBean> H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c3a81998", new Object[]{this}) : this.c;
    }

    public final List<BaseCellBean> I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ab49eff7", new Object[]{this}) : this.d;
    }

    public final List<BaseCellBean> J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("92ebc656", new Object[]{this}) : this.e;
    }

    public final List<BaseCellBean> K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("7a8d9cb5", new Object[]{this}) : this.f;
    }

    public final List<BaseCellBean> L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("622f7314", new Object[]{this}) : this.g;
    }

    public final void a(noz nozVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f69ea95f", new Object[]{this, nozVar});
        } else {
            this.h = nozVar;
        }
    }

    public final boolean M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue() : this.i;
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public final void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93209d1", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public final boolean N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("460add9", new Object[]{this})).booleanValue() : this.k;
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public final boolean O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue() : this.l;
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public final boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue() : this.m;
    }

    public final String Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("479b3b48", new Object[]{this}) : this.o;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public final JSONObject R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("49ca12f9", new Object[]{this}) : this.p;
    }

    public final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            this.p = jSONObject;
        }
    }

    public final JSONObject S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5d71e67a", new Object[]{this}) : this.q;
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else {
            this.q = jSONObject;
        }
    }

    public final HashMap<String, Object> T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("f9f78f7e", new Object[]{this}) : this.r;
    }

    public final void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
        } else {
            this.z = z;
        }
    }

    public final int U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4c3524f", new Object[]{this})).intValue() : this.s;
    }

    public final void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae6e270", new Object[]{this, new Integer(i)});
        } else {
            this.s = i;
        }
    }

    public final int V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4d169d0", new Object[]{this})).intValue() : this.t;
    }

    public final void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bbb0f", new Object[]{this, new Integer(i)});
        } else {
            this.t = i;
        }
    }

    public final String W() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6ebd9b02", new Object[]{this}) : this.u;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.u = str;
        }
    }

    public final String X() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f54355a1", new Object[]{this}) : this.v;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.v = str;
        }
    }

    public final Boolean Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("9ed69dd", new Object[]{this}) : this.w;
    }

    public final void b(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66488c4", new Object[]{this, bool});
        } else {
            this.w = bool;
        }
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else {
            this.x = z;
        }
    }

    public final int aa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aaf2809a", new Object[]{this})).intValue() : this.y;
    }

    public final void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5093ae", new Object[]{this, new Integer(i)});
        } else {
            this.y = i;
        }
    }

    @Override // com.taobao.android.meta.data.a
    public void a(com.taobao.android.meta.data.e<a> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a594de0", new Object[]{this, eVar});
        } else if (eVar == null) {
        } else {
            Map<String, String> e = eVar.e();
            if (q.a((Object) (e != null ? e.get("searchType") : null), (Object) "preload")) {
                return;
            }
            super.a(eVar);
        }
    }

    @Override // com.taobao.search.refactor.e, tb.htg, com.taobao.android.meta.data.a
    public void b(a combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dff4fe5", new Object[]{this, combo});
            return;
        }
        q.c(combo, "combo");
        c(combo);
        noz nozVar = (noz) combo;
        a(nozVar.a());
        this.s = nozVar.s;
        this.t = nozVar.t;
        this.u = nozVar.u;
        this.v = nozVar.v;
        this.g.clear();
        this.g.addAll(nozVar.g);
        a(combo.o());
        this.f.clear();
        this.f.addAll(nozVar.f);
        this.k = true;
        this.i = true;
        b(true);
        c(combo);
    }

    public final void b(noz combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e521afe0", new Object[]{this, combo});
            return;
        }
        q.c(combo, "combo");
        this.c.clear();
        this.e.clear();
        this.c.addAll(combo.c);
        this.e.addAll(combo.e);
    }

    @Override // tb.htg, com.taobao.android.meta.data.a
    public void a(a combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a577c64", new Object[]{this, combo});
            return;
        }
        q.c(combo, "combo");
        super.a(combo);
        this.n = false;
        noz nozVar = (noz) combo;
        this.g.addAll(nozVar.g);
        this.s += nozVar.s;
        this.t += nozVar.t;
        this.u = nozVar.u;
        this.v = nozVar.v;
        c(combo);
    }

    public final void ab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab009828", new Object[]{this});
            return;
        }
        this.m = false;
        b(true);
    }

    @Override // com.taobao.android.meta.data.a
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        w().clear();
        int b = b(0, this.c);
        a(this.c);
        int b2 = b(b, this.d);
        a(this.d);
        b(b2, this.f);
        a(this.f);
        b(0, this.g);
        a(this.g);
        if (e() && this.f31618a == null) {
            b(0, this.e);
            a(this.e);
        }
        super.v();
    }

    private final int b(int i, List<? extends BaseCellBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8e9451e", new Object[]{this, new Integer(i), list})).intValue();
        }
        for (BaseCellBean baseCellBean : list) {
            baseCellBean.comboIndex = i;
            i++;
        }
        return i;
    }

    @Override // com.taobao.search.refactor.e, tb.htg, com.taobao.android.meta.data.a
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        super.h();
        String str = null;
        this.v = str;
        this.u = str;
        this.s = 0;
        this.t = 0;
        a((Boolean) null);
    }

    public final void ac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0eafa9", new Object[]{this});
            return;
        }
        a(this.c);
        a(this.d);
        a(this.f);
        a(this.g);
        a(this.e);
    }

    public final noz ad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (noz) ipChange.ipc$dispatch("85c2bc63", new Object[]{this});
        }
        noz nozVar = new noz();
        nozVar.f31618a = this;
        nozVar.a().pageTraceArgs = a().pageTraceArgs;
        nozVar.a().pageTraceName = a().pageTraceName;
        nozVar.a().pageName = a().pageName;
        nozVar.a(n());
        nozVar.a(s());
        nozVar.b = this.b;
        nozVar.o = this.o;
        JSONObject jSONObject = null;
        nozVar.a((Boolean) null);
        JSONObject jSONObject2 = this.p;
        if (jSONObject2 != null) {
            jSONObject = new JSONObject();
            jSONObject.putAll(jSONObject2);
        }
        nozVar.p = jSONObject;
        return nozVar;
    }

    @Override // tb.htg, com.taobao.android.meta.data.a
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : (this.g.isEmpty() ^ true) && !(this.g.get(0) instanceof SrpStateCell);
    }

    public final void ae() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2adeab", new Object[]{this});
            return;
        }
        noz nozVar = this.f31618a;
        if (nozVar == null) {
            return;
        }
        this.n = true;
        a(nozVar.o());
        a().page = nozVar.a().page;
        a().rn = nozVar.a().rn;
        a().totalPage = nozVar.a().totalPage;
        a().totalResult = nozVar.a().totalResult;
        a().pageTraceArgs = nozVar.a().pageTraceArgs;
        a().style = nozVar.a().style;
        a(nozVar.n());
        a(nozVar.k());
        if (k() == MetaState.UPDATING) {
            z = true;
        }
        this.l = z;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        a(nozVar.c, this.c);
        a(nozVar.d, this.d);
        a(nozVar.e, this.e);
        a(nozVar.f, this.f);
        a(nozVar.g, this.g);
        D().clear();
        D().putAll(nozVar.D());
        q().copy(nozVar.q());
        noz nozVar2 = nozVar.h;
        if (nozVar2 == null) {
            return;
        }
        a((a) nozVar2);
    }

    @Override // com.taobao.android.meta.data.a
    public void a(BaseCellBean baseCellBean, BaseCellBean newBean) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23816c8c", new Object[]{this, baseCellBean, newBean});
            return;
        }
        q.c(newBean, "newBean");
        this.g.set(p.a((List<? extends BaseCellBean>) this.g, baseCellBean), newBean);
        newBean.combo = this;
        if (p() || newBean.isSection) {
            z = true;
        }
        a(z);
        b(true);
    }

    private final void a(List<? extends BaseCellBean> list, List<BaseCellBean> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
            return;
        }
        for (BaseCellBean baseCellBean : list) {
            BaseCellBean c = baseCellBean.mo1013copy();
            c.combo = this;
            q.a((Object) c, "c");
            list2.add(c);
            a(p() || baseCellBean.isSection);
        }
    }

    public final int af() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab38f61f", new Object[]{this})).intValue();
        }
        noz nozVar = this.h;
        if (nozVar == null) {
            return 0;
        }
        if (nozVar == null) {
            q.a();
        }
        return nozVar.g.size();
    }

    @Override // tb.htg
    public void a(BaseCellBean cell) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0c273a", new Object[]{this, cell});
            return;
        }
        q.c(cell, "cell");
        this.g.clear();
        this.g.add(cell);
        cell.combo = this;
        b(true);
    }

    public final boolean ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[]{this})).booleanValue();
        }
        if (o() != null) {
            Boolean o = o();
            if (o == null) {
                q.a();
            }
            if (o.booleanValue()) {
                return true;
            }
        }
        return a().page >= a().totalPage;
    }

    @Override // tb.htg, com.taobao.android.meta.data.a
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (!this.m) {
            return true;
        }
        if (this.n) {
            return false;
        }
        if (o() != null) {
            Boolean o = o();
            if (o == null) {
                q.a();
            }
            if (o.booleanValue()) {
                return true;
            }
        }
        if (this.f31618a != null) {
            return a().page >= a().totalPage;
        }
        int i = this.j;
        if (i <= 0) {
            return true;
        }
        int i2 = a().totalPage;
        if (1 <= i2 && i > i2) {
            i = a().totalPage;
        }
        return a().page >= i;
    }
}
