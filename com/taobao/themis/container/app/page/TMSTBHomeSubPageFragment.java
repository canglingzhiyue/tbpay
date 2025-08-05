package com.taobao.themis.container.app.page;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpt;
import tb.rnc;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0002J(\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSTBHomeSubPageFragment;", "Lcom/taobao/themis/container/app/page/TMSBaseFragment;", "()V", "mPageContainer", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "getPageContainer", "getTitleBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;", "loadTMSPage", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSTBHomeSubPageFragment extends TMSBaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private rnc mPageContainer;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    static {
        kge.a(981971110);
    }

    public static /* synthetic */ Object ipc$super(TMSTBHomeSubPageFragment tMSTBHomeSubPageFragment, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ void access$loadTMSPage(TMSTBHomeSubPageFragment tMSTBHomeSubPageFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ec0b91", new Object[]{tMSTBHomeSubPageFragment});
        } else {
            tMSTBHomeSubPageFragment.loadTMSPage();
        }
    }

    @Override // com.taobao.themis.container.app.page.TMSBaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        rnc rncVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) qpt.b(IContainerViewFactory.class);
        ViewGroup viewGroup2 = null;
        if (iContainerViewFactory != null) {
            FragmentActivity activity = getActivity();
            q.b(activity, "activity");
            ITMSPage mPage = getMPage();
            q.a(mPage);
            rncVar = iContainerViewFactory.createPageContainer(activity, mPage);
        } else {
            rncVar = null;
        }
        this.mPageContainer = rncVar;
        View view = rncVar != null ? rncVar.getView() : null;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup2 = parent;
            }
            ViewGroup viewGroup3 = viewGroup2;
            if (viewGroup3 != null) {
                viewGroup3.endViewTransition(view);
                viewGroup3.removeAllViews();
            }
        }
        View mRootView = getMRootView();
        if (mRootView != null) {
            mRootView.setBackgroundColor(-1);
        }
        View mRootView2 = getMRootView();
        if (mRootView2 != null) {
            mRootView2.setOnClickListener(a.INSTANCE);
        }
        return view;
    }

    @Override // com.taobao.themis.container.app.page.TMSBaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        } else if (isAdded() && getActivity() != null) {
            loadTMSPage();
        } else {
            com.taobao.themis.kernel.utils.a.a(new TMSTBHomeSubPageFragment$onViewCreated$1(this), 32L);
        }
    }

    private final void loadTMSPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d719660a", new Object[]{this});
            return;
        }
        updateDefaultPageUTParam();
        ITMSPage mPage = getMPage();
        if (mPage != null) {
            mPage.a(this);
        }
        ITMSPage mPage2 = getMPage();
        if (mPage2 == null) {
            return;
        }
        mPage2.h();
    }

    @Override // com.taobao.themis.container.app.page.TMSBaseFragment, tb.qpm
    public rnc getPageContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rnc) ipChange.ipc$dispatch("81a84adc", new Object[]{this}) : this.mPageContainer;
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
}
