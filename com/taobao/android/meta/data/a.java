package com.taobao.android.meta.data;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.meta.datasource.ComboOp;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.itt;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ResultError f14269a;
    private e<a> b;
    private List<BaseCellBean> e;
    private int f;
    private Boolean h;
    private boolean i;
    private itt.a k;
    private JSONObject l;
    private int m;
    private boolean n;
    private MetaState c = MetaState.DEFAULT;
    private final List<BaseCellBean> d = new ArrayList();
    private ListStyle g = ListStyle.LIST;
    private final SearchParamImpl j = new SearchParamImpl();
    private int o = -1;

    static {
        kge.a(-1204266533);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        }
    }

    public final void a(ResultError resultError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bac00c", new Object[]{this, resultError});
        } else {
            this.f14269a = resultError;
        }
    }

    public final ResultError i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ResultError) ipChange.ipc$dispatch("7f6919ca", new Object[]{this}) : this.f14269a;
    }

    public final e<a> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("f740987d", new Object[]{this}) : this.b;
    }

    public final void a(MetaState metaState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56669f5e", new Object[]{this, metaState});
            return;
        }
        q.c(metaState, "<set-?>");
        this.c = metaState;
    }

    public final MetaState k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MetaState) ipChange.ipc$dispatch("95f5c428", new Object[]{this}) : this.c;
    }

    public final List<BaseCellBean> l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("566a3ef4", new Object[]{this}) : this.d;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.f;
    }

    public final ListStyle n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListStyle) ipChange.ipc$dispatch("a149a3b2", new Object[]{this}) : this.g;
    }

    public final void a(ListStyle value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b84a965", new Object[]{this, value});
            return;
        }
        q.c(value, "value");
        this.g = value;
        this.n = true;
        b();
    }

    public final void a(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
        } else {
            this.h = bool;
        }
    }

    public final Boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("6a309573", new Object[]{this}) : this.h;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.i;
    }

    public final SearchParamImpl q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SearchParamImpl) ipChange.ipc$dispatch("eed76c02", new Object[]{this}) : this.j;
    }

    public final void a(itt.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf4af9f2", new Object[]{this, aVar});
        } else {
            this.k = aVar;
        }
    }

    public final itt.a r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itt.a) ipChange.ipc$dispatch("65be2987", new Object[]{this}) : this.k;
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.l = jSONObject;
        }
    }

    public final JSONObject s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d26c569a", new Object[]{this}) : this.l;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public final int t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue() : this.o;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : w().size() > 0;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (BaseCellBean baseCellBean : this.d) {
            baseCellBean.forceUpdate = true;
        }
    }

    public void a(e<a> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a594de0", new Object[]{this, eVar});
        } else {
            this.b = eVar;
        }
    }

    public final void a(int i, BaseCellBean cell) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c604c42d", new Object[]{this, new Integer(i), cell});
            return;
        }
        q.c(cell, "cell");
        int size = this.d.size();
        if (i < 0 || size <= i) {
            return;
        }
        BaseCellBean baseCellBean = this.d.get(i);
        this.d.set(i, cell);
        w().set(i, cell);
        cell.combo = this;
        cell.comboRealIndex = baseCellBean.comboRealIndex;
        cell.comboIndex = baseCellBean.comboIndex;
        cell.comboType = baseCellBean.comboType;
    }

    public final List<ComboOp> u() {
        List<ComboOp> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b1ac84b", new Object[]{this});
        }
        List<ComboOp> list = null;
        if (!this.n) {
            return null;
        }
        v();
        int i = this.m;
        if (i != 0) {
            if (i == this.d.size()) {
                int i2 = this.f;
                b = p.a(ComboOp.a(i2, this.d.size() + i2));
            } else if (this.m > this.d.size()) {
                b = p.a(ComboOp.a(this.f, this.m, this.d.size()));
            } else {
                int size = this.d.size() - this.m;
                int size2 = this.f + this.d.size();
                b = p.b(ComboOp.b(size2 - size, size2), ComboOp.a(this.f, size2));
            }
            list = b;
            this.n = false;
            this.m = this.d.size();
        }
        return list;
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        this.m = this.d.size();
        this.d.clear();
        this.d.addAll(w());
    }

    public final void b(int i, BaseCellBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81bf18c", new Object[]{this, new Integer(i), bean});
            return;
        }
        q.c(bean, "bean");
        int size = w().size();
        if (i < 0 || size <= i) {
            return;
        }
        bean.comboRealIndex = w().get(i).comboRealIndex;
        w().set(i, bean);
    }

    public final List<BaseCellBean> w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a5e7509", new Object[]{this});
        }
        List<BaseCellBean> list = this.e;
        if (list != null) {
            return list;
        }
        this.e = new CellList();
        List<BaseCellBean> list2 = this.e;
        if (list2 == null) {
            q.a();
        }
        return list2;
    }

    public final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.e = new CellList(i);
        }
    }

    public void b(BaseCellBean cell) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ba51fb", new Object[]{this, cell});
            return;
        }
        q.c(cell, "cell");
        this.n = true;
        w().add(cell);
        cell.combo = this;
    }

    public void a(int i, List<BaseCellBean> cellList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52638a8c", new Object[]{this, new Integer(i), cellList});
            return;
        }
        q.c(cellList, "cellList");
        this.n = true;
        w().addAll(i, cellList);
        for (BaseCellBean baseCellBean : cellList) {
            baseCellBean.combo = this;
        }
    }

    public void a(List<BaseCellBean> cellList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, cellList});
            return;
        }
        q.c(cellList, "cellList");
        a(w().size(), cellList);
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        this.n = true;
        w().clear();
    }

    public final BaseCellBean o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("3cd5dfb", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.d.size()) {
            return this.d.get(i);
        }
        return null;
    }

    public void a(a combo) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a577c64", new Object[]{this, combo});
            return;
        }
        q.c(combo, "combo");
        a(combo.w());
        if (!this.i && !combo.i) {
            z = false;
        }
        this.i = z;
    }

    public void b(a combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dff4fe5", new Object[]{this, combo});
            return;
        }
        q.c(combo, "combo");
        w().clear();
        a(combo.w());
        this.i = combo.i;
        this.h = combo.h;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.h;
        if (bool != null) {
            if (bool == null) {
                q.a();
            }
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public void a(BaseCellBean baseCellBean, BaseCellBean newBean) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23816c8c", new Object[]{this, baseCellBean, newBean});
            return;
        }
        q.c(newBean, "newBean");
        w().set(p.a((List<? extends BaseCellBean>) w(), baseCellBean), newBean);
        newBean.combo = this;
        if (this.i || newBean.isSection) {
            z = true;
        }
        this.i = z;
        this.n = true;
    }

    public boolean c(BaseCellBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64687cc0", new Object[]{this, bean})).booleanValue();
        }
        q.c(bean, "bean");
        int indexOf = w().indexOf(bean);
        if (indexOf < 0) {
            return false;
        }
        w().remove(indexOf);
        this.n = true;
        return true;
    }

    public boolean a(BaseCellBean bean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a479330d", new Object[]{this, bean, new Integer(i)})).booleanValue();
        }
        q.c(bean, "bean");
        if (i < 0) {
            i = 0;
        } else if (i > w().size()) {
            i = w().size();
        }
        w().add(i, bean);
        this.n = true;
        return true;
    }
}
