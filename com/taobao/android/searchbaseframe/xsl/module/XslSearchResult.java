package com.taobao.android.searchbaseframe.xsl.module;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.c;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultLayoutInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import tb.htg;
import tb.imn;
import tb.kge;

/* loaded from: classes6.dex */
public class XslSearchResult extends MetaResult<htg> {
    private boolean isMetaMode;
    private boolean mAtmosphereAnim;
    private String mAtmosphereListBgColor;
    private String mAtmosphereType;
    private String mAtmosphereUrl;
    private JSONObject mCurrentData;
    private int mDefaultTabIndex;
    private final d mLayoutInfo;
    public ArrayList<c> tabHeaders;
    public ArrayList<c> topHeaders;

    static {
        kge.a(1264179711);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.AbsSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void partialMerge(Set<String> set, SearchResult searchResult) {
    }

    public XslSearchResult(imn imnVar, boolean z) {
        super(imnVar, z);
        this.mLayoutInfo = new d();
        this.mDefaultTabIndex = 0;
        this.topHeaders = new ArrayList<>();
        this.tabHeaders = new ArrayList<>();
        this.isMetaMode = false;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult
    public ResultLayoutInfoBean getThemeBean() {
        throw new IllegalStateException("You should not use themeBean");
    }

    public void setMetaMode(boolean z) {
        this.isMetaMode = z;
    }

    @Override // com.taobao.android.meta.data.MetaResult
    protected boolean isMetaMode() {
        return this.isMetaMode;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean hasListResult() {
        return this.mCells.size() > 0 || !this.mLayoutInfo.e.isEmpty() || !this.mLayoutInfo.d.isEmpty() || !this.mLayoutInfo.c.isEmpty();
    }

    public JSONObject getCurrentData() {
        return this.mCurrentData;
    }

    public void setCurrentData(JSONObject jSONObject) {
        this.mCurrentData = jSONObject;
    }

    public String getAtmosphereType() {
        return this.mAtmosphereType;
    }

    public void setAtmosphereType(String str) {
        this.mAtmosphereType = str;
    }

    public String getAtmosphereUrl() {
        return this.mAtmosphereUrl;
    }

    public void setAtmosphereUrl(String str) {
        this.mAtmosphereUrl = str;
    }

    public String getAtmosphereListBgColor() {
        return this.mAtmosphereListBgColor;
    }

    public void setAtmosphereListBgColor(String str) {
        this.mAtmosphereListBgColor = str;
    }

    public boolean isAtmosphereAnim() {
        return this.mAtmosphereAnim;
    }

    public void setAtmosphereAnim(boolean z) {
        this.mAtmosphereAnim = z;
    }

    public int getDefaultTabIndex() {
        return this.mDefaultTabIndex;
    }

    public void setDefaultTabIndex(int i) {
        this.mDefaultTabIndex = i;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public void merge(SearchResult searchResult) {
        super.merge(searchResult);
        mergeSection(searchResult);
    }

    private void mergeSection(SearchResult searchResult) {
        if (searchResult instanceof XslSearchResult) {
            XslSearchResult xslSearchResult = (XslSearchResult) searchResult;
            boolean z = false;
            setHasBarrier(xslSearchResult.hasBarrier() || hasBarrier());
            setHasSectionClip(xslSearchResult.hasSectionClip() || hasSectionClip());
            if (xslSearchResult.hasSections() || hasSections()) {
                z = true;
            }
            setHasSections(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult
    public void onCellMerge(BaseSearchResult baseSearchResult) {
        if ((baseSearchResult.getSearchConfig() instanceof XslDatasource.a) && ((XslDatasource.a) baseSearchResult.getSearchConfig()).a() >= 0) {
            int a2 = ((XslDatasource.a) baseSearchResult.getSearchConfig()).a();
            boolean z = ((XslDatasource.a) baseSearchResult.getSearchConfig()).o;
            int c = ((XslDatasource.a) baseSearchResult.getSearchConfig()).c();
            ((XslDatasource.a) baseSearchResult.getSearchConfig()).c(this.mCells.size());
            if (a2 < 0) {
                a2 = 0;
            }
            boolean z2 = ((XslDatasource.a) baseSearchResult.getSearchConfig()).n;
            if (c > 0) {
                int i = (a2 + c) - 1;
                if (i >= this.mCells.size()) {
                    i = this.mCells.size() - 1;
                    c().b().b("XslSearchResult", String.format(Locale.getDefault(), "updateListItems length过长，请修正,当前列表长度为%d,from=%d,length=%d", Integer.valueOf(this.mCells.size()), Integer.valueOf(a2), Integer.valueOf(c)));
                }
                addNewCells(baseSearchResult, retrieveOldCells(z2, i, a2), a2, z);
                return;
            }
            addNewCells(baseSearchResult, retrieveOldCells(z2, this.mCells.size() - 1, a2), a2, z);
            return;
        }
        super.onCellMerge(baseSearchResult);
    }

    private Map<Long, BaseCellBean> retrieveOldCells(boolean z, int i, int i2) {
        HashMap hashMap = z ? new HashMap(Math.max((i - i2) + 1, 1)) : null;
        while (i >= i2) {
            if (i >= 0 && i < this.mCells.size()) {
                BaseCellBean remove = this.mCells.remove(i);
                if (hashMap != null && remove.id > 0) {
                    hashMap.put(Long.valueOf(remove.id), remove);
                }
            }
            i--;
        }
        return hashMap;
    }

    private void addNewCells(BaseSearchResult baseSearchResult, Map<Long, BaseCellBean> map, int i, boolean z) {
        if (map == null || map.isEmpty()) {
            if (i > this.mCells.size()) {
                this.mCells.addAll(baseSearchResult.getCells());
                return;
            }
            try {
                this.mCells.addAll(i, baseSearchResult.getCells());
                return;
            } catch (IndexOutOfBoundsException e) {
                k.a("XslSearchResult.addNewCells", "from " + i + " size " + this.mCells.size(), e);
                return;
            }
        }
        int size = baseSearchResult.getCells().size();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            BaseCellBean baseCellBean = baseSearchResult.getCells().get(i2);
            BaseCellBean baseCellBean2 = map.get(Long.valueOf(baseCellBean.id));
            if (baseCellBean2 != null) {
                baseCellBean2.copyCellData(baseCellBean);
            }
            if (!z) {
                this.mCells.add(baseCellBean);
            } else {
                arrayList.add(baseCellBean);
            }
        }
        if (!z) {
            return;
        }
        this.mCells.addAll(i, arrayList);
    }
}
