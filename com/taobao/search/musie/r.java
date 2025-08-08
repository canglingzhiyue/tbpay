package com.taobao.search.musie;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.xsearchplugin.muise.c;
import com.taobao.search.common.util.k;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.sf.InshopResultActivity;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.realtimetag.IRealTimeTagContainer;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.HashMap;
import java.util.Map;
import tb.hwe;
import tb.imo;
import tb.iob;
import tb.ioy;
import tb.ipk;
import tb.ipq;
import tb.iru;
import tb.ise;
import tb.isr;
import tb.isz;
import tb.itd;
import tb.iug;
import tb.ium;
import tb.jxz;
import tb.jyx;
import tb.kge;
import tb.nnd;
import tb.nnh;
import tb.noa;
import tb.nog;
import tb.nou;
import tb.nsp;
import tb.nus;
import tb.nwf;
import tb.nwg;
import tb.nwj;
import tb.pop;

/* loaded from: classes7.dex */
public class r extends c<iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>>> implements GestureDetector.OnGestureListener, IRealTimeTagContainer, com.taobao.search.sf.realtimetag.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ise<ipq, r> CREATOR;
    private nwg c_;
    private String m;
    private String n;
    private MuiseCellBean o;
    private long p;
    private FrameLayout q;
    private TextView r;
    private GestureDetector t;
    private itd u;
    private RecyclerView v;

    public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1795038358:
                super.a((View) objArr[0]);
                return null;
            case -1321168327:
                return new Boolean(super.b((String) objArr[0], (JSONObject) objArr[1], (isr.c.a) objArr[2], (isr.c.a) objArr[3]));
            case -749917094:
                return new Boolean(super.a((String) objArr[0], (JSONObject) objArr[1], (isr.c.a) objArr[2], (isr.c.a) objArr[3]));
            case -700316558:
                return super.a((MuiseCellBean) objArr[0], ((Number) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue(), (ListStyle) objArr[3]);
            case -604580575:
                super.a((com.taobao.android.xsearchplugin.muise.a) objArr[0]);
                return null;
            case 66056653:
                super.F();
                return null;
            case 66974264:
                super.onRenderSuccess((com.taobao.android.weex_framework.p) objArr[0]);
                return null;
            case 74368342:
                super.O();
                return null;
            case 75291863:
                super.P();
                return null;
            case 93762287:
                return new Boolean(super.d());
            case 106691577:
                super.r();
                return null;
            case 107615098:
                super.s();
                return null;
            case 108538619:
                super.t();
                return null;
            case 113156224:
                super.y();
                return null;
            case 118043724:
                super.a(((Number) objArr[0]).intValue(), (MuiseCellBean) objArr[1]);
                return null;
            case 300463397:
                super.a((com.taobao.android.weex_framework.p) objArr[0]);
                return null;
            case 410220614:
                return new Boolean(super.a((ListStyle) objArr[0], (MuiseCellBean) objArr[1]));
            case 2094523359:
                super.onRefreshSuccess((com.taobao.android.weex_framework.p) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.search.sf.realtimetag.IRealTimeTagContainer
    public void clearTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22e8814", new Object[]{this});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b398c1c3", new Object[]{this, motionEvent});
        }
    }

    public static /* synthetic */ MuiseCellBean a(r rVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MuiseCellBean) ipChange.ipc$dispatch("af3badfa", new Object[]{rVar}) : rVar.o;
    }

    public static /* synthetic */ nwg a(r rVar, nwg nwgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nwg) ipChange.ipc$dispatch("d98666b3", new Object[]{rVar, nwgVar});
        }
        rVar.c_ = nwgVar;
        return nwgVar;
    }

    public static /* synthetic */ void a(r rVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4969103", new Object[]{rVar, new Boolean(z), new Boolean(z2)});
        } else {
            rVar.a(z, z2);
        }
    }

    public static /* synthetic */ ListStyle b(r rVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListStyle) ipChange.ipc$dispatch("b19b3b9f", new Object[]{rVar}) : rVar.u();
    }

    public static /* synthetic */ nwg c(r rVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nwg) ipChange.ipc$dispatch("564a7467", new Object[]{rVar}) : rVar.c_;
    }

    static {
        kge.a(1726791584);
        kge.a(512613135);
        kge.a(-1225658221);
        kge.a(1204268671);
        kge.a(751704130);
        CREATOR = new ise<ipq, r>() { // from class: com.taobao.search.musie.r.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public r a(ipq ipqVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("fa5e3e49", new Object[]{this, ipqVar}) : new r(ipqVar.c, ipqVar.e, ipqVar.d, ipqVar.b, ipqVar.f, ipqVar.f29218a);
            }
        };
    }

    public r(Activity activity, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, ium iumVar, ListStyle listStyle, ViewGroup viewGroup, int i) {
        super(activity, c(activity, viewGroup), iumVar, listStyle, i, iruVar);
        this.m = "";
        this.n = "";
        this.c_ = null;
        if (viewGroup instanceof RecyclerView) {
            this.v = (RecyclerView) viewGroup;
        }
    }

    public r(Activity activity, View view, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, ium iumVar, ListStyle listStyle, ViewGroup viewGroup, int i) {
        super(activity, view, iumVar, listStyle, i, iruVar);
        this.m = "";
        this.n = "";
        this.c_ = null;
    }

    public static View c(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f5e9a8df", new Object[]{context, viewGroup}) : new MuiseContainer(context);
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        super.F();
        if (this.itemView instanceof MuiseContainer) {
            this.q = ((MuiseContainer) this.itemView).getInnerCardContainer();
        } else {
            this.q = (FrameLayout) this.itemView.findViewById(R.id.fl_inner_card_container);
        }
        if (!(this.itemView instanceof com.taobao.android.searchbaseframe.uikit.b)) {
            return;
        }
        this.t = new GestureDetector(getActivity().getApplicationContext(), this);
        ((com.taobao.android.searchbaseframe.uikit.b) this.itemView).setOnInterceptTouchEventListener(new com.taobao.search.common.util.e(this.t));
    }

    @Override // com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.muise.b
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        super.a(view);
        if (!(this.b instanceof com.taobao.android.xsearchplugin.muise.f) || !((com.taobao.android.xsearchplugin.muise.f) this.b).g()) {
            return;
        }
        view.setBackgroundResource(R.color.tbsearch_main_card_bg_night);
    }

    @Override // com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.muise.b, com.taobao.android.weex_framework.g
    public void onRenderSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        super.onRenderSuccess(pVar);
        if (m() != 0) {
            return;
        }
        aj();
    }

    @Override // com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.muise.b, com.taobao.android.weex_framework.g
    public void onRefreshSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            return;
        }
        super.onRefreshSuccess(pVar);
        if (m() != 0) {
            return;
        }
        aj();
    }

    @Override // com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.muise.k
    public void a(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{this, pVar});
            return;
        }
        super.a(pVar);
        if (!(getActivity() instanceof nus) || !((nus) getActivity()).x()) {
            z = false;
        }
        pVar.addInstanceEnv("tb2021", String.valueOf(z));
    }

    private void e(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a546db", new Object[]{this, muiseCellBean});
        } else if (!com.taobao.search.common.util.c.a()) {
        } else {
            if (this.r == null) {
                this.r = new TextView(getActivity());
                this.r.setTextColor(-16711936);
                if (this.f.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.f.getParent()).addView(this.r);
                }
            }
            try {
                String substring = this.o.rn.substring(0, 8);
                if (!StringUtils.isEmpty(this.o.mMuiseBean.model.getJSONObject("utLogMap").getString("replaced_nid"))) {
                    substring = substring + " reRanked";
                }
                this.r.setText(substring);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public void a(com.taobao.android.xsearchplugin.muise.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf6d521", new Object[]{this, aVar});
            return;
        }
        super.a(aVar);
        new d().a(aVar, ((iru) j()).f().getBooleanParam(noa.KEY_SEARCH_ELDER_HOME_OPEN));
        aVar.b(!com.taobao.search.common.util.n.INSTANCE.g());
    }

    @Override // com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.muise.b, tb.itd
    public void a(int i, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709344c", new Object[]{this, new Integer(i), muiseCellBean});
            return;
        }
        if (i == 0) {
            ai();
        }
        this.o = muiseCellBean;
        MuiseCellBean muiseCellBean2 = this.o;
        String str = "";
        this.m = muiseCellBean2 != null ? muiseCellBean2.type : str;
        TemplateBean a2 = this.f16257a.a(c(this.o));
        if (a2 != null) {
            str = a2.version;
        }
        this.n = str;
        if (this.b instanceof ipk) {
            ((ipk) this.b).d().a(a2.templateName, a2.version, this.f16257a);
        }
        super.a(i, muiseCellBean);
        V();
        if (com.taobao.search.common.util.j.INSTANCE.e(imo.b())) {
            e(muiseCellBean);
        }
        f(muiseCellBean);
    }

    private void ai() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab633caf", new Object[]{this});
            return;
        }
        com.taobao.android.searchbaseframe.track.d firstRequestPerf = ((iru) j()).d().getFirstRequestPerf();
        if (firstRequestPerf == null || firstRequestPerf.r || firstRequestPerf.t != 0) {
            return;
        }
        firstRequestPerf.t = System.currentTimeMillis();
        ioy srpLifeCycleWatcher = af().getSrpLifeCycleWatcher();
        if (srpLifeCycleWatcher == null) {
            return;
        }
        srpLifeCycleWatcher.a(nnh.SPAN_CELL);
    }

    private void aj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab715430", new Object[]{this});
            return;
        }
        com.taobao.android.searchbaseframe.track.d firstRequestPerf = ((iru) j()).d().getFirstRequestPerf();
        if (firstRequestPerf == null || firstRequestPerf.r || firstRequestPerf.s == 0 || firstRequestPerf.u != 0) {
            return;
        }
        firstRequestPerf.u = System.currentTimeMillis();
        firstRequestPerf.r = true;
        hwe.a(firstRequestPerf);
        ioy srpLifeCycleWatcher = af().getSrpLifeCycleWatcher();
        if (srpLifeCycleWatcher == null) {
            return;
        }
        srpLifeCycleWatcher.a(nnh.SPAN_CELL, (Map<String, Object>) null);
        HashMap hashMap = new HashMap();
        hashMap.put("isPassiveLaunch", Boolean.valueOf(com.taobao.android.launcher.bootstrap.tao.ability.b.d(getActivity().getIntent())));
        hashMap.put("apm_time", Long.valueOf(SystemClock.uptimeMillis()));
        hashMap.put("isPreloadRequest", Boolean.valueOf(com.taobao.search.common.util.u.d()));
        srpLifeCycleWatcher.b("search_render_finish", hashMap);
    }

    private void f(MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0064aba", new Object[]{this, muiseCellBean});
        } else if (!(((iru) j()).d() instanceof com.taobao.search.sf.datasource.c)) {
        } else {
            U();
        }
    }

    private void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3525c", new Object[]{this});
            return;
        }
        this.itemView.setBackgroundDrawable(null);
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        this.itemView.setClipToOutline(false);
        this.itemView.setOutlineProvider(null);
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
        } else if (this.o == null) {
        } else {
            Y();
            this.q.removeAllViews();
            Object obj = this.o.mExtraObj.get("dynamicCardBean");
            if (!(obj instanceof DynamicCardBean)) {
                return;
            }
            DynamicCardBean dynamicCardBean = (DynamicCardBean) obj;
            itd a2 = com.taobao.search.sf.realtimetag.c.a(this, getActivity(), dynamicCardBean, m(), this.o.mMuiseBean.model);
            this.q.addView(a2.itemView);
            if (dynamicCardBean.firstRender) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f);
                scaleAnimation.setDuration(300L);
                a2.itemView.startAnimation(scaleAnimation);
                dynamicCardBean.firstRender = false;
            }
            this.u = a2;
        }
    }

    private void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbb060", new Object[]{this});
            return;
        }
        itd itdVar = this.u;
        if (itdVar == null) {
            return;
        }
        this.q.removeView(itdVar.itemView);
        this.u.x();
        this.u = null;
    }

    @Override // tb.itd
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        super.r();
        Y();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.muise.b
    public Map<String, Object> a(MuiseCellBean muiseCellBean, int i, boolean z, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6420472", new Object[]{this, muiseCellBean, new Integer(i), new Boolean(z), listStyle});
        }
        Map<String, Object> a2 = super.a(muiseCellBean, i, z, listStyle);
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((iru) j()).d().getLastSearchResult();
        if (baseSearchResult instanceof CommonSearchResult) {
            a2.put("iconData", ((CommonSearchResult) baseSearchResult).nxRawIcon);
        }
        a(a2, muiseCellBean.mMuiseBean);
        return a2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.muise.b
    public boolean a(ListStyle listStyle, MuiseCellBean muiseCellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18737846", new Object[]{this, listStyle, muiseCellBean})).booleanValue() : super.a(listStyle, muiseCellBean) || Z();
    }

    private boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("509c7e5", new Object[]{this})).booleanValue();
        }
        if (l() == null) {
            return false;
        }
        Object obj = l().mExtraObj.get("fullSpan");
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            return true;
        }
        JSONObject b = com.taobao.android.searchbaseframe.util.a.b(l().mMuiseBean.model, "info");
        if (b == null) {
            return false;
        }
        return b.getBooleanValue("adjustFullSpan");
    }

    public void a(Map<String, Object> map, MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9adda4c", new Object[]{this, map, muiseBean});
            return;
        }
        JSONObject jSONObject = muiseBean.pageInfoExtraStatus;
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.put("pageName", (Object) com.ut.mini.l.getInstance().getCurrentPageName());
        map.put("pageInfo", jSONObject2);
    }

    @Override // com.taobao.android.xsearchplugin.muise.c
    public void a(Map<String, Object> map, MuiseCellBean muiseCellBean) {
        com.taobao.search.sf.datasource.c cVar;
        CommonSearchResult commonSearchResult;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cef3c8a", new Object[]{this, map, muiseCellBean});
            return;
        }
        String currentPageName = com.ut.mini.l.getInstance().getCurrentPageName();
        map.put("pageName", currentPageName);
        map.put("rainbow", com.taobao.search.rainbow.a.c());
        map.put("hasDynamicCard", String.valueOf(this.o.mExtraObj.get("dynamicCardBean") != null));
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(jyx.DIMENSION_BUSINESS_NAME, com.taobao.search.sf.o.BIZ_TBSEARCH);
        arrayMap.put("tItemType", this.m);
        arrayMap.put("sversion", noa.SERVER_VERSION_VALUE);
        arrayMap.put(jyx.DIMENSION_JSVERSION, this.n);
        try {
            arrayMap.put("rainbow", com.taobao.search.rainbow.a.c(String.format("tbAndroid%sEnableLT", this.m)));
        } catch (Exception unused) {
            com.taobao.android.searchbaseframe.util.k.a("SearchMuiseViewHolder", "getBucketIdFail");
        }
        map.put("hubbleInfo", arrayMap);
        String str = null;
        if (((iru) j()).d() instanceof com.taobao.search.sf.datasource.c) {
            cVar = (com.taobao.search.sf.datasource.c) ((iru) j()).d();
            commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult();
            if (commonSearchResult != null) {
                Map<String, String> map2 = commonSearchResult.getMainInfo().pageTraceArgs;
                if (map2 != null) {
                    str = map2.get("spm-cnt");
                    map.put("spm", str == null ? "" : str);
                }
                map.put(k.a.PARAM_KEY_FIRST_RN, commonSearchResult.getMainInfo().rn);
                map.put("switches", commonSearchResult.switches);
            }
        } else {
            cVar = null;
            commonSearchResult = null;
        }
        MuiseCellBean muiseCellBean2 = this.o;
        if (muiseCellBean2 != null) {
            map.put("srp_seq", String.valueOf(muiseCellBean2.pageNo));
            map.put("srp_pos", String.valueOf(this.o.pagePos));
            map.put("pageSize", String.valueOf(this.o.pageSize));
            Object obj = this.o.mExtraObj.get("iconStyle");
            if (obj != null) {
                map.put("iconStyle", obj);
            }
            Object obj2 = this.o.mExtraObj.get("negFeedbackActions");
            if (obj2 != null) {
                map.put("negFeedbackActions", obj2);
            }
            Object obj3 = this.o.mExtraObj.get("pageData");
            if (obj3 != null) {
                map.put("pageData", obj3);
            }
        }
        if (commonSearchResult instanceof CommonSearchResult) {
            Object obj4 = map.get("pageInfo");
            if (obj4 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj4;
                jSONObject.put("pageName", (Object) currentPageName);
                if (!StringUtils.isEmpty(str)) {
                    jSONObject.put("spm", (Object) str);
                }
                ResultMainInfoBean mainInfo = commonSearchResult.getMainInfo();
                jSONObject.put("pageTraceArgs", (Object) mainInfo.originalPageTraceArgs);
                jSONObject.put("pageSize", (Object) Integer.valueOf(mainInfo.pageSize));
                jSONObject.put("page", (Object) Integer.valueOf(mainInfo.page));
                jSONObject.put("totalPage", (Object) Integer.valueOf(mainInfo.totalPage));
                jSONObject.put("totalResults", (Object) Integer.valueOf(mainInfo.totalResult));
                jSONObject.put("pageTraceName", (Object) mainInfo.pageTraceName);
                jSONObject.put("sessionid", (Object) mainInfo.sessionid);
                jSONObject.put("rootPageName", (Object) currentPageName);
                jSONObject.put("style", (Object) ((iru) j()).d().getUIListStyle().getValue());
                jSONObject.put("RN", (Object) muiseCellBean.rn);
            }
        }
        if (cVar != null) {
            map.put("isJiaGou", String.valueOf(cVar.J()));
        }
        map.put(noa.KEY_EDITION_CODE, com.taobao.search.mmd.util.g.d());
        map.put("elderHome", String.valueOf(com.taobao.search.mmd.util.j.INSTANCE.a()));
        boolean booleanParam = ((iru) j()).f().getBooleanParam(noa.KEY_SEARCH_ELDER_HOME_OPEN);
        com.taobao.search.common.util.m mVar = com.taobao.search.common.util.m.INSTANCE;
        map.put("fontSizeLevel", Integer.valueOf(com.taobao.search.common.util.m.a(booleanParam)));
        map.put(noa.KEY_GRAY_HAIR, String.valueOf(booleanParam));
        if (commonSearchResult == null || !commonSearchResult.isUpdateUtparam) {
            z = false;
        }
        map.put("updateUtparam", String.valueOf(z));
        com.taobao.android.searchbaseframe.context.a f = ((iru) j()).f();
        if (f != null) {
            map.put("sellerId", f.getParam("sellerId"));
        }
        if (cVar != null && cVar.z()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("inshops", (Object) (getActivity() instanceof InshopResultActivity ? "search" : "allauc"));
            jSONObject2.put(noa.KEY_MINI_APP, (Object) cVar.getParamValue(noa.KEY_MINI_APP));
            jSONObject2.put("shopId", (Object) cVar.getParamValue("shopId"));
            jSONObject2.put("sellerId", (Object) f.getParam("sellerId"));
            map.put("inshopAttributes", jSONObject2);
            map.put("spm", aa() + ".0.0");
        }
        if (((iru) j()).d().getTotalSearchResult() instanceof CommonSearchResult) {
            map.put(noa.KEY_HAS_TOP_HEADER, ((CommonSearchResult) ((iru) j()).d().getTotalSearchResult()).hasTopHeader ? "1" : "0");
        }
        map.put("lowDevice", String.valueOf(com.taobao.search.common.util.n.INSTANCE.e()));
        a(map, getActivity());
    }

    public static void a(Map<String, Object> map, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7765af", new Object[]{map, activity});
        } else if (!(activity instanceof pop)) {
        } else {
            if (((pop) activity).dR_()) {
                map.put("styleConfig", com.taobao.search.searchdoor.sf.config.a.INSTANCE.a());
                map.put(noa.KEY_TB_2024, "true");
                return;
            }
            map.put(noa.KEY_TB_2024, "false");
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.b, tb.itd
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        super.t();
        if (getParent() instanceof iob) {
            ((iob) getParent()).A();
        }
        if (l() == null || !StringUtils.equals(l().cardType, "item") || !(l().combo instanceof com.taobao.search.refactor.e)) {
            return;
        }
        ((com.taobao.search.refactor.e) l().combo).a(l().itemId, m());
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
            return;
        }
        super.O();
        if (l() != null) {
            l().isExposed = true;
        }
        this.p = System.currentTimeMillis();
        com.taobao.android.searchbaseframe.datasource.impl.a d = j() != 0 ? ((iru) j()).d() : null;
        if (!(getParent() instanceof com.taobao.android.searchbaseframe.datasource.b)) {
            return;
        }
        ((com.taobao.android.searchbaseframe.datasource.b) getParent()).a(m(), l(), (BaseSearchResult) d.getTotalSearchResult(), d);
    }

    @Override // com.taobao.android.xsearchplugin.muise.b
    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
            return;
        }
        super.P();
        com.taobao.android.searchbaseframe.datasource.impl.a d = j() != 0 ? ((iru) j()).d() : null;
        if (d == null || !(getParent() instanceof com.taobao.android.searchbaseframe.datasource.b)) {
            return;
        }
        ((com.taobao.android.searchbaseframe.datasource.b) getParent()).a(m(), l(), System.currentTimeMillis() - this.p, (BaseSearchResult) d.getTotalSearchResult(), d);
    }

    public final int W() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4df8151", new Object[]{this})).intValue() : m();
    }

    @Override // com.taobao.android.xsearchplugin.muise.b, tb.itd
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        super.y();
        a(true, false);
        Y();
    }

    @Override // com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.weex.weex.h
    public boolean a(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d34d2c5a", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        if ("negativeFeedbackPop".equals(str)) {
            e(jSONObject);
            return true;
        } else if ("clickInShopAuction".equals(str)) {
            d(jSONObject);
            return true;
        } else if ("negativeFeedbackOptionClick".equals(str)) {
            c(jSONObject);
            return true;
        } else {
            return super.a(str, jSONObject, aVar, aVar2);
        }
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        com.taobao.android.searchbaseframe.datasource.impl.a d = ((iru) j()).d();
        if (!(d instanceof com.taobao.search.sf.datasource.c)) {
            return;
        }
        nwj.a(getActivity(), ((com.taobao.search.sf.datasource.c) d).L(), jSONObject, ((iru) j()).f().getBooleanParam(noa.KEY_SEARCH_ELDER_HOME_OPEN));
    }

    private void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, l().rn);
        hashMap.put(TBSearchChiTuJSBridge.ABTEST, l().abtest);
        hashMap.put(com.ap.zlz.toyger.zdoc.b.INFO_PAGE_NUMBER, String.valueOf(l().pageNo));
        hashMap.put("pagePos", String.valueOf(l().pagePos));
        String str = aa() + ".itemlist." + m();
        JSONObject jSONObject2 = jSONObject.getJSONObject("model");
        if (jSONObject2 == null) {
            return;
        }
        com.taobao.search.mmd.util.b.a(jSONObject2, getActivity(), (com.taobao.search.sf.datasource.c) ((iru) j()).b(), u(), hashMap, str);
    }

    private String aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccc1f6d9", new Object[]{this});
        }
        if (getActivity() instanceof InshopResultActivity) {
            return "category".equals(((iru) j()).d().getParamValue("from")) ? "a2141.7631684" : "a2141.11319901";
        }
        String paramStr = ((iru) j()).d().getParamStr("shopAuctionSpmCnt");
        return !StringUtils.isEmpty(paramStr) ? paramStr : "a2141.7631671";
    }

    private com.taobao.search.refactor.g ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.refactor.g) ipChange.ipc$dispatch("9a821ecf", new Object[]{this}) : (com.taobao.search.refactor.g) ((iru) j()).e().b("controller");
    }

    public nwg.b T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nwg.b) ipChange.ipc$dispatch("f66d21cf", new Object[]{this}) : new nou((com.taobao.search.sf.datasource.c) ((iru) j()).b(), l(), ab());
    }

    private void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
        } else if (!com.taobao.search.common.util.r.ar() || jSONObject == null || this.c_ != null) {
        } else {
            final String string = jSONObject.getString("jumpToSimilarUrl");
            String string2 = jSONObject.getString("tItemType");
            TemplateBean template = ((iru) j()).d().getTemplate(string2);
            if (template == null) {
                Nav.from(getActivity()).toUri(string);
                return;
            }
            final nwg.b T = T();
            postEvent(new nwf.a());
            this.c_ = new nwg(getActivity(), getParent(), (iru) j(), template, (ViewGroup) this.itemView, new iug((ViewGroup) this.itemView), Integer.valueOf(m()), this.o.mExtraObj.get("negFeedbackActions"), new nwg.a() { // from class: com.taobao.search.musie.r.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.nwg.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    Nav.from(r.this.getActivity()).toUri(string);
                    r.a(r.this, true, true);
                }

                @Override // tb.nwg.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        r.a(r.this, false, true);
                    }
                }

                @Override // tb.nwg.a
                public void a(JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                    } else {
                        nwj.a(T, Integer.valueOf(r.this.m()), r.a(r.this), jSONObject2, Integer.valueOf(r.this.itemView.getHeight()), Integer.valueOf(ListStyle.toNum(r.b(r.this))));
                    }
                }
            }, T);
            MuiseCellBean l = l();
            this.c_.a(nwj.a(string2, l.rn, l.abtest, l.pageType, l.mMuiseBean.model));
            if (this.c_.getView() == 0) {
                return;
            }
            this.itemView.performHapticFeedback(0);
            ((FrameLayout) this.c_.getView()).startAnimation(nwj.a(true));
            this.c_.attachToContainer();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        if (r9.equals("addParams") != false) goto L13;
     */
    @Override // com.taobao.android.xsearchplugin.muise.c, com.taobao.android.xsearchplugin.weex.weex.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(java.lang.String r9, com.alibaba.fastjson.JSONObject r10, tb.isr.c.a r11, tb.isr.c.a r12) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.musie.r.b(java.lang.String, com.alibaba.fastjson.JSONObject, tb.isr$c$a, tb.isr$c$a):boolean");
    }

    private void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9040aa3", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            String string = jSONObject.getString("itemId");
            if (StringUtils.isEmpty(string)) {
                return;
            }
            d(string);
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("optionParams");
            boolean a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject2, "enableJarvis", false);
            JSONObject jSONObject3 = jSONObject.getJSONObject("requestParams");
            JSONObject jSONObject4 = jSONObject.getJSONObject("jarvisParams");
            String a3 = com.taobao.android.searchbaseframe.util.a.a(jSONObject2, "appId", com.taobao.search.common.util.u.o());
            Map<String, String> a4 = com.taobao.android.searchbaseframe.util.a.a(jSONObject3);
            a(a4);
            com.taobao.search.sf.realtimetag.b K = ((nsp) ((iru) j()).d()).K();
            if (K == null) {
                return;
            }
            K.a(a3, "", a4, W(), a2, jSONObject4);
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            String string = jSONObject.getString("itemId");
            if (StringUtils.isEmpty(string)) {
                return;
            }
            boolean equals = "true".equals(com.taobao.android.searchbaseframe.util.a.a(jSONObject, "needBackInsertCard", "true"));
            Map<String, String> a2 = com.taobao.android.searchbaseframe.util.a.a(com.taobao.android.searchbaseframe.util.a.b(jSONObject, "clickTraceParams"));
            String string2 = jSONObject.getString(nog.CLICK_TRACE);
            if (!StringUtils.isEmpty(string2)) {
                a(string, string2, equals, a2);
            }
            d(string);
            com.taobao.search.common.util.a.a().a(((iru) j()).d().getTab(), string, String.valueOf(System.currentTimeMillis()));
        }
    }

    private void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a56a742", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                a(entry.getKey(), entry.getValue().toString());
            }
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        if (ac() != null) {
            ac().setParam(str, str2);
            if (bI_()) {
                return;
            }
        }
        af().setParam(str, str2);
    }

    private void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba943e1", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "params");
            for (int i = 0; i < a2.size(); i++) {
                JSONObject jSONObject2 = a2.getJSONObject(i);
                if (jSONObject2 != null) {
                    b(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }

    private SearchParamImpl ac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchParamImpl) ipChange.ipc$dispatch("10ff2eb3", new Object[]{this});
        }
        if (l().combo == null) {
            return null;
        }
        return l().combo.q();
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        if (ac() != null) {
            ac().addParamSetValue(str, str2);
            if (bI_()) {
                return;
            }
        }
        af().addParam(str, str2);
    }

    private void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbe080", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "params");
            for (int i = 0; i < a2.size(); i++) {
                JSONObject jSONObject2 = a2.getJSONObject(i);
                if (jSONObject2 != null) {
                    c(jSONObject2.getString("key"), jSONObject2.getString("value"));
                }
            }
        }
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        if (ac() != null) {
            ac().removeParamSetValue(str, str2);
            if (bI_()) {
                return;
            }
        }
        af().removeParam(str, str2);
    }

    private void j(JSONObject jSONObject) {
        JSONArray a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4e7d1f", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "keys")) != null) {
            for (int i = 0; i < a2.size(); i++) {
                String string = a2.getString(i);
                if (!StringUtils.isEmpty(string)) {
                    c(string);
                }
            }
        }
    }

    private void ah() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab55252e", new Object[]{this});
            return;
        }
        if (ac() != null) {
            ac().removeAllParams();
        }
        af().removeAllParams();
        com.taobao.android.searchbaseframe.context.a f = ((iru) j()).f();
        if (!(f instanceof CommonSearchContext)) {
            return;
        }
        af().setParams(((CommonSearchContext) f).getOtherTabParams());
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        if (ac() != null) {
            ac().removeParam(str);
            if (bI_()) {
                return;
            }
        }
        af().clearParam(str);
    }

    public boolean bI_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c204b1a3", new Object[]{this})).booleanValue() : com.taobao.search.common.util.r.cf();
    }

    public void a(String str, String str2, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e27bbad", new Object[]{this, str, str2, new Boolean(z), map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        a((Map<String, String>) hashMap);
        hashMap.putAll(map);
        com.taobao.search.sf.realtimetag.d.a(str2, hashMap, getActivity(), W(), z, ((nsp) ((iru) j()).d()).K());
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        nsp nspVar = (nsp) ((iru) j()).d();
        CommonSearchResult commonSearchResult = (CommonSearchResult) nspVar.getTotalSearchResult();
        map.put("tab", nspVar.getTab());
        map.put(aw.PARAM_SEARCH_KEYWORD_RN, l().rn);
        map.put(noa.KEY_EDITION_CODE, com.taobao.search.mmd.util.g.d());
        map.put("elderHome", String.valueOf(com.taobao.search.mmd.util.j.INSTANCE.a()));
        map.put(noa.KEY_GRAY_HAIR, String.valueOf(((iru) j()).f().getBooleanParam(noa.KEY_SEARCH_ELDER_HOME_OPEN)));
        int W = W();
        if (commonSearchResult == null) {
            return;
        }
        int min = Math.min(commonSearchResult.getCellsCount(), W + 10);
        StringBuilder sb = new StringBuilder();
        for (int max = Math.max(0, W - 10); max < min; max++) {
            BaseCellBean cell = commonSearchResult.getCell(max);
            if (StringUtils.equals("item", cell.cardType)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(cell.itemId);
            }
        }
        map.put("nearbyItems", sb.toString());
        CommonSearchResult commonSearchResult2 = (CommonSearchResult) nspVar.getTotalSearchResult();
        int i = W + 1;
        String str = "";
        String str2 = commonSearchResult2.getCellsCount() > i ? commonSearchResult2.getCell(i).type : str;
        int i2 = W + 2;
        if (commonSearchResult2.getCellsCount() > i2) {
            str = commonSearchResult2.getCell(i2).type;
        }
        map.put("nextItemsType", str2 + "," + str);
        map.put("sessionid", commonSearchResult.getMainInfo().rn);
        if (!StringUtils.isEmpty(commonSearchResult.sessionId)) {
            map.put("sessionId", commonSearchResult.sessionId);
        }
        if (!StringUtils.isEmpty(commonSearchResult.spClientSession)) {
            map.put("sp_client_session", commonSearchResult.spClientSession);
        }
        map.put("jarvis_dynamic_card", String.valueOf(false));
        map.put("max_page", String.valueOf(nspVar.getCurrentPage()));
        nspVar.a(map);
        map.put(noa.KEY_P4P_S, String.valueOf(nspVar.k()));
        map.put(noa.KEY_ITEM_S, String.valueOf(nspVar.j()));
        map.put("bottom", String.valueOf(com.taobao.search.common.util.l.b(this.itemView.getBottom())));
        map.put("screenHeight", String.valueOf(com.taobao.search.common.util.l.b(((ViewGroup) this.itemView.getParent()).getHeight())));
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(aw.PARAM_SEARCH_KEYWORD_POS, String.valueOf(W()));
        hashMap.put("page", String.valueOf(this.o.pageNo));
        hashMap.put("trigger_item_id", str);
        hashMap.put("pv_pos", String.valueOf(l().pagePos));
        hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, this.o.rn);
        hashMap.put("pv_size", String.valueOf(l().pageSize));
        hashMap.put("below_p4p", String.valueOf(ad()));
        hashMap.put("below_pos", String.valueOf(ae()));
        try {
            hashMap.put("bottom", String.valueOf(com.taobao.search.common.util.l.b(this.itemView.getBottom())));
            hashMap.put("screen_height", String.valueOf(com.taobao.search.common.util.l.b(((ViewGroup) this.itemView.getParent()).getHeight())));
            b((Map<String, Object>) hashMap);
        } catch (Throwable unused) {
        }
        a(new jxz(str, hashMap), "childPageWidget");
    }

    private void b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        ViewParent parent = this.itemView.getParent();
        if (!(parent instanceof PartnerRecyclerView)) {
            return;
        }
        PartnerRecyclerView partnerRecyclerView = (PartnerRecyclerView) parent;
        int headerViewsCount = partnerRecyclerView.getHeaderViewsCount();
        View childAt = partnerRecyclerView.getChildAt(partnerRecyclerView.getChildCount() - 1);
        int layoutPosition = partnerRecyclerView.getChildViewHolder(childAt).getLayoutPosition() - headerViewsCount;
        int b = com.taobao.search.common.util.l.b(childAt.getTop());
        View childAt2 = partnerRecyclerView.getChildAt(partnerRecyclerView.getChildCount() - 2);
        int layoutPosition2 = partnerRecyclerView.getChildViewHolder(childAt2).getLayoutPosition() - headerViewsCount;
        int b2 = com.taobao.search.common.util.l.b(childAt2.getTop());
        map.put("last_expose_pos_list", layoutPosition2 + "," + layoutPosition);
        map.put("last_expose_top_height_list", b2 + "," + b);
    }

    private boolean ad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[]{this})).booleanValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) ((iru) j()).d().getTotalSearchResult();
        int ae = ae();
        if (commonSearchResult != null && ae < commonSearchResult.getCellsCount()) {
            return commonSearchResult.getCell(ae).isP4p;
        }
        return false;
    }

    private int ae() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab2ade9e", new Object[]{this})).intValue();
        }
        int W = W();
        return u() == ListStyle.LIST ? W + 1 : W + 2;
    }

    @Override // com.taobao.android.xsearchplugin.muise.c, tb.irw
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (l() == null) {
            return false;
        }
        if (l().videoForcePlay) {
            return true;
        }
        return super.d() && nnd.a(((iru) j()).d());
    }

    private com.taobao.android.searchbaseframe.datasource.a af() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.datasource.a) ipChange.ipc$dispatch("ae80e7f8", new Object[]{this}) : ((iru) j()).d();
    }

    @Override // com.taobao.search.sf.realtimetag.IRealTimeTagContainer
    public ListStyle getContainerListStyle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListStyle) ipChange.ipc$dispatch("1c77b9ec", new Object[]{this}) : u();
    }

    @Override // com.taobao.android.xsearchplugin.muise.b, tb.itd
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        super.s();
        a(true, true);
    }

    private void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        nwg nwgVar = this.c_;
        if (nwgVar == null) {
            return;
        }
        if (z) {
            ((FrameLayout) nwgVar.getView()).clearAnimation();
            if (z2) {
                this.c_.destroyAndRemoveFromParent();
            }
            this.c_ = null;
        } else if (nwgVar.getView() == 0 || ((FrameLayout) this.c_.getView()).getAnimation() != null) {
        } else {
            AlphaAnimation a2 = nwj.a(false);
            a2.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.search.musie.r.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    } else if (r.c(r.this) == null) {
                    } else {
                        ((FrameLayout) r.c(r.this).getView()).clearAnimation();
                        r.c(r.this).destroyAndRemoveFromParent();
                        r.a(r.this, (nwg) null);
                    }
                }
            });
            ((FrameLayout) this.c_.getView()).startAnimation(a2);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!StringUtils.equals(l().cardType, "item") && com.taobao.search.common.util.r.aX()) {
            com.taobao.search.sf.realtimetag.d.a(l(), (Map<String, String>) null, getActivity(), W(), ((iru) j()).d());
        }
        return false;
    }

    public Map<String, String> X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("651738d4", new Object[]{this});
        }
        com.taobao.search.sf.datasource.c cVar = (com.taobao.search.sf.datasource.c) ((iru) j()).d();
        if (cVar.isMetaMode() && l() != null && l().combo != null) {
            return cVar.a((com.taobao.search.refactor.e) l().combo);
        }
        return cVar.getLatestParamsSnapshot();
    }

    @Override // com.taobao.search.sf.realtimetag.a
    public itd a(BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itd) ipChange.ipc$dispatch("e7d7f493", new Object[]{this, baseCellBean});
        }
        RecyclerView recyclerView = this.v;
        if (recyclerView == null) {
            return null;
        }
        isz iszVar = (isz) ((TRecyclerView.HeaderViewAdapter) recyclerView.getAdapter()).getWrappedAdapter();
        return iszVar.createViewHolder(this.v, iszVar.a(baseCellBean));
    }
}
