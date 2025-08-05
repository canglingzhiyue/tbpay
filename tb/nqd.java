package tb;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.t;
import com.taobao.android.task.Coordinator;
import com.taobao.android.weex_ability.page.WeexContainerFragment;
import com.taobao.android.weex_framework.r;
import com.taobao.android.xsearchplugin.weex.weex.g;
import com.taobao.downgrade.Downgrade;
import com.taobao.search.common.util.d;
import com.taobao.search.common.util.n;
import com.taobao.search.common.util.q;
import com.taobao.search.mmd.util.k;
import com.taobao.search.musie.InterceptFrameLayout;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.search.searchdoor.sf.widgets.b;
import com.taobao.search.searchdoor.sf.widgets.e;
import com.taobao.search.searchdoor.sf.widgets.f;
import com.taobao.search.sf.j;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.SmoothRecyclerScrollFeature;
import com.taobao.uikit.feature.view.TRecyclerView;
import com.taobao.weex.WXSDKInstance;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.MethodEnum;
import tb.jvm;
import tb.npr;
import tb.nqh;
import tb.nqw;
import tb.nre;
import tb.nrj;

/* loaded from: classes7.dex */
public class nqd extends ius<Void, TRecyclerView, SearchDoorContext> implements View.OnTouchListener, b, nqh.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SearchDoorContext f31639a;
    public nqh b;
    public boolean c;
    public boolean d;
    public boolean e;
    private volatile com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b f;
    private String g;
    private String h;
    private nqb<e> i;
    private LinearLayoutManager j;
    private final g k;
    private InterceptFrameLayout l;
    private WeexPageFragment m;
    private String n;
    private final Map<String, TemplateBean> o;
    private final Map<String, jvm.c> p;
    private WeexContainerFragment q;
    private boolean r;

    static {
        kge.a(-532286308);
        kge.a(-468432129);
        kge.a(670348989);
        kge.a(-931718986);
    }

    public static /* synthetic */ Object ipc$super(nqd nqdVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -211767613:
                super.onComponentDestroy();
                return null;
            case 217607196:
                super.onCtxResume();
                return null;
            case 299066517:
                super.onCtxPause();
                return null;
            case 593843865:
                super.onCtxDestroy();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "ActivateWidget";
    }

    public static /* synthetic */ InterceptFrameLayout a(nqd nqdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterceptFrameLayout) ipChange.ipc$dispatch("d9d3d67d", new Object[]{nqdVar}) : nqdVar.l;
    }

    public static /* synthetic */ void a(nqd nqdVar, com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ebe4d03", new Object[]{nqdVar, bVar});
        } else {
            nqdVar.a(bVar);
        }
    }

    public static /* synthetic */ void a(nqd nqdVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f8b0241", new Object[]{nqdVar, str});
        } else {
            nqdVar.d(str);
        }
    }

    public static /* synthetic */ nqb b(nqd nqdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nqb) ipChange.ipc$dispatch("edbaadaf", new Object[]{nqdVar}) : nqdVar.i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.taobao.uikit.feature.view.TRecyclerView] */
    @Override // tb.ius
    public /* synthetic */ TRecyclerView onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    public nqd(Activity activity, ium iumVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, searchDoorContext, viewGroup, iurVar);
        this.k = new g();
        this.o = new ConcurrentHashMap();
        this.p = new ConcurrentHashMap();
        this.r = false;
        this.j = new LinearLayoutManager(activity);
        this.f31639a = searchDoorContext;
        this.b = new nqh(this, searchDoorContext.g());
        this.i = new nqb<>(activity, this, new e(this.f31639a, this, this.b));
        f fVar = (f) iumVar;
        this.c = fVar.e;
        this.d = fVar.c;
        this.e = fVar.d;
        this.r = ((tqn) activity).A();
        if (this.r) {
            this.b.b();
        }
        subscribeEvent(this);
    }

    public TRecyclerView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TRecyclerView) ipChange.ipc$dispatch("9f312c12", new Object[]{this});
        }
        TRecyclerView tRecyclerView = new TRecyclerView(this.mActivity);
        tRecyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tRecyclerView.setOverScrollMode(2);
        tRecyclerView.setHasFixedSize(true);
        tRecyclerView.setLayoutManager(this.j);
        tRecyclerView.setAdapter(this.i);
        tRecyclerView.addFeature(new SmoothRecyclerScrollFeature());
        tRecyclerView.setOnTouchListener(this);
        if (tRecyclerView.getItemAnimator() != null) {
            tRecyclerView.getItemAnimator().setChangeDuration(0L);
        }
        tRecyclerView.setRecycledViewPool(new com.taobao.android.searchbaseframe.business.srp.list.uikit.b());
        return tRecyclerView;
    }

    @Override // tb.ius, tb.iup
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
        } else {
            ((TRecyclerView) getView()).setOnTouchListener(this);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.nqd.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b c = ((tqn) nqd.this.getActivity()).l().c();
                    if (c == null || c.t) {
                        return;
                    }
                    nqd.a(nqd.this, c);
                }
            });
        }
    }

    public void a(String str, String str2, Map<String, String> map) {
        nqp nqpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        map.put(noa.KEY_GRAY_HAIR, String.valueOf("true".equals(getModel().a(noa.KEY_SEARCH_ELDER_HOME_OPEN))));
        if (map.containsKey("bxFeature")) {
            nqpVar = new nqp(this.g, this.h, "suggest", str, str2, map, MethodEnum.POST);
        } else {
            nqpVar = new nqp(this.g, this.h, "suggest", str, str2, map, MethodEnum.GET);
        }
        new npr.b().a(nqpVar).a(new nqo(str, this.r)).a(new nul("Default")).a().b().a((iud) new iud<com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b>() { // from class: tb.nqd.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iud
            public void a(com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f273174", new Object[]{this, bVar});
                    return;
                }
                r rVar = new r();
                Intent intent = nqd.this.getActivity().getIntent();
                if (intent != null && intent.getData() != null) {
                    rVar.a(intent.getData().toString());
                } else {
                    nqd.this.c().b().b("ActivateWidget", "No bundleUrl");
                }
                rVar.b(SearchDoorActivity.PAGE_NAME);
                ity.a(rVar, bVar.g, j.f19452a, bVar.k);
            }
        }).c().a(new iud<com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b>() { // from class: tb.nqd.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iud
            public void a(com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f273174", new Object[]{this, bVar});
                    return;
                }
                nqd.a(nqd.this, bVar);
                if (bVar.d == null || bVar.d.size() <= 0) {
                    return;
                }
                ((tqn) nqd.this.getActivity()).l().a(bVar.r);
            }
        }, new npj(nrh.TYPE_ACTIVATE) { // from class: tb.nqd.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str3, Object... objArr) {
                if (str3.hashCode() == -73738099) {
                    super.a((Throwable) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
            }

            @Override // tb.npj, tb.iud
            public void a(Throwable th) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                    return;
                }
                super.a(th);
                TLogTracker.a("Default", "-1", th.getMessage());
                AppMonitor.Alarm.commitFail("Page_SearchItemList", "SearchDoorMain", fjp.ERROR_CODE_CONTROL_SCROLL, th.getMessage());
            }
        });
    }

    public void b() {
        SearchBarHintBean f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!com.taobao.search.common.util.r.c()) {
            String i = this.f31639a.i();
            Map<String, String> c = this.f31639a.c();
            if (TextUtils.equals(i, "all") && (f = this.f31639a.f(i)) != null && f.discovery != null && f.discovery.activateItems != null) {
                StringBuilder sb = new StringBuilder();
                for (ActivateBean activateBean : f.discovery.activateItems) {
                    if (sb.length() > 0) {
                        sb.append(";");
                    }
                    sb.append(activateBean.keyword);
                }
                String sb2 = sb.toString();
                if (!TextUtils.isEmpty(sb2)) {
                    c.put("multi_hintq_show", sb2);
                }
            }
            SearchBarHintBean f2 = this.f31639a.f("all");
            if (f2 != null) {
                if (TextUtils.equals(f2.aac, "true")) {
                    c.put("isAacUser", "true");
                }
                if (!TextUtils.isEmpty(f2.iconName)) {
                    c.put(ChangeAppIconBridge.KEY_ICONNAME, f2.iconName);
                }
            }
            b(c);
            a(c);
            a(i, this.f31639a.j(), c);
        }
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (!"degrade".equals(Downgrade.getInstance().getDowngradeStrategy("search").getTacticsPerformance())) {
        } else {
            map.put("devicePerformanceLevel", "low");
            if (n.INSTANCE.a()) {
                map.put("devicePerformanceType", "NonVideo");
            }
            if (n.INSTANCE.b()) {
                map.put("devicePerformanceType", "NonIntelligEnd");
            }
            if (!n.INSTANCE.c()) {
                return;
            }
            map.put("devicePerformanceType", "DPicDegraded");
        }
    }

    private void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map == null || !com.taobao.search.common.util.r.aJ()) {
        } else {
            String a2 = com.taobao.search.common.util.b.c().a(com.taobao.search.common.util.b.INVOKE_ID_SEARCH_DOOR_MAIN_PAGE, SearchDoorActivity.PAGE_NAME, Integer.valueOf(com.taobao.search.common.util.r.aM()));
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            map.put("bxFeature", a2);
        }
    }

    private void a(final com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f273174", new Object[]{this, bVar});
            return;
        }
        if (bVar != null && !bVar.s) {
            postEvent(nqw.d.a(bVar));
            nrn.a().b(Integer.valueOf(this.f31639a.hashCode()), bVar.l);
        }
        if (bVar == null || (TextUtils.isEmpty(bVar.j) && (bVar.d == null || bVar.d.size() == 0))) {
            q.b("ActivateWidget", "activate cell list is empty");
            AppMonitor.Alarm.commitFail("Page_SearchItemList", "SearchDoorMain", "10001", "EMPTY_RES");
            return;
        }
        if (!bVar.s) {
            this.o.clear();
            if (bVar.g != null) {
                this.o.putAll(bVar.g);
            }
            this.p.putAll(bVar.k);
        }
        this.f = bVar;
        if (!bVar.s) {
            a(bVar.f);
        }
        if (!TextUtils.isEmpty(bVar.j)) {
            this.mActivity.runOnUiThread(new Runnable() { // from class: tb.nqd.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        nqd.a(nqd.this, bVar.j);
                    }
                }
            });
        } else {
            final ArrayList arrayList = new ArrayList();
            if (bVar.d != null) {
                arrayList.addAll(bVar.d);
            }
            a(arrayList, bVar);
            this.mActivity.runOnUiThread(new Runnable() { // from class: tb.nqd.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (nqd.a(nqd.this) != null) {
                        nqd.a(nqd.this).setVisibility(8);
                    }
                    ((TRecyclerView) nqd.this.getView()).setVisibility(0);
                    nqd.b(nqd.this).a(arrayList);
                }
            });
            q.i("ActivateWidget", "需要展示激活页数据:" + bVar);
        }
        AppMonitor.Alarm.commitSuccess("Page_SearchItemList", "SearchDoorMain");
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            InterceptFrameLayout interceptFrameLayout = this.l;
            if (interceptFrameLayout == null) {
                this.l = new InterceptFrameLayout(getActivity());
                getContainer().addView(this.l, -1, -1);
                this.l.setId(k.a());
            } else {
                interceptFrameLayout.setVisibility(0);
                ((TRecyclerView) getView()).setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.n)) {
                return;
            }
            this.n = str;
            if (e(str)) {
                this.q = WeexContainerFragment.newInstance(str, str, null, null, null);
                FragmentTransaction beginTransaction = ((FragmentActivity) getActivity()).getSupportFragmentManager().beginTransaction();
                beginTransaction.add(this.l.getId(), this.q);
                beginTransaction.commit();
                this.l.setOnInterceptTouchEventListener(new View.OnTouchListener() { // from class: tb.nqd.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                        }
                        if (motionEvent.getAction() == 2) {
                            nqd.this.postEvent(nrj.a.a());
                        }
                        return false;
                    }
                });
                return;
            }
            this.m = (WeexPageFragment) WeexPageFragment.newInstanceWithUrl((FragmentActivity) getActivity(), WeexPageFragment.class, str, str, this.l.getId());
            this.m.setRenderListener(new WeexPageFragment.a() { // from class: tb.nqd.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass8 anonymousClass8, String str2, Object... objArr) {
                    if (str2.hashCode() == -1005279751) {
                        super.onRenderSuccess((WXSDKInstance) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                }

                @Override // com.alibaba.aliweex.bundle.WeexPageFragment.a, com.taobao.weex.d
                public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onRenderSuccess(wXSDKInstance, i, i2);
                    nqd.this.postEvent(nre.f.a(wXSDKInstance.al()));
                }
            });
            this.m.setUserTrackEnable(false);
        }
    }

    private boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue() : TextUtils.equals(com.taobao.android.searchbaseframe.util.r.a(str, "weex_mode"), "dom");
    }

    public void a(List<ActivateTypedBean> list, com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85fa6ea5", new Object[]{this, list, bVar});
        } else if (!TextUtils.equals("all", this.f31639a.i())) {
        } else {
            SearchDoorContext searchDoorContext = this.f31639a;
            SearchBarHintBean f = searchDoorContext.f(searchDoorContext.i());
            if (f == null || f.discovery == null) {
                return;
            }
            ActivateCellBean activateCellBean = f.discovery;
            int indexOf = list.indexOf(bVar.c);
            if (indexOf >= 0) {
                if (!activateCellBean.aboveHistory) {
                    indexOf++;
                }
                list.add(indexOf, activateCellBean);
                return;
            }
            list.add(0, activateCellBean);
        }
    }

    private void a(ArrayMap<String, SearchBarHintBean> arrayMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b554718", new Object[]{this, arrayMap});
        } else if (arrayMap == null) {
            q.b("ActivateWidget", "searchBarHintGroup from activate is null");
        } else {
            for (Map.Entry<String, SearchBarHintBean> entry : arrayMap.entrySet()) {
                if (entry == null) {
                    q.b("ActivateWidget", "searchBarHintEntry is null");
                } else {
                    this.f31639a.a(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f31639a.a(getActivity(), "activatePage");
        if (this.c) {
            this.f31639a.b(false);
        } else {
            this.f31639a.b(true);
            onHistoryUpdated(this.b.b());
            g();
        }
        InterceptFrameLayout interceptFrameLayout = this.l;
        if (interceptFrameLayout != null) {
            interceptFrameLayout.setVisibility(0);
        } else if (getView() == 0) {
        } else {
            ((TRecyclerView) getView()).setVisibility(0);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.f31639a.a(getActivity(), "suggestPage");
        ((TRecyclerView) getView()).setVisibility(8);
        InterceptFrameLayout interceptFrameLayout = this.l;
        if (interceptFrameLayout == null) {
            return;
        }
        interceptFrameLayout.setVisibility(8);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 2) {
            postEvent(nrj.a.a());
        }
        return false;
    }

    @Override // tb.nqh.a
    public void onHistoryUpdated(HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800ee4f5", new Object[]{this, historyCellBean});
            return;
        }
        if (this.f == null) {
            this.f = new com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b();
        }
        List<ActivateTypedBean> a2 = this.i.a();
        if (a2 == null) {
            a2 = new ArrayList<>();
        }
        a(a2, this.f);
        g();
    }

    @Override // tb.nqh.a
    public void onHistoryDeleted(HistoryCellBean historyCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89c853", new Object[]{this, historyCellBean});
        } else {
            postEvent(nqw.f.a(historyCellBean));
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.b.a(str);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            d.a(this.mActivity, "", com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_22843), com.alibaba.ability.localization.b.a(R.string.app_confirm), new DialogInterface.OnClickListener() { // from class: tb.nqd.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("channelSrp", nqd.this.getModel().f());
                    com.taobao.search.mmd.util.e.a("ClearHistory", hashMap);
                    nqd.this.b.a();
                    dialogInterface.cancel();
                }
            }, com.alibaba.ability.localization.b.a(R.string.app_cancel), new DialogInterface.OnClickListener() { // from class: tb.nqd.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        dialogInterface.cancel();
                    }
                }
            });
        }
    }

    private void a(nqw.b bVar) {
        final ActivateBean activateBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1d26c6", new Object[]{this, bVar});
        } else if (bVar == null || (activateBean = bVar.f31671a) == null) {
        } else {
            d.a(this.mActivity, "", com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16653), com.alibaba.ability.localization.b.a(R.string.app_confirm), new DialogInterface.OnClickListener() { // from class: tb.nqd.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    nqd.this.b.a(activateBean);
                    dialogInterface.cancel();
                }
            }, com.alibaba.ability.localization.b.a(R.string.app_cancel), new DialogInterface.OnClickListener() { // from class: tb.nqd.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        dialogInterface.cancel();
                    }
                }
            });
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        this.g = str;
        this.h = str2;
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.b
    public final TemplateBean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("45058b5e", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return this.o.get(str);
        }
        return null;
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.b
    public jvm.c b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvm.c) ipChange.ipc$dispatch("ad662293", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return this.p.get(str);
        }
        return null;
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.b
    public final void a(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421b9086", new Object[]{this, wXSDKInstance});
        } else {
            this.k.a(wXSDKInstance);
        }
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.b
    public void b(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65ac8e5", new Object[]{this, wXSDKInstance});
        } else {
            this.k.b(wXSDKInstance);
        }
    }

    @Override // tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        WeexPageFragment weexPageFragment = this.m;
        if (weexPageFragment != null) {
            weexPageFragment.destroyWeex();
        }
        InterceptFrameLayout interceptFrameLayout = this.l;
        if (interceptFrameLayout == null) {
            return;
        }
        t.a(interceptFrameLayout);
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        this.f31639a.a(getActivity(), ((TRecyclerView) getView()).getVisibility() == 0 ? "activatePage" : "suggestPage");
        g();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.i.getItemCount(); i++) {
            if (this.i.a(i) instanceof HistoryCellBean) {
                this.i.notifyItemChanged(i);
            }
        }
    }

    @Override // tb.iut
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        this.f31639a.a(getActivity(), "hide");
    }

    @Override // tb.iut
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        nrn.a().c(Integer.valueOf(this.f31639a.hashCode()));
    }

    public void onEventMainThread(nrj.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812cb0f", new Object[]{this, dVar});
        } else {
            a(dVar.f31690a);
        }
    }

    public void onEventMainThread(nrj.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8133f6e", new Object[]{this, eVar});
        } else {
            a(eVar.f31691a);
        }
    }

    private void a(SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e043b093", new Object[]{this, searchBarHintBean});
        } else if (searchBarHintBean == null) {
        } else {
            a(searchBarHintBean.displayText, searchBarHintBean.searchText);
        }
    }

    public void onEventMainThread(nrj.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811e251", new Object[]{this, bVar});
        } else if (!bVar.a()) {
            e();
        } else {
            d();
        }
    }

    public void onEventMainThread(nre.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8b0453", new Object[]{this, eVar});
        } else {
            c(eVar.f31678a);
        }
    }

    public void onEventMainThread(nqw.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95b1b82", new Object[]{this, cVar});
        } else {
            b();
        }
    }

    public void onEventMainThread(nqw.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95aa723", new Object[]{this, bVar});
        } else {
            a(bVar);
        }
    }

    public void onEventMainThread(nqw.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95c0440", new Object[]{this, eVar});
        } else {
            f();
        }
    }
}
