package com.taobao.themis.container.app.page;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.ViewGroup;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0005H\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0015H\u0016J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000fH\u0016J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSTabPageContainer;", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "mContext", "Landroid/content/Context;", "mPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Landroid/content/Context;Lcom/taobao/themis/kernel/page/ITMSPage;)V", "mContentView", "Landroid/widget/RelativeLayout;", "mRootView", "Landroid/support/constraint/ConstraintLayout;", "attachPage", "", "page", "enableForceWindowRatio", "", "generateLayoutParam", "Landroid/view/ViewGroup$LayoutParams;", "getTitleBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;", "getView", "Landroid/view/View;", "hideErrorWidget", "setBgColor", "color", "", "setRenderView", "view", "setTitleBarImmersive", com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_IMMERSIVE, "showErrorView", "error", "Lcom/taobao/themis/kernel/TMSError;", "showErrorWidget", "Companion", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class h implements rnc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f22371a;
    private final RelativeLayout b;
    private final Context d;
    private final ITMSPage e;

    static {
        kge.a(-945864631);
        kge.a(-1625347462);
        Companion = new a(null);
    }

    @Override // tb.rnc
    public com.taobao.themis.kernel.container.ui.titlebar.b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.container.ui.titlebar.b) ipChange.ipc$dispatch("1ef8475e", new Object[]{this});
        }
        return null;
    }

    @Override // tb.rnc
    public void a(String color) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, color});
        } else {
            q.d(color, "color");
        }
    }

    @Override // tb.rnc
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.rnc
    public void attachPage(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, page});
        } else {
            q.d(page, "page");
        }
    }

    public h(Context mContext, ITMSPage mPage) {
        View view;
        q.d(mContext, "mContext");
        q.d(mPage, "mPage");
        this.d = mContext;
        this.e = mPage;
        ConstraintLayout constraintLayout = new ConstraintLayout(this.d);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        constraintLayout.setBackgroundColor(0);
        t tVar = t.INSTANCE;
        this.f22371a = constraintLayout;
        RelativeLayout relativeLayout = new RelativeLayout(this.d);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        t tVar2 = t.INSTANCE;
        this.b = relativeLayout;
        this.f22371a.addView(this.b, 0, b(this.e));
        suj sujVar = (suj) this.e.a(suj.class);
        if (sujVar == null || (view = sujVar.g()) == null) {
            view = null;
        } else {
            view.setId(R.id.tms_tab_bar);
        }
        if (view != null) {
            RelativeLayout relativeLayout2 = this.b;
            relativeLayout2.setClipChildren(false);
            relativeLayout2.setClipToPadding(false);
            RelativeLayout relativeLayout3 = this.b;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            t tVar3 = t.INSTANCE;
            relativeLayout3.addView(view, layoutParams);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSTabPageContainer$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(743842897);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.rnc
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        q.d(view, "view");
        View findViewById = this.b.findViewById(R.id.tms_tab_content_view);
        if (findViewById != null) {
            this.b.removeView(findViewById);
        }
        RelativeLayout relativeLayout = this.b;
        view.setId(R.id.tms_tab_content_view);
        t tVar = t.INSTANCE;
        relativeLayout.addView(view, 0, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // tb.rnc
    public void dZ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d38ab0", new Object[]{this});
            return;
        }
        rnc.a.a(this);
        View findViewById = this.b.findViewById(R.id.tms_error_view);
        if (findViewById == null) {
            return;
        }
        this.b.removeView(findViewById);
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
            TMSLogger.d("TMSTabPageContainer", "create error page is null");
            return;
        }
        View findViewById = this.b.findViewById(R.id.tms_tab_content_view);
        if (findViewById != null) {
            this.b.removeView(findViewById);
        }
        View view = createErrorPage.getView();
        if (!(view instanceof FrameLayout)) {
            view = null;
        }
        FrameLayout frameLayout = (FrameLayout) view;
        if (frameLayout != null) {
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setId(R.id.tms_error_view);
            this.b.addView(frameLayout);
        }
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.c = error.d;
        errorInfo.d = error.e;
        t tVar = t.INSTANCE;
        createErrorPage.showErrorInfo(errorInfo, this.e.b(), null);
        com.taobao.themis.kernel.container.ui.titlebar.b createTitleBar = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createTitleBar(this.e.b());
        if (createTitleBar == null) {
            return;
        }
        RelativeLayout relativeLayout = this.b;
        View contentView = createTitleBar.getContentView();
        if (contentView != null) {
            contentView.setId(R.id.tms_loading_title_bar);
            t tVar2 = t.INSTANCE;
        } else {
            contentView = null;
        }
        relativeLayout.addView(contentView);
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
            TMSLogger.d("TMSTabPageContainer", "create error page is null");
            return;
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
            this.b.addView(frameLayout);
        }
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.c = error.d;
        errorInfo.d = error.e;
        t tVar = t.INSTANCE;
        createErrorWidget.a(errorInfo, this.e.b(), null);
    }

    @Override // tb.rnc
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.f22371a;
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
        int a2 = k.a(this.d);
        int d2 = k.d(this.d);
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
}
