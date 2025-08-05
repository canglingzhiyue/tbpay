package com.taobao.themis.container.app.page;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.container.splash.ISplashViewFactory;
import com.taobao.themis.container.splash.entity.ErrorInfo;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.utils.k;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qpt;
import tb.qqc;
import tb.rnc;
import tb.suj;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSTabItemPageContainer;", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "mContext", "Landroid/content/Context;", "mPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Landroid/content/Context;Lcom/taobao/themis/kernel/page/ITMSPage;)V", "mRenderView", "Lcom/taobao/themis/container/app/page/TMSPageRootView;", "mRootView", "Landroid/widget/RelativeLayout;", "mTitleBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;", "attachPage", "", "page", "getTitleBar", "getView", "Landroid/view/View;", "hideErrorWidget", "setBgColor", "color", "", "setRenderView", "view", "setTitleBarImmersive", com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_IMMERSIVE, "", "showErrorView", "error", "Lcom/taobao/themis/kernel/TMSError;", "showErrorWidget", "Companion", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class g implements rnc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f22370a;
    private com.taobao.themis.kernel.container.ui.titlebar.b b;
    private final TMSPageRootView c;
    private final Context d;
    private final ITMSPage e;

    static {
        kge.a(-991418250);
        kge.a(-1625347462);
        Companion = new a(null);
    }

    public g(Context mContext, ITMSPage mPage) {
        q.d(mContext, "mContext");
        q.d(mPage, "mPage");
        this.d = mContext;
        this.e = mPage;
        this.f22370a = new RelativeLayout(this.d);
        this.c = new TMSPageRootView(this.d);
        IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) qpt.b(IContainerViewFactory.class);
        this.b = iContainerViewFactory != null ? iContainerViewFactory.createTitleBar(this.d, this.e) : null;
        com.taobao.themis.kernel.container.ui.titlebar.b bVar = this.b;
        if (bVar != null) {
            this.f22370a.addView(bVar.getContentView());
        }
        View g = this.e.g();
        if (g != null) {
            a(g);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSTabItemPageContainer$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-1647282114);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.rnc
    public void attachPage(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        Integer j = qqc.j(page);
        if (j != null) {
            this.f22370a.setBackgroundColor(j.intValue());
        }
        a(qqc.b(page));
        com.taobao.themis.kernel.container.ui.titlebar.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.attachPage(page);
    }

    @Override // tb.rnc
    public com.taobao.themis.kernel.container.ui.titlebar.b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.kernel.container.ui.titlebar.b) ipChange.ipc$dispatch("1ef8475e", new Object[]{this}) : this.b;
    }

    @Override // tb.rnc
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        q.d(view, "view");
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            ((ViewGroup) parent).removeView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        suj v = qqc.v(this.e);
        Boolean bool = null;
        com.taobao.themis.kernel.container.ui.titlebar.c h = v != null ? v.h() : null;
        this.e.c().e().c();
        Window c = this.e.c().e().c();
        if (c != null) {
            bool = c.p();
        }
        if (q.a((Object) bool, (Object) true) && h != null && h.g()) {
            int a2 = k.a(this.d, h.d());
            layoutParams.bottomMargin = a2;
            TMSLogger.a("TMSTabPageContainer", "tabBarSafeArea: true , bottomMargin: " + a2);
        }
        this.c.addView(view, layoutParams);
        if (this.c.getParent() != null) {
            ViewParent parent2 = this.c.getParent();
            if (parent2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            ((ViewGroup) parent2).removeView(this.c);
        }
        this.f22370a.addView(this.c, 0, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // tb.rnc
    public void a(boolean z) {
        View contentView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            TMSPageRootView tMSPageRootView = this.c;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            t tVar = t.INSTANCE;
            tMSPageRootView.setLayoutParams(layoutParams);
            com.taobao.themis.kernel.container.ui.titlebar.b bVar = this.b;
            if (bVar != null) {
                bVar.setTranslucent(true);
            }
        } else {
            com.taobao.themis.kernel.container.ui.titlebar.b bVar2 = this.b;
            if (bVar2 != null) {
                bVar2.setTranslucent(false);
            }
            com.taobao.themis.kernel.container.ui.titlebar.b bVar3 = this.b;
            if (bVar3 != null && (contentView = bVar3.getContentView()) != null) {
                int id = contentView.getId();
                TMSPageRootView tMSPageRootView2 = this.c;
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(3, id);
                t tVar2 = t.INSTANCE;
                tMSPageRootView2.setLayoutParams(layoutParams2);
            }
        }
        this.f22370a.invalidate();
    }

    @Override // tb.rnc
    public void a(com.taobao.themis.kernel.e error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb15ce", new Object[]{this, error});
            return;
        }
        q.d(error, "error");
        rnc.a.a(this, error);
        com.taobao.themis.container.splash.error.a createErrorPage = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createErrorPage(this.e.b());
        if (createErrorPage == null) {
            TMSLogger.d("TMSTabItemPageContainer", "create error page is null");
            return;
        }
        View findViewById = this.c.findViewById(R.id.tms_tab_content_view);
        if (findViewById != null) {
            this.c.removeView(findViewById);
        }
        View view = createErrorPage.getView();
        if (!(view instanceof FrameLayout)) {
            view = null;
        }
        FrameLayout frameLayout = (FrameLayout) view;
        if (frameLayout != null) {
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setId(R.id.tms_error_view);
            this.c.addView(frameLayout);
        }
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.c = error.d;
        errorInfo.d = error.e;
        t tVar = t.INSTANCE;
        createErrorPage.showErrorInfo(errorInfo, this.e.b(), this.e);
        com.taobao.themis.kernel.container.ui.titlebar.b createTitleBar = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createTitleBar(this.e.b());
        if (createTitleBar == null) {
            return;
        }
        TMSPageRootView tMSPageRootView = this.c;
        View contentView = createTitleBar.getContentView();
        if (contentView != null) {
            contentView.setId(R.id.tms_loading_title_bar);
            t tVar2 = t.INSTANCE;
        } else {
            contentView = null;
        }
        tMSPageRootView.addView(contentView);
    }

    @Override // tb.rnc
    public void b(com.taobao.themis.kernel.e error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea2d1cf", new Object[]{this, error});
            return;
        }
        q.d(error, "error");
        rnc.a.b(this, error);
        com.taobao.themis.container.splash.error.b createErrorWidget = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createErrorWidget(this.e.b());
        if (createErrorWidget == null) {
            TMSLogger.d("TMSTabItemPageContainer", "create error page is null");
            return;
        }
        View findViewById = this.c.findViewById(R.id.tms_error_widget);
        if (findViewById != null) {
            this.c.removeView(findViewById);
        }
        View a2 = createErrorWidget.a();
        if (!(a2 instanceof FrameLayout)) {
            a2 = null;
        }
        FrameLayout frameLayout = (FrameLayout) a2;
        if (frameLayout != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.bottomMargin = k.a(this.d, 90.0f);
            layoutParams.setMarginStart(k.a(this.d, 8.0f));
            layoutParams.setMarginEnd(k.a(this.d, 8.0f));
            frameLayout.setId(R.id.tms_error_widget);
            frameLayout.setLayoutParams(layoutParams);
            this.c.addView(frameLayout);
        }
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.c = error.d;
        errorInfo.d = error.e;
        t tVar = t.INSTANCE;
        createErrorWidget.a(errorInfo, this.e.b(), null);
    }

    @Override // tb.rnc
    public void dZ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d38ab0", new Object[]{this});
            return;
        }
        rnc.a.a(this);
        View findViewById = this.c.findViewById(R.id.tms_error_widget);
        if (findViewById == null) {
            return;
        }
        this.c.removeView(findViewById);
    }

    @Override // tb.rnc
    public void a(String color) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, color});
            return;
        }
        q.d(color, "color");
        this.f22370a.setBackgroundColor(Color.parseColor(color));
    }

    @Override // tb.rnc
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.f22370a;
    }
}
