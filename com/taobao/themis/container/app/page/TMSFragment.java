package com.taobao.themis.container.app.page;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.uc.webview.export.media.MessageID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qpm;
import tb.qpt;
import tb.qpv;
import tb.rnc;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J(\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\u0012\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0016J\u001c\u0010 \u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/taobao/themis/container/app/page/TMSFragment;", "Lcom/taobao/themis/container/app/page/TMSBaseFragment;", "()V", "mHasPageLoaded", "", "mHasReport", "mNeedReport", "mPageContainer", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "reportMap", "", "", "", "createViewSafely", "", "getTitleBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;", "loadTMSPage", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", MessageID.onDestroy, "onPause", "onSaveInstanceState", "outState", "onViewCreated", "view", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSFragment extends TMSBaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mHasPageLoaded;
    private boolean mHasReport;
    private boolean mNeedReport;
    private volatile rnc mPageContainer;
    private Map<String, Object> reportMap = new LinkedHashMap();

    static {
        kge.a(1268803964);
    }

    public static /* synthetic */ Object ipc$super(TMSFragment tMSFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2147180915) {
            super.onSaveInstanceState((Bundle) objArr[0]);
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 797441118) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onPause();
            return null;
        }
    }

    public static final /* synthetic */ void access$createViewSafely(TMSFragment tMSFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57548cb5", new Object[]{tMSFragment});
        } else {
            tMSFragment.createViewSafely();
        }
    }

    public static final /* synthetic */ rnc access$getMPageContainer$p(TMSFragment tMSFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rnc) ipChange.ipc$dispatch("cf575e1e", new Object[]{tMSFragment}) : tMSFragment.mPageContainer;
    }

    public static final /* synthetic */ void access$loadTMSPage(TMSFragment tMSFragment, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c17b40e8", new Object[]{tMSFragment, iTMSPage});
        } else {
            tMSFragment.loadTMSPage(iTMSPage);
        }
    }

    public static final /* synthetic */ void access$setMPageContainer$p(TMSFragment tMSFragment, rnc rncVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc6402f6", new Object[]{tMSFragment, rncVar});
        } else {
            tMSFragment.mPageContainer = rncVar;
        }
    }

    @Override // com.taobao.themis.container.app.page.TMSBaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout;
        rnc rncVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ITMSPage mPage = getMPage();
        if (this.mPageContainer == null && mPage != null) {
            IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) qpt.b(IContainerViewFactory.class);
            if (iContainerViewFactory != null) {
                FragmentActivity activity = getActivity();
                q.b(activity, "activity");
                rncVar = iContainerViewFactory.createPageContainer(activity, mPage);
            } else {
                rncVar = null;
            }
            this.mPageContainer = rncVar;
        }
        rnc rncVar2 = this.mPageContainer;
        if (rncVar2 == null || (linearLayout = rncVar2.getView()) == null) {
            linearLayout = new LinearLayout(getContext());
        }
        setMRootView(linearLayout);
        View mRootView = getMRootView();
        ViewParent parent = mRootView != null ? mRootView.getParent() : null;
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) parent;
        if (viewGroup2 != null) {
            viewGroup2.endViewTransition(getMRootView());
            viewGroup2.removeAllViews();
        }
        return getMRootView();
    }

    @Override // com.taobao.themis.container.app.page.TMSBaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        } else {
            createViewSafely();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        this.reportMap.put("onSaveInstanceState", true);
    }

    private final void createViewSafely() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4803f602", new Object[]{this});
            return;
        }
        ITMSPage mPage = getMPage();
        if (isAdded() && getActivity() != null && mPage != null) {
            if (enableForceWindowRatio(mPage) && com.taobao.themis.utils.f.c(getContext())) {
                com.taobao.themis.kernel.utils.a.a(new TMSFragment$createViewSafely$1(this, mPage), 100L);
                return;
            } else {
                loadTMSPage(mPage);
                return;
            }
        }
        if (!this.mNeedReport) {
            this.mNeedReport = true;
            this.reportMap.put("isAdded", Boolean.valueOf(isAdded()));
            this.reportMap.put("activity", Boolean.valueOf(getActivity() == null));
            Map<String, Object> map = this.reportMap;
            if (mPage == null) {
                z = true;
            }
            map.put("page", Boolean.valueOf(z));
            this.reportMap.put("isDetached", Boolean.valueOf(isDetached()));
            this.reportMap.put("isRemoving", Boolean.valueOf(isRemoving()));
        }
        com.taobao.themis.kernel.utils.a.a(new TMSFragment$createViewSafely$2(this), 32L);
    }

    @Override // com.taobao.themis.container.app.page.TMSBaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ITMSPage mPage = getMPage();
        if (mPage == null) {
            return;
        }
        mPage.k();
    }

    private final void loadTMSPage(ITMSPage iTMSPage) {
        rnc rncVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("782fc1b5", new Object[]{this, iTMSPage});
            return;
        }
        updateDefaultPageUTParam();
        if (this.mHasPageLoaded) {
            return;
        }
        this.mHasPageLoaded = true;
        if (this.mPageContainer == null) {
            IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) qpt.b(IContainerViewFactory.class);
            ViewGroup viewGroup = null;
            if (iContainerViewFactory != null) {
                FragmentActivity activity = getActivity();
                q.b(activity, "activity");
                rncVar = iContainerViewFactory.createPageContainer(activity, iTMSPage);
                if (rncVar != null) {
                    View mRootView = getMRootView();
                    if (mRootView instanceof ViewGroup) {
                        viewGroup = mRootView;
                    }
                    ViewGroup viewGroup2 = viewGroup;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(rncVar.getView());
                    }
                    t tVar = t.INSTANCE;
                    this.mPageContainer = rncVar;
                }
            }
            rncVar = null;
            this.mPageContainer = rncVar;
        }
        iTMSPage.a(new a());
        iTMSPage.h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/taobao/themis/container/app/page/TMSFragment$loadTMSPage$2", "Lcom/taobao/themis/kernel/container/context/PageContext;", "getCurrentActivity", "Landroid/app/Activity;", "getCurrentFragment", "Landroid/support/v4/app/Fragment;", "getCurrentFragmentManager", "Landroid/support/v4/app/FragmentManager;", "getPageContainer", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements qpm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.qpm
        public com.taobao.themis.kernel.container.ui.titlebar.b getTitleBar() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.themis.kernel.container.ui.titlebar.b) ipChange.ipc$dispatch("70a8d5ae", new Object[]{this}) : qpm.a.b(this);
        }

        @Override // tb.qpm
        public Activity getCurrentActivity() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this}) : TMSFragment.this.getActivity();
        }

        @Override // tb.qpm
        public Fragment getCurrentFragment() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("4789611c", new Object[]{this}) : TMSFragment.this;
        }

        @Override // tb.qpm
        public rnc getPageContainer() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rnc) ipChange.ipc$dispatch("81a84adc", new Object[]{this}) : TMSFragment.access$getMPageContainer$p(TMSFragment.this);
        }

        @Override // tb.qpm
        public FragmentManager getCurrentFragmentManager() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FragmentManager) ipChange.ipc$dispatch("a4099526", new Object[]{this}) : TMSFragment.this.getFragmentManager();
        }
    }

    @Override // com.taobao.themis.container.app.page.TMSBaseFragment, tb.qpm
    public com.taobao.themis.kernel.container.ui.titlebar.b getTitleBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.container.ui.titlebar.b) ipChange.ipc$dispatch("70a8d5ae", new Object[]{this});
        }
        rnc rncVar = this.mPageContainer;
        if (rncVar == null) {
            return null;
        }
        return rncVar.a();
    }

    @Override // com.taobao.themis.container.app.page.TMSBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (!this.mNeedReport || this.mHasReport) {
            return;
        }
        this.mHasReport = true;
        JSONObject jSONObject = new JSONObject(this.reportMap);
        if (jSONObject.get("onSaveInstanceState") == null) {
            jSONObject.put((JSONObject) "onSaveInstanceState", (String) false);
        }
        qpv.a(jSONObject);
    }
}
