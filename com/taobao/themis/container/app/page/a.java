package com.taobao.themis.container.app.page;

import android.content.Context;
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
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.utils.k;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qpt;
import tb.rnc;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSEmbedPageContainer;", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "mContext", "Landroid/content/Context;", "mPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Landroid/content/Context;Lcom/taobao/themis/kernel/page/ITMSPage;)V", "mRenderView", "Landroid/view/View;", "mRootView", "Landroid/widget/RelativeLayout;", "attachPage", "", "page", "getTitleBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;", "getView", "hideErrorWidget", "setBgColor", "color", "", "setRenderView", "view", "setTitleBarImmersive", com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_IMMERSIVE, "", "showErrorView", "error", "Lcom/taobao/themis/kernel/TMSError;", "showErrorWidget", "Companion", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a implements rnc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final C0932a Companion;
    public static final String TAG = "TMSEmbedPageContainer";

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f22366a;
    private View b;
    private final Context c;
    private final ITMSPage d;

    static {
        kge.a(1349420165);
        kge.a(-1625347462);
        Companion = new C0932a(null);
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

    public a(Context mContext, ITMSPage mPage) {
        q.d(mContext, "mContext");
        q.d(mPage, "mPage");
        this.c = mContext;
        this.d = mPage;
        this.f22366a = new RelativeLayout(this.c);
        View g = this.d.g();
        if (g != null) {
            this.f22366a.addView(g, -1, -1);
        }
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
        com.taobao.themis.container.splash.error.a createErrorPage = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createErrorPage(this.d.b());
        if (createErrorPage == null) {
            TMSLogger.d(TAG, "create error page is null");
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
            this.f22366a.addView(frameLayout);
        }
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.c = error.d;
        errorInfo.d = error.e;
        t tVar = t.INSTANCE;
        createErrorPage.showErrorInfo(errorInfo, this.d.b(), null);
        com.taobao.themis.kernel.container.ui.titlebar.b createTitleBar = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createTitleBar(this.d.b());
        if (createTitleBar == null) {
            return;
        }
        RelativeLayout relativeLayout = this.f22366a;
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
        com.taobao.themis.container.splash.error.b createErrorWidget = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createErrorWidget(this.d.b());
        if (createErrorWidget == null) {
            TMSLogger.d(TAG, "create error page is null");
            return;
        }
        View findViewById = this.f22366a.findViewById(R.id.tms_error_widget);
        if (findViewById != null) {
            this.f22366a.removeView(findViewById);
        }
        View a2 = createErrorWidget.a();
        if (!(a2 instanceof FrameLayout)) {
            a2 = null;
        }
        FrameLayout frameLayout = (FrameLayout) a2;
        if (frameLayout != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.bottomMargin = k.a(this.c, 90.0f);
            layoutParams.setMarginStart(k.a(this.c, 8.0f));
            layoutParams.setMarginEnd(k.a(this.c, 8.0f));
            frameLayout.setId(R.id.tms_error_widget);
            frameLayout.setLayoutParams(layoutParams);
            this.f22366a.addView(frameLayout);
        }
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.c = error.d;
        errorInfo.d = error.e;
        t tVar = t.INSTANCE;
        createErrorWidget.a(errorInfo, this.d.b(), this.d);
    }

    @Override // tb.rnc
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        q.d(view, "view");
        View view2 = this.b;
        if (view2 != null) {
            ViewParent parent = this.f22366a.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(view2);
            }
        }
        this.f22366a.addView(view, -1, -1);
        this.b = view;
    }

    @Override // tb.rnc
    public void dZ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d38ab0", new Object[]{this});
            return;
        }
        rnc.a.a(this);
        View findViewById = this.f22366a.findViewById(R.id.tms_error_widget);
        if (findViewById == null) {
            return;
        }
        this.f22366a.removeView(findViewById);
    }

    @Override // tb.rnc
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.f22366a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSEmbedPageContainer$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.container.app.page.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0932a {
        static {
            kge.a(-478524019);
        }

        private C0932a() {
        }

        public /* synthetic */ C0932a(o oVar) {
            this();
        }
    }
}
