package com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelStoreOwner;
import android.graphics.Rect;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemCategoriesResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.o;
import com.taobao.android.live.plugin.atype.flexalocal.good.tab.GoodsMultiTabManager;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.GoodsLiveStateMutitabView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.NonPreheatTabView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.afp;
import tb.afr;
import tb.afs;
import tb.hgv;
import tb.hhs;
import tb.hhw;
import tb.hib;
import tb.hin;
import tb.hiq;
import tb.hir;
import tb.his;
import tb.hit;
import tb.kge;
import tb.pqj;

/* loaded from: classes5.dex */
public class c extends a<e> implements f, o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.d e;
    public RecyclerView f;
    private FrameLayout h;
    private NoScrollViewPager i;
    private List<View> j;
    private com.taobao.android.live.plugin.atype.flexalocal.good.tab.a k;
    private boolean l;
    private final boolean m;
    private long n;
    private boolean o;
    private List<com.taobao.android.live.plugin.atype.flexalocal.good.tab.d> p;
    private Handler q;
    private int r;
    private com.taobao.android.live.plugin.atype.flexalocal.good.tab.c s;

    static {
        kge.a(20381060);
        kge.a(291908457);
        kge.a(1196508128);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ long a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("75b4381f", new Object[]{cVar})).longValue() : cVar.n;
    }

    public static /* synthetic */ long a(c cVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40d343ed", new Object[]{cVar, new Long(j)})).longValue();
        }
        cVar.n = j;
        return j;
    }

    public static /* synthetic */ boolean b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3cc01f30", new Object[]{cVar})).booleanValue() : cVar.o;
    }

    public static /* synthetic */ void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cc062d", new Object[]{cVar});
        } else {
            cVar.n();
        }
    }

    public static /* synthetic */ NoScrollViewPager d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NoScrollViewPager) ipChange.ipc$dispatch("a836827e", new Object[]{cVar}) : cVar.i;
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.good.tab.c e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.good.tab.c) ipChange.ipc$dispatch("d4694f13", new Object[]{cVar}) : cVar.s;
    }

    public static /* synthetic */ Handler f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("75744596", new Object[]{cVar}) : cVar.q;
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.good.tab.a g(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.good.tab.a) ipChange.ipc$dispatch("e5a05793", new Object[]{cVar}) : cVar.k;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.b
    public /* synthetic */ hgv d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("261a6cc4", new Object[]{this}) : g();
    }

    public c(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, ViewGroup viewGroup) {
        super(cVar, viewGroup);
        this.l = false;
        this.o = false;
        this.n = -1L;
        if (cVar != null && cVar.x() != null) {
            cVar.x().a(this);
        }
        this.m = hir.U();
        this.q = new Handler();
    }

    public e g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("4ea8ae29", new Object[]{this}) : new e(this.c);
    }

    private void n() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        his.b("GoodsView", "realShow | defaultCategoryId=");
        this.l = true;
        if (this.f13769a != null && this.b != null) {
            int i = 0;
            while (true) {
                if (i >= this.f13769a.getChildCount()) {
                    z = false;
                    break;
                } else if (this.b == this.f13769a.getChildAt(i)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f13769a.addView(this.b);
            }
        }
        if (this.f13769a != null) {
            this.f13769a.setVisibility(0);
        }
        if (this.b != null) {
            this.b.setVisibility(0);
            Animation a2 = a();
            a2.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    }
                }

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
            });
            this.b.startAnimation(a2);
        }
        j();
        a(this.s.i());
        com.taobao.android.live.plugin.atype.flexalocal.good.tab.d b = this.s.b();
        if (b == null) {
            HashMap hashMap = new HashMap();
            String str = "" + this.s.e();
            hashMap.put("curIndex", str);
            hit.a(this.c, "tabBundle_empty", hashMap);
            his.b("GoodsView", "realShow | tabBundle is null. index=" + str);
            return;
        }
        if (b instanceof GoodsMultiTabManager.NativeDXTabBundle) {
            final GoodsLiveStateMutitabView goodsLiveStateMutitabView = ((GoodsMultiTabManager.NativeDXTabBundle) b).stateMultiTabView;
            if (v.b.a("goodlist", "glshowdelay2", true) && !com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.m()) {
                this.q.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.c.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (goodsLiveStateMutitabView == null) {
                        } else {
                            hib.a(c.a(c.this));
                            his.a("GoodsView", "realShow | showPackage.");
                            goodsLiveStateMutitabView.showPackage();
                        }
                    }
                }, 75L);
            } else if (goodsLiveStateMutitabView != null) {
                hib.a(this.n);
                his.a("GoodsView", "realShow | showPackage.");
                goodsLiveStateMutitabView.showPackage();
            }
        } else if (StringUtils.equals("weex", b.tabType)) {
            if ((b instanceof GoodsMultiTabManager.WeexTabBundle) && ((GoodsMultiTabManager.WeexTabBundle) b).baseFrame != null && com.taobao.android.live.plugin.atype.flexalocal.good.a.a().l() != null) {
                com.taobao.android.live.plugin.atype.flexalocal.good.a.a().l();
            }
        } else {
            StringUtils.equals("h5", b.tabType);
        }
        ((e) this.d).b();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f
    public void a(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa210a1c", new Object[]{this, str, new Long(j), str2});
            return;
        }
        his.b("GoodsView", "showPackage | defaultCategoryId=" + str + "  topItemId=" + j + " openFrom=" + str2);
        this.c.L.a(str, j, str2);
        final UltronInstanceViewModel a2 = hiq.a((ViewModelStoreOwner) f());
        final LiveData<Boolean> liveData = a2.c;
        final long currentTimeMillis = System.currentTimeMillis();
        liveData.observe((LifecycleOwner) this.c.f(), new Observer<Boolean>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.arch.lifecycle.Observer
            public /* synthetic */ void onChanged(Boolean bool) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a3d3a6b8", new Object[]{this, bool});
                } else {
                    a(bool);
                }
            }

            public void a(Boolean bool) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
                } else if (bool == null || !bool.booleanValue()) {
                } else {
                    a2.a();
                    c.a(c.this, System.currentTimeMillis() - currentTimeMillis);
                    if (!c.b(c.this)) {
                        his.b("GoodsView", "onChanged | consumeTime=" + c.a(c.this));
                    }
                    c.c(c.this);
                    liveData.removeObserver(this);
                }
            }
        });
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        if (this.c == null || this.c.R == null) {
            his.b("GoodsView", "openLiveCart | categoryData is empty.");
            return false;
        }
        List<JSONObject> list = this.c.R.topRightEntranceList;
        if (list == null || list.isEmpty()) {
            his.b("GoodsView", "openLiveCart | entryList is empty.");
            return false;
        }
        for (JSONObject jSONObject : list) {
            if (StringUtils.equals(hhw.ENTRY_TYPE_LIVE_CART, jSONObject.getString("type"))) {
                this.e.c(jSONObject);
                return true;
            }
        }
        return false;
    }

    public e h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("d0f36308", new Object[]{this}) : (e) this.d;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        his.a("GoodsView", "switchToTargetTabByIndex | index=" + i);
        if (i < 0 || i >= this.k.getCount()) {
            return;
        }
        int e = this.s.e();
        his.a("GoodsView", "switchToTargetTabByIndex | oldIndex=" + e + "   index=" + i);
        this.s.c(i);
        this.i.setCurrentItem(i, true);
        if (e == i) {
            return;
        }
        ((e) this.d).b();
    }

    public void a(LiveItemCategoriesResponseData liveItemCategoriesResponseData, String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c52c0c3", new Object[]{this, liveItemCategoriesResponseData, str, list});
            return;
        }
        this.s.a(this.i, this.k, liveItemCategoriesResponseData.extraGoodsTabList);
        GoodsMultiTabManager.NativeDXTabBundle a2 = this.s.a();
        if (a2 == null) {
            return;
        }
        if (a2.stateMultiTabView == null) {
            his.b("GoodsView", "refreshCategory | stateMultiTabView is empty.");
        } else if (liveItemCategoriesResponseData == null || (liveItemCategoriesResponseData.itemCategoryList != null && liveItemCategoriesResponseData.itemCategoryList.size() > 0)) {
            a2.stateMultiTabView.refreshCategoriesNav(liveItemCategoriesResponseData.itemCategoryList, str, list);
        } else {
            a2.stateMultiTabView.clearCategoriesNav();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        this.l = false;
        this.c.L.b();
        if (this.b != null) {
            Animation b = b();
            b.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.c.4
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
                        return;
                    }
                    his.a("GoodsView", "hide | onAnimationStart | state=" + c.this.b.getVisibility());
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                        return;
                    }
                    c.this.b.setVisibility(4);
                    if (c.this.c.l()) {
                        c cVar = c.this;
                        cVar.f13769a = (ViewGroup) cVar.b.getParent();
                        if (c.this.f13769a != null) {
                            c.this.f13769a.removeView(c.this.b);
                        }
                    }
                    his.a("GoodsView", "hide | onAnimationEnd, state=" + c.this.b.getVisibility());
                }
            });
            this.b.startAnimation(b);
        }
        this.e.b();
        com.taobao.android.live.plugin.atype.flexalocal.good.view.search.e.a(this.f13769a, (ResultReceiver) null);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f
    public void setLiveInfos(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c11a635", new Object[]{this, hashMap});
            return;
        }
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.s()) {
            this.s = new com.taobao.android.live.plugin.atype.flexalocal.good.tab.b(this.c, this.p);
        } else {
            this.s = new GoodsMultiTabManager(this.c);
        }
        ((e) this.d).a(this.s);
        a(hashMap);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!this.m || this.d == 0) {
        } else {
            if (z) {
                ((e) this.d).h();
            } else {
                ((e) this.d).i();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        ((e) this.d).g();
        his.b("GoodsView", "resume | resume.");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f
    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue() : this.b.getVisibility() == 0;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.a
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        this.b = (ViewGroup) LayoutInflater.from(f()).inflate(R.layout.taolive_good_view_flexalocal, (ViewGroup) null);
        this.f = (RecyclerView) this.b.findViewById(R.id.taolive_good_view_header);
        this.i = (NoScrollViewPager) this.b.findViewById(R.id.taolive_goods_view_viewpager);
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(this.c)) {
            this.i.setBackgroundColor(-1);
        }
        this.j = new ArrayList();
        this.p = new ArrayList();
        this.k = new com.taobao.android.live.plugin.atype.flexalocal.good.tab.a(this.p, this.j);
        this.i.setAdapter(this.k);
        this.i.setScrollable(false);
        this.h = (FrameLayout) this.b.findViewById(R.id.taolive_goods_view_search_container);
        this.e = new com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.d(this.c, this.h, (ViewGroup) this.b.findViewById(R.id.taolive_goods_view_entry_pop_container));
        this.e.a(this.i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 80;
        viewGroup.addView(this.b, layoutParams);
        b(0);
        this.b.requestLayout();
        return this.b;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.o
    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!v.b.a("goodlist", "enableCartAnim", true)) {
            his.b("GoodsView", "addCartAnim | orange is false.");
        } else {
            his.b("GoodsView", "onAddCart.");
            ((e) this.d).a(true);
            this.q.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.c.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!c.this.k()) {
                        his.b("GoodsView", "onAddCart | list not show.");
                        ((e) c.this.d).a(false);
                    } else if (c.this.l()) {
                        his.b("GoodsView", "onAddCart | search is show.");
                        ((e) c.this.d).a(false);
                    } else {
                        final DXWidgetNode a2 = h.a(c.this.f, "goods_top_liveCart");
                        h.a(c.this.c, str, c.this.f13769a, c.d(c.this), a2 == null ? null : a2.getDXRuntimeContext().v(), h.a(str, c.e(c.this), c.this.c));
                        if (a2 == null || !c.this.c.c.i) {
                            ((e) c.this.d).a(false);
                        } else {
                            c.f(c.this).postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.c.5.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    JSONObject jSONObject;
                                    JSONArray jSONArray;
                                    IpChange ipChange3 = $ipChange;
                                    int i = 0;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    ((e) c.this.d).a(false);
                                    JSONObject e = a2.getDXRuntimeContext().e();
                                    if (e == null || !e.containsKey("fields") || (jSONObject = e.getJSONObject("fields")) == null || !jSONObject.containsKey("topRightEntranceList") || (jSONArray = jSONObject.getJSONArray("topRightEntranceList")) == null) {
                                        return;
                                    }
                                    while (true) {
                                        if (i >= jSONArray.size()) {
                                            break;
                                        }
                                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                        if (StringUtils.equals(hhw.ENTRY_TYPE_LIVE_CART, jSONObject2.getString("type"))) {
                                            String string = jSONObject2.getString("realCount");
                                            if (!StringUtils.isEmpty(string)) {
                                                jSONObject2.put("count", (Object) string);
                                            }
                                            jSONObject2.put("animatedIcon", (Object) true);
                                            his.a("GoodsView", "onAddCart | refresh, realCountS=" + string);
                                        } else {
                                            i++;
                                        }
                                    }
                                    hhs.a().a(a2.queryRootWidgetNode());
                                }
                            }, 500L);
                        }
                    }
                }
            }, 500L);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.o
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (this.c == null || !this.c.c.l) {
        } else {
            q();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f
    public void q() {
        List<com.taobao.android.live.plugin.atype.flexalocal.good.tab.d> i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.tab.c cVar = this.s;
        if (cVar == null || (i = cVar.i()) == null) {
            return;
        }
        GoodsLiveStateMutitabView goodsLiveStateMutitabView = null;
        while (true) {
            if (i2 >= i.size()) {
                break;
            }
            com.taobao.android.live.plugin.atype.flexalocal.good.tab.d dVar = i.get(i2);
            if (dVar instanceof GoodsMultiTabManager.NativeDXTabBundle) {
                goodsLiveStateMutitabView = ((GoodsMultiTabManager.NativeDXTabBundle) dVar).stateMultiTabView;
                break;
            }
            i2++;
        }
        if (goodsLiveStateMutitabView == null) {
            return;
        }
        for (SingleTabBaseView singleTabBaseView : goodsLiveStateMutitabView.getLiveStateViewList()) {
            if (singleTabBaseView instanceof NonPreheatTabView) {
                for (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.e eVar : singleTabBaseView.getAdapter().a()) {
                    eVar.d = 1L;
                }
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.l = false;
        this.q.removeCallbacksAndMessages(-1);
        com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.d dVar = this.e;
        if (dVar != null) {
            dVar.c();
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.tab.c cVar = this.s;
        if (cVar != null) {
            cVar.g();
            this.k.notifyDataSetChanged();
        }
        if (this.c != null && this.c.x() != null) {
            this.c.x().b(this);
        }
        ((e) this.d).f();
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : isShowing() && this.l;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.h.getVisibility() == 0 && this.h.getChildCount() > 0;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        UltronInstanceViewModel a2 = hiq.a((ViewModelStoreOwner) this.c.f());
        String str = a2.f13834a;
        if (StringUtils.isEmpty(str)) {
            his.b("VMUltronInstance", "奥创配置配置没有拉取成功！");
            return;
        }
        his.a("VMUltronInstance", "奥创配置数据源：" + a2.b.name());
        com.alibaba.android.ultron.vfw.instance.d B = this.c.B();
        B.r().a(pqj.b(str));
        B.a(new afp());
        this.r = hiq.a(new JSONObject(), this.c, "TaoLiveGoodsTitleContainer", -1);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.o) {
        } else {
            e();
            List<IDMComponent> e = this.c.B().k().e();
            com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar = this.c;
            if (e == null) {
                e = new ArrayList<>();
            }
            final afs afsVar = new afs(cVar, e, this, this.f);
            this.f.setAdapter(afsVar);
            this.f.setLayoutManager(new LinearLayoutManager(this.c.f()));
            this.f.setOverScrollMode(2);
            this.f.setItemAnimator(null);
            if (this.c.E() != null) {
                this.c.E().d().a((afs) this.f.getAdapter());
            }
            his.b("GoodsView", "initHeaderView | size=" + afsVar.a().size());
            final List<IDMComponent> a2 = afsVar.a();
            this.f.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.c.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass6 anonymousClass6, String str, Object... objArr) {
                    if (str.hashCode() == -1263079482) {
                        super.getItemOffsets((Rect) objArr[0], (View) objArr[1], (RecyclerView) objArr[2], (RecyclerView.State) objArr[3]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                private boolean a(IDMComponent iDMComponent, View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7dab916a", new Object[]{this, iDMComponent, view})).booleanValue();
                    }
                    if ((view instanceof FrameLayout) && com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.r()) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getChildCount() > 0 && !(frameLayout.getChildAt(0) instanceof DXRootView)) {
                            his.b("GoodsView", "idmComponentRender | component=" + iDMComponent.getKey());
                            return false;
                        }
                    }
                    for (IDMComponent iDMComponent2 : afsVar.b(iDMComponent)) {
                        if (afr.a(iDMComponent2)) {
                            his.a("GoodsView", "idmComponentRender | name=" + iDMComponent2.getKey());
                            return true;
                        }
                    }
                    return false;
                }

                @Override // android.support.v7.widget.RecyclerView.ItemDecoration
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
                        return;
                    }
                    super.getItemOffsets(rect, view, recyclerView, state);
                    int childPosition = recyclerView.getChildPosition(view);
                    if (childPosition >= a2.size()) {
                        hit.a(c.this.c, "getItemOffsets", (Map<String, String>) null);
                        his.b("GoodsView", "getItemOffsets | pos=" + childPosition + "  components.size=" + a2.size());
                        return;
                    }
                    IDMComponent iDMComponent = (IDMComponent) a2.get(childPosition);
                    JSONObject jSONObject = iDMComponent.getData().getJSONObject("fields");
                    if (jSONObject == null || !jSONObject.containsKey("overlap") || !a(iDMComponent, view)) {
                        return;
                    }
                    rect.bottom = -hin.a(c.this.c.f(), l.a(jSONObject.getString("overlap"), 0));
                }
            });
            this.o = true;
        }
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.s.e();
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.s()) {
                this.s.a(map);
                this.k.notifyDataSetChanged();
                return;
            }
            this.s.a(map, this.j, f(), this.b, new GoodsMultiTabManager.a(this.c.r(), null), new GoodsMultiTabManager.b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.c.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.atype.flexalocal.good.tab.GoodsMultiTabManager.b
                public void a(List<com.taobao.android.live.plugin.atype.flexalocal.good.tab.d> list, List<String> list2, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea6d17f9", new Object[]{this, list, list2, new Integer(i)});
                        return;
                    }
                    c.g(c.this).a(list2);
                    c.g(c.this).notifyDataSetChanged();
                }
            });
        }
    }

    private void a(List<com.taobao.android.live.plugin.atype.flexalocal.good.tab.d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if ((com.taobao.taolive.sdk.utils.b.d(this.c.f()) || hiq.b(".gl_debug")) && list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size() && !(list.get(i) instanceof GoodsMultiTabManager.NativeDXTabBundle); i++) {
            }
        }
    }

    public void b(int i) {
        int f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (this.c.r()) {
            f = hin.f(this.c.f()) - com.taobao.taolive.sdk.utils.b.a(f(), 48.0f);
        } else {
            f = (int) (hin.f(this.c.f()) * 0.725f);
        }
        layoutParams.width = this.c.c.s;
        layoutParams.gravity = 85;
        int i2 = 51;
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(this.c) && (i2 = this.r) <= 0) {
            i2 = 47;
        }
        his.b("GoodsView", "adapterWidthAndHeight | dm=" + f + "  headHeight=" + i2 + "   compressHeight" + i);
        this.i.getLayoutParams().height = (f - hin.a(hhs.a().c(), this.c.f(), (float) i2)) - i;
        this.h.getLayoutParams().height = f - i;
    }
}
