package com.taobao.android.meta.data;

import com.taobao.android.meta.data.a;
import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.meta.datasource.ComboOp;
import com.taobao.android.searchbaseframe.net.ResultError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.imn;
import tb.kge;

/* loaded from: classes6.dex */
public class MetaResult<C extends a> extends BaseSearchResult {
    private BaseCellBean barrierBean;
    private int barrierIndex;
    private final ArrayList<C> combos;
    private boolean footerChanged;
    private final ArrayList<BaseTypedBean> footers;
    private boolean headerChange;
    private boolean headerPartialRefresh;
    private final ArrayList<c> headers;

    static {
        kge.a(1742842224);
    }

    protected boolean isMetaMode() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaResult(imn core, boolean z) {
        super(core, z);
        q.c(core, "core");
        this.combos = new ArrayList<>(1);
        this.headers = new ArrayList<>(1);
        this.headerChange = true;
        this.footers = new ArrayList<>(1);
        this.footerChanged = true;
    }

    protected final ArrayList<C> getCombos() {
        return this.combos;
    }

    public final ArrayList<c> getHeaders() {
        return this.headers;
    }

    public final boolean getHeaderChange() {
        return this.headerChange;
    }

    public final void setHeaderChange(boolean z) {
        this.headerChange = z;
    }

    public final ArrayList<BaseTypedBean> getFooters() {
        return this.footers;
    }

    public final boolean getFooterChanged() {
        return this.footerChanged;
    }

    public final void setFooterChanged(boolean z) {
        this.footerChanged = z;
    }

    public final int getBarrierIndex() {
        return this.barrierIndex;
    }

    public final void setBarrierIndex(int i) {
        this.barrierIndex = i;
    }

    public final BaseCellBean getBarrierBean() {
        return this.barrierBean;
    }

    public final void setBarrierBean(BaseCellBean baseCellBean) {
        this.barrierBean = baseCellBean;
    }

    public final boolean getHeaderPartialRefresh() {
        return this.headerPartialRefresh;
    }

    public final void setHeaderPartialRefresh(boolean z) {
        this.headerPartialRefresh = z;
    }

    public List<ComboOp> updateItems() {
        getCells().clear();
        this.barrierIndex = 0;
        BaseCellBean baseCellBean = this.barrierBean;
        if (baseCellBean != null) {
            baseCellBean.barrier = false;
        }
        this.barrierBean = null;
        ArrayList arrayList = new ArrayList();
        Iterator<C> it = this.combos.iterator();
        while (it.hasNext()) {
            C combo = it.next();
            List<ComboOp> u = combo.u();
            if (u != null) {
                arrayList.addAll(u);
            }
            combo.a(getCells().size());
            getCells().addAll(combo.l());
            q.a((Object) combo, "combo");
            updateBarrier(combo);
        }
        return arrayList;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.AbsSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void setResultError(ResultError error) {
        a a2;
        q.c(error, "error");
        super.setResultError(error);
        a.C0571a searchConfig = getSearchConfig();
        if (!(searchConfig instanceof e)) {
            searchConfig = null;
        }
        e eVar = (e) searchConfig;
        if (eVar == null || (a2 = eVar.a()) == null) {
            return;
        }
        a2.a(error);
    }

    public List<BaseCellBean> getValidCells() {
        if (this.barrierBean == null) {
            return this.mCells;
        }
        return this.mCells.subList(0, this.barrierIndex + 1);
    }

    protected void updateBarrier(C combo) {
        q.c(combo, "combo");
        BaseCellBean baseCellBean = this.barrierBean;
        if (baseCellBean != null) {
            if (baseCellBean == null) {
                q.a();
            }
            if (baseCellBean.barrier) {
                return;
            }
        }
        if (combo.e() || !(!combo.l().isEmpty())) {
            return;
        }
        this.barrierBean = combo.l().get(combo.l().size() - 1);
        BaseCellBean baseCellBean2 = this.barrierBean;
        if (baseCellBean2 == null) {
            q.a();
        }
        baseCellBean2.barrier = true;
        this.barrierIndex = this.mCells.size() - 1;
    }

    public void addHeader(c header) {
        q.c(header, "header");
        this.headerChange = true;
        this.headers.add(header);
    }

    public void addHeaders(Collection<c> headers) {
        q.c(headers, "headers");
        this.headerChange = true;
        this.headers.addAll(headers);
    }

    public void addFooter(BaseTypedBean footer) {
        q.c(footer, "footer");
        this.footerChanged = true;
        this.footers.add(footer);
    }

    public void addCombo(C combo) {
        q.c(combo, "combo");
        combo.b(this.combos.size());
        this.combos.add(combo);
    }

    public void insertCombo(int i, C combo) {
        q.c(combo, "combo");
        this.combos.add(i, combo);
        int comboSize = comboSize();
        for (int i2 = 0; i2 < comboSize; i2++) {
            C combo2 = getCombo(i2);
            if (combo2 != null) {
                combo2.b(i2);
            }
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isPageFinished() {
        if (isMetaMode()) {
            Iterator<C> it = this.combos.iterator();
            while (it.hasNext()) {
                if (!it.next().e()) {
                    return false;
                }
            }
            return true;
        }
        return super.isPageFinished();
    }

    public C getCombo(int i) {
        int size = this.combos.size();
        if (i >= 0 && size > i) {
            return this.combos.get(i);
        }
        return null;
    }

    public C getLastCombo() {
        return (C) p.k((List<? extends Object>) this.combos);
    }

    public void clearCombos() {
        this.combos.clear();
    }

    public int comboSize() {
        return this.combos.size();
    }

    public void restore() {
        this.headerChange = true;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.AbsSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean isNew() {
        if (getSearchConfig() instanceof e) {
            a.C0571a searchConfig = getSearchConfig();
            if (searchConfig == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.data.MetaSearchConfig<*>");
            }
            e eVar = (e) searchConfig;
            return eVar.f14968a || eVar.d() || eVar.c() || eVar.b();
        }
        return super.isNew();
    }

    public List<c> getHeadersByType(String type) {
        q.c(type, "type");
        ArrayList arrayList = new ArrayList(this.headers.size());
        Iterator<c> it = this.headers.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (q.a((Object) next.a(), (Object) type)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
