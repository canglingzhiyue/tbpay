package com.taobao.search.refactor;

import android.app.Activity;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.srp.c;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.uikit.NxTabLayout;
import com.taobao.search.common.util.r;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import kotlin.TypeCastException;
import tb.htk;
import tb.htl;
import tb.ioy;
import tb.irc;
import tb.ire;
import tb.irp;
import tb.irq;
import tb.irt;
import tb.iru;
import tb.isj;
import tb.isx;
import tb.ite;
import tb.itk;
import tb.itn;
import tb.ito;
import tb.iuk;
import tb.ium;
import tb.iuo;
import tb.iur;
import tb.kge;
import tb.nnh;
import tb.ntf;
import tb.ntr;
import tb.nvj;
import tb.nwk;
import tb.nxh;

/* loaded from: classes7.dex */
public class m extends c<j, e, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.search.sf.widgets.headerskin.a c;
    private com.taobao.search.sf.widgets.headerskin.c d;
    private boolean e;
    private iuk<BaseTypedBean, ?> f;

    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            iru model = (iru) m.this.getModel();
            kotlin.jvm.internal.q.a((Object) model, "model");
            com.taobao.android.searchbaseframe.context.a f = model.f();
            if (f == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.context.CommonSearchContext");
            }
            if (((CommonSearchContext) f).isGallerySrp()) {
                TUrlImageView tUrlImageView = new TUrlImageView(m.this.getActivity());
                tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                tUrlImageView.setImageUrl(r.ay());
                com.taobao.android.meta.structure.page.b iView = (com.taobao.android.meta.structure.page.b) m.this.J();
                kotlin.jvm.internal.q.a((Object) iView, "iView");
                FrameLayout b = iView.b();
                if (b == null) {
                    kotlin.jvm.internal.q.a();
                }
                b.addView(tUrlImageView, 0, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            m mVar = m.this;
            Activity activity = mVar.getActivity();
            m mVar2 = m.this;
            m.a(mVar, new com.taobao.search.sf.widgets.headerskin.a(activity, mVar2, (iru) mVar2.getModel(), m.b(m.this), new iur() { // from class: com.taobao.search.refactor.m.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iur
                public void b(View componentView) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, componentView});
                    } else {
                        kotlin.jvm.internal.q.c(componentView, "componentView");
                    }
                }

                @Override // tb.iur
                public void a(View componentView) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, componentView});
                        return;
                    }
                    kotlin.jvm.internal.q.c(componentView, "componentView");
                    ((com.taobao.android.meta.structure.page.b) m.this.J()).a(componentView);
                }
            }));
            com.taobao.search.sf.widgets.headerskin.a a2 = m.a(m.this);
            if (a2 == null) {
                kotlin.jvm.internal.q.a();
            }
            a2.a(true);
            com.taobao.search.sf.widgets.headerskin.a a3 = m.a(m.this);
            if (a3 == null) {
                kotlin.jvm.internal.q.a();
            }
            a3.ensureView();
            com.taobao.search.sf.widgets.headerskin.a a4 = m.a(m.this);
            if (a4 == null) {
                kotlin.jvm.internal.q.a();
            }
            a4.attachToContainer();
        }
    }

    static {
        kge.a(394041906);
    }

    public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 103921018) {
            if (hashCode == 445253000) {
                super.b((MetaResult) objArr[0]);
                return null;
            } else if (hashCode != 1628600297) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.a((MetaResult) objArr[0]);
                return null;
            }
        }
        return new Boolean(super.o());
    }

    public static final /* synthetic */ com.taobao.search.sf.widgets.headerskin.a a(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.sf.widgets.headerskin.a) ipChange.ipc$dispatch("5b5cddb0", new Object[]{mVar}) : mVar.c;
    }

    public static final /* synthetic */ void a(m mVar, com.taobao.search.sf.widgets.headerskin.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("493e295a", new Object[]{mVar, aVar});
        } else {
            mVar.c = aVar;
        }
    }

    public static final /* synthetic */ ViewGroup b(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("b435cf51", new Object[]{mVar}) : mVar.getContainer();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.taobao.android.meta.srp.a config, Activity activity, ium parent, iru<j> model, ViewGroup viewGroup, iur iurVar) {
        super(config, activity, parent, model, viewGroup, iurVar);
        kotlin.jvm.internal.q.c(config, "config");
        kotlin.jvm.internal.q.c(activity, "activity");
        kotlin.jvm.internal.q.c(parent, "parent");
        kotlin.jvm.internal.q.c(model, "model");
        subscribeEvent(this);
    }

    @Override // com.taobao.android.meta.srp.c
    public void a(iuk<?, ?> searchBarWidget, MetaResult<e> result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93929b8", new Object[]{this, searchBarWidget, result});
            return;
        }
        kotlin.jvm.internal.q.c(searchBarWidget, "searchBarWidget");
        kotlin.jvm.internal.q.c(result, "result");
        if (!(searchBarWidget instanceof com.taobao.search.sf.widgets.searchbar.g)) {
            return;
        }
        ((com.taobao.search.sf.widgets.searchbar.g) searchBarWidget).a((MSearchResult) result);
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        iru model = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        irt e = model.e();
        kotlin.jvm.internal.q.a((Object) e, "model.pageModel");
        this.d = new com.taobao.search.sf.widgets.headerskin.c(getActivity(), this, e);
        com.taobao.search.sf.widgets.headerskin.c cVar = this.d;
        if (cVar == null) {
            kotlin.jvm.internal.q.b("promotionWidget");
        }
        e.a(nvj.CONFIG_KEY, cVar);
    }

    public final void a(j dataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc16166", new Object[]{this, dataSource});
            return;
        }
        kotlin.jvm.internal.q.c(dataSource, "dataSource");
        com.taobao.search.sf.widgets.headerskin.c cVar = this.d;
        if (cVar == null) {
            kotlin.jvm.internal.q.b("promotionWidget");
        }
        cVar.a(dataSource);
    }

    @Override // com.taobao.android.meta.srp.c, com.taobao.android.meta.structure.page.f
    public void a(MetaResult<e> result) {
        ite z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611277e9", new Object[]{this, result});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        long currentTimeMillis = System.currentTimeMillis();
        iru model = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        com.taobao.android.searchbaseframe.datasource.impl.a d = model.d();
        kotlin.jvm.internal.q.a((Object) d, "model.scopeDatasource");
        ioy srpLifeCycleWatcher = ((j) d).getSrpLifeCycleWatcher();
        if (srpLifeCycleWatcher != null) {
            srpLifeCycleWatcher.a(nnh.SPAN_SETUP_PAGE);
        }
        ntr ntrVar = ntr.INSTANCE;
        Activity activity = getActivity();
        kotlin.jvm.internal.q.a((Object) activity, "activity");
        ntrVar.a(activity, "page", "stickyComboPosition", "0");
        CommonSearchResult commonSearchResult = (CommonSearchResult) (!(result instanceof CommonSearchResult) ? null : result);
        if (commonSearchResult != null && commonSearchResult.isHalfStickySearchBar && (z = z()) != null) {
            z.a(itk.TYPE_HALF_STICKY_SEARCHBAR);
        }
        e(result);
        super.a(result);
        com.taobao.search.sf.widgets.headerskin.c cVar = this.d;
        if (cVar == null) {
            kotlin.jvm.internal.q.b("promotionWidget");
        }
        iru model2 = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model2, "model");
        cVar.a((com.taobao.search.sf.datasource.c) model2.c());
        if (srpLifeCycleWatcher != null) {
            srpLifeCycleWatcher.a(nnh.SPAN_SETUP_PAGE, (Map<String, Object>) null);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        iru model3 = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model3, "model");
        com.taobao.android.searchbaseframe.datasource.impl.a d2 = model3.d();
        kotlin.jvm.internal.q.a((Object) d2, "model.scopeDatasource");
        com.taobao.android.searchbaseframe.track.d firstRequestPerf = ((j) d2).getFirstRequestPerf();
        if (firstRequestPerf == null || firstRequestPerf.A != 0) {
            return;
        }
        firstRequestPerf.A = currentTimeMillis2;
    }

    private final void e(MetaResult<e> metaResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46f0ae65", new Object[]{this, metaResult});
            return;
        }
        if (!(metaResult instanceof MSearchResult)) {
            metaResult = null;
        }
        MSearchResult mSearchResult = (MSearchResult) metaResult;
        if (mSearchResult == null) {
            return;
        }
        if (!mSearchResult.newSearch && !mSearchResult.guideSearch) {
            return;
        }
        D();
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
        } else {
            getActivity().runOnUiThread(new a());
        }
    }

    @Override // com.taobao.android.meta.srp.c
    public htk i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (htk) ipChange.ipc$dispatch("4c92d717", new Object[]{this});
        }
        irq creatorParam = I();
        kotlin.jvm.internal.q.a((Object) creatorParam, "creatorParam");
        creatorParam.g = new iuo();
        iru model = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        com.taobao.android.searchbaseframe.datasource.impl.a c = model.c();
        kotlin.jvm.internal.q.a((Object) c, "model.initDatasource");
        CommonSearchResult commonSearchResult = (CommonSearchResult) ((j) c).getTotalSearchResult();
        if (commonSearchResult != null && commonSearchResult.newSearch && !commonSearchResult.guideSearch) {
            ntf ntfVar = new ntf(creatorParam.c, creatorParam.d, creatorParam.e, creatorParam.f, creatorParam.g);
            ntfVar.attachToContainer();
            return ntfVar;
        }
        return new irc(creatorParam.c, creatorParam.d, creatorParam.e, creatorParam.f, creatorParam.g);
    }

    @Override // com.taobao.android.meta.srp.c
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        htl a2 = a();
        if (a2 == null) {
            return;
        }
        View h = a2.h();
        if (!(h instanceof NxTabLayout)) {
            h = null;
        }
        NxTabLayout nxTabLayout = (NxTabLayout) h;
        if (nxTabLayout == null) {
            return;
        }
        if (au_().isEmpty()) {
            nxTabLayout.setTopRadius(0);
            ViewCompat.setBackground(nxTabLayout, null);
            htk e = e();
            if (e == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.tab.BaseSrpTabWidget");
            }
            ire ireVar = (ire) ((irc) e).J();
            if (ireVar == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.widgets.tab.SearchSrpTabView");
            }
            ((nxh) ireVar).g();
            return;
        }
        Activity activity = getActivity();
        if (!(activity instanceof com.taobao.android.xsearchplugin.muise.f)) {
            activity = null;
        }
        com.taobao.android.xsearchplugin.muise.f fVar = (com.taobao.android.xsearchplugin.muise.f) activity;
        if (fVar != null && fVar.g()) {
            nxTabLayout.setBackgroundResource(R.color.tbsearch_main_card_bg_night);
        } else {
            nxTabLayout.setBackgroundColor(-1);
        }
        Activity activity2 = getActivity();
        kotlin.jvm.internal.q.a((Object) activity2, "activity");
        nxTabLayout.setTopRadius(activity2.getResources().getDimensionPixelSize(R.dimen.tbsearch_tab_radius));
        htk e2 = e();
        if (e2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.tab.BaseSrpTabWidget");
        }
        ire ireVar2 = (ire) ((irc) e2).J();
        if (ireVar2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.widgets.tab.SearchSrpTabView");
        }
        ((nxh) ireVar2).f();
    }

    @Override // com.taobao.android.meta.srp.c
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        iru model = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        com.taobao.android.searchbaseframe.datasource.impl.a c = model.c();
        kotlin.jvm.internal.q.a((Object) c, "model.initDatasource");
        CommonSearchResult commonSearchResult = (CommonSearchResult) ((j) c).getTotalSearchResult();
        if (commonSearchResult != null && commonSearchResult.newSearch && !commonSearchResult.subTabNewSearch) {
            return true;
        }
        return super.o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r0.size() <= 1) goto L20;
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [android.view.View] */
    @Override // com.taobao.android.meta.srp.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int n() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.refactor.m.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r4
            java.lang.String r2 = "6239de8"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L19:
            tb.iuk<com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean, ?> r0 = r4.f
            if (r0 == 0) goto L27
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L27
            int r2 = r0.getMeasuredHeight()
        L27:
            java.lang.Object r0 = r4.getModel()
            tb.iru r0 = (tb.iru) r0
            java.lang.String r1 = "model"
            kotlin.jvm.internal.q.a(r0, r1)
            com.taobao.android.searchbaseframe.datasource.impl.a r0 = r0.c()
            java.lang.String r1 = "model.initDatasource"
            kotlin.jvm.internal.q.a(r0, r1)
            com.taobao.search.refactor.j r0 = (com.taobao.search.refactor.j) r0
            com.taobao.android.searchbaseframe.datasource.result.SearchResult r0 = r0.getTotalSearchResult()
            com.taobao.search.sf.datasource.CommonSearchResult r0 = (com.taobao.search.sf.datasource.CommonSearchResult) r0
            if (r0 == 0) goto L62
            java.lang.String r1 = "it"
            kotlin.jvm.internal.q.a(r0, r1)
            java.util.List r1 = r0.getTabs()
            if (r1 == 0) goto L61
            java.util.List r0 = r0.getTabs()
            if (r0 != 0) goto L5b
            kotlin.jvm.internal.q.a()
        L5b:
            int r0 = r0.size()
            if (r0 > r3) goto L62
        L61:
            return r2
        L62:
            r0 = 48
            int r0 = com.taobao.search.common.util.l.a(r0)
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.refactor.m.n():int");
    }

    public final void onEventMainThread(nwk.b event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1245e335", new Object[]{this, event});
            return;
        }
        kotlin.jvm.internal.q.c(event, "event");
        this.e = true;
    }

    @Override // com.taobao.android.meta.srp.c
    public void b(MetaResult<e> result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a8a0588", new Object[]{this, result});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        if (!this.e) {
            super.b(result);
        }
        BaseTypedBean tabHeader = ((MSearchResult) result).getTabHeader();
        if (tabHeader == null) {
            return;
        }
        iru model = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        com.taobao.android.searchbaseframe.datasource.impl.a c = model.c();
        kotlin.jvm.internal.q.a((Object) c, "model.initDatasource");
        j jVar = (j) c;
        if (isj.a(tabHeader)) {
            TemplateBean template = jVar.getTemplate(tabHeader.type);
            if (template != null) {
                ito a2 = v().f().a(new irp(I(), template));
                if (a2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.widget.IViewWidget<com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean, *>");
                }
                this.f = a2;
            }
        } else if (isj.b(tabHeader)) {
            TemplateBean template2 = jVar.getTemplate(tabHeader.type);
            if (template2 != null) {
                itn a3 = v().e().a(new irp(I(), template2));
                if (a3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.widget.IViewWidget<com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean, *>");
                }
                this.f = a3;
            }
        } else {
            iuk<BaseTypedBean, ?> a4 = c().i().a((Class<? extends BaseTypedBean>) tabHeader.getClass(), (Class) I());
            if (a4 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.widget.IViewWidget<com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean, *>");
            }
            this.f = a4;
        }
        iuk<BaseTypedBean, ?> iukVar = this.f;
        if (iukVar == null) {
            return;
        }
        if (iukVar == null) {
            kotlin.jvm.internal.q.a();
        }
        iukVar.ensureView();
        iuk<BaseTypedBean, ?> iukVar2 = this.f;
        if (iukVar2 == null) {
            kotlin.jvm.internal.q.a();
        }
        iukVar2.bindWithData(tabHeader);
        ite iteVar = new ite(this.f);
        iteVar.a("sticky");
        iteVar.a(false);
        ((com.taobao.android.meta.structure.page.b) J()).d().addHeader(iteVar);
    }

    public final void onEventMainThread(isx event) {
        BaseCellBean cell;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b9d727", new Object[]{this, event});
            return;
        }
        kotlin.jvm.internal.q.c(event, "event");
        iru model = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        com.taobao.android.searchbaseframe.datasource.impl.a c = model.c();
        kotlin.jvm.internal.q.a((Object) c, "model.initDatasource");
        CommonSearchResult commonSearchResult = (CommonSearchResult) ((j) c).getTotalSearchResult();
        if (commonSearchResult == null || (cell = commonSearchResult.getCell(event.b)) == null) {
            return;
        }
        com.taobao.android.meta.data.a aVar = cell.combo;
        if (aVar == null) {
            kotlin.jvm.internal.q.a();
        }
        int t = aVar.t();
        ntr ntrVar = ntr.INSTANCE;
        Activity activity = getActivity();
        kotlin.jvm.internal.q.a((Object) activity, "activity");
        ntrVar.a(activity, "page", "stickyComboPosition", String.valueOf(t));
    }
}
