package com.taobao.vessel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.vessel.a;
import com.taobao.vessel.base.VesselBaseView;
import com.taobao.vessel.utils.VesselType;
import com.taobao.vessel.utils.b;
import com.taobao.vessel.weex.VesselWeexView;
import com.taobao.weex.WXSDKEngine;
import java.util.Map;
import tb.kge;
import tb.rgu;
import tb.rgv;
import tb.rgw;
import tb.rgz;

/* loaded from: classes9.dex */
public class VesselViewFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;
    private View mContentView;
    public VesselBaseView.a mEventCallback;
    public boolean mIsShowloading;
    private com.taobao.weex.appfram.navigator.a mNavigatorBarSetter;
    private rgu mOnLoadListener;
    private rgv mScrollViewListener;
    @Deprecated
    public View mTabbar;
    @Deprecated
    public View mToolbar;
    public String mVesselData;
    public Object mVesselParams;
    public VesselType mVesselType;
    public rgw mViewCallback;
    public VesselView mVesselView = null;
    public String mUri = null;
    public String mDowngradeUrl = null;
    public boolean mDowngradeEnable = true;

    public static /* synthetic */ Object ipc$super(VesselViewFragment vesselViewFragment, String str, Object... objArr) {
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
            case -1010986463:
                super.setUserVisibleHint(((Boolean) objArr[0]).booleanValue());
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

    static {
        kge.a(1260282673);
        TAG = VesselView.class.getSimpleName();
    }

    public static VesselViewFragment newInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselViewFragment) ipChange.ipc$dispatch("2db75a18", new Object[0]) : new VesselViewFragment();
    }

    public static VesselViewFragment newInstance(a.C1011a c1011a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselViewFragment) ipChange.ipc$dispatch("852b74e7", new Object[]{c1011a});
        }
        VesselViewFragment vesselViewFragment = new VesselViewFragment();
        a.a().a(c1011a);
        return vesselViewFragment;
    }

    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else {
            loadUrl(str, null);
        }
    }

    public void loadUrl(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b60501d6", new Object[]{this, str, obj});
        } else {
            loadUrl(null, str, obj);
        }
    }

    public void loadUrl(VesselType vesselType, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55ed11", new Object[]{this, vesselType, str, obj});
            return;
        }
        this.mVesselType = vesselType;
        if (this.mVesselType == null) {
            this.mVesselType = b.a(str);
        }
        this.mUri = str;
        this.mVesselParams = obj;
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.loadUrl(vesselType, str, obj);
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            setUrl(str, null);
        }
    }

    public void setUrl(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a4b4da", new Object[]{this, str, obj});
        } else {
            setUrl(null, str, obj);
        }
    }

    public void setUrl(VesselType vesselType, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82f76e15", new Object[]{this, vesselType, str, obj});
            return;
        }
        this.mVesselType = vesselType;
        if (this.mVesselType == null) {
            this.mVesselType = b.a(str);
        }
        this.mUri = str;
        this.mVesselParams = obj;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        TLog.logd(TAG, "onCreateView");
        if (this.mToolbar != null || this.mTabbar != null) {
            addBar(layoutInflater);
        } else {
            if (this.mVesselView == null) {
                this.mVesselView = new VesselView(getActivity());
            }
            this.mContentView = this.mVesselView;
        }
        registerListener();
        if (this.mVesselType == null) {
            this.mVesselType = VesselType.Weex;
        }
        if (!TextUtils.isEmpty(this.mUri)) {
            this.mVesselView.loadUrl(this.mVesselType, this.mUri, this.mVesselParams);
        } else if (!TextUtils.isEmpty(this.mVesselData)) {
            this.mVesselView.loadData(this.mVesselType, this.mVesselData);
        }
        return this.mContentView;
    }

    private void registerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[]{this});
            return;
        }
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        rgu rguVar = this.mOnLoadListener;
        if (rguVar != null) {
            vesselView.setOnLoadListener(rguVar);
        }
        rgw rgwVar = this.mViewCallback;
        if (rgwVar != null) {
            this.mVesselView.setVesselViewCallback(rgwVar);
        }
        rgv rgvVar = this.mScrollViewListener;
        if (rgvVar != null) {
            this.mVesselView.setOnScrollViewListener(rgvVar);
        }
        VesselBaseView.a aVar = this.mEventCallback;
        if (aVar != null) {
            this.mVesselView.setEventCallback(aVar);
        }
        this.mVesselView.setShowLoading(this.mIsShowloading);
        this.mVesselView.setDowngradeEnable(this.mDowngradeEnable);
        this.mVesselView.setDowngradeUrl(this.mDowngradeUrl);
    }

    private void removeAllListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76bf7c9", new Object[]{this});
            return;
        }
        this.mOnLoadListener = null;
        this.mViewCallback = null;
        this.mScrollViewListener = null;
        this.mEventCallback = null;
    }

    @Deprecated
    public void addBar(LayoutInflater layoutInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86957189", new Object[]{this, layoutInflater});
            return;
        }
        TLog.logd(TAG, "addBar");
        this.mContentView = layoutInflater.inflate(R.layout.vessel_panel, (ViewGroup) null);
        if (this.mToolbar != null) {
            ((ViewGroup) this.mContentView.findViewById(R.id.top_frame)).addView(this.mToolbar, new FrameLayout.LayoutParams(-1, -2));
        }
        if (this.mTabbar != null) {
            ((ViewGroup) this.mContentView.findViewById(R.id.bottom_frame)).addView(this.mTabbar, new FrameLayout.LayoutParams(-1, -2));
        }
        this.mVesselView = (VesselView) this.mContentView.findViewById(R.id.vesselview);
    }

    @Override // android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bd9221", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setUserVisibleHint(z);
        if (com.taobao.vessel.utils.a.a()) {
            return;
        }
        VesselWeexView vesselWeexView = null;
        VesselView vesselView = this.mVesselView;
        if (vesselView != null && vesselView.getChildProxyView() != null && (this.mVesselView.getChildProxyView() instanceof VesselWeexView)) {
            vesselWeexView = (VesselWeexView) this.mVesselView.getChildProxyView();
        }
        if (z && vesselWeexView != null) {
            vesselWeexView.onAppear();
        } else if (z || vesselWeexView == null) {
        } else {
            vesselWeexView.onDisappear();
        }
    }

    public void setDowngradeUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac267fcd", new Object[]{this, str});
            return;
        }
        this.mDowngradeUrl = str;
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.setDowngradeUrl(str);
    }

    public void setData(VesselType vesselType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166d9f38", new Object[]{this, vesselType, str});
        } else {
            loadData(vesselType, str, null);
        }
    }

    public void setData(VesselType vesselType, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cafae54d", new Object[]{this, vesselType, str, map});
            return;
        }
        this.mVesselType = vesselType;
        this.mVesselData = str;
        this.mVesselParams = map;
    }

    public void loadData(VesselType vesselType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7900d8bc", new Object[]{this, vesselType, str});
        } else {
            loadData(vesselType, str, null);
        }
    }

    public void loadData(VesselType vesselType, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a4f349", new Object[]{this, vesselType, str, map});
            return;
        }
        this.mVesselType = vesselType;
        this.mVesselData = str;
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.loadData(vesselType, str, map);
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.onStart();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (a.a().b() != null) {
            this.mNavigatorBarSetter = a.a().b();
        } else {
            this.mNavigatorBarSetter = new rgz(getActivity());
        }
        WXSDKEngine.setActivityNavBarSetter(this.mNavigatorBarSetter);
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.onResume();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.setVisibility(8);
        this.mVesselView.removeAllViews();
        this.mVesselView.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        removeAllListeners();
        if (WXSDKEngine.getActivityNavBarSetter() == null || !(WXSDKEngine.getActivityNavBarSetter() instanceof rgz)) {
            return;
        }
        WXSDKEngine.setActivityNavBarSetter(null);
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        TLog.logd(TAG, "onSaveInstanceState");
    }

    public VesselView getVesselView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselView) ipChange.ipc$dispatch("f7a8d76c", new Object[]{this}) : this.mVesselView;
    }

    public void setOnLoadListener(rgu rguVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc27ad2", new Object[]{this, rguVar});
            return;
        }
        this.mOnLoadListener = rguVar;
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.setOnLoadListener(rguVar);
    }

    public void setScrollViewListener(rgv rgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acaad5e", new Object[]{this, rgvVar});
            return;
        }
        this.mScrollViewListener = rgvVar;
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.setOnScrollViewListener(this.mScrollViewListener);
    }

    public void setVesselCallback(rgw rgwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb693df2", new Object[]{this, rgwVar});
            return;
        }
        this.mViewCallback = rgwVar;
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.setVesselViewCallback(this.mViewCallback);
    }

    public void setEventCallback(VesselBaseView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2d5a7c", new Object[]{this, aVar});
            return;
        }
        this.mEventCallback = aVar;
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.setEventCallback(aVar);
    }

    public void setIsLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da7f6abd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsShowloading = z;
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.setShowLoading(z);
    }

    public void setDowngradeEable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("493a6de1", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mDowngradeEnable = z;
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.setDowngradeEnable(this.mDowngradeEnable);
    }

    @Deprecated
    public void setToolbar(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942a6c12", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.mToolbar = view;
        }
    }

    @Deprecated
    public void setTabbar(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d0058b", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.mTabbar = view;
        }
    }
}
