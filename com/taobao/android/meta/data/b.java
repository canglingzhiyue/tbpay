package com.taobao.android.meta.data;

import android.util.SparseArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.structure.childpage.g;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.imn;
import tb.ioy;
import tb.ism;
import tb.itg;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class b<C extends com.taobao.android.meta.data.a, M extends MetaResult<C>> extends com.taobao.android.searchbaseframe.datasource.impl.a<M, LocalDataManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final SparseArray<com.taobao.android.searchbaseframe.datasource.a<M, SearchParamImpl, LocalDataManager>.b> comboTasks;
    private com.taobao.android.meta.logic.a<b<C, MetaResult<C>>, C, MetaResult<C>> controller;
    private com.taobao.android.meta.logic.c<b<C, M>, C, M> flow;
    private int index;
    private boolean initDone;
    private Runnable initRunnable;
    private boolean isInitDataSource;
    private final itg manager;

    /* loaded from: classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MetaResult f14270a;
        public final /* synthetic */ b b;
        public final /* synthetic */ a.C0571a c;

        public a(MetaResult metaResult, b bVar, a.C0571a c0571a) {
            this.f14270a = metaResult;
            this.b = bVar;
            this.c = c0571a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.android.meta.logic.c<b<C, M>, C, M> flow = this.b.getFlow();
            if (flow == null) {
                return;
            }
            flow.a((com.taobao.android.meta.logic.c<b<C, M>, C, M>) this.b, this.f14270a.isSuccess());
        }
    }

    static {
        kge.a(1361402936);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1014456898:
                return new Boolean(super.moveCell(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            case -670846045:
                return new Boolean(super.doPreLoadNewSearch((JSONObject) objArr[0]));
            case -415319146:
                super.onMergeResult((b) ((SearchResult) objArr[0]), (a.C0571a) objArr[1]);
                return null;
            case -95162026:
                super.onPreSearchOfParams((a.C0571a) objArr[0], (Map) objArr[1]);
                return null;
            case 975760437:
                return super.getExecutor((a.C0571a) objArr[0]);
            case 1083699496:
                return new Boolean(super.doNewSearch());
            case 1162854400:
                return new Boolean(super.insertCellToTotal((BaseCellBean) objArr[0], ((Number) objArr[1]).intValue()));
            case 1410081109:
                return new Boolean(super.onPostRequest((b) ((SearchResult) objArr[0]), (a.C0571a) objArr[1], ((Number) objArr[2]).longValue(), (com.taobao.android.searchbaseframe.track.d) objArr[3]));
            case 1561329232:
                return new Boolean(super.doNewSearch((JSONObject) objArr[0]));
            case 1610385166:
                super.onNewTask((a.b) objArr[0], (a.C0571a) objArr[1]);
                return null;
            case 1644444529:
                return new Boolean(super.removeCellFromTotal((BaseCellBean) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public abstract f<C, M> createRequestAdapter();

    public boolean isMetaMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9589cc1d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.searchbaseframe.datasource.a
    public /* bridge */ /* synthetic */ void onMergeResult(SearchResult searchResult, a.C0571a c0571a) {
        onMergeResult((b<C, M>) ((MetaResult) searchResult), c0571a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.searchbaseframe.datasource.a
    public /* bridge */ /* synthetic */ boolean onPostRequest(SearchResult searchResult, a.C0571a c0571a, long j, com.taobao.android.searchbaseframe.track.d dVar) {
        return onPostRequest((b<C, M>) ((MetaResult) searchResult), c0571a, j, dVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(imn core, ioy ioyVar) {
        super(core, ioyVar);
        q.c(core, "core");
        this.isInitDataSource = true;
        this.comboTasks = new SparseArray<>();
        this.manager = new itg();
        this.index = -1;
    }

    public final boolean isInitDataSource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1f7ce6a", new Object[]{this})).booleanValue() : this.isInitDataSource;
    }

    public final void setInitDataSource(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("905386f6", new Object[]{this, new Boolean(z)});
        } else {
            this.isInitDataSource = z;
        }
    }

    public final com.taobao.android.meta.logic.c<b<C, M>, C, M> getFlow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.logic.c) ipChange.ipc$dispatch("b0908981", new Object[]{this}) : this.flow;
    }

    public final void setFlow(com.taobao.android.meta.logic.c<b<C, M>, C, M> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb44394f", new Object[]{this, cVar});
            return;
        }
        this.flow = cVar;
        Runnable runnable = this.initRunnable;
        if (runnable == null) {
            return;
        }
        runnable.run();
        this.initRunnable = null;
    }

    public final SparseArray<com.taobao.android.searchbaseframe.datasource.a<M, SearchParamImpl, LocalDataManager>.b> getComboTasks() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SparseArray) ipChange.ipc$dispatch("510963fc", new Object[]{this}) : this.comboTasks;
    }

    public final int getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue() : this.index;
    }

    public final void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.index = i;
        }
    }

    public final void resetInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5efa406", new Object[]{this});
        } else {
            this.initDone = false;
        }
    }

    public final void doLoadMore(C combo, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0a03dc", new Object[]{this, combo, map});
            return;
        }
        q.c(combo, "combo");
        com.taobao.android.meta.logic.c<b<C, M>, C, M> cVar = this.flow;
        if (cVar != null) {
            cVar.a((com.taobao.android.meta.logic.c<b<C, M>, C, M>) this, (b<C, M>) combo, true, map);
        }
        searchInternal(createConfig(false, combo, false, false, false, map, null));
    }

    public final void setController(com.taobao.android.meta.logic.a<b<C, MetaResult<C>>, C, MetaResult<C>> controller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47dab463", new Object[]{this, controller});
            return;
        }
        q.c(controller, "controller");
        this.controller = controller;
    }

    public void doNewSearch(C c, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3d7751", new Object[]{this, c, new Boolean(z), map});
        } else {
            doNewSearch(c, z, null, map);
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public boolean doPreLoadNewSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d803b3a3", new Object[]{this, jSONObject})).booleanValue();
        }
        if (isMetaMode()) {
            return searchInternal(createConfig(true, null, true, true, true, null, jSONObject));
        }
        return super.doPreLoadNewSearch(jSONObject);
    }

    public void doNewSearch(C c, boolean z, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926c7049", new Object[]{this, c, new Boolean(z), jSONObject, map});
            return;
        }
        if (c != null && !z) {
            com.taobao.android.meta.logic.c<b<C, M>, C, M> cVar = this.flow;
            if (cVar != null) {
                cVar.a((com.taobao.android.meta.logic.c<b<C, M>, C, M>) this, (b<C, M>) c, false, map);
            }
        } else {
            com.taobao.android.meta.logic.c<b<C, M>, C, M> cVar2 = this.flow;
            if (cVar2 != null) {
                cVar2.c(this);
            }
        }
        getPager().reset();
        if (c != null) {
            c.h();
        }
        searchInternal(createConfig(c == null, c, true, false, z, map, jSONObject));
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public boolean doNewSearch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4097f128", new Object[]{this})).booleanValue();
        }
        if (isMetaMode()) {
            getPager().reset();
            searchInternal(createConfig(true, null, true, this.isInitDataSource, true, null, null));
            return true;
        }
        return super.doNewSearch();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public boolean isMultiTasksMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8bad986d", new Object[]{this})).booleanValue() : isMetaMode();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public boolean enableEventBus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c633f434", new Object[]{this})).booleanValue() : !isMetaMode();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public Executor getExecutor(a.C0571a config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("3a28ec35", new Object[]{this, config});
        }
        q.c(config, "config");
        if (isMetaMode()) {
            ThreadPoolExecutor a2 = this.manager.a(getTaskId(config));
            q.a((Object) a2, "manager.getOrCreate(getTaskId(config))");
            return a2;
        }
        Executor executor = super.getExecutor(config);
        q.a((Object) executor, "super.getExecutor(config)");
        return executor;
    }

    private final int getTaskId(a.C0571a c0571a) {
        com.taobao.android.meta.data.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5bcec95", new Object[]{this, c0571a})).intValue();
        }
        if (c0571a != null && (a2 = ((e) c0571a).a()) != null) {
            return a2.hashCode();
        }
        return 0;
    }

    private final int getTaskId(com.taobao.android.meta.data.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f137e9ec", new Object[]{this, aVar})).intValue();
        }
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final void cancelTask(com.taobao.android.meta.data.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ebb8022", new Object[]{this, aVar});
            return;
        }
        int taskId = getTaskId(aVar);
        com.taobao.android.searchbaseframe.datasource.a<M, SearchParamImpl, LocalDataManager>.b bVar = this.comboTasks.get(taskId);
        if (bVar == null) {
            return;
        }
        bVar.cancel(false);
        this.comboTasks.remove(taskId);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public void onNewTask(com.taobao.android.searchbaseframe.datasource.a<M, SearchParamImpl, LocalDataManager>.b bVar, a.C0571a c0571a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ffc870e", new Object[]{this, bVar, c0571a});
            return;
        }
        super.onNewTask(bVar, c0571a);
        if (!isMetaMode()) {
            return;
        }
        int taskId = getTaskId(c0571a);
        com.taobao.android.searchbaseframe.datasource.a<M, SearchParamImpl, LocalDataManager>.b bVar2 = this.comboTasks.get(taskId);
        if (bVar2 != null) {
            if (c0571a == null || c0571a.f) {
                bVar2.cancel(false);
            }
            this.comboTasks.remove(taskId);
        }
        this.comboTasks.put(taskId, bVar);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    /* renamed from: onCreateRequestAdapter */
    public ism<M> mo1220onCreateRequestAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ism) ipChange.ipc$dispatch("884e42c1", new Object[]{this}) : createRequestAdapter();
    }

    public final Map<String, String> getSearchParams(C combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9d98d03c", new Object[]{this, combo});
        }
        q.c(combo, "combo");
        SearchParamImpl currentParam = getCurrentParam();
        q.a((Object) currentParam, "currentParam");
        Map<String, String> buildSearchParams = buildSearchParams(currentParam);
        appendComboParams(buildSearchParams, combo, null);
        return buildSearchParams;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public Map<String, String> buildSearchParams(SearchParamImpl param) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("97339dcc", new Object[]{this, param});
        }
        q.c(param, "param");
        Map<String, String> createUrlParams = param.createUrlParams();
        q.a((Object) createUrlParams, "param.createUrlParams()");
        return createUrlParams;
    }

    public void appendComboParams(Map<String, String> map, C c, e<C> eVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25bb7218", new Object[]{this, map, c, eVar});
            return;
        }
        q.c(map, "map");
        if (c == null) {
            return;
        }
        Map<String, String> createUrlParams = c.q().createUrlParams();
        q.a((Object) createUrlParams, "params.createUrlParams()");
        map.putAll(createUrlParams);
        JSONObject s = c.s();
        if (s == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : s.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            q.a((Object) key, "key");
            if (value == null || (str = value.toString()) == null) {
                str = "";
            }
            map.put(key, str);
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public void onPreSearchOfParams(a.C0571a c0571a, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa53f156", new Object[]{this, c0571a, map});
            return;
        }
        super.onPreSearchOfParams(c0571a, map);
        if (!isMetaMode() || map == null || c0571a == null) {
            return;
        }
        e<C> eVar = (e) c0571a;
        appendComboParams(map, eVar.a(), eVar);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public boolean doNewSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d0ffe50", new Object[]{this, jSONObject})).booleanValue();
        }
        if (isMetaMode()) {
            getPager().reset();
            searchInternal(createConfig(true, null, true, this.isInitDataSource, true, null, jSONObject));
            return true;
        }
        return super.doNewSearch(jSONObject);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.a
    public boolean removeCellFromTotal(BaseCellBean baseCellBean) {
        com.taobao.android.meta.data.a aVar;
        g b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62043b71", new Object[]{this, baseCellBean})).booleanValue();
        }
        if (!isMetaMode()) {
            return super.removeCellFromTotal(baseCellBean);
        }
        if (baseCellBean == null || (aVar = baseCellBean.combo) == null) {
            return false;
        }
        q.a((Object) aVar, "bean.combo ?: return false");
        if (!aVar.c(baseCellBean)) {
            return false;
        }
        com.taobao.android.meta.logic.a<b<C, MetaResult<C>>, C, MetaResult<C>> aVar2 = this.controller;
        if (aVar2 != null && (b = aVar2.b(this.index)) != null) {
            b.n();
        }
        return true;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.a
    public boolean moveCell(int i, int i2) {
        com.taobao.android.meta.data.a combo;
        BaseCellBean o;
        g b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3889dbe", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (isMetaMode()) {
            MetaResult metaResult = (MetaResult) getTotalSearchResult();
            if (metaResult == null || (combo = metaResult.getCombo(0)) == null || (o = combo.o(i)) == null) {
                return false;
            }
            combo.c(o);
            combo.a(o, i2);
            com.taobao.android.meta.logic.a<b<C, MetaResult<C>>, C, MetaResult<C>> aVar = this.controller;
            if (aVar != null && (b = aVar.b(this.index)) != null) {
                b.n();
            }
            return true;
        }
        return super.moveCell(i, i2);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.a
    public boolean insertCellToTotal(BaseCellBean baseCellBean, int i) {
        MetaResult it;
        com.taobao.android.meta.data.a combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("454fc000", new Object[]{this, baseCellBean, new Integer(i)})).booleanValue();
        }
        if (!isMetaMode()) {
            return super.insertCellToTotal(baseCellBean, i);
        }
        if (baseCellBean != null && (it = (MetaResult) getTotalSearchResult()) != null) {
            q.a((Object) it, "it");
            if (!it.isFailed() && (combo = it.getCombo(0)) != null) {
                return combo.a(baseCellBean, i);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onPostRequest(M m, a.C0571a c0571a, long j, com.taobao.android.searchbaseframe.track.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a68a0", new Object[]{this, m, c0571a, new Long(j), dVar})).booleanValue();
        }
        boolean onPostRequest = super.onPostRequest((b<C, M>) m, c0571a, j, dVar);
        if (isMetaMode()) {
            if (m == null || !m.isSseMode() || m.isSseFinished()) {
                this.comboTasks.remove(getTaskId(c0571a));
            }
            if (m != null) {
                if (c0571a == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.data.MetaSearchConfig<C>");
                }
                e eVar = (e) c0571a;
                if (eVar.c() && !this.initDone) {
                    if (m.isSuccess()) {
                        this.initDone = true;
                    }
                    com.taobao.android.meta.logic.c<b<C, M>, C, M> cVar = this.flow;
                    if (cVar != null) {
                        if (cVar == null) {
                            q.a();
                        }
                        cVar.a((com.taobao.android.meta.logic.c<b<C, M>, C, M>) this, m.isSuccess());
                    } else {
                        this.initRunnable = new a(m, this, c0571a);
                    }
                } else if (eVar.a() != null && !eVar.d()) {
                    com.taobao.android.meta.logic.c<b<C, M>, C, M> cVar2 = this.flow;
                    if (cVar2 == 0) {
                        q.a();
                    }
                    cVar2.a(this, eVar.a(), !eVar.b(), m.isSuccess(), eVar);
                } else {
                    com.taobao.android.meta.logic.c<b<C, M>, C, M> cVar3 = this.flow;
                    if (cVar3 == null) {
                        q.a();
                    }
                    cVar3.b(this, m.isSuccess());
                }
            }
        }
        return onPostRequest;
    }

    public final e<C> createConfig(boolean z, C c, boolean z2, boolean z3, boolean z4, Map<String, String> map, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("5cdcd436", new Object[]{this, new Boolean(z), c, new Boolean(z2), new Boolean(z3), new Boolean(z4), map, obj}) : createConfig(z, c, z2, z3, z4, map, obj, true);
    }

    public final e<C> createConfig(boolean z, C c, boolean z2, boolean z3, boolean z4, Map<String, String> map, Object obj, boolean z5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("b0f80092", new Object[]{this, new Boolean(z), c, new Boolean(z2), new Boolean(z3), new Boolean(z4), map, obj, new Boolean(z5)}) : new e(z, obj, z5, false).a((e) c).a(z2).b(z4).c(z3).a(map);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        if (!isMetaMode()) {
            return;
        }
        this.manager.a();
        int size = this.comboTasks.size();
        for (int i = 0; i < size; i++) {
            this.comboTasks.valueAt(i).cancel(true);
        }
        this.comboTasks.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMergeResult(M m, a.C0571a c0571a) {
        com.taobao.android.meta.data.a a2;
        com.taobao.android.meta.data.a combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6092deb", new Object[]{this, m, c0571a});
            return;
        }
        super.onMergeResult((b<C, M>) m, c0571a);
        if (!isMetaMode() || m == null) {
            return;
        }
        if (!(c0571a instanceof e)) {
            c0571a = null;
        }
        e eVar = (e) c0571a;
        if (eVar == null || (a2 = eVar.a()) == null || (combo = m.getCombo(0)) == null) {
            return;
        }
        if (eVar.b()) {
            com.taobao.android.meta.logic.c<b<C, M>, C, M> cVar = this.flow;
            if (cVar == 0) {
                q.a();
            }
            cVar.b(this, a2, combo, eVar);
            return;
        }
        com.taobao.android.meta.logic.c<b<C, M>, C, M> cVar2 = this.flow;
        if (cVar2 == 0) {
            q.a();
        }
        cVar2.a((com.taobao.android.meta.logic.c<b<C, M>, C, M>) this, a2, combo, (e<com.taobao.android.meta.data.a>) eVar);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public LocalDataManager onCreateLocalDataManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LocalDataManager) ipChange.ipc$dispatch("74f5fe77", new Object[]{this}) : new DummyLocalManager();
    }
}
