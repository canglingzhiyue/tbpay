package com.taobao.pha.core.phacontainer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.s;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.controller.l;
import com.taobao.pha.core.manifest.ManifestProperty;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.model.TabHeaderModel;
import com.taobao.pha.core.p;
import com.taobao.pha.core.phacontainer.c;
import com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.nez;
import tb.nfa;
import tb.nfv;
import tb.nfz;
import tb.ngf;
import tb.ngj;
import tb.ngk;
import tb.ngn;
import tb.ngr;
import tb.ngu;

/* loaded from: classes7.dex */
public class PageFragment extends AbstractPageFragment implements c, d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PageFragment";
    private PageHeaderFragment mPageHeaderFragment;
    private PageModel mPageModel;
    private ViewGroup mPageView;
    private nfz mPageWebView;
    private nez mProgressBar;
    private IPullRefreshLayout mRefreshLayout;
    private int mPageIndex = -1;
    private final List<c.a> mAppearListeners = new ArrayList();
    private final List<c.b> mDisappearListeners = new ArrayList();
    private final f mPullRefreshDelegate = new f(this);

    static {
        kge.a(-396358145);
        kge.a(415810824);
        kge.a(68685277);
    }

    public static /* synthetic */ Object ipc$super(PageFragment pageFragment, String str, Object... objArr) {
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
            case 434397186:
                super.onHiddenChanged(((Boolean) objArr[0]).booleanValue());
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

    public static /* synthetic */ PageModel access$000(PageFragment pageFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageModel) ipChange.ipc$dispatch("4c14ea9f", new Object[]{pageFragment}) : pageFragment.mPageModel;
    }

    public static /* synthetic */ nfz access$100(PageFragment pageFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfz) ipChange.ipc$dispatch("e9c265da", new Object[]{pageFragment}) : pageFragment.mPageWebView;
    }

    public static /* synthetic */ f access$200(PageFragment pageFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("2b28996", new Object[]{pageFragment}) : pageFragment.mPullRefreshDelegate;
    }

    public static /* synthetic */ nez access$300(PageFragment pageFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nez) ipChange.ipc$dispatch("5eada31b", new Object[]{pageFragment}) : pageFragment.mProgressBar;
    }

    public static /* synthetic */ IPullRefreshLayout access$400(PageFragment pageFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPullRefreshLayout) ipChange.ipc$dispatch("d154aa08", new Object[]{pageFragment}) : pageFragment.mRefreshLayout;
    }

    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        nfz nfzVar = this.mPageWebView;
        if (nfzVar == null) {
            return false;
        }
        return nfzVar.q();
    }

    @Override // android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e46002", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onHiddenChanged(z);
        if (!z) {
            setWebViewVisible();
            onPageAppear();
            return;
        }
        setWebViewInVisible();
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
    public void setUserVisibleHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bd9221", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setUserVisibleHint(z);
        ngr.a(TAG, "setUserVisibleHint " + z + " " + this.mPageIndex);
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

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PageModel pageModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View rootView = getRootView();
        if (rootView != null) {
            ViewParent parent = rootView.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) parent;
                viewGroup2.endViewTransition(rootView);
                viewGroup2.removeAllViews();
            }
            return rootView;
        }
        PageModel pageModel2 = this.mPageModel;
        if (pageModel2 != null && pageModel2.getPageHeader() != null && TextUtils.equals(this.mPageModel.getPageHeader().position, "static")) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.mPageView = linearLayout;
            linearLayout.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setId(R.id.pha_view_pager_root_view);
            linearLayout.addView(frameLayout);
        } else {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.mPageView = frameLayout2;
            frameLayout2.setId(R.id.pha_view_pager_root_view);
        }
        this.mPageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        IPullRefreshLayout a2 = p.b().n().a(getContext(), this.mPageModel);
        if (a2 != null) {
            a2.setListener(new IPullRefreshLayout.b() { // from class: com.taobao.pha.core.phacontainer.PageFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (PageFragment.access$000(PageFragment.this) == null || PageFragment.access$100(PageFragment.this) == null) {
                    } else {
                        if (PageFragment.access$200(PageFragment.this).a()) {
                            PageFragment.access$100(PageFragment.this).h();
                        } else {
                            PageFragment.access$100(PageFragment.this).evaluateJavaScript(ngn.a("pullrefresh", "", (String) null));
                        }
                    }
                }

                @Override // com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout.b
                public boolean b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : PageFragment.access$100(PageFragment.this) != null && PageFragment.access$100(PageFragment.this).p() > 0;
                }
            });
            this.mRefreshLayout = a2;
        } else {
            ngr.b(TAG, "RefreshLayout can't be create.");
        }
        nfz nfzVar = this.mPageWebView;
        if (nfzVar != null) {
            View j = nfzVar.j();
            PageModel pageModel3 = this.mPageModel;
            if (pageModel3 != null && !TextUtils.isEmpty(pageModel3.backgroundColor)) {
                this.mPageView.setBackgroundColor(ngn.f(this.mPageModel.backgroundColor));
                j.setBackgroundColor(ngn.f(this.mPageModel.backgroundColor));
            }
            IPullRefreshLayout iPullRefreshLayout = this.mRefreshLayout;
            if (iPullRefreshLayout != null && iPullRefreshLayout.getView() != null) {
                FrameLayout frameLayout3 = new FrameLayout(getContext());
                frameLayout3.addView(j);
                this.mRefreshLayout.getView().addView(frameLayout3);
                this.mRefreshLayout.setEnabled(this.mPullRefreshDelegate.e());
            }
        }
        if (this.mRefreshLayout != null && (pageModel = this.mPageModel) != null) {
            setColorScheme(pageModel.pullRefreshColorScheme);
            Integer g = ngn.g(this.mPageModel.pullRefreshBackgroundColor);
            if (g != null) {
                setBackgroundColor(g.intValue());
            }
        }
        addTabHeaderView();
        if (this.mPageView != null) {
            if (a2 != null && a2.getView() != null) {
                this.mPageView.addView(a2.getView());
            } else {
                nfz nfzVar2 = this.mPageWebView;
                if (nfzVar2 != null) {
                    this.mPageView.addView(nfzVar2.j());
                }
            }
        }
        return getRootView();
    }

    private View getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        ViewGroup viewGroup = this.mPageView;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup;
    }

    private void addTabHeaderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0176ead", new Object[]{this});
            return;
        }
        PageModel pageModel = this.mPageModel;
        if (pageModel == null || pageModel.getPageHeader() == null) {
            return;
        }
        TabHeaderModel pageHeader = this.mPageModel.getPageHeader();
        pageHeader.setSubPage(this.mPageModel.isSubPage());
        if (TextUtils.isEmpty(pageHeader.html) && TextUtils.isEmpty(pageHeader.getUrl())) {
            return;
        }
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag(PageHeaderFragment.TAG_FRAGMENT);
        AppController appController = getAppController();
        if (findFragmentByTag != null || appController == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_tab_header_model", pageHeader);
        bundle.putInt("key_tab_header_page_index", this.mPageIndex);
        bundle.putLong("AppControllerInstanceId", appController.L());
        Fragment instantiate = Fragment.instantiate(getContext(), PageHeaderFragment.class.getName(), bundle);
        PageHeaderFragment pageHeaderFragment = (PageHeaderFragment) instantiate;
        this.mPageHeaderFragment = pageHeaderFragment;
        if (instantiate != null) {
            appController.a(pageHeaderFragment, pageHeader.key);
        }
        getChildFragmentManager().beginTransaction().add(R.id.pha_view_pager_root_view, instantiate, PageHeaderFragment.TAG_FRAGMENT).commitAllowingStateLoss();
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        setWebViewVisible();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        nfz nfzVar = this.mPageWebView;
        if (nfzVar != null) {
            nfzVar.o();
        }
        super.onResume();
        if (!getUserVisibleHint() || isHidden()) {
            return;
        }
        onPageAppear();
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

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        nfz nfzVar = this.mPageWebView;
        if (nfzVar != null) {
            nfzVar.n();
        }
        super.onPause();
        if (!getUserVisibleHint() || isHidden()) {
            return;
        }
        onPageDisappear();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
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
        ngr.a(TAG, "Page Fragment destroy");
    }

    private void onPageAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1800bf4a", new Object[]{this});
            return;
        }
        for (c.a aVar : this.mAppearListeners) {
            if (aVar != null) {
                aVar.a(this.mPageIndex);
            }
        }
        JSONObject pageEventData = getPageEventData(this.mPageModel, true);
        sendEventToPHAWorker("pageappear", pageEventData);
        sendEventToPageView("pageappear", pageEventData, null);
        if (getAppController() == null || this.mPageModel == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageUrl", (Object) this.mPageModel.getUrl());
        String str = this.mPageModel.key;
        if (TextUtils.isEmpty(str)) {
            str = this.mPageIndex + "";
        }
        jSONObject.put("pageId", (Object) str);
        getAppController().a("pageappear", jSONObject);
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
            return;
        }
        this.mPageIndex = i;
        PageHeaderFragment pageHeaderFragment = this.mPageHeaderFragment;
        if (pageHeaderFragment == null) {
            return;
        }
        pageHeaderFragment.setPageIndex(i);
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public void updatePageModel(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e747200c", new Object[]{this, pageModel});
        } else if (this.mPageModel == null || pageModel == null) {
        } else {
            if (!TextUtils.isEmpty(pageModel.getUrl())) {
                this.mPageModel.setUrl(pageModel.getUrl());
            }
            if (!TextUtils.isEmpty(pageModel.backgroundColor)) {
                this.mPageModel.backgroundColor = pageModel.backgroundColor;
            }
            this.mRefreshLayout.setEnabled(this.mPullRefreshDelegate.e());
        }
    }

    @Override // com.taobao.pha.core.phacontainer.c
    /* renamed from: getPageModel */
    public PageModel mo1202getPageModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageModel) ipChange.ipc$dispatch("dd6442ff", new Object[]{this}) : this.mPageModel;
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

    public void setWebViewVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2345ee22", new Object[]{this});
            return;
        }
        nfz nfzVar = this.mPageWebView;
        if (nfzVar == null || nfzVar.j() == null) {
            return;
        }
        ngr.a(TAG, "setWebViewVisible " + this.mPageIndex);
        this.mPageWebView.j().setVisibility(0);
    }

    public void setWebViewInVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ca697d", new Object[]{this});
            return;
        }
        nfz nfzVar = this.mPageWebView;
        if (nfzVar == null || nfzVar.j() == null) {
            return;
        }
        ngr.a(TAG, "setWebViewInVisible " + this.mPageIndex);
        this.mPageWebView.j().setVisibility(4);
    }

    @Override // com.taobao.pha.core.phacontainer.c
    public void destroy() {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        nfz nfzVar = this.mPageWebView;
        if (nfzVar == null) {
            return;
        }
        nfzVar.g();
        this.mPageWebView = null;
        this.mPageView = null;
        nez nezVar = this.mProgressBar;
        if (nezVar == null || (a2 = nezVar.a()) == null || a2.getParent() == null || !(a2.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) a2.getParent()).removeView(a2);
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

    @Override // com.taobao.pha.core.phacontainer.AbstractPageFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        ManifestProperty z;
        nfa A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (ngu.g()) {
            AppController appController = getAppController();
            com.taobao.monitor.procedure.g b = s.f18233a.b(this);
            b.b("phaRouteInit", SystemClock.uptimeMillis());
            ngn.a(appController, b);
        }
        Bundle arguments = getArguments();
        final AppController appController2 = getAppController();
        if (arguments != null && arguments.containsKey("key_page_model")) {
            this.mPageModel = (PageModel) arguments.getSerializable("key_page_model");
        }
        PageModel pageModel = this.mPageModel;
        if (pageModel != null && !TextUtils.isEmpty(pageModel.title) && getActivity() != null) {
            getActivity().setTitle(this.mPageModel.title);
        }
        PageModel pageModel2 = this.mPageModel;
        if (pageModel2 != null) {
            this.mPullRefreshDelegate.a(pageModel2);
        }
        if (appController2 != null && this.mPageModel != null) {
            if (!appController2.c() && (z = appController2.z()) != null && z.h != null && ((z.h.equals("default") || z.h.equals(ManifestProperty.PHAManifest.H5URL)) && (A = p.b().A()) != null)) {
                Context context = getContext();
                this.mProgressBar = A.a(context);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                if (displayMetrics != null) {
                    layoutParams.height = (int) (displayMetrics.density * 1.0f);
                }
                layoutParams.gravity = 48;
                View findViewById = ((Activity) context).findViewById(16908290);
                if (findViewById instanceof FrameLayout) {
                    ((FrameLayout) findViewById).addView(this.mProgressBar.a(), layoutParams);
                }
            }
            l j = appController2.j();
            if (j != null) {
                this.mPageWebView = j.a(this.mPageModel.getUrl());
            }
            ngk ngkVar = new ngk() { // from class: com.taobao.pha.core.phacontainer.PageFragment.2
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
                public void a(ngf ngfVar, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ce765a78", new Object[]{this, ngfVar, new Integer(i)});
                        return;
                    }
                    if (PageFragment.access$300(PageFragment.this) != null) {
                        PageFragment.access$300(PageFragment.this).a(i);
                    }
                    if (!PageFragment.access$200(PageFragment.this).a() || PageFragment.access$400(PageFragment.this) == null || i != 100) {
                        return;
                    }
                    PageFragment.access$400(PageFragment.this).setRefreshing(false);
                }

                @Override // tb.ngk
                public void a(ngf ngfVar, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("46a67af5", new Object[]{this, ngfVar, str});
                    } else if (!PageFragment.access$200(PageFragment.this).a() || PageFragment.access$400(PageFragment.this) == null) {
                    } else {
                        PageFragment.access$400(PageFragment.this).setRefreshing(false);
                    }
                }

                @Override // tb.ngk
                public boolean a(MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
                    }
                    IPullRefreshLayout pullRefreshLayout = PageFragment.this.getPullRefreshLayout();
                    if (motionEvent != null && pullRefreshLayout != null && PageFragment.access$200(PageFragment.this).e()) {
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
                public void a(int i, int i2, boolean z2, boolean z3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9d1e1b48", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z2), new Boolean(z3)});
                        return;
                    }
                    IPullRefreshLayout pullRefreshLayout = PageFragment.this.getPullRefreshLayout();
                    if (pullRefreshLayout == null || !PageFragment.access$200(PageFragment.this).e()) {
                        return;
                    }
                    pullRefreshLayout.setEnabled(true);
                    pullRefreshLayout.setRefreshing(false);
                }

                @Override // tb.ngk
                public void a(int i, int i2, int i3, int i4) {
                    IpChange ipChange2 = $ipChange;
                    boolean z2 = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                        return;
                    }
                    super.a(i, i2, i3, i4);
                    ManifestModel u = appController2.u();
                    if (u == null) {
                        return;
                    }
                    boolean z3 = u.tabBar != null && u.tabBar.enableScrollListener;
                    if (u.worker == null || !u.worker.enableScrollListener) {
                        z2 = false;
                    }
                    if (!z3 && !z2) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("left", (Object) Integer.valueOf(i));
                    jSONObject.put("top", (Object) Integer.valueOf(i2));
                    jSONObject.put("oldleft", (Object) Integer.valueOf(i3));
                    jSONObject.put("oldtop", (Object) Integer.valueOf(i4));
                    if (PageFragment.access$000(PageFragment.this) != null) {
                        jSONObject.put("origin", (Object) PageFragment.access$000(PageFragment.this).getUrl());
                    }
                    if (z3) {
                        appController2.E().a("pagescroll", jSONObject, "native", "TabBar");
                    }
                    if (!z2) {
                        return;
                    }
                    appController2.E().a("pagescroll", jSONObject, "native", "AppWorker");
                }
            };
            nfz nfzVar = this.mPageWebView;
            if (nfzVar == null) {
                this.mPageWebView = new ngj().a(appController2).a(this.mPageModel).a(ngkVar).a();
            } else {
                nfzVar.a(ngkVar);
            }
            if (this.mProgressBar != null) {
                nfz nfzVar2 = this.mPageWebView;
                if ((nfzVar2 instanceof nfv) && ((nfv) nfzVar2).b()) {
                    this.mProgressBar.a(100);
                }
            }
            appController2.a(this, this.mPageModel.key);
        }
        if (appController2 == null) {
            return;
        }
        appController2.P().a(this);
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

    public PageHeaderFragment getPageHeaderFragment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageHeaderFragment) ipChange.ipc$dispatch("9c2dadae", new Object[]{this}) : this.mPageHeaderFragment;
    }
}
