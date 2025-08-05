package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.util.SparseArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.data.b;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.xsl.section.h;
import com.taobao.android.xsearchplugin.muise.f;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.refactor.e;
import com.taobao.search.refactor.g;
import com.taobao.search.refactor.j;
import com.taobao.search.refactor.p;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public class npb extends p<j, e, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public g f31619a;
    private noz e;
    private String f;
    private final npa b = new npa();
    private final SparseArray<noz> c = new SparseArray<>();
    private int d = -1;
    private boolean g = true;

    static {
        kge.a(981915780);
    }

    public static /* synthetic */ Object ipc$super(npb npbVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public boolean a(int i, j initDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6982d5d", new Object[]{this, new Integer(i), initDataSource})).booleanValue();
        }
        q.c(initDataSource, "initDataSource");
        return i == 0;
    }

    public void b(j scopeDataSource, com.taobao.android.meta.structure.childpage.g childPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8fe7f0a", new Object[]{this, scopeDataSource, childPage});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(childPage, "childPage");
    }

    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public /* bridge */ /* synthetic */ void a(b bVar, a aVar, a aVar2, com.taobao.android.meta.data.e eVar) {
        a((j) bVar, (e) aVar, (e) aVar2, (com.taobao.android.meta.data.e<e>) eVar);
    }

    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public /* bridge */ /* synthetic */ void a(b bVar, a aVar, boolean z, Map map) {
        a((j) bVar, (e) aVar, z, (Map<String, String>) map);
    }

    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public /* bridge */ /* synthetic */ void a(b bVar, a aVar, boolean z, boolean z2, com.taobao.android.meta.data.e eVar) {
        a((j) bVar, (e) aVar, z, z2, (com.taobao.android.meta.data.e<e>) eVar);
    }

    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public /* synthetic */ void a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a6da71", new Object[]{this, bVar, new Boolean(z)});
        } else {
            b((j) bVar, z);
        }
    }

    @Override // com.taobao.search.refactor.p
    public /* bridge */ /* synthetic */ void a(Map map, e eVar, j jVar, com.taobao.android.meta.data.e<e> eVar2) {
        a((Map<String, String>) map, eVar, jVar, eVar2);
    }

    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public /* bridge */ /* synthetic */ void b(b bVar, a aVar, a aVar2, com.taobao.android.meta.data.e eVar) {
        b((j) bVar, (e) aVar, (e) aVar2, (com.taobao.android.meta.data.e<e>) eVar);
    }

    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public /* synthetic */ void c(b bVar, com.taobao.android.meta.structure.childpage.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe30ac", new Object[]{this, bVar, gVar});
        } else {
            b((j) bVar, gVar);
        }
    }

    public final g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("6541b28f", new Object[]{this});
        }
        g gVar = this.f31619a;
        if (gVar == null) {
            q.b("controller");
        }
        return gVar;
    }

    public final void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc00449", new Object[]{this, gVar});
            return;
        }
        q.c(gVar, "<set-?>");
        this.f31619a = gVar;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.d;
    }

    public final noz c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (noz) ipChange.ipc$dispatch("1e6ba023", new Object[]{this}) : this.e;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.f;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void a(j scopeDataSource, e eVar, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c3343a", new Object[]{this, scopeDataSource, eVar, new Boolean(z), map});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        if (eVar == null) {
            return;
        }
        if (!z) {
            ((noz) eVar).a((noz) null);
        }
        noz nozVar = (noz) eVar;
        if (nozVar.F() == null) {
            return;
        }
        if (nozVar.O()) {
            nozVar.f(false);
        }
        noz F = nozVar.F();
        if (F == null) {
            q.a();
        }
        F.e(false);
    }

    public final void a(j initDataSource) {
        h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc16166", new Object[]{this, initDataSource});
            return;
        }
        q.c(initDataSource, "initDataSource");
        g gVar = this.f31619a;
        if (gVar == null) {
            q.b("controller");
        }
        Activity activity = gVar.c().getActivity();
        if (!(activity instanceof f)) {
            activity = null;
        }
        f fVar = (f) activity;
        if (fVar == null || !fVar.g()) {
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) initDataSource.getTotalSearchResult();
        int comboSize = commonSearchResult != null ? commonSearchResult.comboSize() : 0;
        for (int i = 0; i < comboSize; i++) {
            CommonSearchResult commonSearchResult2 = (CommonSearchResult) initDataSource.getTotalSearchResult();
            if (commonSearchResult2 == null) {
                q.a();
            }
            e combo = commonSearchResult2.getCombo(i);
            if (combo != null) {
                for (BaseCellBean baseCellBean : combo.w()) {
                    if (baseCellBean.isSection && (hVar = baseCellBean.ownedSectionStyle) != null) {
                        hVar.c(0);
                    }
                }
            }
        }
    }

    public void b(j scopeDataSource, e src, e incoming, com.taobao.android.meta.data.e<e> config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f19ed25", new Object[]{this, scopeDataSource, src, incoming, config});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(src, "src");
        q.c(incoming, "incoming");
        q.c(config, "config");
        Map<String, String> e = config.e();
        if (e != null && TextUtils.equals(e.get("searchType"), "all")) {
            ((noz) src).b((noz) incoming);
        }
        src.b(incoming);
    }

    public void a(j scopeDataSource, e src, e incoming, com.taobao.android.meta.data.e<e> config) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0cf0e4", new Object[]{this, scopeDataSource, src, incoming, config});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(src, "src");
        q.c(incoming, "incoming");
        q.c(config, "config");
        Map<String, String> e = config.e();
        if (e != null && (str = e.get("searchType")) != null) {
            if (!TextUtils.equals(str, "preload")) {
                return;
            }
            ((noz) src).a((noz) incoming);
        } else if (!((noz) src).P()) {
        } else {
            src.a(incoming);
        }
    }

    public void b(j initDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeaab68d", new Object[]{this, initDataSource, new Boolean(z)});
            return;
        }
        q.c(initDataSource, "initDataSource");
        if (!z) {
            return;
        }
        CommonSearchResult result = (CommonSearchResult) initDataSource.getTotalSearchResult();
        if (result != null) {
            com.taobao.search.sf.widgets.list.floatbar.b bVar = result.floatBarBean;
            if (bVar != null) {
                bVar.b = null;
            }
            int comboSize = result.comboSize();
            for (int i = 0; i < comboSize; i++) {
                e combo = result.getCombo(i);
                if (combo != null) {
                    if (combo == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.ns.NSCombo");
                    }
                    noz nozVar = (noz) combo;
                    q.a((Object) result, "result");
                    nozVar.n(a(result, nozVar));
                }
            }
        }
        a(initDataSource);
    }

    public void a(j scopeDataSource, e eVar, boolean z, boolean z2, com.taobao.android.meta.data.e<e> config) {
        iru iruVar;
        b bVar;
        com.taobao.search.sf.widgets.list.floatbar.b bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b59c1", new Object[]{this, scopeDataSource, eVar, new Boolean(z), new Boolean(z2), config});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(config, "config");
        CommonSearchResult commonSearchResult = (CommonSearchResult) scopeDataSource.getLastSearchResult();
        if (commonSearchResult != null && (bVar2 = commonSearchResult.floatBarBean) != null) {
            bVar2.b = null;
        }
        if (z2) {
            g gVar = this.f31619a;
            if (gVar == null) {
                q.b("controller");
            }
            com.taobao.android.meta.structure.childpage.g b = gVar.c().b(scopeDataSource.getIndex());
            if (b != null) {
                b.b(false);
            }
        }
        if (!(eVar instanceof noz)) {
            eVar = null;
        }
        noz nozVar = (noz) eVar;
        if (nozVar == null) {
            return;
        }
        if (!z) {
            nozVar.d(true);
            nozVar.e(true);
        }
        if (!scopeDataSource.isInitDataSource() || z) {
            return;
        }
        g gVar2 = this.f31619a;
        if (gVar2 == null) {
            q.b("controller");
        }
        CommonSearchResult commonSearchResult2 = (CommonSearchResult) scopeDataSource.getTotalSearchResult();
        if (commonSearchResult2 == null) {
            q.a();
        }
        q.a((Object) commonSearchResult2, "scopeDataSource.totalSearchResult!!");
        com.taobao.android.meta.structure.childpage.g b2 = gVar2.b(a(commonSearchResult2, nozVar));
        if (b2 == null || (iruVar = (iru) b2.getModel()) == null || (bVar = (b) iruVar.d()) == null) {
            return;
        }
        MetaResult metaResult = (MetaResult) bVar.getTotalSearchResult();
        a combo = metaResult != null ? metaResult.getCombo(0) : null;
        if (!(combo instanceof noz)) {
            combo = null;
        }
        noz nozVar2 = (noz) combo;
        if (nozVar2 == null || !nozVar2.O()) {
            return;
        }
        if (bVar == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.MSDataSource");
        }
        a(nozVar2, (j) bVar);
    }

    public final void b(j scopeDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e49a2127", new Object[]{this, scopeDataSource});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        g gVar = this.f31619a;
        if (gVar == null) {
            q.b("controller");
        }
        com.taobao.android.meta.structure.childpage.g b = gVar.c().b(scopeDataSource.getIndex());
        if (b == null) {
            return;
        }
        b.b(true);
    }

    public final int a(CommonSearchResult result, noz combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e5e8d6f", new Object[]{this, result, combo})).intValue();
        }
        q.c(result, "result");
        q.c(combo, "combo");
        if (result.getTabs() != null) {
            List<TabBean> tabs = result.getTabs();
            if (tabs == null) {
                q.a();
            }
            if (tabs.size() != 1) {
                List<TabBean> tabs2 = result.getTabs();
                if (tabs2 == null) {
                    q.a();
                }
                int size = tabs2.size();
                for (int i = 0; i < size; i++) {
                    List<TabBean> tabs3 = result.getTabs();
                    if (tabs3 == null) {
                        q.a();
                    }
                    if (TextUtils.equals(tabs3.get(i).bizName, combo.Q())) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    @Override // com.taobao.search.refactor.p
    public void a(j scopeDataSource, com.taobao.android.meta.structure.childpage.g childPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4d14eb", new Object[]{this, scopeDataSource, childPage});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(childPage, "childPage");
        noz nozVar = this.c.get(scopeDataSource.getIndex());
        if (nozVar == null) {
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) scopeDataSource.getTotalSearchResult();
        if (commonSearchResult != null) {
            commonSearchResult.setMainInfo(nozVar.a());
        }
        noz F = nozVar.F();
        if (F == null) {
            return;
        }
        boolean P = F.P();
        if (F.P()) {
            F.ab();
            g gVar = this.f31619a;
            if (gVar == null) {
                q.b("controller");
            }
            g gVar2 = this.f31619a;
            if (gVar2 == null) {
                q.b("controller");
            }
            com.taobao.android.meta.structure.childpage.g d = gVar.d((g) gVar2.b());
            if (d != null) {
                d.a(true);
                d.o();
            }
        }
        if (!P && (!F.N() || F.k() == MetaState.UPDATING)) {
            return;
        }
        F.e(false);
        a(nozVar, scopeDataSource);
    }

    private final void a(noz nozVar, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86fbd41d", new Object[]{this, nozVar, jVar});
            return;
        }
        nozVar.ae();
        g gVar = this.f31619a;
        if (gVar == null) {
            q.b("controller");
        }
        a(jVar, (j) gVar.b());
        g gVar2 = this.f31619a;
        if (gVar2 == null) {
            q.b("controller");
        }
        com.taobao.android.meta.structure.childpage.g d = gVar2.d((g) jVar);
        if (d == null) {
            return;
        }
        d.b(true);
    }

    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public void a(j scopeDataSource, e combo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d410b41a", new Object[]{this, scopeDataSource, combo, new Integer(i)});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(combo, "combo");
        if (!this.g) {
            return;
        }
        noz nozVar = (noz) combo;
        if (nozVar.F() != null || !nozVar.M() || !combo.e() || nozVar.aa() <= 0 || !combo.f()) {
            return;
        }
        nozVar.d(false);
        scopeDataSource.doLoadMore(combo, ai.a(new Pair("searchType", "preload")));
    }

    @Override // com.taobao.search.refactor.p
    public void a(j scopeDataSource, e combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e7c009", new Object[]{this, scopeDataSource, combo});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(combo, "combo");
        scopeDataSource.doLoadMore(combo, null);
    }

    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.b
    public void a(CommonSearchResult result, JSONObject jSONObject, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e40d71", new Object[]{this, result, jSONObject, imnVar});
            return;
        }
        q.c(result, "result");
        this.b.a((MSearchResult) result, jSONObject, imnVar);
        b(result);
        a(result);
    }

    private final void a(CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4cbd85", new Object[]{this, commonSearchResult});
        } else if (this.f == null) {
            List<TabBean> tabs = commonSearchResult.getTabs();
            if (tabs != null) {
                StringBuilder sb = new StringBuilder();
                int size = tabs.size();
                for (int i = 0; i < size; i++) {
                    sb.append(tabs.get(i).bizName);
                    if (i < tabs.size() - 1) {
                        sb.append(",");
                    }
                }
                this.f = sb.toString();
                return;
            }
            this.f = "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        r0 = r4.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
        r4.d = a(r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(com.taobao.search.sf.datasource.CommonSearchResult r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.npb.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            java.lang.String r5 = "3fe0c686"
            r0.ipc$dispatch(r5, r1)
            return
        L15:
            int r0 = r4.d
            r1 = -1
            if (r0 == r1) goto L1b
            return
        L1b:
            java.util.List r0 = r5.getTabs()
            if (r0 == 0) goto L5e
            java.util.List r0 = r5.getTabs()
            if (r0 != 0) goto L2a
            kotlin.jvm.internal.q.a()
        L2a:
            int r0 = r0.size()
            if (r0 != r2) goto L31
            goto L5e
        L31:
            int r0 = r5.comboSize()
        L35:
            if (r3 >= r0) goto L53
            com.taobao.android.meta.data.a r1 = r5.getCombo(r3)
            if (r1 == 0) goto L4b
            tb.noz r1 = (tb.noz) r1
            boolean r2 = r1.G()
            if (r2 == 0) goto L48
            r4.e = r1
            goto L53
        L48:
            int r3 = r3 + 1
            goto L35
        L4b:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type com.taobao.search.refactor.ns.NSCombo"
            r5.<init>(r0)
            throw r5
        L53:
            tb.noz r0 = r4.e
            if (r0 == 0) goto L5d
            int r5 = r4.a(r5, r0)
            r4.d = r5
        L5d:
            return
        L5e:
            r4.d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.npb.b(com.taobao.search.sf.datasource.CommonSearchResult):void");
    }

    private final void a(j jVar, j jVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ea05e4", new Object[]{this, jVar, jVar2});
            return;
        }
        jVar.getTemplateFiles().putAll(jVar2.getTemplateFiles());
        jVar.mergeTemplates(jVar2.getAllTemplates());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5 A[LOOP:0: B:18:0x008e->B:29:0x00d5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8 A[EDGE_INSN: B:45:0x00d8->B:30:0x00d8 ?: BREAK  , SYNTHETIC] */
    @Override // com.taobao.android.meta.logic.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.iru<com.taobao.search.refactor.j> a(int r11, com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean r12, com.taobao.search.refactor.j r13) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.npb.a(int, com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean, com.taobao.search.refactor.j):tb.iru");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.search.refactor.p
    public boolean a(j scopeDataSource, e combo, ListStyle newStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("836f8c28", new Object[]{this, scopeDataSource, combo, newStyle})).booleanValue();
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(combo, "combo");
        q.c(newStyle, "newStyle");
        combo.a(newStyle);
        g gVar = this.f31619a;
        if (gVar == null) {
            q.b("controller");
        }
        com.taobao.android.meta.structure.childpage.g d = gVar.d((g) scopeDataSource);
        if (d != null) {
            d.n();
        }
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public void a(Map<String, String> map, e combo, j scopeDataSource, com.taobao.android.meta.data.e<e> eVar) {
        Map<String, String> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae0daf6", new Object[]{this, map, combo, scopeDataSource, eVar});
            return;
        }
        q.c(map, "map");
        q.c(combo, "combo");
        q.c(scopeDataSource, "scopeDataSource");
        noz nozVar = (noz) combo;
        if (!nozVar.G()) {
            map.put("m", "combo");
            String Q = nozVar.Q();
            if (Q == null) {
                Q = "";
            }
            map.put("comboBizType", Q);
        } else {
            map.put("comboBizType", "item");
        }
        map.put(noa.KEY_NEED_TABS, "false");
        map.put(noa.VALUE_BIZ_TYPE_NEW_SEARCH, "true");
        map.put("bizName", "all");
        map.putAll(combo.D());
        map.put("n", "10");
        map.put(noa.KEY_P4P_S, String.valueOf(nozVar.U()));
        map.put(noa.KEY_ITEM_S, String.valueOf(nozVar.V()));
        String X = nozVar.X();
        if (X != null) {
            map.put(noa.KEY_P4P_IDS, X);
        }
        String W = nozVar.W();
        if (W != null) {
            map.put("itemIds", W);
        }
        if (nozVar.F() == null) {
            if (!TextUtils.equals("preload", (eVar == null || (e = eVar.e()) == null) ? null : e.get("searchType"))) {
                return;
            }
        }
        map.put("isNewSearchSubTab", "true");
    }
}
