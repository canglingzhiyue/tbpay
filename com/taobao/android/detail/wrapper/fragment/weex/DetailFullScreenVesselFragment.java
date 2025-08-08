package com.taobao.android.detail.wrapper.fragment.weex;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
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
import tb.ecu;
import tb.epj;
import tb.kge;
import tb.rgu;
import tb.rgv;
import tb.rgw;
import tb.rgz;

/* loaded from: classes5.dex */
public class DetailFullScreenVesselFragment extends DialogFragment {
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

    public static /* synthetic */ Object ipc$super(DetailFullScreenVesselFragment detailFullScreenVesselFragment, String str, Object... objArr) {
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
            case 462397159:
                super.onDestroyView();
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
        kge.a(975926472);
        TAG = VesselView.class.getSimpleName();
    }

    public static DetailFullScreenVesselFragment newInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailFullScreenVesselFragment) ipChange.ipc$dispatch("e315f1e1", new Object[0]) : new DetailFullScreenVesselFragment();
    }

    public static DetailFullScreenVesselFragment newInstance(a.C1011a c1011a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailFullScreenVesselFragment) ipChange.ipc$dispatch("aeb219f0", new Object[]{c1011a});
        }
        DetailFullScreenVesselFragment detailFullScreenVesselFragment = new DetailFullScreenVesselFragment();
        a.a().a(c1011a);
        return detailFullScreenVesselFragment;
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
        try {
            getDialog().getWindow().requestFeature(1);
        } catch (Throwable unused) {
        }
        super.onActivityCreated(bundle);
        try {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getDialog().getWindow().setLayout(-1, -1);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VesselView vesselView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        try {
            getDialog().requestWindowFeature(1);
        } catch (Throwable unused) {
        }
        this.mContentView = (ViewGroup) layoutInflater.inflate(R.layout.x_detail_weex_vessel_fullscreen_container, viewGroup, false);
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
            try {
                if (!StringUtils.isEmpty(this.mUri)) {
                    this.mVesselView.loadUrl(this.mVesselType, this.mUri, this.mVesselParams);
                } else {
                    this.mVesselView.loadData(this.mVesselType, this.mVesselData);
                }
            } catch (Throwable unused2) {
                epj.f().navigateTo(getContext(), this.mUri, null);
            }
        } catch (Throwable unused3) {
            i.a(TAG, "选择配送区域二级跳转至纯WeexActivity容器失败！");
        }
        if (this.mContentView != null && (vesselView = this.mVesselView) != null) {
            vesselView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.mContentView.addView(this.mVesselView);
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
        moveUp();
        alphaDown(this.mContentView);
        moveUp();
        if (!ecu.z || WXEnvironment.isCPUSupport()) {
            return;
        }
        i.a(TAG, "WXEnvironment.isSupport() == false");
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

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
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
        a.a().d();
        if (WXSDKEngine.getActivityNavBarSetter() != null && (WXSDKEngine.getActivityNavBarSetter() instanceof rgz)) {
            WXSDKEngine.setActivityNavBarSetter(null);
        }
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.onDestroy();
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

    public void disappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c72aaa", new Object[]{this});
            return;
        }
        alphaUp(this.mContentView);
        moveDown();
    }

    public void alphaDown(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99fdd1cb", new Object[]{this, view});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        view.startAnimation(alphaAnimation);
    }

    public void alphaUp(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43fec832", new Object[]{this, view});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        view.startAnimation(alphaAnimation);
    }

    public void moveUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4dd14d3", new Object[]{this});
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(300L);
        this.mContentView.startAnimation(translateAnimation);
    }

    public void moveDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("477ec71a", new Object[]{this});
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.detail.wrapper.fragment.weex.DetailFullScreenVesselFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    DetailFullScreenVesselFragment.this.dismiss();
                }
            }
        });
        this.mContentView.startAnimation(translateAnimation);
    }
}
