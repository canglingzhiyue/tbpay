package com.taobao.themis.container.app.page;

import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
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
import com.taobao.themis.kernel.utils.n;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0001&B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\nH\u0016J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSPageContainer;", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "mContext", "Landroid/content/Context;", "mPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Landroid/content/Context;Lcom/taobao/themis/kernel/page/ITMSPage;)V", "mContentView", "Landroid/widget/RelativeLayout;", "mImmersive", "", "mRenderView", "Lcom/taobao/themis/container/app/page/TMSPageRootView;", "mRootView", "Landroid/support/constraint/ConstraintLayout;", "mTitleBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;", "attachPage", "", "page", "enableForceWindowRatio", "generateLayoutParam", "Landroid/view/ViewGroup$LayoutParams;", "getTitleBar", "getView", "Landroid/view/View;", "hideErrorWidget", "setBgColor", "color", "", "setRenderView", "view", "setTitleBarImmersive", com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_IMMERSIVE, "showErrorView", "error", "Lcom/taobao/themis/kernel/TMSError;", "showErrorWidget", "Companion", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSPageContainer implements rnc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f22365a;
    private final Context b;
    private final com.taobao.themis.kernel.container.ui.titlebar.b c;
    private final TMSPageRootView d;
    private final RelativeLayout e;
    private final ITMSPage f;
    private boolean g;

    static {
        kge.a(487034630);
        kge.a(-1625347462);
        Companion = new a(null);
    }

    public TMSPageContainer(Context mContext, ITMSPage mPage) {
        View contentView;
        q.d(mContext, "mContext");
        q.d(mPage, "mPage");
        this.b = mContext;
        this.f = mPage;
        ConstraintLayout constraintLayout = new ConstraintLayout(this.b);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        constraintLayout.setBackgroundColor(0);
        t tVar = t.INSTANCE;
        this.f22365a = constraintLayout;
        RelativeLayout relativeLayout = new RelativeLayout(this.b);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        t tVar2 = t.INSTANCE;
        this.e = relativeLayout;
        IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) qpt.b(IContainerViewFactory.class);
        this.c = iContainerViewFactory != null ? iContainerViewFactory.createTitleBar(this.b, this.f) : null;
        this.d = new TMSPageRootView(this.b);
        this.f22365a.addView(this.e, 0, b(this.f));
        this.e.addView(this.d, new ViewGroup.LayoutParams(-1, -1));
        com.taobao.themis.kernel.container.ui.titlebar.b bVar = this.c;
        if (bVar != null && (contentView = bVar.getContentView()) != null) {
            this.e.addView(contentView);
        }
        View g = this.f.g();
        if (g != null) {
            this.d.addView(g, -1, -1);
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
            this.e.setBackgroundColor(j.intValue());
        }
        a(qqc.b(page));
        com.taobao.themis.kernel.container.ui.titlebar.b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.attachPage(page);
    }

    @Override // tb.rnc
    public com.taobao.themis.kernel.container.ui.titlebar.b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.kernel.container.ui.titlebar.b) ipChange.ipc$dispatch("1ef8475e", new Object[]{this}) : this.c;
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
        this.d.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.d.getParent() != null) {
            ViewParent parent2 = this.d.getParent();
            if (parent2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            ((ViewGroup) parent2).removeView(this.d);
        }
        this.e.addView(this.d, 0, new ViewGroup.LayoutParams(-1, -1));
        a(this.g);
    }

    @Override // tb.rnc
    public void a(boolean z) {
        View contentView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.g = z;
        if (z) {
            TMSPageRootView tMSPageRootView = this.d;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            t tVar = t.INSTANCE;
            tMSPageRootView.setLayoutParams(layoutParams);
            com.taobao.themis.kernel.container.ui.titlebar.b bVar = this.c;
            if (bVar != null) {
                bVar.setTranslucent(true);
            }
        } else {
            com.taobao.themis.kernel.container.ui.titlebar.b bVar2 = this.c;
            if (bVar2 != null) {
                bVar2.setTranslucent(false);
            }
            com.taobao.themis.kernel.container.ui.titlebar.b bVar3 = this.c;
            if (bVar3 != null && (contentView = bVar3.getContentView()) != null) {
                int id = contentView.getId();
                TMSPageRootView tMSPageRootView2 = this.d;
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(3, id);
                t tVar2 = t.INSTANCE;
                tMSPageRootView2.setLayoutParams(layoutParams2);
            }
        }
        this.f22365a.invalidate();
    }

    @Override // tb.rnc
    public void a(String color) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, color});
            return;
        }
        q.d(color, "color");
        this.e.setBackgroundColor(Color.parseColor(color));
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
        com.taobao.themis.container.splash.error.a createErrorPage = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createErrorPage(this.f.b());
        if (createErrorPage == null) {
            TMSLogger.d("TMSPageContainer", "create error page is null");
            return;
        }
        View view = createErrorPage.getView();
        if (!(view instanceof FrameLayout)) {
            view = null;
        }
        FrameLayout frameLayout = (FrameLayout) view;
        if (frameLayout != null) {
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setId(R.id.tms_error_view);
            this.f22365a.addView(frameLayout);
        }
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.c = error.d;
        errorInfo.d = error.e;
        t tVar = t.INSTANCE;
        createErrorPage.showErrorInfo(errorInfo, this.f.b(), null);
        com.taobao.themis.kernel.container.ui.titlebar.b createTitleBar = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createTitleBar(this.f.b());
        if (createTitleBar == null) {
            return;
        }
        ConstraintLayout constraintLayout = this.f22365a;
        View contentView = createTitleBar.getContentView();
        if (contentView != null) {
            contentView.setId(R.id.tms_loading_title_bar);
            t tVar2 = t.INSTANCE;
        } else {
            contentView = null;
        }
        constraintLayout.addView(contentView);
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
        com.taobao.themis.container.splash.error.b createErrorWidget = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createErrorWidget(this.f.b());
        if (createErrorWidget == null) {
            TMSLogger.d("TMSPageContainer", "create error page is null");
            return;
        }
        View findViewById = this.e.findViewById(R.id.tms_error_widget);
        if (findViewById != null) {
            this.e.removeView(findViewById);
        }
        View a2 = createErrorWidget.a();
        if (!(a2 instanceof FrameLayout)) {
            a2 = null;
        }
        FrameLayout frameLayout = (FrameLayout) a2;
        if (frameLayout != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            suj sujVar = (suj) this.f.a(suj.class);
            View g = sujVar != null ? sujVar.g() : null;
            layoutParams.addRule(12);
            suj sujVar2 = (suj) this.f.a(suj.class);
            Integer valueOf = sujVar2 != null ? Integer.valueOf(sujVar2.j()) : null;
            if (g != null && valueOf != null) {
                layoutParams.bottomMargin = k.a(this.b, 8.0f) + valueOf.intValue();
            } else {
                layoutParams.bottomMargin = k.a(this.b, 90.0f);
            }
            layoutParams.setMarginStart(k.a(this.b, 8.0f));
            layoutParams.setMarginEnd(k.a(this.b, 8.0f));
            frameLayout.setId(R.id.tms_error_widget);
            frameLayout.setLayoutParams(layoutParams);
            this.e.addView(frameLayout);
        }
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.c = error.d;
        errorInfo.d = error.e;
        t tVar = t.INSTANCE;
        createErrorWidget.a(errorInfo, this.f.b(), null);
    }

    @Override // tb.rnc
    public void dZ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d38ab0", new Object[]{this});
            return;
        }
        rnc.a.a(this);
        View findViewById = this.e.findViewById(R.id.tms_error_widget);
        if (findViewById == null) {
            return;
        }
        this.e.removeView(findViewById);
    }

    @Override // tb.rnc
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.f22365a;
    }

    private final boolean a(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb549217", new Object[]{this, iTMSPage})).booleanValue() : qqc.m(iTMSPage) && n.an();
    }

    private final ViewGroup.LayoutParams b(ITMSPage iTMSPage) {
        int min;
        int max;
        double d;
        String str;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("42ad2e21", new Object[]{this, iTMSPage});
        }
        int i2 = -1;
        if (!a(iTMSPage)) {
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
            layoutParams.h = 0;
            layoutParams.q = 0;
            layoutParams.s = 0;
            layoutParams.k = 0;
            return layoutParams;
        }
        int a2 = k.a(this.b);
        int d2 = k.d(this.b);
        if (qqc.k(iTMSPage) == Window.Orientation.LANDSCAPE) {
            min = Math.max(a2, d2);
            max = Math.min(a2, d2);
            d = 1.7777777777777777d;
            str = com.taobao.android.detail2.core.framework.base.media.frame.b.VALUE_SIXTEEN_NINE_RATIO;
        } else {
            min = Math.min(a2, d2);
            max = Math.max(a2, d2);
            d = 0.5625d;
            str = "9:16";
        }
        if (min / max > d) {
            i = -1;
            i2 = 0;
        } else {
            i = 0;
        }
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(i2, i);
        layoutParams2.h = 0;
        layoutParams2.q = 0;
        layoutParams2.s = 0;
        layoutParams2.k = 0;
        layoutParams2.B = str;
        return layoutParams2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSPageContainer$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(2064444110);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
