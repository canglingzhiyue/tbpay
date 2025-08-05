package com.taobao.themis.container.app.page;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.extension.page.j;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.u;
import com.uc.webview.export.media.MessageID;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qpm;
import tb.qpt;
import tb.qqc;
import tb.rnc;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u000bH\u0004J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0001H\u0016J\n\u0010%\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000bH\u0002J(\u0010'\u001a\u0004\u0018\u00010\u00132\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\u001fH\u0016J\b\u0010/\u001a\u00020\u001fH\u0016J\b\u00100\u001a\u00020\u001fH\u0016J\b\u00101\u001a\u00020\u001fH\u0016J\b\u00102\u001a\u00020\u001fH\u0016J\u001c\u00103\u001a\u00020\u001f2\b\u00104\u001a\u0004\u0018\u00010\u00132\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u000e\u00105\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000bJ\b\u00106\u001a\u00020\u001fH\u0004R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00068"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSBaseFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/taobao/themis/kernel/container/context/PageContext;", "()V", "alreadyScheduleAdded", "", "getAlreadyScheduleAdded", "()Z", "setAlreadyScheduleAdded", "(Z)V", "mPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "getMPage", "()Lcom/taobao/themis/kernel/page/ITMSPage;", "setMPage", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "mPageContainer", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "mRootView", "Landroid/view/View;", "getMRootView", "()Landroid/view/View;", "setMRootView", "(Landroid/view/View;)V", "mTitleBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;", "getMTitleBar", "()Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;", "setMTitleBar", "(Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;)V", "createViewSafely", "", "enableForceWindowRatio", "page", "getCurrentActivity", "Landroid/app/Activity;", "getCurrentFragment", "getPageContainer", "loadPage", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", MessageID.onDestroy, "onPause", "onResume", "onStart", MessageID.onStop, "onViewCreated", "view", "setPage", "updateDefaultPageUTParam", "Companion", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class TMSBaseFragment extends Fragment implements qpm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion;
    private static final String TAG = "TMSBaseFragment";
    private boolean alreadyScheduleAdded;
    private ITMSPage mPage;
    private rnc mPageContainer;
    private View mRootView;
    private com.taobao.themis.kernel.container.ui.titlebar.b mTitleBar;

    static {
        kge.a(309460333);
        kge.a(1151933142);
        Companion = new b(null);
    }

    public static /* synthetic */ Object ipc$super(TMSBaseFragment tMSBaseFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static final /* synthetic */ void access$createViewSafely(TMSBaseFragment tMSBaseFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ad0aa4", new Object[]{tMSBaseFragment});
        } else {
            tMSBaseFragment.createViewSafely();
        }
    }

    public static final /* synthetic */ void access$loadPage(TMSBaseFragment tMSBaseFragment, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238d1f69", new Object[]{tMSBaseFragment, iTMSPage});
        } else {
            tMSBaseFragment.loadPage(iTMSPage);
        }
    }

    @Override // tb.qpm
    public FragmentManager getCurrentFragmentManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentManager) ipChange.ipc$dispatch("a4099526", new Object[]{this}) : qpm.a.a(this);
    }

    @Override // tb.qpm
    public com.taobao.themis.kernel.container.ui.titlebar.b getTitleBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.kernel.container.ui.titlebar.b) ipChange.ipc$dispatch("70a8d5ae", new Object[]{this}) : qpm.a.b(this);
    }

    public final ITMSPage getMPage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("26554f74", new Object[]{this}) : this.mPage;
    }

    public final void setMPage(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ff598c", new Object[]{this, iTMSPage});
        } else {
            this.mPage = iTMSPage;
        }
    }

    public final View getMRootView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("7f28de07", new Object[]{this}) : this.mRootView;
    }

    public final void setMRootView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8628b9", new Object[]{this, view});
        } else {
            this.mRootView = view;
        }
    }

    public final com.taobao.themis.kernel.container.ui.titlebar.b getMTitleBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.kernel.container.ui.titlebar.b) ipChange.ipc$dispatch("6bd5d4ed", new Object[]{this}) : this.mTitleBar;
    }

    public final void setMTitleBar(com.taobao.themis.kernel.container.ui.titlebar.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b44e9d", new Object[]{this, bVar});
        } else {
            this.mTitleBar = bVar;
        }
    }

    public final boolean getAlreadyScheduleAdded() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("537348b2", new Object[]{this})).booleanValue() : this.alreadyScheduleAdded;
    }

    public final void setAlreadyScheduleAdded(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c2d85a", new Object[]{this, new Boolean(z)});
        } else {
            this.alreadyScheduleAdded = z;
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View view = this.mRootView;
        if (view != null) {
            ViewParent parent = view != null ? view.getParent() : null;
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup2 = (ViewGroup) parent;
            if (viewGroup2 != null) {
                viewGroup2.endViewTransition(this.mRootView);
                viewGroup2.removeAllViews();
            }
            return this.mRootView;
        }
        this.mRootView = new LinearLayout(getActivity());
        View view2 = this.mRootView;
        if (view2 != null) {
            view2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        View view3 = this.mRootView;
        if (view3 != null) {
            view3.setBackgroundColor(0);
        }
        return this.mRootView;
    }

    public final void setPage(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11535bc3", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        this.mPage = page;
        updateDefaultPageUTParam();
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        TMSLogger.b(TAG, "onViewCreated");
        createViewSafely();
    }

    private final void createViewSafely() {
        ITMSPage iTMSPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4803f602", new Object[]{this});
            return;
        }
        TMSLogger.b(TAG, "createViewSafely");
        if (isAdded() && this.mRootView != null && getActivity() != null && (iTMSPage = this.mPage) != null) {
            q.a(iTMSPage);
            if (enableForceWindowRatio(iTMSPage) && com.taobao.themis.utils.f.c(getContext())) {
                com.taobao.themis.kernel.utils.a.a(new TMSBaseFragment$createViewSafely$1(this), 100L);
                return;
            }
            ITMSPage iTMSPage2 = this.mPage;
            q.a(iTMSPage2);
            loadPage(iTMSPage2);
            return;
        }
        com.taobao.themis.kernel.utils.a.a(new TMSBaseFragment$createViewSafely$2(this), 32L);
    }

    private final void loadPage(ITMSPage iTMSPage) {
        rnc rncVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b47cc47", new Object[]{this, iTMSPage});
            return;
        }
        TMSLogger.b(TAG, "loadPage");
        this.mPage = iTMSPage;
        updateDefaultPageUTParam();
        if (this.mTitleBar != null && this.mPageContainer != null) {
            return;
        }
        Context context = getContext();
        if (context == null) {
            TMSLogger.d(TAG, "Activity context is null, loadPage fail");
            return;
        }
        IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) qpt.b(IContainerViewFactory.class);
        if (iContainerViewFactory == null || (rncVar = iContainerViewFactory.createPageContainer(context, iTMSPage)) == null) {
            rncVar = null;
        } else {
            View view = this.mRootView;
            if (!(view instanceof ViewGroup)) {
                view = null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup != null) {
                viewGroup.addView(rncVar.getView());
            }
            t tVar = t.INSTANCE;
        }
        this.mPageContainer = rncVar;
        iTMSPage.a(this);
        iTMSPage.h();
    }

    public final boolean enableForceWindowRatio(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4e78869", new Object[]{this, page})).booleanValue();
        }
        q.d(page, "page");
        return qqc.m(page) && n.an();
    }

    public final void updateDefaultPageUTParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9616946e", new Object[]{this});
            return;
        }
        ITMSPage iTMSPage = this.mPage;
        String str = null;
        com.taobao.themis.kernel.f b2 = iTMSPage != null ? iTMSPage.b() : null;
        IUserTrackerAdapter iUserTrackerAdapter = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class);
        if (iUserTrackerAdapter != null) {
            iUserTrackerAdapter.updatePageProperties(getActivity(), u.a(b2));
        }
        IUserTrackerAdapter iUserTrackerAdapter2 = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class);
        if (iUserTrackerAdapter2 != null) {
            iUserTrackerAdapter2.updatePageUtParam(getActivity(), u.b(b2));
        }
        IUserTrackerAdapter iUserTrackerAdapter3 = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class);
        if (iUserTrackerAdapter3 != null) {
            iUserTrackerAdapter3.updatePageName(getActivity(), u.c(b2));
        }
        if (n.ce()) {
            ITMSPage iTMSPage2 = this.mPage;
            if (iTMSPage2 != null && qqc.a(iTMSPage2)) {
                IUserTrackerAdapter iUserTrackerAdapter4 = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class);
                if (iUserTrackerAdapter4 == null) {
                    return;
                }
                FragmentActivity activity = getActivity();
                if (b2 != null) {
                    str = b2.g();
                }
                iUserTrackerAdapter4.updatePageUrl(activity, str);
                return;
            }
            IUserTrackerAdapter iUserTrackerAdapter5 = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class);
            if (iUserTrackerAdapter5 == null) {
                return;
            }
            FragmentActivity activity2 = getActivity();
            ITMSPage iTMSPage3 = this.mPage;
            if (iTMSPage3 != null) {
                str = iTMSPage3.e();
            }
            iUserTrackerAdapter5.updatePageUrl(activity2, str);
            return;
        }
        IUserTrackerAdapter iUserTrackerAdapter6 = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class);
        if (iUserTrackerAdapter6 == null) {
            return;
        }
        FragmentActivity activity3 = getActivity();
        if (b2 != null) {
            str = b2.g();
        }
        iUserTrackerAdapter6.updatePageUrl(activity3, str);
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        j jVar;
        ITMSPage c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        ITMSPage iTMSPage = this.mPage;
        if (iTMSPage != null) {
            iTMSPage.j();
        }
        ITMSPage iTMSPage2 = this.mPage;
        if (iTMSPage2 == null || (jVar = (j) iTMSPage2.a(j.class)) == null || !jVar.a() || (c = iTMSPage2.b().b().c()) == null || !qqc.a(c)) {
            return;
        }
        c.p();
        c.i();
    }

    @Override // tb.qpm
    public rnc getPageContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rnc) ipChange.ipc$dispatch("81a84adc", new Object[]{this}) : this.mPageContainer;
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        ITMSPage iTMSPage = this.mPage;
        if (iTMSPage == null) {
            return;
        }
        iTMSPage.i();
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        ITMSPage iTMSPage = this.mPage;
        if (iTMSPage == null) {
            return;
        }
        iTMSPage.p();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        ITMSPage iTMSPage = this.mPage;
        if (iTMSPage == null) {
            return;
        }
        iTMSPage.q();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ITMSPage iTMSPage = this.mPage;
        if (iTMSPage != null) {
            iTMSPage.k();
        }
        super.onDestroy();
    }

    @Override // tb.qpm
    public Activity getCurrentActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this}) : getActivity();
    }

    @Override // tb.qpm
    public Fragment getCurrentFragment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("4789611c", new Object[]{this}) : this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSBaseFragment$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b {
        static {
            kge.a(1623835765);
        }

        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }
    }
}
