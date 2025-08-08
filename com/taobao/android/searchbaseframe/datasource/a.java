package com.taobao.android.searchbaseframe.datasource;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.android.searchbaseframe.datasource.c;
import com.taobao.android.searchbaseframe.datasource.param.SearchParam;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.weex_framework.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.dpl;
import tb.imn;
import tb.ioy;
import tb.isl;
import tb.ism;
import tb.isv;
import tb.itv;
import tb.itw;
import tb.ity;
import tb.jvm;
import tb.jyz;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class a<RESULT extends SearchResult, PARAM extends SearchParam, LOCAL extends LocalDataManager> implements c<RESULT, PARAM, LOCAL> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static int DS_ID = 0;
    private static final String LOG_TAG = "AbsSearchDatasource";
    public ism<RESULT> mAdapter;
    private String mBundleUrl;
    @Deprecated
    private c.a mCacheProvider;
    private imn mCore;
    private Map<String, String> mDebugParams;
    private final a<?, ?, ?> mDelegate;
    public int mDsTokenId;
    private de.greenrobot.event.c mEventBus;
    private com.taobao.android.searchbaseframe.track.d mFirstRequestPerf;
    private boolean mIsDestroyed;
    private boolean mIsFirstSearch;
    private boolean mIsTaskRunning;
    private RESULT mLastResult;
    private Map<String, String> mLatestParamsSnapshot;
    private ListStyle mListStyle;
    @Deprecated
    private boolean mLoadNextInCacheEnabled;
    private LOCAL mLocalDataManager;
    private IPager mPager;
    private int mRequestCount;
    private PARAM mSearchParam;
    private a<RESULT, PARAM, LOCAL>.b mSearchTask;
    private ConcurrentHashMap<String, jvm.c> mTemplateFiles;
    private Map<String, TemplateBean> mTemplates;
    private final List<itw> mTemplatesLoadListeners;
    private RESULT mTotalResult;
    @Deprecated
    private volatile boolean mWaitingForDownload;
    private final itv mWeexInstanceManager;
    public d perfStaticsCallback;
    private ioy srpLifeCycleWatcher;

    public void asyncAppendParams(Map<String, String> map, C0571a c0571a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbb69bd", new Object[]{this, map, c0571a});
        }
    }

    public abstract Map<String, String> buildSearchParams(PARAM param);

    public void buildSearchParamsWithConfig(Map<String, String> map, C0571a c0571a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc63fd85", new Object[]{this, map, c0571a});
        }
    }

    /* renamed from: createResult */
    public abstract RESULT mo1015createResult(boolean z);

    public boolean enableEventBus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c633f434", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public abstract List<String> findNoTemplateCards(Map<String, TemplateBean> map, RESULT result);

    @Override // com.taobao.android.searchbaseframe.datasource.c
    public String getTrackingName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b87969a1", new Object[]{this}) : "search";
    }

    public boolean isMultiTasksMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bad986d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isSSEMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97ca1a49", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isTemplateParseAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4687a078", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract LOCAL onCreateLocalDataManager();

    /* renamed from: onCreateRequestAdapter */
    public abstract ism<RESULT> mo1220onCreateRequestAdapter();

    public abstract PARAM onCreateSearchParam();

    public abstract itv onCreateWeexInstanceManager();

    public void onNewTask(a<RESULT, PARAM, LOCAL>.b bVar, C0571a c0571a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ffc870e", new Object[]{this, bVar, c0571a});
        }
    }

    public void onPreSearchOfParams(C0571a c0571a, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa53f156", new Object[]{this, c0571a, map});
        }
    }

    public abstract void removeNoTemplateDataAndCheckRequire(Map<String, TemplateBean> map, RESULT result);

    public boolean shouldResetEventBus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b4a808d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ String access$000(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8108e53b", new Object[]{aVar}) : aVar.mBundleUrl;
    }

    public static /* synthetic */ boolean access$100(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a72c0ce8", new Object[]{aVar})).booleanValue() : aVar.mWaitingForDownload;
    }

    public static /* synthetic */ imn access$200(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("c913a6d9", new Object[]{aVar}) : aVar.mCore;
    }

    public static /* synthetic */ ConcurrentHashMap access$300(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("26736b04", new Object[]{aVar}) : aVar.mTemplateFiles;
    }

    public static /* synthetic */ Map access$400(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("1ae4e1f6", new Object[]{aVar}) : aVar.mTemplates;
    }

    public static /* synthetic */ void access$500(a aVar, SearchResult searchResult, C0571a c0571a, Map map, long j, com.taobao.android.searchbaseframe.track.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c451f5", new Object[]{aVar, searchResult, c0571a, map, new Long(j), dVar});
        } else {
            aVar.handleResult(searchResult, c0571a, map, j, dVar);
        }
    }

    public static /* synthetic */ void access$600(a aVar, com.taobao.android.searchbaseframe.track.d dVar, SearchResult searchResult, C0571a c0571a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902bdf75", new Object[]{aVar, dVar, searchResult, c0571a});
        } else {
            aVar.downloadTemplates(dVar, searchResult, c0571a);
        }
    }

    public imn getCore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("f78bd660", new Object[]{this}) : this.mCore;
    }

    public imn c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("1e695152", new Object[]{this}) : this.mCore;
    }

    static {
        kge.a(961684003);
        kge.a(1608123657);
        DS_ID = 1;
    }

    private de.greenrobot.event.c getEventBus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (de.greenrobot.event.c) ipChange.ipc$dispatch("f1ebedc0", new Object[]{this});
        }
        a<?, ?, ?> aVar = this.mDelegate;
        if (aVar != null) {
            return aVar.getEventBus();
        }
        return this.mEventBus;
    }

    public RESULT getLastSearchResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RESULT) ipChange.ipc$dispatch("1487eace", new Object[]{this}) : this.mLastResult;
    }

    public final void setLastResult(RESULT result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6119216a", new Object[]{this, result});
        } else {
            this.mLastResult = result;
        }
    }

    public RESULT getTotalSearchResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RESULT) ipChange.ipc$dispatch("969984d0", new Object[]{this}) : this.mTotalResult;
    }

    public void setTotalResult(RESULT result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2883c0", new Object[]{this, result});
        } else {
            this.mTotalResult = result;
        }
    }

    public void setSearchParam(PARAM param) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5632d0", new Object[]{this, param});
        } else if (param == null) {
        } else {
            this.mSearchParam = param;
        }
    }

    public final PARAM getCurrentParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PARAM) ipChange.ipc$dispatch("1026d9db", new Object[]{this}) : this.mSearchParam;
    }

    public Map<String, String> getLatestParamsSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("978a803", new Object[]{this});
        }
        if (this.mLatestParamsSnapshot == null) {
            this.mLatestParamsSnapshot = buildSearchParams(getCurrentParam());
        }
        return new HashMap(this.mLatestParamsSnapshot);
    }

    public final LOCAL getLocalDataManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LOCAL) ipChange.ipc$dispatch("2d07aafc", new Object[]{this}) : this.mLocalDataManager;
    }

    public void setLocalDataManager(LOCAL local) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9975f93c", new Object[]{this, local});
        } else if (local == null) {
        } else {
            this.mLocalDataManager = local;
        }
    }

    public final IPager getPager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPager) ipChange.ipc$dispatch("30d8585b", new Object[]{this}) : this.mPager;
    }

    public final void setPager(IPager iPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10514961", new Object[]{this, iPager});
        } else {
            this.mPager = iPager;
        }
    }

    public void setCurrentPage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18fd536", new Object[]{this, new Integer(i)});
        } else {
            this.mPager.setCurrentPage(i);
        }
    }

    public int getCurrentPage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9ddb71ec", new Object[]{this})).intValue() : this.mPager.getCurrentPage();
    }

    public final int getNextPage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("55f3e612", new Object[]{this})).intValue() : this.mPager.getNextPageNum();
    }

    public int getTotalResultCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("738c06fe", new Object[]{this})).intValue() : this.mPager.getTotalNum();
    }

    public final int getPageSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2822d620", new Object[]{this})).intValue() : this.mPager.getPageSize();
    }

    public boolean hasNextPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39d52367", new Object[]{this})).booleanValue();
        }
        RESULT result = this.mLastResult;
        if (result != null && !this.mLoadNextInCacheEnabled && result.isCache()) {
            return false;
        }
        return this.mPager.hasNextPage();
    }

    public final void setRequestAdapter(ism<RESULT> ismVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f941a856", new Object[]{this, ismVar});
        } else {
            this.mAdapter = ismVar;
        }
    }

    public void setTemplates(Map<String, TemplateBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2939c7", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.mTemplates = map;
        }
    }

    public void setTemplateFiles(ConcurrentHashMap<String, jvm.c> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d7e9b2", new Object[]{this, concurrentHashMap});
        } else if (concurrentHashMap == null) {
        } else {
            this.mTemplateFiles = concurrentHashMap;
        }
    }

    public ConcurrentHashMap<String, jvm.c> getTemplateFiles() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("1ef720b8", new Object[]{this}) : this.mTemplateFiles;
    }

    public jvm.c getTemplateFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvm.c) ipChange.ipc$dispatch("15514229", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return this.mTemplateFiles.get(str);
        }
        return null;
    }

    public ListStyle getUserListStyle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListStyle) ipChange.ipc$dispatch("e9fd2cb6", new Object[]{this}) : this.mListStyle;
    }

    public void setUserListStyle(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef10dd40", new Object[]{this, listStyle});
        } else {
            this.mListStyle = listStyle;
        }
    }

    public int getRequestCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a831bbb0", new Object[]{this})).intValue() : this.mRequestCount;
    }

    public void updateRequestCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("279739d3", new Object[]{this, new Integer(i)});
        } else {
            this.mRequestCount = i;
        }
    }

    public com.taobao.android.searchbaseframe.track.d getFirstRequestPerf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.track.d) ipChange.ipc$dispatch("eb0bbf6e", new Object[]{this}) : this.mFirstRequestPerf;
    }

    public void updateFirstRequestPerf(com.taobao.android.searchbaseframe.track.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8327d35", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            this.mFirstRequestPerf = dVar;
        }
    }

    public void setBundleUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9c479c", new Object[]{this, str});
        } else {
            this.mBundleUrl = str;
        }
    }

    public String getBundleUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dee20482", new Object[]{this}) : this.mBundleUrl;
    }

    public ioy getSrpLifeCycleWatcher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ioy) ipChange.ipc$dispatch("2abab05f", new Object[]{this}) : this.srpLifeCycleWatcher;
    }

    public final boolean isCacheEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46efd7b4", new Object[]{this})).booleanValue() : this.mCacheProvider != null;
    }

    public final void setCacheProvider(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd5da5", new Object[]{this, aVar});
        } else {
            this.mCacheProvider = aVar;
        }
    }

    public boolean isLoadNextInCacheEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b61e5b52", new Object[]{this})).booleanValue() : this.mLoadNextInCacheEnabled;
    }

    public void setLoadNextInCacheEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d04f0e", new Object[]{this, new Boolean(z)});
        } else {
            this.mLoadNextInCacheEnabled = z;
        }
    }

    public final void setWaitingForDownload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295f6b07", new Object[]{this, new Boolean(z)});
        } else {
            this.mWaitingForDownload = z;
        }
    }

    public a(imn imnVar) {
        this(imnVar, null, null);
    }

    public a(imn imnVar, ioy ioyVar) {
        this(imnVar, null, ioyVar);
    }

    public a(imn imnVar, a<?, ?, ?> aVar) {
        this(imnVar, aVar, null);
    }

    public a(imn imnVar, a<?, ?, ?> aVar, ioy ioyVar) {
        this.mEventBus = com.taobao.android.searchbaseframe.util.c.a();
        this.mTemplatesLoadListeners = new ArrayList();
        this.mPager = new Pager();
        this.mIsTaskRunning = false;
        this.mIsFirstSearch = true;
        this.mTemplates = new ConcurrentHashMap();
        this.mTemplateFiles = new ConcurrentHashMap<>();
        this.mListStyle = null;
        int i = DS_ID;
        DS_ID = i + 1;
        this.mDsTokenId = i;
        this.mIsDestroyed = false;
        this.mLoadNextInCacheEnabled = false;
        this.mWaitingForDownload = true;
        this.mDelegate = aVar;
        this.mCore = imnVar;
        this.srpLifeCycleWatcher = ioyVar;
        this.mSearchParam = onCreateSearchParam();
        this.mLocalDataManager = onCreateLocalDataManager();
        this.mAdapter = mo1220onCreateRequestAdapter();
        this.mWeexInstanceManager = onCreateWeexInstanceManager();
    }

    public boolean doNextPageSearch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb6afbe0", new Object[]{this})).booleanValue();
        }
        if (!this.mIsTaskRunning) {
            return searchInternal(C0571a.h());
        }
        return false;
    }

    public boolean doNextPageSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c51b2a98", new Object[]{this, jSONObject})).booleanValue();
        }
        if (!this.mIsTaskRunning) {
            return searchInternal(C0571a.a(jSONObject));
        }
        return false;
    }

    public boolean doNewSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d0ffe50", new Object[]{this, jSONObject})).booleanValue() : searchInternal(C0571a.b(jSONObject));
    }

    public boolean doNewSearchWithAssignPage(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1d3329ff", new Object[]{this, new Integer(i)})).booleanValue() : searchInternal(C0571a.a(i));
    }

    public boolean doNewSearch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4097f128", new Object[]{this})).booleanValue() : searchInternal(C0571a.i());
    }

    public boolean doRefreshListSearch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f9269161", new Object[]{this})).booleanValue() : searchInternal(C0571a.j());
    }

    public boolean doLoadCacheSearch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d307d304", new Object[]{this})).booleanValue() : searchInternal(C0571a.k());
    }

    public boolean doSilentNewSearch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dbb48313", new Object[]{this})).booleanValue() : searchInternal(C0571a.l());
    }

    public boolean doSilentNewSearch(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("967aa71d", new Object[]{this, str})).booleanValue() : searchInternal(C0571a.c(str));
    }

    public boolean doSilentNewSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("afb295c5", new Object[]{this, jSONObject})).booleanValue() : searchInternal(C0571a.c(jSONObject));
    }

    public boolean doPartialSearch(Set<String> set, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f027b5a", new Object[]{this, set, jSONObject})).booleanValue() : searchInternal(C0571a.a(set, jSONObject));
    }

    public boolean doSilentNextPageSearch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e183e4d5", new Object[]{this})).booleanValue() : searchInternal(C0571a.m());
    }

    public boolean doPreLoadNewSearch(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9b948ff", new Object[]{this, str})).booleanValue() : searchInternal(C0571a.b(str));
    }

    public boolean doPreLoadNewSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d803b3a3", new Object[]{this, jSONObject})).booleanValue() : searchInternal(C0571a.b(jSONObject));
    }

    public boolean doLoadCacheSearch(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b09e3cce", new Object[]{this, str})).booleanValue() : searchInternal(C0571a.g().a(true).d(true).e(true).a(str).a());
    }

    public boolean doLoadCacheSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("872cc7f4", new Object[]{this, jSONObject})).booleanValue() : searchInternal(C0571a.g().a(true).d(true).e(true).a(jSONObject).a());
    }

    public boolean searchInternal(C0571a c0571a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50eaf3b7", new Object[]{this, c0571a})).booleanValue();
        }
        boolean z = c0571a.f14968a;
        boolean z2 = c0571a.c;
        boolean z3 = c0571a.d;
        boolean z4 = c0571a.e;
        Object obj = c0571a.i;
        if (isMultiTasksMode()) {
            this.mIsTaskRunning = false;
        }
        if (obj != null && !(obj instanceof String) && !(obj instanceof JSONObject)) {
            throw new IllegalArgumentException("preLoad must be String or JSONObject(fastjson)");
        }
        if (this.mIsTaskRunning) {
            if (!c0571a.f) {
                k.e("[XS.request]", "[Request][Datasource:%d][token:%d] Request skipped, last search not finished", Integer.valueOf(this.mDsTokenId), Integer.valueOf(c0571a.j));
                return false;
            }
            cancelCurrent();
        }
        this.mIsTaskRunning = true;
        ioy ioyVar = this.srpLifeCycleWatcher;
        if (ioyVar != null) {
            ioyVar.a(z);
            this.srpLifeCycleWatcher.a();
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.taobao.android.searchbaseframe.track.d dVar = new com.taobao.android.searchbaseframe.track.d();
        dVar.c = getTrackingName();
        dVar.e = currentTimeMillis;
        dVar.o = jyz.a();
        boolean z5 = z3 && this.mCacheProvider != null;
        k b2 = c().b();
        Object[] objArr = new Object[5];
        objArr[0] = Boolean.valueOf(z);
        objArr[1] = Boolean.valueOf(z5);
        objArr[2] = Boolean.valueOf(z4);
        objArr[3] = Boolean.valueOf(z2);
        objArr[4] = Boolean.valueOf(obj != null);
        b2.c(LOG_TAG, "SEARCH [start] <isNew: %b> <cache: %b> <silent: %b> <refreshList: %b> <preLoad: %b>", objArr);
        if (z && !z4 && !c0571a.f()) {
            this.mLastResult = null;
            this.mTotalResult = null;
        }
        onPreSearch(c0571a);
        Map<String, String> buildSearchParams = buildSearchParams(this.mSearchParam);
        buildSearchParamsWithConfig(buildSearchParams, c0571a);
        this.mLatestParamsSnapshot = new HashMap(buildSearchParams);
        onPreSearchOfParams(c0571a, buildSearchParams);
        if (this.mCore.a().c()) {
            this.mDebugParams = buildSearchParams;
        }
        k.d("[XS.request]", "[Request][Datasource:%d][token:%d] Request start, params: %s", Integer.valueOf(this.mDsTokenId), Integer.valueOf(c0571a.j), buildSearchParams);
        this.mSearchTask = new b(c0571a, buildSearchParams, this.mCacheProvider, this.mAdapter, currentTimeMillis, dVar);
        onNewTask(this.mSearchTask, c0571a);
        this.mSearchTask.executeOnExecutor(getExecutor(c0571a), new Void[0]);
        this.mRequestCount++;
        if (c0571a.f()) {
            triggerPartialBefore(c0571a);
        } else {
            triggerBefore(z, z4, z5);
        }
        return true;
    }

    public Executor getExecutor(C0571a c0571a) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Executor) ipChange.ipc$dispatch("3a28ec35", new Object[]{this, c0571a}) : this.mCore.c().k().e;
    }

    public void onPreSearch(C0571a c0571a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4db7554c", new Object[]{this, c0571a});
        } else if (!c0571a.f14968a && (!c0571a.f() || !c0571a.h.contains("listItems"))) {
        } else {
            if (c0571a.b > 0) {
                this.mPager.resetWithAssignPage(c0571a.b);
            } else {
                this.mPager.reset();
            }
        }
    }

    private void checkAndCallbackFinishedResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d0506a", new Object[]{this});
            return;
        }
        a<RESULT, PARAM, LOCAL>.b bVar = this.mSearchTask;
        if (bVar == null) {
            k.e(LOG_TAG, "there is no task");
        } else if (bVar.getStatus() != AsyncTask.Status.FINISHED) {
            k.e(LOG_TAG, "the task is not finished");
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.searchbaseframe.datasource.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    k.e(a.LOG_TAG, "callback the task");
                    a.this.triggerAfter(true, false, false);
                }
            });
        }
    }

    public void subscribePreSearch(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7648c19f", new Object[]{this, obj, new Integer(i)});
            return;
        }
        subscribe(obj, i);
        checkAndCallbackFinishedResult();
    }

    public final void subscribe(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f215636", new Object[]{this, obj, new Integer(i)});
        } else {
            getEventBus().a(obj, i);
        }
    }

    public void subscribe(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6c6a6d", new Object[]{this, obj});
        } else {
            getEventBus().a(obj);
        }
    }

    public final void unsubscribe(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c0c8b4", new Object[]{this, obj});
        } else {
            getEventBus().c(obj);
        }
    }

    public boolean isSubscribed(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("15dd96cb", new Object[]{this, obj})).booleanValue() : getEventBus().b(obj);
    }

    public final void triggerBefore(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc4c0b36", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (!enableEventBus()) {
        } else {
            if (z2) {
                getEventBus().d(isv.m.a(z, z3, this));
            } else {
                getEventBus().d(isv.b.a(z, z3, this));
            }
        }
    }

    public final void triggerAfter(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902ec2e9", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (!enableEventBus()) {
        } else {
            if (z2) {
                getEventBus().d(isv.l.a(z, z3, this));
            } else {
                getEventBus().d(isv.a.a(z, z3, this));
            }
        }
    }

    private void triggerPartialBefore(C0571a c0571a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7afbf50", new Object[]{this, c0571a});
        } else if (!enableEventBus()) {
        } else {
            getEventBus().d(isv.j.a(this, c0571a.h));
        }
    }

    private void triggerPartialAfter(C0571a c0571a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9efa15c5", new Object[]{this, c0571a});
        } else if (!enableEventBus()) {
        } else {
            getEventBus().d(isv.i.a(this, c0571a.h));
        }
    }

    public void triggerRefreshList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136add48", new Object[]{this});
        } else if (!enableEventBus()) {
        } else {
            getEventBus().d(isv.k.a());
        }
    }

    public void postEvent(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e40efd", new Object[]{this, obj});
        } else {
            getEventBus().d(obj);
        }
    }

    public RESULT doSseSearchRequest(final C0571a c0571a, final Map<String, String> map, ism<RESULT> ismVar, final long j, final com.taobao.android.searchbaseframe.track.d dVar, final AsyncTask<Void, Void, RESULT> asyncTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RESULT) ipChange.ipc$dispatch("9a21f2a9", new Object[]{this, c0571a, map, ismVar, new Long(j), dVar, asyncTask});
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final ArrayList arrayList = new ArrayList(1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ismVar.a(map, c0571a, (isl) new isl<RESULT>() { // from class: com.taobao.android.searchbaseframe.datasource.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.isl
            public void a(final RESULT result) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d319fde", new Object[]{this, result});
                    return;
                }
                try {
                    Map<String, TemplateBean> templates = result.getTemplates();
                    if (templates != null) {
                        String extractPageNameFrom = a.this.extractPageNameFrom(result);
                        r rVar = new r();
                        rVar.a(a.access$000(a.this));
                        rVar.b(extractPageNameFrom);
                        if (a.access$100(a.this)) {
                            ity.a(rVar, templates, a.access$200(a.this), a.access$300(a.this));
                        } else {
                            ity.b(rVar, templates, a.access$200(a.this), a.access$300(a.this));
                        }
                        a.this.mergeTemplates(templates);
                        List<String> findNoTemplateCards = a.this.findNoTemplateCards(a.access$400(a.this), result);
                        if (findNoTemplateCards != null && findNoTemplateCards.size() > 0) {
                            for (String str : findNoTemplateCards) {
                                jvm.c a2 = dpl.a().a(str);
                                if (a2 != null) {
                                    a.access$300(a.this).put(a2.b(), a2);
                                }
                            }
                        }
                        a.this.removeNoTemplateDataAndCheckRequire(a.access$400(a.this), result);
                    }
                } catch (Exception unused) {
                }
                if (result.isSseFinished()) {
                    atomicBoolean.set(true);
                    arrayList.add(result);
                    countDownLatch.countDown();
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.searchbaseframe.datasource.a.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.access$500(a.this, result, c0571a, map, j, dVar);
                        }
                    }
                });
            }

            @Override // tb.isl
            public void b(RESULT result) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bf7c54bd", new Object[]{this, result});
                    return;
                }
                arrayList.add(result);
                countDownLatch.countDown();
            }

            @Override // tb.isl
            public void c(RESULT result) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("41c7099c", new Object[]{this, result});
                } else if (atomicBoolean.get()) {
                } else {
                    arrayList.add(result);
                    countDownLatch.countDown();
                }
            }

            @Override // tb.isl
            public RESULT a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (RESULT) ipChange2.ipc$dispatch("9ea9561e", new Object[]{this});
                }
                RESULT result = (RESULT) a.this.mo1015createResult(c0571a.f14968a);
                result.setSearchConfig(c0571a);
                result.setSseMode(true);
                return result;
            }

            @Override // tb.isl
            public boolean b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : asyncTask.isCancelled();
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception unused) {
        }
        if (arrayList.isEmpty()) {
            RESULT mo1015createResult = mo1015createResult(c0571a.f14968a);
            mo1015createResult.setResultError(new ResultError(0, ""));
            return mo1015createResult;
        }
        return (RESULT) arrayList.get(0);
    }

    private void downloadTemplates(com.taobao.android.searchbaseframe.track.d dVar, RESULT result, C0571a c0571a) {
        jvm.d b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df33d58e", new Object[]{this, dVar, result, c0571a});
            return;
        }
        k.d("[XS.request]", "[Request][Datasource:%d][token:%d] Template download start", Integer.valueOf(this.mDsTokenId), Integer.valueOf(c0571a.j));
        long currentTimeMillis = System.currentTimeMillis();
        ioy ioyVar = this.srpLifeCycleWatcher;
        if (ioyVar != null) {
            ioyVar.g(null);
        }
        Map<String, TemplateBean> templates = result.getTemplates();
        if (templates != null) {
            String extractPageNameFrom = extractPageNameFrom(result);
            r rVar = new r();
            rVar.a(this.mBundleUrl);
            rVar.b(extractPageNameFrom);
            if (this.mWaitingForDownload) {
                b2 = ity.a(rVar, templates, this.mCore, this.mTemplateFiles);
            } else {
                b2 = ity.b(rVar, templates, this.mCore, this.mTemplateFiles);
            }
            dVar.k = b2.b;
            dVar.l = b2.c;
            dVar.j = b2.d;
        }
        ioy ioyVar2 = this.srpLifeCycleWatcher;
        if (ioyVar2 != null) {
            ioyVar2.a(dVar.j, (Map<String, String>) null);
        }
        k.d("[XS.request]", "[Request][Datasource:%d][token:%d] Template download finished, count: %d, timecost: %d", Integer.valueOf(this.mDsTokenId), Integer.valueOf(c0571a.j), Integer.valueOf(dVar.k), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        mergeTemplates(templates);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RESULT doSearchRequest(final com.taobao.android.searchbaseframe.datasource.a.C0571a r20, java.util.Map<java.lang.String, java.lang.String> r21, tb.ism<RESULT> r22, long r23, final com.taobao.android.searchbaseframe.track.d r25, com.taobao.android.searchbaseframe.datasource.c.a r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.searchbaseframe.datasource.a.doSearchRequest(com.taobao.android.searchbaseframe.datasource.a$a, java.util.Map, tb.ism, long, com.taobao.android.searchbaseframe.track.d, com.taobao.android.searchbaseframe.datasource.c$a):com.taobao.android.searchbaseframe.datasource.result.SearchResult");
    }

    public boolean onPostRequest(RESULT result, C0571a c0571a, long j, com.taobao.android.searchbaseframe.track.d dVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("540c2155", new Object[]{this, result, c0571a, new Long(j), dVar})).booleanValue();
        }
        if (!c0571a.e) {
            updateResult(result, c0571a.f14968a);
            z = true;
        } else {
            z = false;
        }
        if (result.isFailed()) {
            this.mIsTaskRunning = false;
            return z;
        }
        if (c0571a.e) {
            updateResult(result, c0571a.f14968a);
        }
        onMergeResult(result, c0571a);
        onPostSearch(c0571a.f14968a, this.mTotalResult, result);
        dVar.d = extractPageNameFrom(result);
        long currentTimeMillis = System.currentTimeMillis();
        dVar.f = currentTimeMillis;
        dVar.g = currentTimeMillis - dVar.e;
        dVar.n = result.getPageNo();
        this.mIsTaskRunning = false;
        dVar.m = this.mIsFirstSearch;
        c().o().d(dVar);
        this.mIsFirstSearch = false;
        if (this.mFirstRequestPerf == null && result.isSuccess()) {
            this.mFirstRequestPerf = dVar;
        }
        return true;
    }

    public void onMergeResult(RESULT result, C0571a c0571a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73ebb96", new Object[]{this, result, c0571a});
        } else if (c0571a.f()) {
            this.mTotalResult.partialMerge(c0571a.h, result);
        } else if (c0571a.f14968a) {
        } else {
            this.mTotalResult.merge(result);
        }
    }

    public String extractPageNameFrom(RESULT result) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f9fa7c6", new Object[]{this, result}) : getTrackingName();
    }

    public String getTrackingPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13f4b452", new Object[]{this}) : getTotalSearchResult() == null ? "" : extractPageNameFrom(this.mLastResult);
    }

    public void updateResult(RESULT result, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80d239b", new Object[]{this, result, new Boolean(z)});
            return;
        }
        this.mLastResult = result;
        if (!z) {
            return;
        }
        this.mTotalResult = result;
    }

    public void onPostSearch(boolean z, RESULT result, RESULT result2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f5ba6", new Object[]{this, new Boolean(z), result, result2});
            return;
        }
        this.mPager.increasePage();
        if (z) {
            this.mPager.setTotalNum(result.getTotalResult());
            this.mPager.setPageSize(result.getPageSize());
        }
        if (result2.isPageFinished() || (!this.mLoadNextInCacheEnabled && result2.isCache())) {
            this.mPager.setFinished();
        } else {
            this.mPager.setNotFinished();
        }
        for (itw itwVar : this.mTemplatesLoadListeners) {
            itwVar.a(result2.getTemplates());
        }
    }

    public void mergeTemplates(Map<String, TemplateBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fcfa49d", new Object[]{this, map});
        } else {
            c().e().a(this.mTemplates, map);
        }
    }

    public void registerTemplateLoadListener(itw itwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aca79e2", new Object[]{this, itwVar});
        } else {
            this.mTemplatesLoadListeners.add(itwVar);
        }
    }

    public TemplateBean getTemplate(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateBean) ipChange.ipc$dispatch("5cdb49ef", new Object[]{this, str}) : this.mTemplates.get(str);
    }

    public Map<String, TemplateBean> getAllTemplates() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8e72f80a", new Object[]{this}) : this.mTemplates;
    }

    public final void addWeexInstance(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d6485a", new Object[]{this, obj});
            return;
        }
        itv itvVar = this.mWeexInstanceManager;
        if (itvVar == null) {
            return;
        }
        itvVar.a(obj);
    }

    public void removeWeexInstance(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7320f7d", new Object[]{this, obj});
            return;
        }
        itv itvVar = this.mWeexInstanceManager;
        if (itvVar == null) {
            return;
        }
        itvVar.b(obj);
    }

    public boolean isFirstSearchDone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9666aa1b", new Object[]{this})).booleanValue() : this.mSearchTask != null;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.mIsDestroyed) {
        } else {
            this.mIsDestroyed = true;
            a<RESULT, PARAM, LOCAL>.b bVar = this.mSearchTask;
            if (bVar != null) {
                bVar.cancel(true);
                this.mSearchTask = null;
            }
            itv itvVar = this.mWeexInstanceManager;
            if (itvVar != null) {
                itvVar.a();
            }
            if (this.mDelegate != null || !shouldResetEventBus()) {
                return;
            }
            this.mEventBus = com.taobao.android.searchbaseframe.util.c.a();
        }
    }

    public void saveInstance(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e442c77b", new Object[]{this, bundle});
            return;
        }
        bundle.putParcelable("1", this.mLastResult);
        bundle.putParcelable("2", this.mTotalResult);
        bundle.putSerializable("3", this.mSearchParam);
        bundle.putParcelable("4", this.mLocalDataManager);
        bundle.putSerializable("5", this.mPager);
        Bundle bundle2 = new Bundle(this.mTemplates.size());
        for (Map.Entry<String, TemplateBean> entry : this.mTemplates.entrySet()) {
            bundle2.putSerializable(entry.getKey(), entry.getValue());
        }
        bundle.putBundle("6", bundle2);
        bundle.putSerializable("7", this.mListStyle);
    }

    public void restoreInstance(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbdfd44a", new Object[]{this, bundle});
            return;
        }
        this.mLastResult = (RESULT) bundle.getParcelable("1");
        RESULT result = this.mLastResult;
        if (result != null) {
            result.setCore(c());
        }
        this.mTotalResult = (RESULT) bundle.getParcelable("2");
        RESULT result2 = this.mTotalResult;
        if (result2 != null) {
            result2.setCore(c());
        }
        this.mSearchParam = (PARAM) bundle.getSerializable("3");
        this.mLocalDataManager = (LOCAL) bundle.getParcelable("4");
        this.mPager = (Pager) bundle.getSerializable("5");
        Bundle bundle2 = bundle.getBundle("6");
        for (String str : bundle2.keySet()) {
            this.mTemplates.put(str, (TemplateBean) bundle2.getSerializable(str));
        }
        this.mListStyle = (ListStyle) bundle.getSerializable("7");
    }

    /* loaded from: classes6.dex */
    public final class b extends AsyncTask<Void, Void, RESULT> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final long b;
        private final com.taobao.android.searchbaseframe.track.d c;
        private final c.a d;
        private final C0571a e;
        private Map<String, String> f;
        private ism<RESULT> g;
        private boolean h = false;

        static {
            kge.a(22033550);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ Object doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, obj});
            } else {
                a((b) ((SearchResult) obj));
            }
        }

        public b(C0571a c0571a, Map<String, String> map, c.a aVar, ism<RESULT> ismVar, long j, com.taobao.android.searchbaseframe.track.d dVar) {
            this.e = c0571a;
            this.f = map;
            this.g = ismVar;
            this.b = j;
            this.c = dVar;
            this.d = aVar;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : isCancelled() || this.h;
        }

        public RESULT a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RESULT) ipChange.ipc$dispatch("9260120a", new Object[]{this, voidArr});
            }
            if (isCancelled()) {
                RESULT result = (RESULT) a.this.mo1015createResult(this.e.f14968a);
                result.setResultError(new ResultError(2));
                return result;
            }
            a.this.asyncAppendParams(this.f, this.e);
            if (this.e.g) {
                return (RESULT) a.this.doSseSearchRequest(this.e, this.f, this.g, this.b, this.c, this);
            }
            return (RESULT) a.this.doSearchRequest(this.e, this.f, this.g, this.b, this.c, this.d);
        }

        public void a(RESULT result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d319fde", new Object[]{this, result});
                return;
            }
            this.c.C = System.currentTimeMillis();
            if (isCancelled()) {
                this.h = true;
                return;
            }
            a.access$500(a.this, result, this.e, this.f, this.b, this.c);
            this.h = true;
        }
    }

    private void handleResult(RESULT result, C0571a c0571a, Map<String, String> map, long j, com.taobao.android.searchbaseframe.track.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9fccd01", new Object[]{this, result, c0571a, map, new Long(j), dVar});
            return;
        }
        boolean onPostRequest = onPostRequest(result, c0571a, j, dVar);
        if (!result.isSseMode()) {
            c().o().d(com.taobao.android.searchbaseframe.track.c.a(result, this, getResultTrackArgs(map)));
        }
        if (result.isSuccess()) {
            k.d("[XS.request]", "[Request][Datasource:%d][token:%d] Request finished, summary: %s", Integer.valueOf(this.mDsTokenId), Integer.valueOf(c0571a.j), result);
        } else {
            k.f("[XS.request]", "[Request][Datasource:%d][token:%d] Request failed, error: %s", Integer.valueOf(this.mDsTokenId), Integer.valueOf(c0571a.j), result.getError());
        }
        onTriggerEventAfterSearchTask(c0571a, result, onPostRequest);
    }

    public Map<String, String> getResultTrackArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7baebd7e", new Object[]{this, map}) : new HashMap();
    }

    public void onTriggerEventAfterSearchTask(C0571a c0571a, RESULT result, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f37e5e", new Object[]{this, c0571a, result, new Boolean(z)});
        } else if (!z) {
        } else {
            if (c0571a.f()) {
                triggerPartialAfter(c0571a);
            } else if (c0571a.c) {
                triggerRefreshList();
            } else {
                triggerAfter(c0571a.f14968a, c0571a.e, result.isCache());
            }
        }
    }

    public boolean isTaskRunning() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fa36517b", new Object[]{this})).booleanValue() : this.mIsTaskRunning;
    }

    public void cancelCurrent() {
        a<RESULT, PARAM, LOCAL>.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed366a6", new Object[]{this});
        } else if (!this.mIsTaskRunning || (bVar = this.mSearchTask) == null) {
        } else {
            bVar.cancel(false);
            c().b().d(LOG_TAG, "Task cancel");
        }
    }

    /* renamed from: com.taobao.android.searchbaseframe.datasource.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0571a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static int k;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f14968a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final Set<String> h;
        public final Object i;
        public final int j;

        static {
            kge.a(-774511605);
            k = 1;
        }

        public C0571a(C0572a c0572a) {
            int i = k;
            k = i + 1;
            this.j = i;
            this.f14968a = C0572a.b(c0572a);
            this.c = C0572a.c(c0572a);
            this.d = C0572a.d(c0572a);
            this.e = C0572a.a(c0572a);
            this.i = C0572a.e(c0572a);
            this.h = c0572a.f14969a;
            this.f = C0572a.f(c0572a);
            this.b = C0572a.g(c0572a);
            this.g = C0572a.h(c0572a);
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.h != null;
        }

        public static C0572a g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0572a) ipChange.ipc$dispatch("f20300c0", new Object[0]) : new C0572a();
        }

        public static C0571a h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0571a) ipChange.ipc$dispatch("eef9c39e", new Object[0]) : g().a(false).a();
        }

        public static C0571a a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0571a) ipChange.ipc$dispatch("861e65b3", new Object[]{obj}) : g().a(false).a(obj).a();
        }

        public static C0571a b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0571a) ipChange.ipc$dispatch("4d2a4cb4", new Object[]{obj}) : g().a(true).a(obj).a();
        }

        public static C0571a i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0571a) ipChange.ipc$dispatch("184e18df", new Object[0]) : g().a(true).a();
        }

        public static C0571a a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0571a) ipChange.ipc$dispatch("9f5fc34a", new Object[]{new Integer(i)}) : g().a(true).a(i).a();
        }

        public static C0571a j() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0571a) ipChange.ipc$dispatch("41a26e20", new Object[0]) : g().a(true).c(true).f(true).a();
        }

        public static C0571a k() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0571a) ipChange.ipc$dispatch("6af6c361", new Object[0]) : g().a(true).d(true).a();
        }

        public static C0571a l() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0571a) ipChange.ipc$dispatch("944b18a2", new Object[0]) : g().a(true).e(true).a();
        }

        public static C0571a c(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0571a) ipChange.ipc$dispatch("143633b5", new Object[]{obj}) : g().a(true).e(true).a(obj).a();
        }

        public static C0571a m() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0571a) ipChange.ipc$dispatch("bd9f6de3", new Object[0]) : g().e(true).a();
        }

        public static C0571a a(Set<String> set, Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0571a) ipChange.ipc$dispatch("349c4722", new Object[]{set, obj}) : g().a(false).e(true).a(set).a(obj).a();
        }

        /* renamed from: com.taobao.android.searchbaseframe.datasource.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static class C0572a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public Set<String> f14969a;
            private boolean b;
            private int c;
            private boolean d;
            private boolean e;
            private boolean f;
            private boolean g;
            private boolean h;
            private Object i;

            static {
                kge.a(-1958117406);
            }

            public static /* synthetic */ boolean a(C0572a c0572a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b79df2be", new Object[]{c0572a})).booleanValue() : c0572a.f;
            }

            public static /* synthetic */ boolean b(C0572a c0572a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("448b09dd", new Object[]{c0572a})).booleanValue() : c0572a.b;
            }

            public static /* synthetic */ boolean c(C0572a c0572a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d17820fc", new Object[]{c0572a})).booleanValue() : c0572a.d;
            }

            public static /* synthetic */ boolean d(C0572a c0572a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5e65381b", new Object[]{c0572a})).booleanValue() : c0572a.e;
            }

            public static /* synthetic */ Object e(C0572a c0572a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("b4f25abc", new Object[]{c0572a}) : c0572a.i;
            }

            public static /* synthetic */ boolean f(C0572a c0572a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("783f6659", new Object[]{c0572a})).booleanValue() : c0572a.g;
            }

            public static /* synthetic */ int g(C0572a c0572a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("52c7d67", new Object[]{c0572a})).intValue() : c0572a.c;
            }

            public static /* synthetic */ boolean h(C0572a c0572a) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("92199497", new Object[]{c0572a})).booleanValue() : c0572a.h;
            }

            public C0572a a(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0572a) ipChange.ipc$dispatch("51577be", new Object[]{this, new Boolean(z)});
                }
                this.b = z;
                return this;
            }

            public C0572a b(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0572a) ipChange.ipc$dispatch("92028edd", new Object[]{this, new Boolean(z)});
                }
                this.h = z;
                return this;
            }

            public C0572a a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0572a) ipChange.ipc$dispatch("467bce6d", new Object[]{this, new Integer(i)});
                }
                this.c = i;
                return this;
            }

            public C0572a c(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0572a) ipChange.ipc$dispatch("1eefa5fc", new Object[]{this, new Boolean(z)});
                }
                this.d = z;
                return this;
            }

            public C0572a d(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0572a) ipChange.ipc$dispatch("abdcbd1b", new Object[]{this, new Boolean(z)});
                }
                this.e = z;
                return this;
            }

            public C0572a e(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0572a) ipChange.ipc$dispatch("38c9d43a", new Object[]{this, new Boolean(z)});
                }
                this.f = z;
                return this;
            }

            public C0572a a(Set<String> set) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0572a) ipChange.ipc$dispatch("ac7f6a29", new Object[]{this, set});
                }
                this.f14969a = set;
                return this;
            }

            public C0572a a(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0572a) ipChange.ipc$dispatch("781b7a96", new Object[]{this, obj});
                }
                this.i = obj;
                return this;
            }

            public C0572a f(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0572a) ipChange.ipc$dispatch("c5b6eb59", new Object[]{this, new Boolean(z)});
                }
                this.g = z;
                return this;
            }

            public C0571a a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (C0571a) ipChange.ipc$dispatch("cdab6ed7", new Object[]{this}) : new C0571a(this);
            }
        }
    }

    public StringBuilder dumpDebugInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("baef482f", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("page: ");
        sb.append(this.mPager.getCurrentPage());
        sb.append('\n');
        sb.append("physics page: ");
        sb.append(this.mPager.getCurrentPhysicsPage());
        sb.append('\n');
        sb.append("Template总计: ");
        sb.append(this.mTemplates.size());
        sb.append('\n');
        sb.append("请求次数: ");
        sb.append(this.mRequestCount);
        sb.append('\n');
        return sb;
    }

    public JSONObject dumpDebugParamsInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("17a2339a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = this.mDebugParams;
        if (map != null) {
            jSONObject.putAll(map);
        }
        return jSONObject;
    }
}
