package com.taobao.tao.homepage.revision;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.i;
import com.taobao.homepage.speed.SpeedFrameLayout;
import com.taobao.homepage.view.widgets.bgcontainer.BGContainerView;
import com.taobao.taobao.R;
import tb.kge;
import tb.ksp;
import tb.kss;
import tb.lbo;
import tb.lbq;
import tb.oiy;
import tb.ojd;
import tb.opb;
import tb.oqq;

/* loaded from: classes8.dex */
public class ChangeContainerProcess {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CUSTOM_1 = "ACTION_CUSTOM_1";
    public static final String ACTION_CUSTOM_2 = "ACTION_CUSTOM_2";
    public static final String ACTION_CUSTOM_3 = "ACTION_CUSTOM_3";
    public static final String ACTION_CUSTOM_4 = "ACTION_CUSTOM_4";
    public static final String ACTION_CUSTOM_5 = "ACTION_CUSTOM_5";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20607a;
    public static boolean b;
    private View c;

    /* loaded from: classes8.dex */
    public enum ChangeContainerType {
        revision,
        edition,
        overseaHotRevision
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static ChangeContainerProcess f20608a;

        static {
            kge.a(757432591);
            f20608a = new ChangeContainerProcess();
        }

        public static /* synthetic */ ChangeContainerProcess a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ChangeContainerProcess) ipChange.ipc$dispatch("1e3e1a08", new Object[0]) : f20608a;
        }
    }

    static {
        kge.a(-270240079);
        f20607a = true;
        b = true;
    }

    private ChangeContainerProcess() {
    }

    public static ChangeContainerProcess a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ChangeContainerProcess) ipChange.ipc$dispatch("1e3e1a08", new Object[0]) : a.a();
    }

    public void b() {
        lbq b2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c != null && (b2 = oiy.a().b()) != null) {
            ViewGroup viewGroup = (ViewGroup) this.c.getParent();
            View rootView = b2.getRootView();
            if (rootView == null) {
                return;
            }
            if (rootView.getParent() == null || !(rootView instanceof ViewGroup) || viewGroup != null) {
                if (viewGroup == null) {
                    return;
                }
                int indexOfChild = viewGroup.indexOfChild(this.c);
                if (indexOfChild >= 0) {
                    viewGroup.removeView(this.c);
                    i = indexOfChild;
                }
                a(rootView);
                viewGroup.addView(rootView, i);
                this.c = null;
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) rootView.getParent();
            for (int childCount = viewGroup2.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup2.getChildAt(childCount);
                if (childAt != rootView && (childAt instanceof SpeedFrameLayout)) {
                    ksp.c("ChangeContainerProcess", "执行删除~~");
                    viewGroup2.removeView(childAt);
                }
            }
            ksp.c("ChangeContainerProcess", "checkRootView 清空旧组件~~~~");
            this.c = null;
        }
    }

    public void a(ChangeContainerType changeContainerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e643ce1", new Object[]{this, changeContainerType});
            return;
        }
        ksp.b("ChangeContainerProcess", "homeRevision");
        if (!c()) {
            ksp.c("ChangeContainerProcess", "homeRevision error !isEnableRevision");
            return;
        }
        b(changeContainerType);
        d();
        e();
        c(changeContainerType);
        lbo.b().a(i.a(), changeContainerType);
        try {
            com.taobao.prefork.b.a().b();
        } catch (Throwable unused) {
        }
    }

    private void d(ChangeContainerType changeContainerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a787b3e", new Object[]{this, changeContainerType});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("oldMultiTab", (Object) false);
        jSONObject.put("oldNewFace", (Object) false);
        jSONObject.put("newMultiTab", (Object) true);
        jSONObject.put("newNewFace", (Object) true);
        kss.a("Page_Home", 19999, "homeRevision", changeContainerType == null ? "" : changeContainerType.toString(), "", jSONObject);
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        lbq b2 = oiy.a().b();
        return (b2 == null || b2.getRootView() == null || b2.getHomePageManager() == null || b2.getStartUpWorkflow() == null) ? false : true;
    }

    private void b(ChangeContainerType changeContainerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d15a700", new Object[]{this, changeContainerType});
        } else {
            d(changeContainerType);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        boolean z = !oiy.a().j();
        com.taobao.tao.topmultitab.c.a().f();
        if (!z) {
            return;
        }
        lbq b2 = oiy.a().b();
        oiy.a().f();
        LayoutInflater d = oiy.a().d();
        ViewGroup e = oiy.a().e();
        if (d == null || e == null || b2 == null) {
            ksp.b("ChangeContainerProcess", "updateTab ： inflater + " + d + ", container : " + e + ", pageProvider" + b2);
            return;
        }
        View rootView = b2.getRootView();
        if (rootView == null) {
            return;
        }
        this.c = rootView;
        ksp.b("ChangeContainerProcess", "加载layout：activity_homepage_multitab ");
        View b3 = ojd.a().b(d, e);
        com.taobao.tao.topmultitab.c.a().a(b3);
        b2.setRootView(b3);
        b();
        b2.getHomePageManager().a(new com.taobao.homepage.view.widgets.bgcontainer.b((BGContainerView) b2.getRootView().findViewById(R.id.home_bg_container), b2));
        f();
        b2.getStartUpWorkflow().a((RelativeLayout) b3.findViewById(R.id.search_bar_container));
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        boolean z = !oiy.a().k();
        boolean z2 = !i.a().equals(oiy.a().i());
        if (z) {
            ksp.b("ChangeContainerProcess", "updateNewFace ");
            f();
        } else if (!z2) {
        } else {
            ksp.b("ChangeContainerProcess", "updateNewFace 111");
            f();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        oiy.a().h();
        oiy.a().g();
        oqq.a();
    }

    private void c(ChangeContainerType changeContainerType) {
        lbo homePageManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc7111f", new Object[]{this, changeContainerType});
            return;
        }
        lbq b2 = oiy.a().b();
        if (b2 == null || (homePageManager = b2.getHomePageManager()) == null) {
            return;
        }
        ksp.b("ChangeContainerProcess", "resetState");
        opb.a();
        if (changeContainerType == ChangeContainerType.revision) {
            homePageManager.g().a();
        }
        com.taobao.homepage.view.widgets.bgcontainer.c d = homePageManager.d();
        if (d == null) {
            return;
        }
        d.a();
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null || !(view.getParent() instanceof ViewGroup)) {
        } else {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }
}
