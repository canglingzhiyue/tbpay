package com.taobao.android.searchbaseframe.xsl.module;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.util.k;
import java.util.HashMap;
import java.util.Map;
import tb.htg;
import tb.imn;
import tb.kge;

/* loaded from: classes6.dex */
public class XslDatasource extends com.taobao.android.meta.data.b<htg, XslSearchResult> implements LocalDataManager {
    public static final Parcelable.Creator<XslDatasource> CREATOR;
    protected boolean mIsFlatParams;
    private boolean mJsParamReady;
    private boolean mJsRequestEventFired;
    protected boolean mMetaMode;
    private int mTabIndex;
    protected final Map<String, String> mTppParams;
    private String mTrackingName;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public LocalDataManager onCreateLocalDataManager() {
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public XslDatasource(imn imnVar) {
        super(imnVar, null);
        this.mJsParamReady = false;
        this.mJsRequestEventFired = false;
        this.mTppParams = new HashMap();
        this.mTrackingName = "xsearchlist";
        this.mMetaMode = false;
    }

    public void setMetaMode() {
        this.mMetaMode = true;
        if (this.mAdapter instanceof f) {
            ((f) this.mAdapter).b();
        }
    }

    public void setTrackingName(String str) {
        this.mTrackingName = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.taobao.android.searchbaseframe.datasource.a
    /* renamed from: createResult  reason: collision with other method in class */
    public XslSearchResult mo1015createResult(boolean z) {
        XslSearchResult xslSearchResult = new XslSearchResult(c(), z);
        xslSearchResult.setMetaMode(this.mMetaMode);
        return xslSearchResult;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.a
    public void setBizParam(String str, String str2) {
        this.mTppParams.put(str, str2);
    }

    public void addBizParam(Map<String, String> map) {
        this.mTppParams.putAll(map);
    }

    public void setFlatParams(boolean z) {
        this.mIsFlatParams = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addTppPageParam(Map<String, String> map) {
        map.put("page", String.valueOf(getNextPage()));
        map.put("sversion", c().a().e());
        map.put("ttid", c().a().a());
        map.put("utd_id", c().a().b());
        Map<String, String> map2 = this.mTppParams;
        if (map2 != null) {
            map.putAll(map2);
        }
    }

    public void setApi(String str, String str2) {
        ((f) this.mAdapter).a(str, str2);
        if (!TextUtils.isEmpty(str)) {
            this.mJsParamReady = true;
        }
    }

    public void setApi(String str, String str2, String str3) {
        if (str3 == null) {
            setApi(str, str2);
            return;
        }
        ((f) this.mAdapter).a(str, str2, str3);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mJsParamReady = true;
    }

    public boolean isJsRequestEventFired() {
        return this.mJsRequestEventFired;
    }

    public void setJsRequestEventFired(boolean z) {
        this.mJsRequestEventFired = z;
    }

    public boolean isJsParamReady() {
        return this.mJsParamReady;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public Map<String, String> buildSearchParams(SearchParamImpl searchParamImpl) {
        Map<String, String> createUrlParams = searchParamImpl.createUrlParams();
        HashMap hashMap = new HashMap();
        addTppPageParam(hashMap);
        HashMap hashMap2 = new HashMap(createUrlParams);
        addFixParams(hashMap2);
        if (this.mIsFlatParams) {
            hashMap2.putAll(hashMap);
        } else {
            hashMap2.put("params", JSON.toJSONString(hashMap));
        }
        return hashMap2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public void onPreSearchOfParams(a.C0571a c0571a, Map<String, String> map) {
        super.onPreSearchOfParams(c0571a, map);
        if (c0571a.f() || c0571a.i != null) {
            return;
        }
        if (isFirstSearchDone()) {
            k.d("[XS.xsl]", "Next page request for tab: %d, page: %d, params: %s", Integer.valueOf(getCurrentTabIndex()), Integer.valueOf(getNextPage()), map);
        } else {
            k.d("[XS.xsl]", "First request for tab %d, params: %s", Integer.valueOf(getCurrentTabIndex()), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public boolean onPostRequest(XslSearchResult xslSearchResult, a.C0571a c0571a, long j, com.taobao.android.searchbaseframe.track.d dVar) {
        if (xslSearchResult.isFailed()) {
            k.f("[XS.xsl]", "Request Return for tab %d, page %d, error: %s", Integer.valueOf(getCurrentTabIndex()), Integer.valueOf(getNextPage()), xslSearchResult.getError());
        } else {
            k.d("[XS.xsl]", "Request Return for tab %d, page %d", Integer.valueOf(getCurrentTabIndex()), Integer.valueOf(getNextPage()));
        }
        if ((c0571a instanceof a) && getPager() != null) {
            getPager().decreasePage();
        }
        return super.onPostRequest((XslDatasource) xslSearchResult, c0571a, j, dVar);
    }

    protected void addFixParams(Map<String, String> map) {
        map.put("ttid", c().a().a());
        map.put("utd_id", c().a().b());
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a, com.taobao.android.searchbaseframe.datasource.c
    public String getTrackingName() {
        return this.mTrackingName;
    }

    static {
        kge.a(1447939295);
        kge.a(-1334742732);
        CREATOR = new Parcelable.Creator<XslDatasource>() { // from class: com.taobao.android.searchbaseframe.xsl.module.XslDatasource.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public XslDatasource a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (XslDatasource) ipChange.ipc$dispatch("9aa0ab37", new Object[]{this, parcel});
                }
                return null;
            }

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.searchbaseframe.xsl.module.XslDatasource] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ XslDatasource createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.android.searchbaseframe.xsl.module.XslDatasource[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ XslDatasource[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public XslDatasource[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (XslDatasource[]) ipChange.ipc$dispatch("af485e8", new Object[]{this, new Integer(i)}) : new XslDatasource[i];
            }
        };
    }

    public void setCurrentTabIndex(int i) {
        this.mTabIndex = i;
    }

    public int getCurrentTabIndex() {
        return this.mTabIndex;
    }

    public void addTppParam(String str, String str2) {
        this.mTppParams.put(str, str2);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.a, com.taobao.android.searchbaseframe.datasource.a
    public StringBuilder dumpDebugInfo() {
        return super.dumpDebugInfo();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public JSONObject dumpDebugParamsInfo() {
        JSONObject dumpDebugParamsInfo = super.dumpDebugParamsInfo();
        String string = dumpDebugParamsInfo.getString("params");
        if (!TextUtils.isEmpty(string)) {
            try {
                dumpDebugParamsInfo.put("params", (Object) JSON.parseObject(string));
            } catch (Exception e) {
                c().b().b("dumpDebugParamsInfo", "tpp params err", e);
            }
        }
        return dumpDebugParamsInfo;
    }

    @Override // com.taobao.android.meta.data.b
    public boolean isMetaMode() {
        return this.mMetaMode;
    }

    @Override // com.taobao.android.meta.data.b
    public com.taobao.android.meta.data.f<htg, XslSearchResult> createRequestAdapter() {
        return new f(c());
    }

    /* loaded from: classes6.dex */
    public static class a extends a.C0571a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int k;
        public int l;
        public int m;
        public boolean n;
        public boolean o;

        static {
            kge.a(1684505750);
        }

        public a(a.C0571a.C0572a c0572a) {
            super(c0572a);
            this.k = -1;
            this.l = 0;
            this.m = 0;
            this.n = false;
            this.o = false;
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else {
                this.k = i;
            }
        }

        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.k;
        }

        public void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            } else {
                this.l = i;
            }
        }

        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.m;
        }

        public void d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            } else {
                this.m = i;
            }
        }
    }

    public void doUpdateSearch(JSONObject jSONObject, int i, int i2, boolean z, boolean z2) {
        a aVar = new a(a.C0571a.g().a(false).a(jSONObject));
        aVar.b(i);
        aVar.d(i2);
        aVar.o = z2;
        aVar.n = z;
        searchInternal(aVar);
    }
}
