package com.taobao.pha.core.phacontainer;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.s;
import com.taobao.pha.core.PHAContainerType;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.controller.l;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.p;
import com.taobao.pha.core.phacontainer.c;
import com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.nfj;
import tb.nfz;
import tb.ngf;
import tb.ngk;
import tb.ngn;
import tb.ngr;
import tb.ngu;

/* loaded from: classes7.dex */
public class LazyPageFragment extends AbstractPageFragment implements c, d, nfj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private boolean mEnableScrollListener;
    private int mPageFrameIndex;
    private String mPageHeaderPosition;
    private PageModel mPageModel;
    private ViewGroup mPageViewContainer;
    private nfz mPageWebView;
    private ImageView mPreviewImage;
    private IPullRefreshLayout mRefreshLayout;
    private FrameLayout mRootView;
    private int mTabHeaderHeight;
    private final List<c.a> mAppearListeners = new ArrayList();
    private int mPageIndex = -1;
    private boolean mInflateView = false;
    private final List<c.b> mDisappearListeners = new ArrayList();
    private final f mPullRefreshDelegate = new f(this);

    public static /* synthetic */ Object ipc$super(LazyPageFragment lazyPageFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1010986463:
                super.setUserVisibleHint(((Boolean) objArr[0]).booleanValue());
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public boolean isDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("404ec491", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ nfz access$000(LazyPageFragment lazyPageFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfz) ipChange.ipc$dispatch("a65b96ed", new Object[]{lazyPageFragment}) : lazyPageFragment.mPageWebView;
    }

    public static /* synthetic */ f access$100(LazyPageFragment lazyPageFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("a819c7a9", new Object[]{lazyPageFragment}) : lazyPageFragment.mPullRefreshDelegate;
    }

    public static /* synthetic */ boolean access$200(LazyPageFragment lazyPageFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("751ee079", new Object[]{lazyPageFragment})).booleanValue() : lazyPageFragment.mEnableScrollListener;
    }

    public static /* synthetic */ PageModel access$300(LazyPageFragment lazyPageFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageModel) ipChange.ipc$dispatch("62f78c68", new Object[]{lazyPageFragment}) : lazyPageFragment.mPageModel;
    }

    public static /* synthetic */ IPullRefreshLayout access$400(LazyPageFragment lazyPageFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPullRefreshLayout) ipChange.ipc$dispatch("6e2eb8f4", new Object[]{lazyPageFragment}) : lazyPageFragment.mRefreshLayout;
    }

    static {
        kge.a(497444755);
        kge.a(415810824);
        kge.a(617340116);
        kge.a(-379925115);
        kge.a(68685277);
        TAG = LazyPageFragment.class.getSimpleName();
    }

    @Override // com.taobao.pha.core.phacontainer.AbstractPageFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mPageModel = (PageModel) arguments.getSerializable("key_page_model");
            this.mEnableScrollListener = arguments.getBoolean("key_tab_header_enable_scroll_listener", false);
            this.mTabHeaderHeight = arguments.getInt("key_tab_header_height", 0);
            this.mPageHeaderPosition = arguments.getString("key_page_header_position", "absolute");
            this.mPageFrameIndex = arguments.getInt("key_page_frame_index", 0);
        }
        PageModel pageModel = this.mPageModel;
        if (pageModel != null) {
            this.mPullRefreshDelegate.a(pageModel);
        }
        PageModel pageModel2 = this.mPageModel;
        if (pageModel2 != null && !StringUtils.isEmpty(pageModel2.title) && getActivity() != null) {
            getActivity().setTitle(this.mPageModel.title);
        }
        AppController appController = getAppController();
        if (appController == null) {
            return;
        }
        appController.P().a(this);
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Integer g;
        ViewGroup viewGroup2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        FrameLayout frameLayout = this.mRootView;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup3 = (ViewGroup) parent;
                viewGroup3.endViewTransition(this.mRootView);
                viewGroup3.removeAllViews();
            }
            return this.mRootView;
        }
        if (ngu.g()) {
            ngn.a(getAppController(), s.f18233a.b(this));
        }
        this.mRootView = new FrameLayout(getContext());
        this.mRefreshLayout = p.b().n().a(getContext(), this.mPageModel);
        IPullRefreshLayout iPullRefreshLayout = this.mRefreshLayout;
        if (iPullRefreshLayout != null) {
            iPullRefreshLayout.setListener(new IPullRefreshLayout.b() { // from class: com.taobao.pha.core.phacontainer.LazyPageFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (LazyPageFragment.access$000(LazyPageFragment.this) == null) {
                    } else {
                        if (LazyPageFragment.access$100(LazyPageFragment.this).a()) {
                            LazyPageFragment.access$000(LazyPageFragment.this).h();
                        } else {
                            LazyPageFragment.access$000(LazyPageFragment.this).evaluateJavaScript(ngn.a("pullrefresh", "", (String) null));
                        }
                    }
                }

                @Override // com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout.b
                public boolean b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : LazyPageFragment.access$000(LazyPageFragment.this) != null && LazyPageFragment.access$000(LazyPageFragment.this).p() > 0;
                }
            });
        } else {
            ngr.b(TAG, "RefreshLayout can't be create.");
        }
        ngr.a(TAG, "createPageView");
        this.mPageViewContainer = new FrameLayout(getContext());
        this.mPageViewContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View view = null;
        if (getUserVisibleHint() && !this.mInflateView) {
            view = instanceWebView();
            this.mInflateView = true;
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_START);
        imageView.setVisibility(8);
        this.mPreviewImage = imageView;
        ViewGroup viewGroup4 = this.mPageViewContainer;
        if (viewGroup4 != null) {
            viewGroup4.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
            if (view != null) {
                this.mPageViewContainer.addView(view);
            }
        }
        IPullRefreshLayout iPullRefreshLayout2 = this.mRefreshLayout;
        if (iPullRefreshLayout2 != null && iPullRefreshLayout2.getView() != null && this.mPageViewContainer != null) {
            this.mRefreshLayout.getView().addView(this.mPageViewContainer);
            this.mRefreshLayout.setEnabled(this.mPullRefreshDelegate.e());
        }
        PageModel pageModel = this.mPageModel;
        if (pageModel != null) {
            if (!StringUtils.isEmpty(pageModel.backgroundColor) && (viewGroup2 = this.mPageViewContainer) != null) {
                viewGroup2.setBackgroundColor(ngn.f(this.mPageModel.backgroundColor));
            }
            if (this.mRefreshLayout != null) {
                if (!StringUtils.isEmpty(this.mPageModel.pullRefreshBackgroundColor) && (g = ngn.g(this.mPageModel.pullRefreshBackgroundColor)) != null) {
                    this.mRefreshLayout.setBackgroundColor(g.intValue());
                }
                setColorScheme(this.mPageModel.pullRefreshColorScheme);
            }
        }
        IPullRefreshLayout iPullRefreshLayout3 = this.mRefreshLayout;
        if (iPullRefreshLayout3 != null && iPullRefreshLayout3.getView() != null) {
            this.mRootView.addView(this.mRefreshLayout.getView());
        }
        adjustViewPosition();
        return this.mRootView;
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        if (this.mPageWebView != null && getUserVisibleHint()) {
            this.mPageWebView.o();
        }
        super.onResume();
        if (!getUserVisibleHint()) {
            return;
        }
        onPageAppear();
    }

    private void onPageAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1800bf4a", new Object[]{this});
            return;
        }
        com.taobao.monitor.procedure.g b = s.f18233a.b(this);
        if (getUserVisibleHint()) {
            b.b("phaRouteInit", SystemClock.uptimeMillis());
        }
        for (c.a aVar : this.mAppearListeners) {
            if (aVar != null) {
                aVar.a(this.mPageIndex);
            }
        }
        JSONObject pageEventData = getPageEventData(this.mPageModel, true);
        sendEventToPHAWorker("pageappear", pageEventData);
        sendEventToPageView("pageappear", pageEventData, null);
        AppController appController = getAppController();
        if (appController == null || this.mPageModel == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageUrl", (Object) this.mPageModel.getUrl());
        String str = this.mPageModel.key;
        if (StringUtils.isEmpty(str)) {
            str = this.mPageIndex + "_" + this.mPageFrameIndex;
        }
        jSONObject.put("pageId", (Object) str);
        appController.a("pageappear", jSONObject);
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        if (this.mPageWebView != null && getUserVisibleHint()) {
            this.mPageWebView.n();
        }
        super.onPause();
        if (!getUserVisibleHint()) {
            return;
        }
        onPageDisappear();
    }

    private void onPageDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6518a43c", new Object[]{this});
            return;
        }
        for (c.b bVar : this.mDisappearListeners) {
            if (bVar != null) {
                bVar.a(this.mPageIndex);
            }
        }
        JSONObject pageEventData = getPageEventData(this.mPageModel, false);
        sendEventToPHAWorker("pagedisappear", pageEventData);
        sendEventToPageView("pagedisappear", pageEventData, null);
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        if (!this.mInflateView || !getUserVisibleHint()) {
            return;
        }
        setWebViewVisible();
        if (this.mPageWebView == null) {
            return;
        }
        getUserVisibleHint();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        if (this.mPageWebView != null) {
            getUserVisibleHint();
        }
        super.onStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        AppController appController;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        if (!ngu.x() || (appController = getAppController()) == null || !PHAContainerType.MINIAPP.equals(appController.p())) {
            z = true;
        }
        if (!z) {
            return;
        }
        destroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        destroy();
        super.onDestroy();
        ngr.a(TAG, "destroyed.");
    }

    @Override // com.taobao.pha.core.phacontainer.AbstractPageFragment
    public void evaluateSourceCodeToPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103dd97c", new Object[]{this, str});
            return;
        }
        nfz nfzVar = this.mPageWebView;
        if (nfzVar == null) {
            return;
        }
        nfzVar.evaluateJavaScript(str);
    }

    public void notifyDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
            return;
        }
        nfz nfzVar = this.mPageWebView;
        if (nfzVar == null) {
            return;
        }
        nfzVar.a(this.mPageModel.getUrl());
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        nfz nfzVar = this.mPageWebView;
        if (nfzVar == null) {
            return;
        }
        nfzVar.a(i, i2, intent);
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public void registerPageAppearListener(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("368f0c51", new Object[]{this, aVar});
            return;
        }
        this.mAppearListeners.add(aVar);
        aVar.a(this.mPageIndex);
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public void registerPageDisappearListener(c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705c621a", new Object[]{this, bVar});
        } else {
            this.mDisappearListeners.add(bVar);
        }
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public nfz getPageView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfz) ipChange.ipc$dispatch("e6918913", new Object[]{this}) : this.mPageWebView;
    }

    @Override // com.taobao.pha.core.phacontainer.c
    /* renamed from: getPageModel */
    public PageModel mo1202getPageModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageModel) ipChange.ipc$dispatch("dd6442ff", new Object[]{this}) : this.mPageModel;
    }

    public void setEnableScrollListener(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9987467", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableScrollListener = z;
        }
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public void updatePageModel(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e747200c", new Object[]{this, pageModel});
        } else if (this.mPageModel == null || pageModel == null) {
        } else {
            if (!StringUtils.isEmpty(pageModel.getUrl())) {
                this.mPageModel.setUrl(pageModel.getUrl());
            }
            if (!StringUtils.isEmpty(pageModel.backgroundColor)) {
                this.mPageModel.backgroundColor = pageModel.backgroundColor;
            }
            this.mPageModel.setEnableSoftPullRefresh(Boolean.valueOf(pageModel.isEnableSoftPullRefresh()));
            this.mPageModel.setEnableHardPullRefresh(Boolean.valueOf(pageModel.isEnableHardPullRefresh()));
            IPullRefreshLayout iPullRefreshLayout = this.mRefreshLayout;
            if (iPullRefreshLayout == null) {
                return;
            }
            iPullRefreshLayout.setEnabled(this.mPullRefreshDelegate.e());
        }
    }

    public int getPageIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("913ddec7", new Object[]{this})).intValue() : this.mPageIndex;
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public void setPageIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74d6bb", new Object[]{this, new Integer(i)});
        } else {
            this.mPageIndex = i;
        }
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        nfz nfzVar = this.mPageWebView;
        if (nfzVar != null) {
            nfzVar.g();
            this.mPageWebView = null;
        }
        this.mInflateView = false;
        FrameLayout frameLayout = this.mRootView;
        if (frameLayout == null) {
            return;
        }
        ViewParent parent = frameLayout.getParent();
        if (!(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).removeView(this.mRootView);
        this.mRootView = null;
    }

    @Override // android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bd9221", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setUserVisibleHint(z);
        String str = TAG;
        ngr.a(str, "setUserVisibleHint " + z + " " + this.mPageIndex);
        if (z && !this.mInflateView && getView() != null) {
            View instanceWebView = instanceWebView();
            ViewGroup viewGroup = this.mPageViewContainer;
            if (viewGroup != null && instanceWebView != null) {
                viewGroup.addView(instanceWebView);
            }
            this.mInflateView = true;
        }
        if (!this.mInflateView || getView() == null) {
            return;
        }
        if (z) {
            setWebViewVisible();
            onPageAppear();
            return;
        }
        setWebViewInVisible();
        onPageDisappear();
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        nfz nfzVar = this.mPageWebView;
        if (nfzVar == null) {
            return;
        }
        nfzVar.a(configuration);
    }

    public void setWebViewVisible() {
        View j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2345ee22", new Object[]{this});
            return;
        }
        String str = TAG;
        ngr.a(str, "setWebViewVisible " + this.mPageIndex);
        nfz nfzVar = this.mPageWebView;
        if (nfzVar == null || (j = nfzVar.j()) == null) {
            return;
        }
        j.setVisibility(0);
        ImageView imageView = this.mPreviewImage;
        if (imageView != null && imageView.getVisibility() == 0) {
            this.mPreviewImage.setVisibility(8);
            this.mPreviewImage.setImageBitmap(null);
        }
        adjustViewPosition();
    }

    public void setWebViewInVisible() {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ca697d", new Object[]{this});
            return;
        }
        String str = TAG;
        ngr.a(str, "setWebViewInVisible " + this.mPageIndex);
        nfz nfzVar = this.mPageWebView;
        if (nfzVar == null) {
            return;
        }
        Bitmap m = nfzVar.m();
        View j = this.mPageWebView.j();
        if (j == null || m == null) {
            return;
        }
        int height = (j.getHeight() - j.getPaddingTop()) - j.getPaddingBottom();
        if (m != null && height > 0 && Build.VERSION.SDK_INT >= 19) {
            m.setHeight(height);
        }
        if (m != null && (imageView = this.mPreviewImage) != null) {
            imageView.setImageBitmap(m);
            this.mPreviewImage.setVisibility(0);
        }
        j.setVisibility(4);
    }

    public void setTabHeaderHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ce1235", new Object[]{this, new Integer(i)});
        } else if (this.mTabHeaderHeight == i) {
        } else {
            this.mTabHeaderHeight = i;
            adjustViewPosition();
        }
    }

    private void adjustViewPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ff69e24", new Object[]{this});
        } else if (this.mRootView == null) {
        } else {
            this.mRootView.setPadding(0, offsetTop(), 0, 0);
        }
    }

    private int offsetTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3bf20b3c", new Object[]{this})).intValue();
        }
        PageModel pageModel = this.mPageModel;
        if (pageModel == null || pageModel.getPageHeader() == null) {
            return 0;
        }
        String str = this.mPageHeaderPosition;
        if (!StringUtils.isEmpty(this.mPageModel.headerPosition)) {
            str = this.mPageModel.headerPosition;
        }
        if (this.mTabHeaderHeight <= 0 || !StringUtils.equals("static", str)) {
            return 0;
        }
        int a2 = ngn.a(getContext(), this.mTabHeaderHeight);
        return (this.mPageModel.getPageHeader().includedSafeArea || getAppController() == null) ? a2 : a2 + getAppController().R();
    }

    @Override // tb.nfj
    public void preload(List<Integer> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef23301", new Object[]{this, list});
        } else if (!list.contains(Integer.valueOf(this.mPageIndex)) || this.mInflateView || getView() == null) {
        } else {
            View instanceWebView = instanceWebView();
            ViewGroup viewGroup = this.mPageViewContainer;
            if (viewGroup != null && instanceWebView != null) {
                viewGroup.addView(instanceWebView);
            }
            this.mInflateView = true;
        }
    }

    @Override // com.taobao.pha.core.phacontainer.d
    public boolean startPullRefresh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("19b9619f", new Object[]{this})).booleanValue() : this.mPullRefreshDelegate.b();
    }

    @Override // com.taobao.pha.core.phacontainer.d
    public boolean stopPullRefresh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cea69ff", new Object[]{this})).booleanValue() : this.mPullRefreshDelegate.c();
    }

    @Override // com.taobao.pha.core.phacontainer.d
    public boolean setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c04712d", new Object[]{this, new Integer(i)})).booleanValue() : this.mPullRefreshDelegate.a(i);
    }

    @Override // com.taobao.pha.core.phacontainer.d
    public boolean setColorScheme(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8be4ef3b", new Object[]{this, str})).booleanValue() : this.mPullRefreshDelegate.a(str);
    }

    @Override // com.taobao.pha.core.phacontainer.d
    public IPullRefreshLayout getPullRefreshLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPullRefreshLayout) ipChange.ipc$dispatch("829d84b2", new Object[]{this}) : this.mRefreshLayout;
    }

    @Override // com.taobao.pha.core.phacontainer.d
    public boolean enablePullRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("388183be", new Object[]{this, new Boolean(z)})).booleanValue() : this.mPullRefreshDelegate.a(z);
    }

    @Override // com.taobao.pha.core.phacontainer.d
    public boolean disablePullRefresh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("36186659", new Object[]{this})).booleanValue() : this.mPullRefreshDelegate.d();
    }

    private View instanceWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("311a8fcd", new Object[]{this});
        }
        ngr.a(TAG, "instanceWebView");
        final AppController appController = getAppController();
        if (appController == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        l j = appController.j();
        if (j != null) {
            this.mPageWebView = j.a(this.mPageModel.getUrl());
        }
        if (this.mPageWebView == null) {
            this.mPageWebView = ngn.a(appController, this.mPageModel);
        }
        nfz nfzVar = this.mPageWebView;
        if (nfzVar == null) {
            return null;
        }
        nfzVar.a(new ngk() { // from class: com.taobao.pha.core.phacontainer.LazyPageFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1659494104) {
                    super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                    return null;
                } else if (hashCode != 1597486209) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    return new Boolean(super.a((MotionEvent) objArr[0]));
                }
            }

            @Override // tb.ngk
            public void a(int i, int i2, int i3, int i4) {
                nfz pageView;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                super.a(i, i2, i3, i4);
                if (LazyPageFragment.this.getParentFragment() != null && LazyPageFragment.access$200(LazyPageFragment.this)) {
                    Fragment findFragmentByTag = LazyPageFragment.this.getParentFragment().getChildFragmentManager().findFragmentByTag(PageHeaderFragment.TAG_FRAGMENT);
                    if ((findFragmentByTag instanceof c) && (pageView = ((c) findFragmentByTag).getPageView()) != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("left", (Object) Integer.valueOf(i));
                        jSONObject.put("top", (Object) Integer.valueOf(i2));
                        jSONObject.put("oldleft", (Object) Integer.valueOf(i3));
                        jSONObject.put("oldtop", (Object) Integer.valueOf(i4));
                        if (LazyPageFragment.access$300(LazyPageFragment.this) != null) {
                            jSONObject.put("origin", (Object) LazyPageFragment.access$300(LazyPageFragment.this).getUrl());
                        }
                        AppController appController2 = LazyPageFragment.this.getAppController();
                        if (appController2 != null && appController2.E() != null) {
                            String d = pageView.d();
                            appController2.E().a("onPHAPageScroll", jSONObject, "native", d);
                            appController2.E().a("pagescroll", jSONObject, "native", d);
                        }
                    }
                }
                ManifestModel u = appController.u();
                if (u == null) {
                    return;
                }
                boolean z = u.tabBar != null && u.tabBar.enableScrollListener;
                boolean z2 = u.worker != null && u.worker.enableScrollListener;
                if (!z && !z2) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("left", (Object) Integer.valueOf(i));
                jSONObject2.put("top", (Object) Integer.valueOf(i2));
                jSONObject2.put("oldleft", (Object) Integer.valueOf(i3));
                jSONObject2.put("oldtop", (Object) Integer.valueOf(i4));
                if (LazyPageFragment.access$300(LazyPageFragment.this) != null) {
                    jSONObject2.put("origin", (Object) LazyPageFragment.access$300(LazyPageFragment.this).getUrl());
                }
                if (z) {
                    appController.E().a("pagescroll", jSONObject2, "native", "TabBar");
                }
                if (!z2) {
                    return;
                }
                appController.E().a("pagescroll", jSONObject2, "native", "AppWorker");
            }

            @Override // tb.ngk
            public void a(ngf ngfVar, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ce765a78", new Object[]{this, ngfVar, new Integer(i)});
                } else if (!LazyPageFragment.access$100(LazyPageFragment.this).a() || LazyPageFragment.access$400(LazyPageFragment.this) == null || i != 100) {
                } else {
                    LazyPageFragment.access$400(LazyPageFragment.this).setRefreshing(false);
                }
            }

            @Override // tb.ngk
            public void a(ngf ngfVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("46a67af5", new Object[]{this, ngfVar, str});
                } else if (!LazyPageFragment.access$100(LazyPageFragment.this).a() || LazyPageFragment.access$400(LazyPageFragment.this) == null) {
                } else {
                    LazyPageFragment.access$400(LazyPageFragment.this).setRefreshing(false);
                }
            }

            @Override // tb.ngk
            public boolean a(MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
                }
                IPullRefreshLayout pullRefreshLayout = LazyPageFragment.this.getPullRefreshLayout();
                if (motionEvent != null && pullRefreshLayout != null && LazyPageFragment.access$100(LazyPageFragment.this).e()) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        pullRefreshLayout.setEnabled(false);
                    } else if (action == 1) {
                        pullRefreshLayout.setEnabled(true);
                        pullRefreshLayout.setRefreshing(false);
                    }
                }
                return super.a(motionEvent);
            }

            @Override // tb.ngk
            public void a(int i, int i2, boolean z, boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9d1e1b48", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2)});
                    return;
                }
                IPullRefreshLayout pullRefreshLayout = LazyPageFragment.this.getPullRefreshLayout();
                if (pullRefreshLayout == null || !LazyPageFragment.access$100(LazyPageFragment.this).e()) {
                    return;
                }
                pullRefreshLayout.setEnabled(true);
                pullRefreshLayout.setRefreshing(false);
            }
        });
        View j2 = this.mPageWebView.j();
        if (j2 == null) {
            ngr.b(TAG, "failed to create webView");
            return null;
        }
        String str = TAG;
        ngr.a(str, "Init WebView in ms:" + (System.currentTimeMillis() - currentTimeMillis));
        PageModel pageModel = this.mPageModel;
        if (pageModel != null && !StringUtils.isEmpty(pageModel.backgroundColor)) {
            ViewGroup viewGroup = this.mPageViewContainer;
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(ngn.f(this.mPageModel.backgroundColor));
            }
            j2.setBackgroundColor(ngn.f(this.mPageModel.backgroundColor));
        }
        j2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        return j2;
    }
}
