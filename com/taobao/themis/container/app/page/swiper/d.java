package com.taobao.themis.container.app.page.swiper;

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
import com.taobao.themis.container.app.page.IContainerViewFactory;
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
import tb.qqc;
import tb.rnc;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 '2\u00020\u0001:\u0001'B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\u0006\u0010\u0018\u001a\u00020\u0012J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0016\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\nH\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\fH\u0016J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/taobao/themis/container/app/page/swiper/TMSSwiperPageContainer;", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "mContext", "Landroid/content/Context;", "mPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Landroid/content/Context;Lcom/taobao/themis/kernel/page/ITMSPage;)V", "mContentView", "Landroid/widget/FrameLayout;", "mHeaderView", "Landroid/view/View;", "mImmersive", "", "mRootView", "Landroid/widget/RelativeLayout;", "mTitleBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;", "mTmsSwiperView", "Lcom/taobao/themis/container/app/page/swiper/TMSViewPager;", "attachPage", "", "page", "getTitleBar", "getView", "getViewPager", "hideErrorWidget", "setBgColor", "color", "", "setHeaderView", "view", "height", "", "setRenderView", "setTitleBarImmersive", com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_IMMERSIVE, "showErrorWidget", "error", "Lcom/taobao/themis/kernel/TMSError;", "Companion", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class d implements rnc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final TMSViewPager f22382a;
    private final RelativeLayout b;
    private View c;
    private final FrameLayout d;
    private com.taobao.themis.kernel.container.ui.titlebar.b e;
    private boolean f;
    private final ITMSPage g;
    private final Context h;

    static {
        kge.a(-1291211575);
        kge.a(-1625347462);
        Companion = new a(null);
    }

    public d(Context mContext, ITMSPage mPage) {
        View contentView;
        q.d(mContext, "mContext");
        q.d(mPage, "mPage");
        this.h = mContext;
        this.g = mPage;
        RelativeLayout relativeLayout = new RelativeLayout(this.h);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        t tVar = t.INSTANCE;
        this.b = relativeLayout;
        FrameLayout frameLayout = new FrameLayout(this.h);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        t tVar2 = t.INSTANCE;
        this.d = frameLayout;
        IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) qpt.b(IContainerViewFactory.class);
        this.e = iContainerViewFactory != null ? iContainerViewFactory.createTitleBar(this.h, this.g) : null;
        TMSViewPager tMSViewPager = new TMSViewPager(this.h);
        tMSViewPager.setOffscreenPageLimit(1);
        if (!this.g.c().e().g()) {
            tMSViewPager.setAcceptTouchEvent(false);
        }
        t tVar3 = t.INSTANCE;
        this.f22382a = tMSViewPager;
        RelativeLayout relativeLayout2 = this.b;
        FrameLayout frameLayout2 = this.d;
        frameLayout2.addView(this.f22382a, new FrameLayout.LayoutParams(-1, -1));
        t tVar4 = t.INSTANCE;
        relativeLayout2.addView(frameLayout2, new RelativeLayout.LayoutParams(-1, -1));
        com.taobao.themis.kernel.container.ui.titlebar.b bVar = this.e;
        if (bVar == null || (contentView = bVar.getContentView()) == null) {
            return;
        }
        this.b.addView(contentView);
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/container/app/page/swiper/TMSSwiperPageContainer$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(1224929489);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
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
        com.taobao.themis.container.splash.error.b createErrorWidget = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createErrorWidget(this.g.b());
        if (createErrorWidget == null) {
            TMSLogger.d("TMSSwiperPageContainer", "create error page is null");
            return;
        }
        View a2 = createErrorWidget.a();
        if (!(a2 instanceof FrameLayout)) {
            a2 = null;
        }
        FrameLayout frameLayout = (FrameLayout) a2;
        if (frameLayout != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = k.a(this.h, 90.0f);
            layoutParams.setMarginStart(k.a(this.h, 8.0f));
            layoutParams.setMarginEnd(k.a(this.h, 8.0f));
            frameLayout.setId(R.id.tms_error_widget);
            frameLayout.setLayoutParams(layoutParams);
            this.d.addView(frameLayout);
        }
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.c = error.d;
        errorInfo.d = error.e;
        t tVar = t.INSTANCE;
        createErrorWidget.a(errorInfo, this.g.b(), this.g);
        com.taobao.themis.kernel.container.ui.titlebar.b createTitleBar = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createTitleBar(this.g.b());
        if (createTitleBar == null) {
            return;
        }
        FrameLayout frameLayout2 = this.d;
        View contentView = createTitleBar.getContentView();
        if (contentView != null) {
            contentView.setId(R.id.tms_loading_title_bar);
            t tVar2 = t.INSTANCE;
        } else {
            contentView = null;
        }
        frameLayout2.addView(contentView);
    }

    @Override // tb.rnc
    public void dZ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d38ab0", new Object[]{this});
            return;
        }
        rnc.a.a(this);
        View findViewById = this.d.findViewById(R.id.tms_error_widget);
        if (findViewById == null) {
            return;
        }
        this.d.removeView(findViewById);
    }

    public final TMSViewPager b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSViewPager) ipChange.ipc$dispatch("8ee0884f", new Object[]{this}) : this.f22382a;
    }

    public final void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
            return;
        }
        q.d(view, "view");
        this.d.addView(view, new FrameLayout.LayoutParams(-1, i));
    }

    @Override // tb.rnc
    public void attachPage(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        if (!q.a(page, this.g)) {
            return;
        }
        Integer j = qqc.j(page);
        if (j != null) {
            this.b.setBackgroundColor(j.intValue());
        }
        a(qqc.b(page));
        com.taobao.themis.kernel.container.ui.titlebar.b bVar = this.e;
        if (bVar == null) {
            return;
        }
        bVar.attachPage(page);
    }

    @Override // tb.rnc
    public com.taobao.themis.kernel.container.ui.titlebar.b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.kernel.container.ui.titlebar.b) ipChange.ipc$dispatch("1ef8475e", new Object[]{this}) : this.e;
    }

    @Override // tb.rnc
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        q.d(view, "view");
        View view2 = this.c;
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(view2);
            }
        }
        View findViewById = this.d.findViewById(R.id.tms_error_widget);
        if (findViewById != null) {
            this.d.removeView(findViewById);
        }
        this.c = view;
        this.f22382a.addView(view);
    }

    @Override // tb.rnc
    public void a(boolean z) {
        View contentView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        if (z) {
            FrameLayout frameLayout = this.d;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            t tVar = t.INSTANCE;
            frameLayout.setLayoutParams(layoutParams);
            com.taobao.themis.kernel.container.ui.titlebar.b bVar = this.e;
            if (bVar != null) {
                bVar.setTranslucent(true);
            }
        } else {
            com.taobao.themis.kernel.container.ui.titlebar.b bVar2 = this.e;
            if (bVar2 != null) {
                bVar2.setTranslucent(false);
            }
            com.taobao.themis.kernel.container.ui.titlebar.b bVar3 = this.e;
            if (bVar3 != null && (contentView = bVar3.getContentView()) != null) {
                int id = contentView.getId();
                FrameLayout frameLayout2 = this.d;
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(3, id);
                t tVar2 = t.INSTANCE;
                frameLayout2.setLayoutParams(layoutParams2);
            }
        }
        this.b.invalidate();
    }

    @Override // tb.rnc
    public void a(String color) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, color});
            return;
        }
        q.d(color, "color");
        this.b.setBackgroundColor(Color.parseColor(color));
    }

    @Override // tb.rnc
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.b;
    }
}
