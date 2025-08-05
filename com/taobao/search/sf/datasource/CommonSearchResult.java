package com.taobao.search.sf.datasource;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.mmd.datasource.bean.SFOnesearchBean;
import com.taobao.search.mmd.datasource.bean.SearchBarBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.imn;
import tb.ioz;
import tb.kge;
import tb.ntg;
import tb.nvr;

/* loaded from: classes8.dex */
public class CommonSearchResult extends MetaResult<com.taobao.search.refactor.e> {
    public JSONArray carriedData;
    public Set<String> clearParams;
    public JSONObject copyPageInfo;
    public String crossShopRecPvUuid;
    public HashMap<String, SearchDomBean> domIcons;
    public com.taobao.search.sf.widgets.list.floatbar.b floatBarBean;
    public boolean guideSearch;
    public boolean guideSearchNative;
    public boolean hasGuideSearchTopHeader;
    public boolean hasTopHeader;
    public boolean isAddCartSupported;
    public boolean isAllVideoAutoPlay;
    public boolean isHalfStickySearchBar;
    public boolean isJarvisDataCache;
    public boolean isNewFilter;
    public boolean isPageTurning;
    private Boolean isPreDetail;
    public boolean isPrePaging;
    public boolean isPreciseAppear;
    public boolean isPullRefreshEnabled;
    public boolean isSaveListStyle;
    public boolean isServerAutoPlay;
    public boolean isUpdateUtparam;
    public ioz itemsArrayTraceDigest;
    public Map<String, String> jarvisFeature;
    public Map<String, ioz> layoutParseTraceDigestMap;
    protected final List<BaseCellBean> mBufferCells;
    private SFOnesearchBean mOnesearch;
    protected final List<BaseCellBean> mReplaceCells;
    private SearchBarBean mSearchBarInfo;
    public boolean mainSearch;
    public JSONObject negFeedbackActions;
    public boolean newSearch;
    public boolean newSearchNative;
    public nvr noResultMod;
    public String nxRawIcon;
    public JSONObject originData;
    public JSONObject pageData;
    public JSONObject pageInfo;
    public BaseTypedBean pkModuleBean;
    public String poplayerUrl;
    public MuiseBean popupBean;
    public int sceneStickyHeight;
    public String sessionId;
    public HashMap<String, String> sessionParams;
    public String spClientSession;
    public boolean subTabNewSearch;
    public JSONObject switches;
    public ioz tabParseTraceDigest;
    public ntg tabPromotionBean;
    public ioz templatesParseTraceDigest;
    public ioz topBarParseTraceDigest;
    public final Map<String, String> updateParams;

    static {
        kge.a(398693074);
    }

    @Override // com.taobao.android.meta.data.MetaResult
    protected boolean isMetaMode() {
        return false;
    }

    public void setPreDetail(Boolean bool) {
        this.isPreDetail = bool;
    }

    public boolean isPreDetail() {
        Boolean bool = this.isPreDetail;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public CommonSearchResult(imn imnVar, boolean z) {
        super(imnVar, z);
        this.mReplaceCells = new ArrayList();
        this.mBufferCells = new ArrayList();
        this.updateParams = new HashMap();
        this.tabPromotionBean = null;
        this.hasTopHeader = false;
        this.hasGuideSearchTopHeader = false;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean hasListResult() {
        return this.mCells.size() > 0;
    }

    public void setOnesearch(SFOnesearchBean sFOnesearchBean) {
        this.mOnesearch = sFOnesearchBean;
    }

    public SFOnesearchBean getOnesearch() {
        return this.mOnesearch;
    }

    public SearchBarBean getSearchBarInfo() {
        return this.mSearchBarInfo;
    }

    public void setSearchBarInfo(SearchBarBean searchBarBean) {
        this.mSearchBarInfo = searchBarBean;
    }

    public List<BaseCellBean> getReplaceCells() {
        return this.mReplaceCells;
    }

    public List<BaseCellBean> getBufferCells() {
        return this.mBufferCells;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.result.AbsSearchResult, com.taobao.android.searchbaseframe.datasource.result.SearchResult
    public boolean bizRuleNoResult() {
        return this.noResultMod != null;
    }
}
