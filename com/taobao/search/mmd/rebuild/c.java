package com.taobao.search.mmd.rebuild;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.IPager;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.sf.datasource.CommonLocalManager;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.jvm;
import tb.kge;
import tb.nsp;

/* loaded from: classes7.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.search.mmd.rebuild.a f19178a;
    public CommonLocalManager b;
    public SearchParamImpl c;
    public IPager d;
    private JSONArray e;
    private String g;
    private String h;
    private com.taobao.search.sf.datasource.a i;
    private JSONObject j;
    private Map<String, String> k;
    private CommonSearchResult m;
    private CommonSearchResult n;
    private Map<String, ? extends TemplateBean> o;
    private ConcurrentHashMap<String, jvm.c> p;
    private ListStyle q;
    private int r;
    private com.taobao.android.searchbaseframe.track.d s;
    private int f = -1;
    private boolean l = true;
    private String t = "";

    static {
        kge.a(582395714);
        Companion = new a(null);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-933763062);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final c a(nsp curDatasource) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("3704d6e", new Object[]{this, curDatasource});
            }
            q.c(curDatasource, "curDatasource");
            c cVar = new c();
            com.taobao.search.mmd.rebuild.a R = curDatasource.R();
            q.a((Object) R, "curDatasource.exposureFilterRecord");
            cVar.a(R);
            cVar.a(curDatasource.aC_());
            cVar.a(curDatasource.S());
            cVar.a(curDatasource.o());
            cVar.b(curDatasource.p());
            cVar.a(curDatasource.G());
            cVar.a(curDatasource.getExtraStatus());
            cVar.a(curDatasource.getFallbackTypeMap());
            cVar.a(curDatasource.isDynamicFallback());
            CommonLocalManager F = curDatasource.F();
            q.a((Object) F, "curDatasource.localManager");
            cVar.a(F);
            SearchParamImpl currentParam = curDatasource.getCurrentParam();
            q.a((Object) currentParam, "curDatasource.currentParam");
            cVar.a(currentParam);
            cVar.a((CommonSearchResult) curDatasource.getTotalSearchResult());
            cVar.b((CommonSearchResult) curDatasource.getLastSearchResult());
            IPager pager = curDatasource.getPager();
            q.a((Object) pager, "curDatasource.pager");
            cVar.a(pager);
            cVar.b(curDatasource.getAllTemplates());
            cVar.a(curDatasource.getTemplateFiles());
            cVar.a(curDatasource.getUserListStyle());
            cVar.b(curDatasource.getRequestCount());
            cVar.a(curDatasource.getFirstRequestPerf());
            cVar.c(curDatasource.getBundleUrl());
            return cVar;
        }
    }

    public final com.taobao.search.mmd.rebuild.a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.search.mmd.rebuild.a) ipChange.ipc$dispatch("9ae091eb", new Object[]{this});
        }
        com.taobao.search.mmd.rebuild.a aVar = this.f19178a;
        if (aVar == null) {
            q.b("rebuildDSExposureFilterRecord");
        }
        return aVar;
    }

    public final void a(com.taobao.search.mmd.rebuild.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0cb092b", new Object[]{this, aVar});
            return;
        }
        q.c(aVar, "<set-?>");
        this.f19178a = aVar;
    }

    public final void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else {
            this.e = jSONArray;
        }
    }

    public final JSONArray b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("505e5935", new Object[]{this}) : this.e;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.g;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.h;
    }

    public final void a(com.taobao.search.sf.datasource.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141e10da", new Object[]{this, aVar});
        } else {
            this.i = aVar;
        }
    }

    public final com.taobao.search.sf.datasource.a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.sf.datasource.a) ipChange.ipc$dispatch("44931e5f", new Object[]{this}) : this.i;
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.j = jSONObject;
        }
    }

    public final JSONObject g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this}) : this.j;
    }

    public final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.k = map;
        }
    }

    public final Map<String, String> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3fbd54e4", new Object[]{this}) : this.k;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.l;
    }

    public final void a(CommonLocalManager commonLocalManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f1a688", new Object[]{this, commonLocalManager});
            return;
        }
        q.c(commonLocalManager, "<set-?>");
        this.b = commonLocalManager;
    }

    public final CommonLocalManager j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonLocalManager) ipChange.ipc$dispatch("3f15c225", new Object[]{this});
        }
        CommonLocalManager commonLocalManager = this.b;
        if (commonLocalManager == null) {
            q.b("rebuildDSLocalDataManager");
        }
        return commonLocalManager;
    }

    public final void a(SearchParamImpl searchParamImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3349eff2", new Object[]{this, searchParamImpl});
            return;
        }
        q.c(searchParamImpl, "<set-?>");
        this.c = searchParamImpl;
    }

    public final SearchParamImpl k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchParamImpl) ipChange.ipc$dispatch("449001fc", new Object[]{this});
        }
        SearchParamImpl searchParamImpl = this.c;
        if (searchParamImpl == null) {
            q.b("rebuildDSSearchParam");
        }
        return searchParamImpl;
    }

    public final void a(CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4cbd85", new Object[]{this, commonSearchResult});
        } else {
            this.m = commonSearchResult;
        }
    }

    public final CommonSearchResult l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CommonSearchResult) ipChange.ipc$dispatch("1fc11a20", new Object[]{this}) : this.m;
    }

    public final void b(CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe0c686", new Object[]{this, commonSearchResult});
        } else {
            this.n = commonSearchResult;
        }
    }

    public final CommonSearchResult m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CommonSearchResult) ipChange.ipc$dispatch("20f76cff", new Object[]{this}) : this.n;
    }

    public final void a(IPager iPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3100141", new Object[]{this, iPager});
            return;
        }
        q.c(iPager, "<set-?>");
        this.d = iPager;
    }

    public final IPager n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPager) ipChange.ipc$dispatch("7e76f11a", new Object[]{this});
        }
        IPager iPager = this.d;
        if (iPager == null) {
            q.b("rebuildDSPager");
        }
        return iPager;
    }

    public final void b(Map<String, ? extends TemplateBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else {
            this.o = map;
        }
    }

    public final Map<String, TemplateBean> o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("df66012b", new Object[]{this}) : this.o;
    }

    public final void a(ConcurrentHashMap<String, jvm.c> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347f5c38", new Object[]{this, concurrentHashMap});
        } else {
            this.p = concurrentHashMap;
        }
    }

    public final ConcurrentHashMap<String, jvm.c> p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("63540b0f", new Object[]{this}) : this.p;
    }

    public final void a(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b84a965", new Object[]{this, listStyle});
        } else {
            this.q = listStyle;
        }
    }

    public final ListStyle q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListStyle) ipChange.ipc$dispatch("1d46a375", new Object[]{this}) : this.q;
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.r = i;
        }
    }

    public final int r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue() : this.r;
    }

    public final void a(com.taobao.android.searchbaseframe.track.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e35165", new Object[]{this, dVar});
        } else {
            this.s = dVar;
        }
    }

    public final com.taobao.android.searchbaseframe.track.d s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.track.d) ipChange.ipc$dispatch("547bfb19", new Object[]{this}) : this.s;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.t = str;
        }
    }

    public final String t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("abe3bf05", new Object[]{this}) : this.t;
    }
}
