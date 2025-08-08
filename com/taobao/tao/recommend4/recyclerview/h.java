package com.taobao.tao.recommend4.recyclerview;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.home.component.view.NestedEmptyView;
import com.taobao.homepage.dinamic3.RecommendDxUserContext;
import com.taobao.homepage.utils.o;
import com.taobao.homepage.view.widgets.CustomErrorView;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.refresh.TBDefaultLoadMoreFooter;
import com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.acj;
import tb.kge;
import tb.ksk;
import tb.ksp;
import tb.ksr;
import tb.kst;
import tb.ooa;
import tb.ooe;
import tb.ooj;
import tb.osm;
import tb.osp;
import tb.syc;

/* loaded from: classes8.dex */
public class h extends RecyclerView.Adapter<c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public g f20983a;
    public osm b;
    private int h;
    private l i;
    private a k;
    private b l;
    private TBLoadMoreFooter.LoadMoreState m;
    private List<SectionModel> n;
    private SectionModel p;
    private int q;
    private boolean r;
    private int s;
    private boolean j = true;
    private int t = 10;
    private int u = -1;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public Handler c = new Handler();
    private SectionModel o = new SectionModel();

    /* loaded from: classes8.dex */
    public static class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f20991a;

        static {
            kge.a(-118370927);
        }

        public c(View view) {
            super(view);
        }
    }

    static {
        kge.a(-102646328);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53b1e4d6", new Object[]{hVar})).intValue() : hVar.s;
    }

    public static /* synthetic */ void a(h hVar, CustomErrorView customErrorView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44084fa2", new Object[]{hVar, customErrorView, new Boolean(z)});
        } else {
            hVar.a(customErrorView, z);
        }
    }

    public static /* synthetic */ void a(h hVar, TBErrorView tBErrorView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce612e", new Object[]{hVar, tBErrorView, new Boolean(z)});
        } else {
            hVar.a(tBErrorView, z);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, cVar, new Integer(i)});
        } else {
            a(cVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.tao.recommend4.recyclerview.h$c, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ c mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public h(osm osmVar, g gVar) {
        this.b = osmVar;
        this.f20983a = gVar;
        this.i = new l(this.b.f());
        this.h = com.taobao.homepage.utils.b.a(this.b.h()) / 2;
        this.o.put("sectionBizCode", (Object) "error");
        this.p = new SectionModel();
        this.p.put("sectionBizCode", (Object) "loading");
        this.k = new a();
        this.l = new b();
        this.r = this.b.o();
    }

    public void a(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b1abf5", new Object[]{this, kskVar});
        } else {
            this.i = new l(kskVar);
        }
    }

    public JSONObject a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eef312bb", new Object[]{this, new Integer(i)});
        }
        List<SectionModel> list = this.n;
        if (list != null && i >= 0 && i < list.size()) {
            return this.n.get(i);
        }
        return null;
    }

    public void b(int i) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        List<SectionModel> list = this.n;
        List<SectionModel> j = this.b.j();
        if (j == null || j.isEmpty()) {
            arrayList = new ArrayList(1);
            arrayList.add(this.o);
        } else {
            arrayList = new ArrayList(j.size() + 1);
            arrayList.addAll(j);
            if (!this.b.k()) {
                arrayList.add(this.p);
                this.m = TBLoadMoreFooter.LoadMoreState.LOADING;
            }
        }
        this.n = arrayList;
        this.f20983a.a(arrayList);
        i();
        if (i == 0) {
            notifyDataSetChanged();
        } else {
            acj.a(new ooe(list, arrayList), false).a(this);
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        AwesomeGetPageData s = this.b.s();
        if (s == null) {
            return;
        }
        this.t = s.requestInAdvance;
    }

    public void a() {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<SectionModel> list = this.n;
        if (list == null || list.isEmpty()) {
            return;
        }
        RecyclerView i = this.b.i();
        SectionModel sectionModel = this.n.get(0);
        String str = "";
        if (StringUtils.equals(sectionModel != null ? sectionModel.getString("sectionBizCode") : str, "error")) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = i.findViewHolderForAdapterPosition(0);
            if (findViewHolderForAdapterPosition2 == null || findViewHolderForAdapterPosition2.itemView == null) {
                return;
            }
            a(findViewHolderForAdapterPosition2.itemView, false);
        } else if (this.n.size() <= 1) {
        } else {
            List<SectionModel> list2 = this.n;
            SectionModel sectionModel2 = list2.get(list2.size() - 1);
            if (sectionModel2 != null) {
                str = sectionModel2.getString("sectionBizCode");
            }
            if (!StringUtils.equals(str, "loading")) {
                return;
            }
            this.m = TBLoadMoreFooter.LoadMoreState.NONE;
            int[] findLastVisibleItemPositions = ((StaggeredGridLayoutManager) i.getLayoutManager()).findLastVisibleItemPositions(null);
            if (findLastVisibleItemPositions[0] != this.n.size() - 1 || (findViewHolderForAdapterPosition = i.findViewHolderForAdapterPosition(findLastVisibleItemPositions[0])) == null || findViewHolderForAdapterPosition.itemView == null) {
                return;
            }
            ((TBLoadMoreFooter) ((FrameLayout) findViewHolderForAdapterPosition.itemView).getChildAt(0)).changeToState(this.m);
        }
    }

    public List<SectionModel> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.n;
    }

    public c a(ViewGroup viewGroup, int i) {
        FrameLayout a2;
        RecyclerView.LayoutParams generateDefaultLayoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("52660576", new Object[]{this, viewGroup, new Integer(i)});
        }
        o.a a3 = this.i.a(i);
        View view = null;
        if (i == -2) {
            view = c();
        } else if (i == -3) {
            view = d();
        } else if (i != -1 && a3 != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (a3.a()) {
                a2 = this.l.a(viewGroup.getContext(), viewGroup, a3.e());
            } else {
                a2 = this.k.a(viewGroup.getContext(), viewGroup, a3.d());
            }
            if (a2 != null) {
                FrameLayout frameLayout = new FrameLayout(a2.getContext());
                frameLayout.addView(a2);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                a2 = frameLayout;
            }
            ksr.a("RecommendRecyclerAdapter_" + a3.b(), SystemClock.uptimeMillis() - uptimeMillis, (Map<String, String>) null);
            view = a2;
        }
        if (view == null) {
            view = new NestedEmptyView(viewGroup.getContext());
        }
        RecyclerView i2 = this.b.i();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            generateDefaultLayoutParams = i2.getLayoutManager().generateLayoutParams(layoutParams);
        } else {
            generateDefaultLayoutParams = i2.getLayoutManager().generateDefaultLayoutParams();
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        return new c(view);
    }

    public void a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a17a7f", new Object[]{this, cVar, new Integer(i)});
            return;
        }
        List<SectionModel> list = this.n;
        if (list == null || list.isEmpty() || cVar.itemView == null) {
            return;
        }
        this.f = i;
        SectionModel sectionModel = this.n.get(i);
        boolean z = cVar.itemView instanceof NestedEmptyView;
        String string = sectionModel.getString("sectionBizCode");
        if (!z && i > this.e) {
            this.d++;
            if (!StringUtils.equals(string, "loading") || !StringUtils.equals(string, "error")) {
                this.g++;
            }
        }
        if (!kst.a(cVar.f20991a, sectionModel)) {
            if (StringUtils.equals(string, "loading")) {
                ((TBLoadMoreFooter) ((FrameLayout) cVar.itemView).getChildAt(0)).changeToState(this.m);
                if (this.d > 1 && !j()) {
                    this.b.d();
                }
            } else if (!StringUtils.equals(string, "error") && !z) {
                if (com.taobao.homepage.utils.o.a(sectionModel.getJSONObject("template")).a()) {
                    this.l.a(cVar, sectionModel, f());
                } else {
                    this.k.a(cVar, sectionModel, f());
                }
                cVar.f20991a = sectionModel;
                if (this.b instanceof osp) {
                    cVar.itemView.setTag(R.id.tag_recommend_containerId, this.b.g());
                    cVar.itemView.setTag(R.id.tag_recommend_tabIndex, -1);
                    cVar.itemView.setTag(R.id.tag_recommend_container, this.b);
                } else {
                    cVar.itemView.setTag(R.id.tag_recommend_datasource, this.b);
                }
            }
        }
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) cVar.itemView.getLayoutParams();
        boolean a2 = a(sectionModel, layoutParams, cVar.itemView);
        if (layoutParams != null && layoutParams.isFullSpan() != a2) {
            layoutParams.setFullSpan(a2);
        }
        d(i);
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        osm osmVar = this.b;
        if (osmVar != null && !StringUtils.isEmpty(osmVar.g())) {
            boolean contains = this.b.g().contains(syc.MULTI_NATIVE_INFOFLOW_CID_PREFIX);
            int i = this.u;
            boolean z = i > 0 && i == this.n.size() - this.t;
            if (contains && z) {
                return true;
            }
        }
        return false;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
        } else {
            this.q = i;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<SectionModel> list = this.n;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        List<SectionModel> list = this.n;
        if (list == null || list.isEmpty()) {
            this.n = new ArrayList(1);
            this.n.add(this.o);
            return -2;
        }
        SectionModel sectionModel = this.n.get(i);
        if (sectionModel == null) {
            return -1;
        }
        if (sectionModel == this.o) {
            return -2;
        }
        if (sectionModel == this.p) {
            return -3;
        }
        if (sectionModel.getJSONObject("ext") != null && sectionModel.getJSONObject("ext").getBooleanValue("hidden")) {
            return -1;
        }
        return this.i.a(sectionModel.getJSONObject("template"));
    }

    private void d(int i) {
        List<SectionModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (!this.b.k() && this.d > 1 && this.n.size() < 10 && i == 0) {
            this.u = i;
            this.b.d();
        } else if (this.b.k() || this.d <= 1 || (list = this.n) == null || list.size() - i != this.t) {
        } else {
            this.u = i;
            this.b.d();
        }
    }

    private View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this});
        }
        this.j = com.taobao.android.home.component.utils.j.a("enableCustomizedErrorView", true);
        if (this.j) {
            CustomErrorView customErrorView = new CustomErrorView(this.b.h());
            customErrorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            customErrorView.setButtonVisibility(CustomErrorView.ButtonType.BUTTON_RIGHT, 8);
            a(customErrorView, true);
            customErrorView.setButtonVisibility(CustomErrorView.ButtonType.BUTTON_LEFT, 8);
            return customErrorView;
        }
        TBErrorView tBErrorView = new TBErrorView(this.b.h());
        tBErrorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        a(tBErrorView, true);
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
        return tBErrorView;
    }

    private void a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b3caa", new Object[]{this, view, new Boolean(z)});
            return;
        }
        if (view instanceof CustomErrorView) {
            a((CustomErrorView) view, z);
        }
        if (!(view instanceof TBErrorView)) {
            return;
        }
        a((TBErrorView) view, z);
    }

    private void a(final TBErrorView tBErrorView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef3beab3", new Object[]{this, tBErrorView, new Boolean(z)});
        } else if (z) {
            tBErrorView.setTitle(com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16165));
            tBErrorView.setSubTitle(com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16166));
            tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, com.alibaba.ability.localization.b.a(R.string.app_loading), new View.OnClickListener() { // from class: com.taobao.tao.recommend4.recyclerview.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    }
                }
            });
            tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 4);
        } else {
            tBErrorView.setTitle(com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16148));
            tBErrorView.setSubTitle(com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16140));
            tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, com.alibaba.ability.localization.b.a(R.string.app_refresh), new View.OnClickListener() { // from class: com.taobao.tao.recommend4.recyclerview.h.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    h.a(h.this, tBErrorView, true);
                    h.this.b.c();
                }
            });
            tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 0);
        }
    }

    private void a(final CustomErrorView customErrorView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26fe9bfd", new Object[]{this, customErrorView, new Boolean(z)});
        } else if (z) {
            customErrorView.setTitle(com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16165), true);
            customErrorView.setSubTitle(com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16166), true);
            customErrorView.setButton(CustomErrorView.ButtonType.BUTTON_LEFT, com.alibaba.ability.localization.b.a(R.string.app_loading), new View.OnClickListener() { // from class: com.taobao.tao.recommend4.recyclerview.h.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    }
                }
            });
            customErrorView.setButtonVisibility(CustomErrorView.ButtonType.BUTTON_LEFT, 4);
        } else {
            customErrorView.setTitle(com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16148));
            customErrorView.setSubTitle(com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16140));
            customErrorView.setButton(CustomErrorView.ButtonType.BUTTON_LEFT, com.alibaba.ability.localization.b.a(R.string.app_refresh), new View.OnClickListener() { // from class: com.taobao.tao.recommend4.recyclerview.h.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    h.a(h.this, customErrorView, true);
                    h.this.b.c();
                }
            });
            customErrorView.setButtonVisibility(CustomErrorView.ButtonType.BUTTON_LEFT, 0);
        }
    }

    private FrameLayout d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("df23db0e", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(this.b.h());
        TBDefaultLoadMoreFooter tBDefaultLoadMoreFooter = new TBDefaultLoadMoreFooter(this.b.h());
        tBDefaultLoadMoreFooter.setLoadMoreTips(g());
        tBDefaultLoadMoreFooter.setBackgroundColor(0);
        tBDefaultLoadMoreFooter.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.recommend4.recyclerview.h.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                TBLoadMoreFooter tBLoadMoreFooter = (TBLoadMoreFooter) view;
                if (tBLoadMoreFooter.getCurrentState() != TBLoadMoreFooter.LoadMoreState.NONE) {
                    return;
                }
                tBLoadMoreFooter.changeToState(TBLoadMoreFooter.LoadMoreState.LOADING);
                h.this.b.d();
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) ((tBDefaultLoadMoreFooter.getResources().getDisplayMetrics().density * 50.0f) + this.q));
        layoutParams.addRule(14);
        layoutParams.addRule(10);
        tBDefaultLoadMoreFooter.setLayoutParams(layoutParams);
        tBDefaultLoadMoreFooter.changeToState(TBLoadMoreFooter.LoadMoreState.LOADING);
        frameLayout.addView(tBDefaultLoadMoreFooter);
        return frameLayout;
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        osm osmVar = this.b;
        return osmVar != null ? osmVar.g() : "";
    }

    private ba f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ba) ipChange.ipc$dispatch("af7324e6", new Object[]{this});
        }
        RecommendDxUserContext addContext = RecommendDxUserContext.newInstance().addContext("containerId", e());
        osm osmVar = this.b;
        return addContext.addContext("apiInfo", osmVar == null ? null : osmVar.b()).addContext(osp.RMD_CONTAINER, new WeakReference(this.b));
    }

    private String[] g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("849a8dbd", new Object[]{this}) : new String[]{com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16155), com.alibaba.ability.localization.b.a(R.string.app_release_to_reload), com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16160), com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16147)};
    }

    private boolean a(JSONObject jSONObject, ViewGroup.LayoutParams layoutParams, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a252f2a1", new Object[]{this, jSONObject, layoutParams, view})).booleanValue();
        }
        if (jSONObject == null || layoutParams == null || view == null) {
            return false;
        }
        if (!StringUtils.equals(jSONObject.getString("sectionBizCode"), "error") && !StringUtils.equals(jSONObject.getString("sectionBizCode"), "loading")) {
            if (!(jSONObject.getJSONObject("template") != null && StringUtils.equals("one", com.taobao.homepage.utils.o.b(jSONObject.getJSONObject("template")))) && a(view, R.id.tag_recommend_decoration_width, layoutParams.width) <= this.h) {
                return false;
            }
        }
        return true;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        this.s = i;
        this.h = this.s / 2;
    }

    private int a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c25113d", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue() : view.getTag(i) == null ? i2 : ((Integer) view.getTag(i)).intValue();
    }

    /* loaded from: classes8.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1327342237);
        }

        private a() {
        }

        public View a(Context context, ViewGroup viewGroup, DinamicTemplate dinamicTemplate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("1a39fd2b", new Object[]{this, context, viewGroup, dinamicTemplate});
            }
            try {
                com.taobao.android.dinamic.view.b a2 = com.taobao.android.dinamic.d.a("guess").a(context, viewGroup, DTemplateManager.a("guess").d(dinamicTemplate));
                if (!a2.c()) {
                    return null;
                }
                return a2.e();
            } catch (Exception e) {
                com.taobao.android.home.component.utils.e.a("RecommendRecyclerAdapter", "createViewHolder failed", e);
                ksp.a("RecommendRecyclerAdapter", "createViewHolder failed", e);
                return null;
            }
        }

        public void a(c cVar, JSONObject jSONObject, ba baVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9231ac89", new Object[]{this, cVar, jSONObject, baVar});
                return;
            }
            try {
                com.taobao.android.dinamic.d.a("guess").a(cVar.itemView, jSONObject, baVar);
            } catch (Throwable th) {
                ooa.a("DynamicViewProvider", "bind failed", th);
            }
        }
    }

    /* loaded from: classes8.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean b;

        static {
            kge.a(-439838556);
        }

        public b() {
            this.b = false;
            this.b = com.taobao.android.home.component.utils.j.a("enableUserContextRend", true);
        }

        public View a(Context context, ViewGroup viewGroup, DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b931ba4a", new Object[]{this, context, viewGroup, dXTemplateItem}) : h.this.b.n().b(context, h.this.b.n().a(dXTemplateItem)).f11780a;
        }

        public void a(c cVar, JSONObject jSONObject, ba baVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9231ac89", new Object[]{this, cVar, jSONObject, baVar});
            } else if (!(cVar.itemView instanceof FrameLayout)) {
            } else {
                View childAt = ((FrameLayout) cVar.itemView).getChildAt(0);
                if (!(childAt instanceof DXRootView)) {
                    return;
                }
                DXRootView dXRootView = (DXRootView) childAt;
                if (this.b) {
                    ooj.a(h.this.b.n(), dXRootView, jSONObject, baVar, h.a(h.this));
                } else {
                    ooj.a(h.this.b.n(), dXRootView, jSONObject);
                }
            }
        }
    }

    public void h() {
        RecyclerView i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        osm osmVar = this.b;
        if (osmVar == null || (i = osmVar.i()) == null) {
            return;
        }
        int childCount = i.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView.ViewHolder childViewHolder = i.getChildViewHolder(i.getChildAt(i2));
            if (childViewHolder instanceof c) {
                ((c) childViewHolder).f20991a = null;
            }
        }
        int i3 = this.s;
        if (i3 > 0) {
            this.h = i3 / 2;
        } else {
            this.h = com.taobao.homepage.utils.b.a(i.getContext()) / 2;
        }
        i.getAdapter().notifyDataSetChanged();
    }
}
