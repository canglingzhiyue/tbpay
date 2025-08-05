package com.taobao.themis.taobao.container.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.LocalBroadcastManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.search.common.util.i;
import com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment;
import com.taobao.taobao.R;
import com.taobao.themis.container.app.page.IContainerViewFactory;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.d;
import com.uc.webview.export.media.MessageID;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpm;
import tb.qpt;
import tb.qpv;
import tb.rnc;
import tb.trk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u0005¢\u0006\u0002\u0010\u0003J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010$\u001a\u00020\u0014H\u0016J\u001a\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0012\u0010)\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010+\u001a\u00020\u0014H\u0016J\b\u0010,\u001a\u00020\u0014H\u0016J\u0012\u0010-\u001a\u00020\u00142\b\u0010.\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010/\u001a\u00020\u0014H\u0016J\b\u00100\u001a\u00020\u0014H\u0016J\u001c\u00101\u001a\u00020\u00142\b\u00102\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u000e\u00103\u001a\u00020\u00142\u0006\u00104\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/taobao/themis/taobao/container/fragment/TMSTBHomeFragment;", "Lcom/taobao/tao/tbmainfragment/SupportSecondaryBaseFragment;", "Lcom/taobao/themis/kernel/container/context/PageContext;", "()V", "containerHelper", "Lcom/taobao/themis/taobao/container/fragment/TMSFragmentContainerHelper;", "mPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "mPageContainer", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "mRootView", "Landroid/view/View;", "getCurrentActivity", "Landroid/app/Activity;", "getCurrentFragment", "Landroid/support/v4/app/Fragment;", "getPageContainer", "name", "", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressedSupport", "", i.b.MEASURE_ONCREATE, "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", MessageID.onDestroy, "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onNewIntent", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "onPause", "onResume", "onSaveInstanceState", "outState", "onStart", MessageID.onStop, "onViewCreated", "view", "setPage", "page", "Companion", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSTBHomeFragment extends SupportSecondaryBaseFragment implements qpm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final String TAG = "TMSTBHomeFragment";
    private com.taobao.themis.taobao.container.fragment.a containerHelper;
    private ITMSPage mPage;
    private rnc mPageContainer;
    private View mRootView;

    static {
        kge.a(-1699073775);
        kge.a(1151933142);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(TMSTBHomeFragment tMSTBHomeFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
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

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
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

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        d dVar = d.INSTANCE;
        long currentTimeMillis = System.currentTimeMillis();
        d dVar2 = d.INSTANCE;
        com.taobao.themis.container.utils.b.a(getContext());
        long currentTimeMillis2 = System.currentTimeMillis();
        d dVar3 = d.INSTANCE;
        super.onCreate(bundle);
        this.mRootView = View.inflate(getContext(), R.layout.tms_activity_main, null);
        FragmentActivity activity = getActivity();
        q.b(activity, "activity");
        View view = this.mRootView;
        q.a(view);
        View findViewById = view.findViewById(R.id.tms_splash_container);
        q.b(findViewById, "mRootView!!.findViewById….id.tms_splash_container)");
        this.containerHelper = new com.taobao.themis.taobao.container.fragment.a(activity, this, (ViewGroup) findViewById);
        Bundle arguments = getArguments();
        Object obj = arguments != null ? arguments.get("originActivityIntent") : null;
        if (!(obj instanceof Intent)) {
            obj = null;
        }
        Intent intent = (Intent) obj;
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("traceId");
        if (stringExtra != null) {
            String uri = data.toString();
            q.b(uri, "url.toString()");
            qpv.a(uri, stringExtra, false, 4, (Object) null);
        }
        d dVar4 = d.INSTANCE;
        com.taobao.themis.taobao.container.fragment.a aVar = this.containerHelper;
        if (aVar != null) {
            String uri2 = data.toString();
            q.b(uri2, "url.toString()");
            trk.a.a(aVar, uri2, (JSONObject) null, 2, (Object) null);
        }
        d dVar5 = d.INSTANCE;
        com.taobao.themis.taobao.container.fragment.a aVar2 = this.containerHelper;
        if (aVar2 != null) {
            trk.a.a(aVar2, (TMSSolutionType) null, (f.c) null, 3, (Object) null);
        }
        com.taobao.themis.taobao.container.fragment.a aVar3 = this.containerHelper;
        if (aVar3 != null) {
            aVar3.a(ai.a(j.a("containerOnCreate", String.valueOf(currentTimeMillis)), j.a("containerStart", String.valueOf(currentTimeMillis2))));
        }
        Intent intent2 = new Intent(PopLayer.ACTION_FRAGMENT_SWITCH);
        intent2.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_NAME, TAG);
        intent2.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_PARAM, data.toString());
        intent2.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_NEED_ACTIVITY_PARAM, false);
        LocalBroadcastManager.getInstance(this.mActivity).sendBroadcast(intent2);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        com.taobao.themis.taobao.container.fragment.a aVar = this.containerHelper;
        if (aVar == null) {
            return;
        }
        aVar.a(bundle);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, inflater, viewGroup, bundle});
        }
        q.d(inflater, "inflater");
        TMSLogger.d(TAG, "onCreateView");
        return this.mRootView;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        } else {
            super.onViewCreated(view, bundle);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment
    public boolean onBackPressedSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6048655e", new Object[]{this})).booleanValue();
        }
        com.taobao.themis.taobao.container.fragment.a aVar = this.containerHelper;
        return aVar != null && aVar.a(4, (KeyEvent) null);
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        com.taobao.themis.taobao.container.fragment.a aVar = this.containerHelper;
        return aVar != null && aVar.a(4, (KeyEvent) null);
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        String simpleName = getClass().getSimpleName();
        q.b(simpleName, "this::class.java.simpleName");
        return simpleName;
    }

    public final void setPage(ITMSPage page) {
        rnc rncVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11535bc3", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        d dVar = d.INSTANCE;
        this.mPage = page;
        IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) qpt.b(IContainerViewFactory.class);
        View view = null;
        if (iContainerViewFactory != null) {
            Context context = getContext();
            q.b(context, "context");
            rncVar = iContainerViewFactory.createPageContainer(context, page);
        } else {
            rncVar = null;
        }
        this.mPageContainer = rncVar;
        d dVar2 = d.INSTANCE;
        View view2 = this.mRootView;
        if (view2 != null) {
            View findViewById = ((RelativeLayout) view2).findViewById(R.id.tms_fragment_container);
            q.b(findViewById, "(mRootView as RelativeLa…d.tms_fragment_container)");
            RelativeLayout relativeLayout = (RelativeLayout) findViewById;
            rnc rncVar2 = this.mPageContainer;
            if (rncVar2 != null) {
                view = rncVar2.getView();
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
            relativeLayout.addView(view);
            d dVar3 = d.INSTANCE;
            page.a(this);
            page.h();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
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

    @Override // tb.qpm
    public rnc getPageContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rnc) ipChange.ipc$dispatch("81a84adc", new Object[]{this}) : this.mPageContainer;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        com.taobao.themis.taobao.container.fragment.a aVar = this.containerHelper;
        if (aVar == null) {
            return;
        }
        aVar.c();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        com.taobao.themis.taobao.container.fragment.a aVar = this.containerHelper;
        if (aVar == null) {
            return;
        }
        aVar.o();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TMSLogger.d(TAG, "onResume");
        super.onResume();
        com.taobao.themis.taobao.container.fragment.a aVar = this.containerHelper;
        if (aVar == null) {
            return;
        }
        aVar.f();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        TMSLogger.d(TAG, "onPause");
        super.onPause();
        com.taobao.themis.taobao.container.fragment.a aVar = this.containerHelper;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TMSLogger.d(TAG, MessageID.onDestroy);
        super.onDestroy();
        com.taobao.themis.taobao.container.fragment.a aVar = this.containerHelper;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        com.taobao.themis.taobao.container.fragment.a aVar = this.containerHelper;
        if (aVar == null) {
            return;
        }
        aVar.a(i, i2, intent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/taobao/container/fragment/TMSTBHomeFragment$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(556841753);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
