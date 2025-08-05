package com.taobao.mytaobao.homepage;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.monitor.procedure.o;
import com.taobao.mytaobao.base.c;
import com.taobao.mytaobao.base.d;
import com.taobao.mytaobao.ultron.MtbBizProxy;
import com.taobao.search.common.util.i;
import com.taobao.tao.MytaobaoApplication;
import com.taobao.tao.TBBaseFragment;
import com.taobao.tao.log.TLog;
import tb.kge;
import tb.mxf;
import tb.mxj;
import tb.nwv;

/* loaded from: classes7.dex */
public class MyTaobaoFragment extends TBBaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout flRoot;
    private ViewGroup parentContainerView;
    private d mtbBizProxy = null;
    private boolean hasPreload = false;

    static {
        kge.a(2087383049);
    }

    public static /* synthetic */ Object ipc$super(MyTaobaoFragment myTaobaoFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
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

    public void markSwitchToOldProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b18b026a", new Object[]{this});
            return;
        }
        d dVar = this.mtbBizProxy;
        if (!(dVar instanceof com.taobao.mytaobao.pagev2.a)) {
            TLog.loge("mtbMainLink", "标记切老VC，当前不是新vc，直接return");
            return;
        }
        dVar.j();
        this.mtbBizProxy = null;
        TLog.loge("mtbMainLink", "标记切老VC，清除proxy状态");
    }

    public void preloadMtb(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e6a2eb", new Object[]{this, activity});
            return;
        }
        nwv.a("preloadMtb");
        if (this.hasPreload) {
            return;
        }
        if (mxj.a("fixWeexPreloadLeak", true) && getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            return;
        }
        nwv.f("======preloadMtb");
        this.hasPreload = true;
        ensureMtbBizProxy().a(activity);
        nwv.e("preloadMtb");
    }

    public d ensureMtbBizProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("7f54b8fe", new Object[]{this});
        }
        if (this.mtbBizProxy == null) {
            if (c.x() && !c.r()) {
                TLog.loge("mtbMainLink", "创建新VC");
                this.mtbBizProxy = new com.taobao.mytaobao.pagev2.a(this);
                considerPlaybackLifecycle(this.mtbBizProxy);
            } else {
                TLog.loge("mtbMainLink", "创建老VC");
                this.mtbBizProxy = new MtbBizProxy(this);
                considerPlaybackLifecycle(this.mtbBizProxy);
            }
        }
        return this.mtbBizProxy;
    }

    private void considerPlaybackLifecycle(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e03efc24", new Object[]{this, dVar});
            return;
        }
        Lifecycle.State currentState = getLifecycle().getCurrentState();
        TLog.loge("mtbMainLink", "当前proxy生命周期:" + currentState);
        if (currentState == Lifecycle.State.INITIALIZED || !currentState.isAtLeast(Lifecycle.State.CREATED)) {
            return;
        }
        TLog.loge("mtbMainLink", "补偿proxy onCreate");
        dVar.a((Bundle) null);
        if (this.flRoot == null || this.parentContainerView == null) {
            return;
        }
        TLog.loge("mtbMainLink", "补偿proxy onCreateView");
        this.flRoot.removeAllViews();
        this.flRoot.addView(dVar.a(LayoutInflater.from(requireContext()), this.parentContainerView, null), -1, -1);
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        nwv.a(i.b.MEASURE_ONCREATE);
        nwv.f("======onCreate");
        MytaobaoApplication.isPageCreated = true;
        mxf.c(o.f18229a.a(this).c());
        ensureMtbBizProxy().a(bundle);
        nwv.e(i.b.MEASURE_ONCREATE);
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        nwv.a("onCreateView");
        this.parentContainerView = viewGroup;
        View a2 = ensureMtbBizProxy().a(layoutInflater, viewGroup, bundle);
        if (this.flRoot == null) {
            this.flRoot = new FrameLayout(layoutInflater.getContext());
            this.flRoot.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.flRoot.addView(a2, -1, -1);
        }
        nwv.e("onCreateView");
        return this.flRoot;
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        nwv.a("onResume");
        ensureMtbBizProxy().d();
        nwv.e("onResume");
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        ensureMtbBizProxy();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        ensureMtbBizProxy().f();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        ensureMtbBizProxy().h();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ensureMtbBizProxy().j();
        super.onDestroy();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        ensureMtbBizProxy().i();
        super.onDestroyView();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        ensureMtbBizProxy().a(context);
    }

    @Override // com.taobao.tao.TBBaseFragment
    public void handleLoginAction(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e52feba", new Object[]{this, loginAction});
        } else {
            ensureMtbBizProxy().a(loginAction);
        }
    }
}
