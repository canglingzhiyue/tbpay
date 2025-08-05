package com.taobao.android.lightbuy;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightbuy.message.module.LightBuyMUSModule;
import com.taobao.android.lightbuy.performance.LightBuyStage;
import com.taobao.android.lightbuy.prefetch.LightBuyWeexPrefetch;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.android.purchase.aura.f;
import com.taobao.android.purchase.aura.utils.h;
import com.taobao.android.purchase.aura.utils.k;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.q;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.afa;
import tb.afi;
import tb.afk;
import tb.arc;
import tb.gws;
import tb.kge;
import tb.ljl;

/* loaded from: classes5.dex */
public class LightBuyFragment extends Fragment implements com.taobao.android.purchase.aura.a, com.taobao.android.purchase.aura.b, f, g, gws {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LightBuyFragment";
    private String mContainerType;
    private p mMUSInstance;
    private g mMUSRenderListener;
    private a mMyLayoutChanged;
    private ViewGroup mRootView;
    private FrameLayout mWeexContainer;
    private WeexStateReceiver mWeexStateReceiver;

    static {
        kge.a(-1703045332);
        kge.a(-1316612705);
        kge.a(1009639087);
        kge.a(-311268728);
        kge.a(98823612);
        kge.a(-20624053);
    }

    public static /* synthetic */ Object ipc$super(LightBuyFragment lightBuyFragment, String str, Object... objArr) {
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
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.purchase.aura.a
    public void dataUpdate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
        }
    }

    @Override // com.taobao.android.purchase.aura.b
    public String getRenderContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1507e0c4", new Object[]{this}) : "weex";
    }

    @Override // com.taobao.android.purchase.aura.b
    public void invokeEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
        }
    }

    @Override // com.taobao.android.purchase.aura.b
    public void refreshPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee313163", new Object[]{this, new Boolean(z)});
        }
    }

    public void setMUSInstanceRenderListener(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8158a647", new Object[]{this, gVar});
        } else {
            this.mMUSRenderListener = gVar;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        com.taobao.android.purchase.aura.utils.g.b(getActivity(), new HashMap<String, String>() { // from class: com.taobao.android.lightbuy.LightBuyFragment.1
            {
                put("renderContainer", "weex");
            }
        });
        LightBuyMUSModule.registerModule();
        Bundle arguments = getArguments();
        String string = arguments.getString("bundleUrl");
        this.mContainerType = arguments.getString("containerType");
        createWeexInstance(getActivity(), string, this.mContainerType);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.mWeexContainer = new FrameLayout(getContext());
        this.mWeexContainer.setLayoutParams(layoutParams);
        this.mMUSInstance.registerRenderListener(this);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
        } else {
            super.onAttach(context);
        }
    }

    private void rebindContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("912fb6e2", new Object[]{this, context});
            return;
        }
        p pVar = this.mMUSInstance;
        if (pVar == null) {
            arc.a().b("rebindContext mWeex2Instance is null", arc.a.a().b(TAG).a("LightBuy/common").a("info", "rebindContext mWeex2Instance is null").b());
        } else {
            pVar.resetContext(context);
        }
    }

    @Override // tb.gws
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else {
            getActivity().getSupportFragmentManager().popBackStack();
        }
    }

    @Override // tb.gws
    public Intent getContainerIntent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("dd388005", new Object[]{this}) : getActivity().getIntent();
    }

    /* loaded from: classes5.dex */
    public static class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final p f13281a;

        static {
            kge.a(-89038778);
            kge.a(-782512414);
        }

        public a(p pVar) {
            this.f13281a = pVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            } else {
                arc.a().b(" onLayoutChange ");
                this.f13281a.updateViewport();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class WeexStateReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final View f13280a;

        static {
            kge.a(1309670279);
        }

        public WeexStateReceiver(View view) {
            this.f13280a = view;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!"viewDidAppear".equals(intent.getAction()) || this.f13280a == null) {
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(50L);
                this.f13280a.startAnimation(alphaAnimation);
                this.f13280a.setVisibility(8);
            }
        }
    }

    public void registerBroadcast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb846e5", new Object[]{this});
        } else if (this.mWeexStateReceiver == null) {
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("viewDidAppear");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(getActivity()).registerReceiver(this.mWeexStateReceiver, intentFilter);
        }
    }

    public void unRegisterBroadcast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bad1cc", new Object[]{this});
        } else if (this.mWeexStateReceiver == null) {
        } else {
            LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(this.mWeexStateReceiver);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.mRootView == null) {
            this.mRootView = (ViewGroup) layoutInflater.inflate(R.layout.fragment_lightbuy_layout, viewGroup, false);
            LinearLayout linearLayout = (LinearLayout) this.mRootView.findViewById(R.id.purchase_skeleton);
            boolean equals = "fullScreen".equals(this.mContainerType);
            if (equals) {
                ((ViewGroup) this.mRootView.findViewById(R.id.purchase_statusBar)).setVisibility(0);
            }
            if (h.a((Activity) getActivity())) {
                linearLayout.addView(h.a(getActivity(), new View.OnClickListener() { // from class: com.taobao.android.lightbuy.LightBuyFragment.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (LightBuyFragment.this.getActivity() == null) {
                        } else {
                            LightBuyFragment.this.getActivity().finish();
                        }
                    }
                }, !equals));
            } else {
                this.mRootView.findViewById(R.id.title_action_bar).setVisibility(0);
                layoutInflater.inflate(R.layout.layout_purchase_skeleton, (ViewGroup) linearLayout, true);
            }
            ((FrameLayout) this.mRootView.findViewById(R.id.weex_container)).addView(this.mWeexContainer);
            if (afi.b()) {
                View findViewById = this.mRootView.findViewById(R.id.purchase_mask);
                findViewById.setVisibility(0);
                this.mWeexStateReceiver = new WeexStateReceiver(findViewById);
            }
            View renderRoot = this.mMUSInstance.getRenderRoot();
            if (renderRoot.getParent() != null) {
                ViewParent parent = renderRoot.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(renderRoot);
                }
            }
            this.mWeexContainer.addView(renderRoot);
            registerBroadcast();
        }
        return this.mRootView;
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
        } else {
            super.onDetach();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        afk.a(getActivity().getIntent());
        p pVar = this.mMUSInstance;
        if (pVar != null) {
            pVar.onActivityResume();
            if (Build.VERSION.SDK_INT >= 11) {
                if (this.mMyLayoutChanged == null) {
                    this.mMyLayoutChanged = new a(this.mMUSInstance);
                }
                this.mWeexContainer.addOnLayoutChangeListener(this.mMyLayoutChanged);
            }
        }
        k.a(k.d);
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        p pVar = this.mMUSInstance;
        if (pVar == null) {
            return;
        }
        pVar.onActivityStart();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        p pVar = this.mMUSInstance;
        if (pVar != null) {
            pVar.onActivityPause();
        }
        if (Build.VERSION.SDK_INT < 11 || (aVar = this.mMyLayoutChanged) == null) {
            return;
        }
        this.mWeexContainer.removeOnLayoutChangeListener(aVar);
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        p pVar = this.mMUSInstance;
        if (pVar == null) {
            return;
        }
        pVar.onActivityStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        } else {
            super.onDestroyView();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        FrameLayout frameLayout = this.mWeexContainer;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        onHighPerformanceStage();
        p pVar = this.mMUSInstance;
        if (pVar != null) {
            pVar.destroy();
        }
        afa.a().b(getContext());
        unRegisterBroadcast();
        k.a(k.e);
    }

    private void createWeexInstance(Context context, String str, String str2) {
        boolean z;
        String valueAsString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("251cdd23", new Object[]{this, context, str, str2});
        } else if (str == null) {
        } else {
            this.mMUSInstance = LightBuyWeexPrefetch.a(context, str);
            if (this.mMUSInstance != null) {
                VariationSet activate = UTABTest.activate("LightBuy", "weex_preheat");
                Variation variation = activate.getVariation("enablePreheat");
                if (variation != null) {
                    z = variation.getValueAsBoolean(false);
                } else {
                    arc.a().b("lightBuy没有获取到实验信息", arc.a.a().a("LightBuy/preload").b());
                    z = false;
                }
                Variation variation2 = activate.getVariation("abinfo");
                if (variation2 != null && (valueAsString = variation2.getValueAsString(null)) != null) {
                    com.taobao.android.lightbuy.performance.a.a().a("abTestInfo", valueAsString);
                    arc.a().b("lightBuy AB实验信息：" + valueAsString, arc.a.a().a("LightBuy/preload").b());
                }
            } else {
                arc.a().b("lightBuy没有获取到预热实例", arc.a.a().a("LightBuy/preload").b());
                com.taobao.android.lightbuy.performance.a.a().a("abTestInfo", "nullInstance");
                z = false;
            }
            if (str2 != null) {
                str = str + "&containerType=" + str2;
            }
            if (this.mMUSInstance == null || !z) {
                p pVar = this.mMUSInstance;
                if (pVar != null) {
                    pVar.destroy();
                }
                MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
                mUSInstanceConfig.d(true);
                mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
                mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
                mUSInstanceConfig.c(str);
                mUSInstanceConfig.f(false);
                mUSInstanceConfig.a(new com.taobao.android.weex_framework.f() { // from class: com.taobao.android.lightbuy.LightBuyFragment.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.f
                    public void onCreateView(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1414cfeb", new Object[]{this, view});
                        }
                    }
                });
                com.taobao.android.lightbuy.performance.a.a().a(LightBuyStage.WEEX_INIT);
                this.mMUSInstance = q.a().a(getContext(), mUSInstanceConfig);
                renderUrl(str, null, false);
                rebindContext(context);
                return;
            }
            rebindContext(context);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("lightbuyUrl", (Object) str);
            this.mMUSInstance.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.update", jSONObject);
        }
    }

    public void renderUrl(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9581892e", new Object[]{this, str, jSONObject, new Boolean(z)});
            return;
        }
        this.mMUSInstance.initWithURL(Uri.parse(str));
        if (z) {
            jSONObject = null;
        }
        this.mMUSInstance.render(jSONObject, null);
    }

    public String getPageMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18a6fdb1", new Object[]{this}) : "fullScreen".equals(this.mContainerType) ? TBBuyPageMode.fullPageMode : TBBuyPageMode.halfPageMode;
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        p pVar = this.mMUSInstance;
        if (pVar == null) {
            return;
        }
        pVar.onActivityResult(i, i2, intent);
    }

    @Override // com.taobao.android.purchase.aura.f
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        p pVar = this.mMUSInstance;
        if (pVar == null || !pVar.canGoBack()) {
            return false;
        }
        this.mMUSInstance.goBack();
        return true;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
            return;
        }
        arc.a().a("onForeground");
        g gVar = this.mMUSRenderListener;
        if (gVar == null) {
            return;
        }
        gVar.onForeground(pVar);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
            return;
        }
        arc.a().a("onPrepareSuccess");
        g gVar = this.mMUSRenderListener;
        if (gVar == null) {
            return;
        }
        gVar.onPrepareSuccess(pVar);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        arc.a().a(ljl.RENDER_SUCCESS_TIME);
        g gVar = this.mMUSRenderListener;
        if (gVar == null) {
            return;
        }
        gVar.onRenderSuccess(pVar);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        arc.a().a("onRenderFailed");
        g gVar = this.mMUSRenderListener;
        if (gVar == null) {
            return;
        }
        gVar.onRenderFailed(pVar, i, str, z);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            return;
        }
        arc.a().a("onRefreshSuccess");
        g gVar = this.mMUSRenderListener;
        if (gVar == null) {
            return;
        }
        gVar.onRefreshSuccess(pVar);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        arc.a().a("onRefreshFailed");
        g gVar = this.mMUSRenderListener;
        if (gVar == null) {
            return;
        }
        gVar.onRefreshFailed(pVar, i, str, z);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
            return;
        }
        arc.a().a("onJSException");
        g gVar = this.mMUSRenderListener;
        if (gVar == null) {
            return;
        }
        gVar.onJSException(pVar, i, str);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
            return;
        }
        arc.a().a("onFatalException");
        g gVar = this.mMUSRenderListener;
        if (gVar == null) {
            return;
        }
        gVar.onFatalException(pVar, i, str);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            return;
        }
        arc.a().a("onDestroyed");
        g gVar = this.mMUSRenderListener;
        if (gVar == null) {
            return;
        }
        gVar.onDestroyed(mUSDKInstance);
    }

    private void onHighPerformanceStage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcc0ff6", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("context", (Object) getActivity());
        com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().a(UltronTradeHybridStage.ON_CONTAINER_RESUME, "tabCart", jSONObject);
    }
}
