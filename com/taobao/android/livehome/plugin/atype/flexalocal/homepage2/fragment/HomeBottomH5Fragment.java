package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taolivecontainer.TBLiveH5Container;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.mfj;
import tb.mfm;
import tb.psn;
import tb.pso;
import tb.sqt;

/* loaded from: classes6.dex */
public class HomeBottomH5Fragment extends HomeNormalFragment implements com.taobao.live.home.h5container.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HomeBottomH5Fragment";
    private int bottomBarHeight;
    private FrameLayout mH5RootView;
    private boolean mInit;
    private boolean mLowDevice = com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.d();
    private TBLiveH5Container mTBLiveH5Container;
    private com.taobao.taolivecontainer.b mTBLiveH5ContainerBuilder;
    public String mUrl;
    private int navBarHeight;
    private int statusBarHeight;

    static {
        kge.a(-148342610);
        kge.a(-1558015931);
    }

    public static /* synthetic */ Object ipc$super(HomeBottomH5Fragment homeBottomH5Fragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -2049624054:
                super.onTabResume();
                return null;
            case -1990827289:
                super.onTabPause();
                return null;
            case -1665651870:
                super.lazyInitView((View) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1126882532:
                return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 86521170:
                super.refreshFragment();
                return null;
            case 303778162:
                super.onTabAppear();
                return null;
            case 999033108:
                super.onTabDisappear();
                return null;
            case 1685858968:
                super.onScreenOrientationChange(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeNormalFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public String getTabName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fbf611af", new Object[]{this}) : TAG;
    }

    public static HomeBottomH5Fragment newInstance(Bundle bundle, sqt sqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeBottomH5Fragment) ipChange.ipc$dispatch("aedd5915", new Object[]{bundle, sqtVar});
        }
        HomeBottomH5Fragment homeBottomH5Fragment = new HomeBottomH5Fragment();
        homeBottomH5Fragment.setArguments(bundle);
        homeBottomH5Fragment.setLiveHomeContext(sqtVar);
        return homeBottomH5Fragment;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeNormalFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (this.mTabBottom == null) {
            return;
        }
        this.mUrl = this.mTabBottom.jumpUrl;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeNormalFragment, com.taobao.live.home.view.BaseLiveRecyclerFragment
    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        if (!this.mLowDevice) {
            return -1;
        }
        return R.layout.taolivehome_hotmarking_h5tab_flexalocal;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeNormalFragment, com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void lazyInitView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb82b62", new Object[]{this, view});
            return;
        }
        super.lazyInitView(view);
        initView();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (!this.mLowDevice) {
            this.mContainer.addView(layoutInflater.inflate(R.layout.taolivehome_hotmarking_h5tab_flexalocal, viewGroup, false));
            initView();
        }
        return this.mContainer;
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.mH5RootView = (FrameLayout) this.mContainer.findViewById(R.id.taolive_home_h5_container);
        this.bottomBarHeight = (int) ((this.mLiveHomeContext.m / com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a()) * 375.0f);
        this.navBarHeight = (int) ((this.mLiveHomeContext.l / com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a()) * 375.0f);
        this.statusBarHeight = (int) ((Math.max(this.mLiveHomeContext.k, this.mLiveHomeContext.j) / com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a()) * 375.0f);
        String format = String.format("window._tlHomeInfo={safeArea:{statusBarHeight:%d,navBarHeight:%d,bottomBarHeight:%d}}", Integer.valueOf(this.statusBarHeight), Integer.valueOf(this.navBarHeight), Integer.valueOf(this.bottomBarHeight));
        if (this.mTBLiveH5ContainerBuilder != null) {
            return;
        }
        mfj.c(TAG, "onRenderView " + this + " new mTBLiveH5ContainerBuilder");
        this.mTBLiveH5ContainerBuilder = new com.taobao.taolivecontainer.b(getContext(), "LiveUltraHomeTab", new pso() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBottomH5Fragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pso
            public void a(String str, String str2, HashMap<String, String> hashMap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a507bab7", new Object[]{this, str, str2, hashMap});
                    return;
                }
                UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder(str, "Button-" + str2);
                uTControlHitBuilder.setProperties(hashMap);
                UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
            }

            @Override // tb.pso
            public void b(String str, String str2, HashMap<String, String> hashMap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab0b8616", new Object[]{this, str, str2, hashMap});
                } else {
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, "", "0", hashMap).build());
                }
            }

            @Override // tb.pso
            public void a(String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                } else {
                    TLog.loge(str, str2, str3);
                }
            }
        }, new psn() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBottomH5Fragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.psn
            public String a(String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3}) : OrangeConfig.getInstance().getConfig(str, str2, str3);
            }
        }, new String[]{format});
        this.mTBLiveH5ContainerBuilder.a(this);
        this.mTBLiveH5ContainerBuilder.a(this.mUrl);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d5380a", new Object[]{this});
            return;
        }
        super.onTabResume();
        if (this.mTBLiveH5Container == null) {
            return;
        }
        mfj.c(TAG, "onEvent " + this + " mTBLiveH5Container.onResume()");
        this.mTBLiveH5Container.onResume();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeNormalFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        super.onTabAppear();
        if (!this.mInit) {
            mfj.c(TAG, "onEvent " + this + " APPEAR mInit false");
            this.mInit = true;
            this.mTBLiveH5ContainerBuilder.b(this.mUrl);
            this.mTBLiveH5Container = this.mTBLiveH5ContainerBuilder.b();
            this.mTBLiveH5Container.setEnableWebViewGestureLogic(mfm.q());
            this.mH5RootView.addView(this.mTBLiveH5Container);
        }
        if (this.mTBLiveH5Container == null) {
            return;
        }
        mfj.c(TAG, "onEvent " + this + " mTBLiveH5Container.pageAppear()");
        this.mTBLiveH5Container.pageAppear();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895662e7", new Object[]{this});
            return;
        }
        super.onTabPause();
        if (this.mTBLiveH5Container == null) {
            return;
        }
        mfj.c(TAG, "onEvent " + this + " mTBLiveH5Container.onPause()");
        this.mTBLiveH5Container.onPause();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onTabDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8c0914", new Object[]{this});
            return;
        }
        super.onTabDisappear();
        if (this.mTBLiveH5Container == null) {
            return;
        }
        mfj.c(TAG, "onEvent " + this + " mTBLiveH5Container.pageDisAppear()");
        this.mTBLiveH5Container.pageDisAppear();
    }

    private void destroyH5tab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b8ad55", new Object[]{this});
            return;
        }
        if (this.mTBLiveH5Container != null) {
            mfj.c(TAG, "onEvent " + this + " mTBLiveH5Container.destroy()");
            this.mTBLiveH5Container.destroy();
        }
        if (this.mTBLiveH5ContainerBuilder == null) {
            return;
        }
        mfj.c(TAG, "onEvent " + this + " mTBLiveH5ContainerBuilder.destroy()");
        this.mTBLiveH5ContainerBuilder.e();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroyH5tab();
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        bundle.putSerializable(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_TAB_BOTTOM, this.mTabBottom);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.taobao.live.home.h5container.b
    public Map<String, Object> getTabData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b1e0b2e5", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("h5ContainerRenderType", "Native");
        hashMap.put("appear", Boolean.valueOf(this.mAppear));
        hashMap.put("tabBottom", JSONObject.toJSONString(this.mTabBottom));
        hashMap.put("bottomBarHeight", Integer.valueOf(this.bottomBarHeight));
        hashMap.put("navBarHeight", Integer.valueOf(this.navBarHeight));
        hashMap.put("statusBarHeight", Integer.valueOf(this.statusBarHeight));
        return hashMap;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void onScreenOrientationChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onScreenOrientationChange(z);
        if (this.mLiveHomeContext == null) {
            return;
        }
        float f = Globals.getApplication().getResources().getDisplayMetrics().widthPixels;
        this.bottomBarHeight = (int) ((this.mLiveHomeContext.m / f) * 375.0f);
        this.navBarHeight = (int) ((this.mLiveHomeContext.l / f) * 375.0f);
        this.statusBarHeight = (int) ((Math.max(this.mLiveHomeContext.k, this.mLiveHomeContext.j) / f) * 375.0f);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void refreshFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5283552", new Object[]{this});
            return;
        }
        super.refreshFragment();
        if (this.mTBLiveH5Container == null || this.mLiveHomeContext == null) {
            return;
        }
        if (this.mLiveHomeContext.l()) {
            this.mTBLiveH5Container.changeScreenLandscape();
        } else {
            this.mTBLiveH5Container.changeScreenPortrait();
        }
    }
}
