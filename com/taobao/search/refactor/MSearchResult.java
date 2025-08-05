package com.taobao.search.refactor;

import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.List;
import java.util.Map;
import tb.imn;
import tb.kge;
import tb.noz;

/* loaded from: classes7.dex */
public final class MSearchResult extends CommonSearchResult {
    private boolean isRedirectMode;
    private String redirectUrl;
    private BaseTypedBean tabHeader;
    private boolean useNativeTopBar;

    static {
        kge.a(-98172487);
    }

    @Override // com.taobao.search.sf.datasource.CommonSearchResult, com.taobao.android.meta.data.MetaResult
    protected boolean isMetaMode() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MSearchResult(imn core, boolean z) {
        super(core, z);
        kotlin.jvm.internal.q.c(core, "core");
        this.redirectUrl = "";
    }

    public final boolean getUseNativeTopBar() {
        return this.useNativeTopBar;
    }

    public final void setUseNativeTopBar(boolean z) {
        this.useNativeTopBar = z;
    }

    public final BaseTypedBean getTabHeader() {
        return this.tabHeader;
    }

    public final void setTabHeader(BaseTypedBean baseTypedBean) {
        this.tabHeader = baseTypedBean;
    }

    public final boolean isRedirectMode() {
        return this.isRedirectMode;
    }

    public final void setRedirectMode(boolean z) {
        this.isRedirectMode = z;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.taobao.android.meta.data.MetaResult
    public void updateBarrier(e eVar) {
        if (eVar instanceof noz) {
            if (getBarrierBean() != null) {
                BaseCellBean barrierBean = getBarrierBean();
                if (barrierBean == null) {
                    kotlin.jvm.internal.q.a();
                }
                if (barrierBean.barrier) {
                    return;
                }
            }
            if (eVar.e()) {
                return;
            }
            noz nozVar = (noz) eVar;
            if (!(!nozVar.L().isEmpty())) {
                return;
            }
            setBarrierBean((BaseCellBean) kotlin.collections.p.j((List<? extends Object>) nozVar.L()));
            BaseCellBean barrierBean2 = getBarrierBean();
            if (barrierBean2 == null) {
                kotlin.jvm.internal.q.a();
            }
            barrierBean2.barrier = true;
            setBarrierIndex((this.mCells.size() - nozVar.J().size()) - 1);
        }
    }

    @Override // com.taobao.android.meta.data.MetaResult, com.taobao.android.searchbaseframe.datasource.result.AbsSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void setResultError(ResultError error) {
        Map<String, String> e;
        kotlin.jvm.internal.q.c(error, "error");
        a.C0571a searchConfig = getSearchConfig();
        String str = null;
        if (!(searchConfig instanceof com.taobao.android.meta.data.e)) {
            searchConfig = null;
        }
        com.taobao.android.meta.data.e eVar = (com.taobao.android.meta.data.e) searchConfig;
        if (eVar != null && (e = eVar.e()) != null) {
            str = e.get("searchType");
        }
        if (kotlin.jvm.internal.q.a((Object) str, (Object) "preload")) {
            return;
        }
        super.setResultError(error);
    }
}
