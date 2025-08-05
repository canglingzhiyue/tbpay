package tb;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.weex_framework.r;
import com.taobao.downgrade.Downgrade;
import com.taobao.search.common.util.i;
import com.taobao.search.common.util.n;
import com.taobao.search.common.util.q;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.b;
import com.taobao.search.searchdoor.sf.widgets.e;
import com.taobao.search.searchdoor.sf.widgets.g;
import com.taobao.search.searchdoor.sf.widgets.suggest.data.c;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.Globals;
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
import tb.nrj;
import tb.nrw;

/* loaded from: classes7.dex */
public abstract class nrl extends ius<Void, TRecyclerView, SearchDoorContext> implements View.OnTouchListener, b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f31693a;
    private nqy b;
    private LinearLayoutManager c;
    private boolean d;
    private npn e;
    private SearchDoorContext f;
    private final Map<String, TemplateBean> g;
    private final Map<String, jvm.c> h;
    private g i;

    static {
        kge.a(-1062348235);
        kge.a(-468432129);
        kge.a(-931718986);
    }

    public static /* synthetic */ Object ipc$super(nrl nrlVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode != 593843865) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCtxDestroy();
            return null;
        }
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.b
    public void a(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421b9086", new Object[]{this, wXSDKInstance});
        }
    }

    public abstract Map<String, String> b();

    @Override // com.taobao.search.searchdoor.sf.widgets.b
    public void b(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65ac8e5", new Object[]{this, wXSDKInstance});
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "SuggestWidget";
    }

    public static /* synthetic */ void a(nrl nrlVar, com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbfc09bc", new Object[]{nrlVar, bVar});
        } else {
            nrlVar.a(bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.taobao.uikit.feature.view.TRecyclerView] */
    @Override // tb.ius
    public /* synthetic */ TRecyclerView onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    public nrl(Activity activity, ium iumVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, searchDoorContext, viewGroup, iurVar);
        this.f31693a = null;
        this.d = false;
        this.i = new g();
        this.g = new ConcurrentHashMap();
        this.h = new ConcurrentHashMap();
        this.c = new LinearLayoutManager(activity);
        this.f = searchDoorContext;
        this.b = new nrp(activity, this, new e(this.f, this, null));
        subscribeEvent(this.i);
        subscribeEvent(this);
    }

    public TRecyclerView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TRecyclerView) ipChange.ipc$dispatch("9f312c12", new Object[]{this});
        }
        TRecyclerView tRecyclerView = new TRecyclerView(this.mActivity);
        tRecyclerView.setBackgroundResource(R.drawable.tbsearch_sortbar_background);
        tRecyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tRecyclerView.setOverScrollMode(2);
        tRecyclerView.setHasFixedSize(true);
        tRecyclerView.setLayoutManager(this.c);
        tRecyclerView.setAdapter(this.b);
        tRecyclerView.addFeature(new SmoothRecyclerScrollFeature());
        tRecyclerView.setOnTouchListener(this);
        tRecyclerView.setVisibility(8);
        tRecyclerView.setRecycledViewPool(new com.taobao.android.searchbaseframe.business.srp.list.uikit.b());
        return tRecyclerView;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ?? view = getView();
        if (view.getVisibility() == 8) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200L);
            view.startAnimation(alphaAnimation);
            view.setVisibility(0);
        }
        this.f.a(10002);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        ((TRecyclerView) getView()).setVisibility(8);
        this.b.a((List) new ArrayList());
        this.f.a(10001);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 2) {
            ((InputMethodManager) Globals.getApplication().getSystemService("input_method")).hideSoftInputFromWindow(((TRecyclerView) getView()).getWindowToken(), 0);
        }
        return false;
    }

    public void a(String str, String str2) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        q.i(com.taobao.share.taopassword.busniess.model.g.TAO, "startSearchAssocWord :" + str);
        h();
        q.i("SuggestWidget", "取消前一个关键词推荐任务");
        Map<String, String> c = this.f.c();
        if (this.f.a()) {
            c.put("firstBackRequest", "true");
            this.f.a(false);
        }
        String q = this.f.q();
        if (!TextUtils.isEmpty(q)) {
            c.put("lastQ", q);
        }
        c.put(noa.KEY_GRAY_HAIR, String.valueOf("true".equals(this.f.a(noa.KEY_SEARCH_ELDER_HOME_OPEN))));
        a(c);
        c.putAll(b());
        c.put("sessionId", this.i.c());
        if (c.containsKey("bxFeature")) {
            cVar = new c(str, str2, this.f.j(), c, MethodEnum.POST);
        } else {
            cVar = new c(str, str2, this.f.j(), c);
        }
        this.e = new npr.b().a(cVar).a(new com.taobao.search.searchdoor.sf.widgets.suggest.data.b(str2, this.d)).a(new nul("Suggest")).a().b().a((iud) new iud<com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b>() { // from class: tb.nrl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iud
            public void a(com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f273174", new Object[]{this, bVar});
                    return;
                }
                r rVar = new r();
                Intent intent = nrl.this.getActivity().getIntent();
                if (intent != null && intent.getData() != null) {
                    rVar.a(intent.getData().toString());
                } else {
                    nrl.this.c().b().b("SuggestWidget", "No bundleUrl");
                }
                rVar.b(SearchDoorActivity.PAGE_NAME);
                ity.a(rVar, bVar.g, nrl.this.c(), bVar.k);
            }
        }).c().a(new iud<com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b>() { // from class: tb.nrl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iud
            public void a(com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f273174", new Object[]{this, bVar});
                    return;
                }
                q.a("SuggestWidget", "suggest callback thread:" + Thread.currentThread().toString());
                nrl.a(nrl.this, bVar);
            }
        }, new npv() { // from class: tb.nrl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str3, Object... objArr) {
                if (str3.hashCode() == -73738099) {
                    super.a((Throwable) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
            }

            @Override // tb.npv, tb.npj, tb.iud
            public void a(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                    return;
                }
                super.a(th);
                if (th == null) {
                    return;
                }
                TLogTracker.a("Default", "-1", th.getMessage());
            }
        });
        f();
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

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        npn npnVar = this.e;
        if (npnVar == null || npnVar.b()) {
            return;
        }
        this.e.a();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        h();
        q.i("SuggestWidget", "清空搜索框取消关键词推荐任务");
        g();
    }

    public void onEventMainThread(nrj.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811e251", new Object[]{this, bVar});
        } else if (bVar.a()) {
            d();
        } else {
            a(bVar.f31688a, this.f.i());
        }
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.b
    public TemplateBean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("45058b5e", new Object[]{this, str});
        }
        if (!this.g.isEmpty() && !TextUtils.isEmpty(str)) {
            return this.g.get(str);
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
            return this.h.get(str);
        }
        return null;
    }

    private void a(com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f273174", new Object[]{this, bVar});
        } else if (bVar == null) {
            i.d.a().b(i.d.a().a(i.d.TYPE_SUCCESS_WITH_EMPTY_DATA, null));
        } else {
            if (bVar.c() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("code", String.valueOf(bVar.c().getErrorCode()));
                hashMap.put("msg", bVar.c().getErrorMsg());
                i.d.a().b(i.d.a().a("failure", hashMap));
            } else {
                z = false;
            }
            nrn.a().c(Integer.valueOf(this.f.hashCode()), bVar.l);
            postEvent(nrw.e.a(bVar));
            if (bVar.g != null) {
                this.g.putAll(bVar.g);
            }
            this.h.putAll(bVar.k);
            this.f31693a = bVar.f19366a;
            this.b.a((List) bVar.d);
            if (z) {
                return;
            }
            if (bVar.d.isEmpty()) {
                i.d.a().b(i.d.a().a(i.d.TYPE_SUCCESS_WITH_EMPTY_DATA, null));
            } else {
                i.d.a().b(i.d.a().a(i.d.TYPE_SUCCESS, null));
            }
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.f31693a;
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        this.d = com.taobao.search.common.util.r.aT();
        i.d.a().a(this.d);
    }

    @Override // tb.iut
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        nrn.a().e(Integer.valueOf(this.f.hashCode()));
        h();
        q.i("SuggestWidget", "退出页面取消关键词推荐任务");
    }
}
