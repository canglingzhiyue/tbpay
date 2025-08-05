package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.childpage.g;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.xsl.section.h;
import com.taobao.search.common.util.r;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.refactor.e;
import com.taobao.search.refactor.j;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class nox extends npb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final now b = new now();
    private final boolean c;

    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ j b;

        public a(j jVar) {
            this.b = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            g d = nox.this.a().d((com.taobao.search.refactor.g) this.b);
            if (d == null) {
                return;
            }
            d.x();
        }
    }

    /* loaded from: classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ j b;

        public b(j jVar) {
            this.b = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            g d = nox.this.a().d((com.taobao.search.refactor.g) this.b);
            if (d == null) {
                return;
            }
            d.x();
        }
    }

    static {
        kge.a(-2010614926);
    }

    public static /* synthetic */ Object ipc$super(nox noxVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1845922032:
                super.b((nox) ((com.taobao.android.meta.data.b) objArr[0]), ((Boolean) objArr[1]).booleanValue());
                return null;
            case -1364543859:
                super.b((j) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case 177953217:
                super.a((j) objArr[0], (e) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), (com.taobao.android.meta.data.e) objArr[4]);
                return null;
            case 450943734:
                super.a((Map) objArr[0], (e) objArr[1], (j) objArr[2], (com.taobao.android.meta.data.e) objArr[3]);
                return null;
            case 1220752442:
                super.a((j) objArr[0], (e) objArr[1], ((Boolean) objArr[2]).booleanValue(), (Map) objArr[3]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public nox(boolean z) {
        this.c = z;
        a(false);
    }

    @Override // tb.npb, com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.data.a aVar, com.taobao.android.meta.data.a aVar2, com.taobao.android.meta.data.e eVar) {
        a((j) bVar, (e) aVar, (e) aVar2, (com.taobao.android.meta.data.e<e>) eVar);
    }

    @Override // tb.npb, com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.data.a aVar, boolean z, Map map) {
        a((j) bVar, (e) aVar, z, (Map<String, String>) map);
    }

    @Override // tb.npb, com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.data.a aVar, boolean z, boolean z2, com.taobao.android.meta.data.e eVar) {
        a((j) bVar, (e) aVar, z, z2, (com.taobao.android.meta.data.e<e>) eVar);
    }

    @Override // tb.npb, com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public /* synthetic */ void a(com.taobao.android.meta.data.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a6da71", new Object[]{this, bVar, new Boolean(z)});
        } else {
            b((j) bVar, z);
        }
    }

    @Override // tb.npb, com.taobao.search.refactor.p
    public /* bridge */ /* synthetic */ void a(Map map, e eVar, j jVar, com.taobao.android.meta.data.e<e> eVar2) {
        a2((Map<String, String>) map, eVar, jVar, eVar2);
    }

    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public /* synthetic */ void b(com.taobao.android.meta.data.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f97710", new Object[]{this, bVar, new Boolean(z)});
        } else {
            a((j) bVar, z);
        }
    }

    @Override // tb.npb, com.taobao.search.refactor.p, com.taobao.android.meta.logic.b
    public void a(CommonSearchResult result, JSONObject jSONObject, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e40d71", new Object[]{this, result, jSONObject, imnVar});
            return;
        }
        q.c(result, "result");
        this.b.a((MSearchResult) result, jSONObject, imnVar);
    }

    public void a(j scopeDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a6b7e2e", new Object[]{this, scopeDataSource, new Boolean(z)});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        super.b((nox) scopeDataSource, z);
        if (!z) {
            return;
        }
        e();
        scopeDataSource.a(true);
        CommonSearchResult commonSearchResult = (CommonSearchResult) scopeDataSource.getTotalSearchResult();
        if (commonSearchResult == null || commonSearchResult.comboSize() != 0) {
            return;
        }
        if (this.c && r.cs()) {
            noz nozVar = new noz();
            nozVar.a(MetaState.EMPTY);
            CommonSearchResult commonSearchResult2 = (CommonSearchResult) scopeDataSource.getTotalSearchResult();
            if (commonSearchResult2 == null) {
                return;
            }
            commonSearchResult2.addCombo(nozVar);
            return;
        }
        new Handler(Looper.getMainLooper()).post(new b(scopeDataSource));
    }

    @Override // tb.npb
    public void b(j initDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeaab68d", new Object[]{this, initDataSource, new Boolean(z)});
            return;
        }
        q.c(initDataSource, "initDataSource");
        super.b(initDataSource, z);
        if (!z) {
            return;
        }
        initDataSource.a(true);
        e();
        CommonSearchResult commonSearchResult = (CommonSearchResult) initDataSource.getTotalSearchResult();
        if (commonSearchResult == null || commonSearchResult.comboSize() != 0) {
            return;
        }
        if (this.c && r.cs()) {
            noz nozVar = new noz();
            nozVar.a(MetaState.EMPTY);
            CommonSearchResult commonSearchResult2 = (CommonSearchResult) initDataSource.getTotalSearchResult();
            if (commonSearchResult2 == null) {
                return;
            }
            commonSearchResult2.addCombo(nozVar);
            return;
        }
        new Handler(Looper.getMainLooper()).post(new a(initDataSource));
    }

    @Override // tb.npb, com.taobao.search.refactor.p
    public boolean a(j scopeDataSource, e combo, ListStyle newStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("836f8c28", new Object[]{this, scopeDataSource, combo, newStyle})).booleanValue();
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(combo, "combo");
        q.c(newStyle, "newStyle");
        combo.a(newStyle);
        g d = a().d((com.taobao.search.refactor.g) scopeDataSource);
        if (d != null) {
            d.n();
        }
        return true;
    }

    @Override // tb.npb
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(Map<String, String> map, e combo, j scopeDataSource, com.taobao.android.meta.data.e<e> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae0daf6", new Object[]{this, map, combo, scopeDataSource, eVar});
            return;
        }
        q.c(map, "map");
        q.c(combo, "combo");
        q.c(scopeDataSource, "scopeDataSource");
        super.a(map, combo, scopeDataSource, eVar);
        map.put("m", "guide_combo");
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) ((j) a().b()).getTotalSearchResult();
        if (commonSearchResult == null) {
            return;
        }
        int comboSize = commonSearchResult.comboSize();
        for (int i = 0; i < comboSize; i++) {
            e combo = commonSearchResult.getCombo(i);
            if (!(combo instanceof noz)) {
                combo = null;
            }
            noz nozVar = (noz) combo;
            if (nozVar != null) {
                if (nozVar.Y() != null) {
                    Boolean Y = nozVar.Y();
                    if (Y == null) {
                        q.a();
                    }
                    if (Y.booleanValue()) {
                        ntr ntrVar = ntr.INSTANCE;
                        Activity activity = a().c().getActivity();
                        q.a((Object) activity, "controller.pageWidget.activity");
                        String Q = nozVar.Q();
                        if (Q == null) {
                            Q = "";
                        }
                        ntrVar.a(activity, Q, "comboState", "5");
                    }
                }
                ntr ntrVar2 = ntr.INSTANCE;
                Activity activity2 = a().c().getActivity();
                q.a((Object) activity2, "controller.pageWidget.activity");
                String Q2 = nozVar.Q();
                if (Q2 == null) {
                    Q2 = "";
                }
                ntrVar2.a(activity2, Q2, "comboState", "0");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(com.taobao.search.refactor.e r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.nox.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r3 = 0
            r1[r3] = r4
            r1[r2] = r5
            java.lang.String r5 = "7dbf1b8b"
            r0.ipc$dispatch(r5, r1)
            return
        L15:
            if (r5 != 0) goto L18
            return
        L18:
            com.taobao.android.meta.structure.state.MetaState r0 = r5.k()
            int[] r1 = tb.noy.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            java.lang.String r1 = "0"
            if (r0 == r2) goto L33
            if (r0 == r3) goto L3e
            r2 = 3
            if (r0 == r2) goto L3b
            r2 = 4
            if (r0 == r2) goto L38
            r2 = 5
            if (r0 == r2) goto L35
        L33:
            r0 = r1
            goto L40
        L35:
            java.lang.String r0 = "4"
            goto L40
        L38:
            java.lang.String r0 = "2"
            goto L40
        L3b:
            java.lang.String r0 = "3"
            goto L40
        L3e:
            java.lang.String r0 = "1"
        L40:
            boolean r2 = r5 instanceof tb.noz
            if (r2 == 0) goto L4c
            r2 = r5
            tb.noz r2 = (tb.noz) r2
            boolean r2 = r2.ag()
            goto L50
        L4c:
            boolean r2 = r5.e()
        L50:
            boolean r1 = kotlin.jvm.internal.q.a(r0, r1)
            if (r1 == 0) goto L5a
            if (r2 == 0) goto L5a
            java.lang.String r0 = "5"
        L5a:
            tb.ntr r1 = tb.ntr.INSTANCE
            com.taobao.search.refactor.g r2 = r4.a()
            com.taobao.android.meta.structure.page.f r2 = r2.c()
            android.app.Activity r2 = r2.getActivity()
            java.lang.String r3 = "controller.pageWidget.activity"
            kotlin.jvm.internal.q.a(r2, r3)
            tb.noz r5 = (tb.noz) r5
            java.lang.String r5 = r5.Q()
            if (r5 != 0) goto L77
            java.lang.String r5 = ""
        L77:
            java.lang.String r3 = "comboState"
            r1.a(r2, r5, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nox.a(com.taobao.search.refactor.e):void");
    }

    @Override // tb.npb
    public void a(j scopeDataSource, e eVar, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c3343a", new Object[]{this, scopeDataSource, eVar, new Boolean(z), map});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        super.a(scopeDataSource, eVar, z, map);
        a(eVar);
    }

    @Override // tb.npb
    public void a(j scopeDataSource, e eVar, boolean z, boolean z2, com.taobao.android.meta.data.e<e> config) {
        h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b59c1", new Object[]{this, scopeDataSource, eVar, new Boolean(z), new Boolean(z2), config});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(config, "config");
        super.a(scopeDataSource, eVar, z, z2, config);
        a(eVar);
        CommonSearchResult commonSearchResult = (CommonSearchResult) scopeDataSource.getTotalSearchResult();
        if (commonSearchResult == null || !commonSearchResult.hasSectionClip() || commonSearchResult.getLastCombo() != eVar || eVar == null || !eVar.e()) {
            return;
        }
        if (!(eVar instanceof noz)) {
            eVar = null;
        }
        noz nozVar = (noz) eVar;
        if (nozVar == null) {
            return;
        }
        for (BaseCellBean baseCellBean : nozVar.J()) {
            h hVar2 = baseCellBean.ownedSectionStyle;
            if (hVar2 != null && hVar2.e() && (hVar = baseCellBean.ownedSectionStyle) != null) {
                hVar.a(false);
            }
        }
    }

    @Override // tb.npb
    public void a(j scopeDataSource, e src, e incoming, com.taobao.android.meta.data.e<e> config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0cf0e4", new Object[]{this, scopeDataSource, src, incoming, config});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(src, "src");
        q.c(incoming, "incoming");
        q.c(config, "config");
        src.a(incoming);
        noz nozVar = (noz) src;
        nozVar.J().clear();
        nozVar.J().addAll(((noz) incoming).J());
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str != null) {
            CommonSearchResult commonSearchResult = (CommonSearchResult) ((j) a().b()).getTotalSearchResult();
            if (commonSearchResult == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.MSearchResult");
            }
            MSearchResult mSearchResult = (MSearchResult) commonSearchResult;
            int comboSize = mSearchResult.comboSize();
            for (int i = 0; i < comboSize; i++) {
                e combo = mSearchResult.getCombo(i);
                if (combo == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.ns.NSCombo");
                }
                noz nozVar = (noz) combo;
                if (q.a((Object) nozVar.Q(), (Object) str)) {
                    a().a(0, nozVar.m(), 0, true);
                    return;
                }
            }
        }
    }
}
