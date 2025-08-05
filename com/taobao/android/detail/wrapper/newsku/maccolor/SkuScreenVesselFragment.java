package com.taobao.android.detail.wrapper.newsku.maccolor;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.a;
import com.taobao.vessel.base.VesselBaseView;
import com.taobao.vessel.utils.VesselType;
import com.taobao.vessel.utils.b;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import java.util.Map;
import tb.epj;
import tb.kge;
import tb.rgu;
import tb.rgv;
import tb.rgw;
import tb.rgz;

/* loaded from: classes5.dex */
public class SkuScreenVesselFragment extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;
    private ViewGroup mContentView;
    public VesselBaseView.a mEventCallback;
    public boolean mIsShowloading;
    private rgz mNavigatorBarSetter;
    private rgu mOnLoadListener;
    private rgv mScrollViewListener;
    public String mVesselData;
    public Object mVesselParams;
    public VesselType mVesselType;
    public rgw mViewCallback;
    public String mUri = null;
    public String mDowngradeUrl = null;
    public boolean mDowngradeEnable = true;
    public VesselView mVesselView = null;

    public static /* synthetic */ Object ipc$super(SkuScreenVesselFragment skuScreenVesselFragment, String str, Object... objArr) {
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
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
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

    static {
        kge.a(-499701537);
        TAG = VesselView.class.getSimpleName();
    }

    public static SkuScreenVesselFragment newInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SkuScreenVesselFragment) ipChange.ipc$dispatch("2caff90e", new Object[0]) : new SkuScreenVesselFragment();
    }

    public static SkuScreenVesselFragment newInstance(a.C1011a c1011a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkuScreenVesselFragment) ipChange.ipc$dispatch("4370c39f", new Object[]{c1011a});
        }
        SkuScreenVesselFragment skuScreenVesselFragment = new SkuScreenVesselFragment();
        com.taobao.vessel.a.a().a(c1011a);
        return skuScreenVesselFragment;
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

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        getDialog().getWindow().requestFeature(1);
        super.onActivityCreated(bundle);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getDialog().getWindow().setLayout(-1, -1);
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VesselView vesselView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        getDialog().requestWindowFeature(1);
        this.mContentView = (ViewGroup) layoutInflater.inflate(R.layout.taosku_detail_weex_vessel_fullscreen_container, (ViewGroup) null);
        if (this.mVesselView == null) {
            this.mVesselView = new VesselView(getActivity());
        }
        rgw rgwVar = this.mViewCallback;
        if (rgwVar != null) {
            this.mVesselView.setVesselViewCallback(rgwVar);
        }
        if (this.mVesselType == null) {
            this.mVesselType = VesselType.Weex;
        }
        registerListener();
        try {
            if (!TextUtils.isEmpty(this.mUri)) {
                this.mVesselView.loadUrl(this.mVesselType, this.mUri, this.mVesselParams);
            } else {
                this.mVesselView.loadData(this.mVesselType, this.mVesselData);
            }
        } catch (Throwable unused) {
            epj.f().navigateTo(getContext(), this.mUri, null);
        }
        ViewGroup viewGroup2 = this.mContentView;
        if (viewGroup2 != null && (vesselView = this.mVesselView) != null) {
            viewGroup2.addView(vesselView);
        }
        return this.mContentView;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        if (WXEnvironment.isSupport()) {
            return;
        }
        i.a(TAG, "WXEnvironment.isSupport() == false");
        getActivity().finish();
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

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
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
        if (this.mNavigatorBarSetter == null) {
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
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        removeAllListeners();
        com.taobao.vessel.a.a().d();
        if (WXSDKEngine.getActivityNavBarSetter() != null && (WXSDKEngine.getActivityNavBarSetter() instanceof rgz)) {
            WXSDKEngine.setActivityNavBarSetter(null);
        }
        getActivity().finish();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        i.d(TAG, "onSaveInstanceState");
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
}
