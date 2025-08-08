package com.taobao.homepage.view.manager.searchbar.impl.searchview;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.editionswitcher.l;
import com.taobao.android.home.component.utils.j;
import com.taobao.homepage.utils.k;
import com.taobao.homepage.utils.n;
import com.taobao.tao.Globals;
import tb.kge;
import tb.ldf;
import tb.oqk;
import tb.oql;
import tb.sqg;
import tb.ssm;
import tb.tgr;
import tb.tgs;

/* loaded from: classes7.dex */
public class c extends DXRootView.a implements tgs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f17330a = false;
    private final SearchBarView b;
    private final ssm c;

    static {
        kge.a(353910589);
        kge.a(-612825092);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.tgs
    public void a(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0ff5ab", new Object[]{this, new Float(f), new Integer(i)});
        }
    }

    public static /* synthetic */ ssm a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ssm) ipChange.ipc$dispatch("37d9fa50", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acba884f", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.f17330a = z;
        return z;
    }

    public c(SearchBarView searchBarView, ssm ssmVar) {
        this.b = searchBarView;
        this.c = ssmVar;
        oql.a().a(g());
    }

    @Override // com.taobao.android.dinamicx.DXRootView.a
    public void b(DXRootView dXRootView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a57523d9", new Object[]{this, dXRootView, new Integer(i)});
        } else if (i == 0) {
            if (c()) {
                return;
            }
            a();
            ldf.d("SearchBarAppearStatus", "onWindowVisibilityChanged VISIBLE");
        } else {
            b();
            ldf.d("SearchBarAppearStatus", "onWindowVisibilityChanged GONE");
        }
    }

    @Override // com.taobao.android.dinamicx.DXRootView.a
    public void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
        } else if (i == 0) {
            if (c()) {
                return;
            }
            a();
            ldf.d("SearchBarAppearStatus", "onVisibilityChanged VISIBLE");
        } else {
            b();
            ldf.d("SearchBarAppearStatus", "onVisibilityChanged GONE");
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : com.taobao.homepage.page.weexv2.a.d();
    }

    @Override // com.taobao.android.dinamicx.DXRootView.a
    public void a(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
            return;
        }
        b();
        ldf.d("SearchBarAppearStatus", "onDetachedFromWindow");
    }

    @Override // com.taobao.android.dinamicx.DXRootView.a
    public void b(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4766dc6a", new Object[]{this, dXRootView});
            return;
        }
        a();
        ldf.d("SearchBarAppearStatus", "onAttachedToWindow");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (e() && !this.f17330a) {
            f();
        } else {
            this.b.onDxSearchBarViewAppear();
            ldf.d("SearchBarAppearStatus", "onRootViewAppear");
        }
        com.taobao.tao.topmultitab.c.a().x();
        c(this.b.getDX3SearchView());
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b.onDxSearchBarViewDisAppear();
        ldf.d("SearchBarAppearStatus", "onRootViewDisappear");
    }

    @Override // tb.tgs
    public void a(String str, tgr tgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4051d3e3", new Object[]{this, str, tgrVar});
            return;
        }
        d();
        k.a(str);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!n.n().h()) {
        } else {
            ldf.d("SearchBarAppearStatus", "stopSearchTextLooper run");
            String a2 = com.taobao.tao.topmultitab.c.a().a(com.taobao.tao.topmultitab.c.a().z());
            ldf.d("SearchBarAppearStatus", "stopSearchTextLooper currentType " + a2);
            DXEvent dXEvent = new DXEvent(!a(a2) ? 5288671110273408574L : 5388973340095122049L);
            this.b.postDXEvent(dXEvent, "searchText");
            ldf.d("SearchBarAppearStatus", "stopSearchTextLooper searchTextWidgetNode postEvent dxEvent： " + dXEvent);
        }
    }

    private boolean a(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        if (StringUtils.equals(str, "home")) {
            str = "home";
        }
        JSONObject c = sqg.c();
        if (c != null && (jSONObject = c.getJSONObject("subSection")) != null && (jSONObject2 = jSONObject.getJSONObject(str)) != null && (jSONObject3 = jSONObject2.getJSONObject("ext")) != null) {
            return jSONObject3.getBooleanValue(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_IMMERSIVE);
        }
        return false;
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : j.a("fix_home_searchbar_bg_loop_new_enable", true) && l.f(Globals.getApplication());
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.f17330a) {
        } else {
            ldf.d("SearchBarAppearStatus", "commitRecommendLoopExceptionHomeLoopException");
        }
    }

    private oqk g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oqk) ipChange.ipc$dispatch("3d32afaf", new Object[]{this}) : new oqk() { // from class: com.taobao.homepage.view.manager.searchbar.impl.searchview.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.oqk
            public void dw_() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7a5014b3", new Object[]{this});
                    return;
                }
                c.a(c.this, true);
                c.this.a();
                ldf.d("SearchBarAppearStatus", "onResumeByHomePage");
            }

            @Override // tb.oqk
            public void dS_() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3ce19e57", new Object[]{this});
                    return;
                }
                c.a(c.this, false);
                c.this.b();
                ldf.d("SearchBarAppearStatus", "onPauseByHomePage");
            }

            @Override // tb.oqk
            public void h() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cf10ef", new Object[]{this});
                    return;
                }
                c.a(c.this, false);
                ldf.d("SearchBarAppearStatus", "onStopByHomePage");
            }

            @Override // tb.oqk
            public void g() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c0f96e", new Object[]{this});
                    return;
                }
                c.a(c.this, true);
                ldf.d("SearchBarAppearStatus", "onStartByHomePage");
            }
        };
    }

    private void c(final DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2079eeb", new Object[]{this, dXRootView});
        } else if (dXRootView == null) {
            ldf.d("SearchBarAppearStatus", "doUiDetect rootView == null");
        } else {
            dXRootView.post(new Runnable() { // from class: com.taobao.homepage.view.manager.searchbar.impl.searchview.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.a(c.this).a(dXRootView);
                    }
                }
            });
        }
    }
}
