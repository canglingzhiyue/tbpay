package com.taobao.android.icart;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.engine.CartVEngineFactory;
import com.taobao.android.icart.engine.a;
import com.taobao.android.icart.utils.d;
import com.taobao.application.common.c;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.tao.Globals;
import com.taobao.tao.TBBaseFragment;
import com.taobao.tao.TBMainHost;
import tb.aaf;
import tb.aat;
import tb.abj;
import tb.akg;
import tb.bbz;
import tb.bex;
import tb.gns;
import tb.goc;
import tb.hoo;
import tb.ieu;
import tb.ifm;
import tb.jpr;
import tb.jqg;
import tb.kge;
import tb.qgs;

/* loaded from: classes5.dex */
public class UltronICartFragment extends TBBaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UltronICartFragment";
    private static boolean sHasCreated;
    private aat mCartVEngine;
    public long mInstanceCreateTimeMills;
    private final String mInstanceId;

    public static /* synthetic */ Object ipc$super(UltronICartFragment ultronICartFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1542694236:
                super.onSupportInvisible();
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
            case -198387616:
                return new Boolean(super.onPanelKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case 188604040:
                super.onStop();
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1950489833:
                super.onSupportVisible();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        }
    }

    public static /* synthetic */ aat access$000(UltronICartFragment ultronICartFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aat) ipChange.ipc$dispatch("c0026eb8", new Object[]{ultronICartFragment}) : ultronICartFragment.mCartVEngine;
    }

    static {
        kge.a(1078336876);
        sHasCreated = false;
        d.a();
    }

    public static boolean hasCreated() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dcb0a079", new Object[0])).booleanValue() : sHasCreated;
    }

    public UltronICartFragment() {
        String andResetInstanceId = CartVEngineFactory.getAndResetInstanceId();
        this.mInstanceId = andResetInstanceId == null ? ieu.a() : andResetInstanceId;
        Context context = TBMainHost.a().getContext();
        if (context instanceof Activity) {
            qgs.a((Activity) context, this.mInstanceId, true, "click");
        }
        this.mInstanceCreateTimeMills = System.currentTimeMillis();
        sHasCreated = true;
        boolean b = akg.b();
        if (!CartVEngineFactory.hasStartPrefetch() || !b) {
            jpr.a("iCart");
        }
        if (!b || CartVEngineFactory.isPrefetchSuccess()) {
            return;
        }
        context = context == null ? Globals.getApplication() : context;
        jqg.b(TAG, "开始执行preload");
        hoo.a(context);
    }

    @Override // com.taobao.tao.TBBaseFragment
    public void handleLoginAction(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e52feba", new Object[]{this, loginAction});
            return;
        }
        aat aatVar = this.mCartVEngine;
        if (aatVar == null) {
            return;
        }
        aatVar.a(loginAction);
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        gns.a(this);
        if (this.mCartVEngine == null) {
            this.mCartVEngine = getCartVEngine();
        }
        this.mCartVEngine.a(this);
        this.mCartVEngine.a(bundle);
        reportStartDuration(bundle);
        ifm.a(getContext(), UltronTradeHybridStage.ON_CONTAINER_CREATE);
    }

    private aat getCartVEngine() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (aat) ipChange.ipc$dispatch("b58d9729", new Object[]{this});
        }
        a aVar = null;
        try {
            if (TBMainHost.a().getContext() == getActivity()) {
                z = true;
            }
            if (z) {
                aat cartVEngine = CartVEngineFactory.getCartVEngine(getActivity());
                if (cartVEngine == null) {
                    CartVEngineFactory.updatePrefetchObjResult();
                    a aVar2 = new a(getActivity(), this.mInstanceId);
                    try {
                        CartVEngineFactory.putCartVEngine(aVar2);
                        cartVEngine = aVar2;
                    } catch (Throwable th) {
                        th = th;
                        aVar = aVar2;
                        if (aVar != null) {
                            aVar.a(this.mInstanceId);
                        }
                        throw th;
                    }
                }
                jqg.b("iCart", "cartPrefetch:" + cartVEngine.k());
                if (cartVEngine != null) {
                    cartVEngine.a(this.mInstanceId);
                }
                return cartVEngine;
            }
            a aVar3 = new a(getActivity(), this.mInstanceId);
            aVar3.a(this.mInstanceId);
            return aVar3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void reportStartDuration(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221cff6b", new Object[]{this, bundle});
        } else if (TBMainHost.a().getContext() != getActivity() || bundle != null) {
        } else {
            this.mCartVEngine.h().t().post(new Runnable() { // from class: com.taobao.android.icart.UltronICartFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        long j = UltronICartFragment.this.getArguments().getLong("CLICK_TIME") - c.a().a("startProcessSystemClockTime", -1L);
                        bbz h = UltronICartFragment.access$000(UltronICartFragment.this).h();
                        bex.c(h, "Page_ShoppingCart_MainTabCartLoad", "appLaunch2MainCartTabLoad=" + j);
                    } catch (Exception e) {
                        abj.a("getApmStartCartDurationError", e);
                    }
                }
            });
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle}) : this.mCartVEngine.a(layoutInflater, viewGroup, bundle);
    }

    @Override // com.taobao.tao.TBBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else {
            this.mCartVEngine.a(intent);
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mCartVEngine.a();
        aaf.a(getActivity());
        ifm.a(getContext(), UltronTradeHybridStage.ON_CONTAINER_DESTROY);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74421ce9", new Object[]{this});
            return;
        }
        super.onSupportVisible();
        if (!goc.a("SupportLifecycle", true)) {
            return;
        }
        this.mCartVEngine.I();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportInvisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40c5aa4", new Object[]{this});
            return;
        }
        super.onSupportInvisible();
        if (!goc.a("SupportLifecycle", true)) {
            return;
        }
        this.mCartVEngine.L();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.mCartVEngine.b();
        ifm.a(getContext(), UltronTradeHybridStage.ON_CONTAINER_PAUSE);
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        this.mCartVEngine.c();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.mCartVEngine.d();
        ifm.a(getContext(), UltronTradeHybridStage.ON_CONTAINER_RESUME);
    }

    @Override // com.taobao.tao.TBBaseFragment
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        aat aatVar = this.mCartVEngine;
        return aatVar != null ? aatVar.f() : "";
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        } else {
            super.onDestroyView();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.mCartVEngine.e();
    }

    @Override // com.taobao.tao.TBBaseFragment
    public boolean onPanelKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        aat aatVar = this.mCartVEngine;
        if (aatVar != null && aatVar.a(i, keyEvent)) {
            return true;
        }
        return super.onPanelKeyDown(i, keyEvent);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.mCartVEngine.a(i, i2, intent);
        }
    }
}
