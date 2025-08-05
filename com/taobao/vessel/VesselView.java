package com.taobao.vessel;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.vessel.base.VesselBaseView;
import com.taobao.vessel.local.VesselNativeView;
import com.taobao.vessel.utils.VesselType;
import com.taobao.vessel.utils.b;
import com.taobao.vessel.utils.c;
import com.taobao.vessel.web.VesselWebView;
import com.taobao.vessel.weex.VesselWeexView;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.adapter.IWXComputeScreenAdapter;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.rgt;
import tb.rgu;
import tb.rgv;
import tb.rgw;
import tb.rgy;

/* loaded from: classes9.dex */
public class VesselView extends VesselParentView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IWXComputeScreenAdapter mComputeScreenAdapter;
    private boolean mDoNotCallCoreDestroy;
    public boolean mDowngradeEnable;

    /* renamed from: com.taobao.vessel.VesselView$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23443a = new int[VesselType.values().length];

        static {
            try {
                f23443a[VesselType.Weex.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23443a[VesselType.Web.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23443a[VesselType.Native.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(-456757823);
    }

    public static /* synthetic */ Object ipc$super(VesselView vesselView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1632570124:
                super.onScrollRightOrLeftEdge((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -1553366115:
                super.onScrollToTop((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1406763059:
                super.setDowngradeUrl((String) objArr[0]);
                return null;
            case -1249006439:
                super.onScrollToBottom((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -1209090403:
                super.setOnScrollViewListener((rgv) objArr[0]);
                return null;
            case -1014233709:
                super.onLoadFinish((View) objArr[0]);
                return null;
            case -847870242:
                super.setInterceptException(((Boolean) objArr[0]).booleanValue());
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -131487228:
                super.onLoadStart();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 442576194:
                return new Boolean(super.refresh(objArr[0]));
            case 797441118:
                super.onPause();
                return null;
            case 1125809207:
                super.setVesselViewCallback((rgw) objArr[0]);
                return null;
            case 1252973456:
                super.setShowLoading(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1304591058:
                super.setOnLoadListener((rgu) objArr[0]);
                return null;
            case 1320987706:
                return super.getVesselView();
            case 1568951796:
                return super.getChildView();
            case 1785180258:
                return new Boolean(super.onScrollEnabled((View) objArr[0], ((Boolean) objArr[1]).booleanValue()));
            case 1862385775:
                super.releaseMemory();
                return null;
            case 2020098384:
                super.fireEvent((String) objArr[0], (Map) objArr[1]);
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.vessel.VesselParentView, android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ void fireEvent(String str, Map map) {
        super.fireEvent(str, map);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ View getChildView() {
        return super.getChildView();
    }

    @Override // com.taobao.vessel.VesselParentView
    @Deprecated
    public /* bridge */ /* synthetic */ View getVesselView() {
        return super.getVesselView();
    }

    @Override // com.taobao.vessel.VesselParentView, tb.rgx
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.taobao.vessel.VesselParentView, android.view.ViewGroup
    public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.taobao.vessel.VesselParentView, tb.rgx
    public /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    @Override // com.taobao.vessel.VesselParentView, tb.rgx
    public /* bridge */ /* synthetic */ void onResume() {
        super.onResume();
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView, tb.rgv
    public /* bridge */ /* synthetic */ boolean onScrollEnabled(View view, boolean z) {
        return super.onScrollEnabled(view, z);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView, tb.rgv
    public /* bridge */ /* synthetic */ void onScrollRightOrLeftEdge(View view, int i, int i2) {
        super.onScrollRightOrLeftEdge(view, i, i2);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView, tb.rgv
    public /* bridge */ /* synthetic */ void onScrollToBottom(View view, int i, int i2) {
        super.onScrollToBottom(view, i, i2);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView, tb.rgv
    public /* bridge */ /* synthetic */ void onScrollToTop(View view, int i, int i2) {
        super.onScrollToTop(view, i, i2);
    }

    @Override // com.taobao.vessel.VesselParentView, tb.rgx
    public /* bridge */ /* synthetic */ void onStart() {
        super.onStart();
    }

    @Override // com.taobao.vessel.VesselParentView, tb.rgx
    public /* bridge */ /* synthetic */ void onStop() {
        super.onStop();
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ boolean refresh(Object obj) {
        return super.refresh(obj);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ void releaseMemory() {
        super.releaseMemory();
    }

    @Override // com.taobao.vessel.VesselParentView
    public /* bridge */ /* synthetic */ void setDowngradeUrl(String str) {
        super.setDowngradeUrl(str);
    }

    @Override // com.taobao.vessel.VesselParentView
    public /* bridge */ /* synthetic */ void setInterceptException(boolean z) {
        super.setInterceptException(z);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ void setOnLoadListener(rgu rguVar) {
        super.setOnLoadListener(rguVar);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ void setOnScrollViewListener(rgv rgvVar) {
        super.setOnScrollViewListener(rgvVar);
    }

    @Override // com.taobao.vessel.VesselParentView
    public /* bridge */ /* synthetic */ void setShowLoading(boolean z) {
        super.setShowLoading(z);
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
    public /* bridge */ /* synthetic */ void setVesselViewCallback(rgw rgwVar) {
        super.setVesselViewCallback(rgwVar);
    }

    public VesselView(Context context) {
        super(context);
        this.mDowngradeEnable = true;
        this.mDoNotCallCoreDestroy = false;
    }

    public VesselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDowngradeEnable = true;
        this.mDoNotCallCoreDestroy = false;
    }

    public VesselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDowngradeEnable = true;
        this.mDoNotCallCoreDestroy = false;
    }

    public void setDoNotCallCoreDestroy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc3e756", new Object[]{this, new Boolean(z)});
        } else {
            this.mDoNotCallCoreDestroy = z;
        }
    }

    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else {
            loadUrl(str, null);
        }
    }

    @Override // com.taobao.vessel.VesselParentView, com.taobao.vessel.base.VesselBaseView
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
        if (vesselType == null) {
            vesselType = b.a(str);
        }
        if (vesselType == null) {
            onLoadError(new rgy());
            return;
        }
        this.mOriginUrl = str;
        this.mOriginParams = obj;
        this.mCurrentVesselType = vesselType;
        destroyVesselProxyViewBeforeCreate();
        this.mProxyView = createView(getContext(), vesselType);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.mProxyView.getParent() == null) {
            addView(this.mProxyView, layoutParams);
        }
        if (this.mVesselViewCallback != null) {
            this.mProxyView.setVesselViewCallback(this.mVesselViewCallback);
        }
        this.mProxyView.mInstanceId = this.mInstanceId;
        this.mProxyView.setOnLoadListener(this);
        this.mProxyView.loadUrl(str, obj);
        this.mProxyView.setOnScrollViewListener(this);
    }

    private void destroyVesselProxyViewBeforeCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11763fc5", new Object[]{this});
        } else if (this.mProxyView == null || !com.taobao.vessel.utils.a.c()) {
        } else {
            this.mProxyView.onDestroy();
        }
    }

    public View getChildProxyView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3329b2b6", new Object[]{this}) : this.mProxyView;
    }

    public void setDowngradeEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73228b57", new Object[]{this, new Boolean(z)});
        } else {
            this.mDowngradeEnable = z;
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView, tb.rgu
    public void onLoadStart() {
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f829aa04", new Object[]{this});
            return;
        }
        super.onLoadStart();
        if ((this.mProxyView instanceof VesselWeexView) && (wXSDKInstance = ((VesselWeexView) this.mProxyView).getWXSDKInstance()) != null) {
            wXSDKInstance.a(this.mComputeScreenAdapter);
        }
        if (this.mNoDataMaskView == null) {
            return;
        }
        this.mNoDataMaskView.startLoading();
    }

    public void setComputeScreenAdapter(IWXComputeScreenAdapter iWXComputeScreenAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8dbef1", new Object[]{this, iWXComputeScreenAdapter});
        } else {
            this.mComputeScreenAdapter = iWXComputeScreenAdapter;
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void loadData(VesselType vesselType, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a4f349", new Object[]{this, vesselType, str, map});
            return;
        }
        if (vesselType == null) {
            vesselType = VesselType.Weex;
        }
        this.mCurrentVesselType = vesselType;
        if (this.mProxyView == null) {
            this.mProxyView = createView(getContext(), vesselType);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.mProxyView.getParent() == null) {
            addView(this.mProxyView, layoutParams);
        }
        if (this.mVesselViewCallback != null) {
            this.mProxyView.setVesselViewCallback(this.mVesselViewCallback);
        }
        this.mProxyView.mInstanceId = this.mInstanceId;
        this.mProxyView.setOnLoadListener(this);
        this.mProxyView.loadData(vesselType, str, map);
        this.mProxyView.setOnScrollViewListener(this);
    }

    @Override // com.taobao.vessel.base.VesselBaseView, tb.rgu
    public void onLoadFinish(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
            return;
        }
        super.onLoadFinish(view);
        if (this.mNoDataMaskView == null) {
            return;
        }
        this.mNoDataMaskView.finish();
    }

    @Override // com.taobao.vessel.base.VesselBaseView, tb.rgu
    public void onLoadError(rgy rgyVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
            return;
        }
        TLog.logd(TAG, "onLoadError");
        if (rgyVar != null) {
            str = rgyVar.b + "URL =" + this.mOriginUrl;
        } else {
            str = c.LOAD_ERROR;
        }
        b.a(c.LOAD_ERROR, str);
        if (!this.mDowngradeEnable || this.mCurrentVesselType == VesselType.Web) {
            if (this.mOnLoadListener == null) {
                return;
            }
            this.mOnLoadListener.onLoadError(rgyVar);
            return;
        }
        if (this.mOnLoadListener != null && (this.mOnLoadListener instanceof rgt)) {
            getDowngradeType();
        }
        if (downgrade(this.mOriginUrl)) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", this.mDowngradeUrl);
            if (this.mOnLoadListener == null) {
                return;
            }
            this.mOnLoadListener.onDowngrade(rgyVar, hashMap);
        } else if (this.mOnLoadListener == null) {
        } else {
            this.mOnLoadListener.onLoadError(rgyVar);
        }
    }

    private VesselType getDowngradeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselType) ipChange.ipc$dispatch("8f22e371", new Object[]{this});
        }
        return b.a(TextUtils.isEmpty(this.mDowngradeUrl) ? b.b(this.mOriginUrl) : this.mDowngradeUrl);
    }

    public boolean downgrade(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a97b754a", new Object[]{this, str})).booleanValue();
        }
        String str2 = TAG;
        TLog.logd(str2, "downgrade url:" + str);
        if (str == null) {
            return false;
        }
        removeAllViews();
        this.mProxyView.onDestroy();
        this.mProxyView = null;
        if (!TextUtils.isEmpty(this.mDowngradeUrl)) {
            createView(this.mDowngradeUrl);
            return true;
        } else if (this.mCurrentVesselType == VesselType.Weex) {
            this.mCurrentVesselType = VesselType.Web;
            loadUrl(this.mCurrentVesselType, str, null);
            return true;
        } else {
            String b = b.b(this.mOriginUrl);
            if (this.mCurrentVesselType != VesselType.Native || b == null) {
                return false;
            }
            this.mCurrentVesselType = b.a(b);
            this.mDowngradeUrl = b;
            loadUrl(this.mCurrentVesselType, str, null);
            return true;
        }
    }

    private VesselBaseView createView(Context context, VesselType vesselType) {
        VesselBaseView vesselWeexView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselBaseView) ipChange.ipc$dispatch("fedcac08", new Object[]{this, context, vesselType});
        }
        int i = AnonymousClass1.f23443a[vesselType.ordinal()];
        if (i == 1) {
            vesselWeexView = new VesselWeexView(context);
        } else if (i == 2) {
            vesselWeexView = new VesselWebView(context);
        } else if (i == 3) {
            vesselWeexView = new VesselNativeView(context);
        } else {
            vesselWeexView = new VesselWebView(context);
        }
        if (vesselWeexView instanceof VesselWebView) {
            ((VesselWebView) vesselWeexView).setDoNotCallCoreDestroy(this.mDoNotCallCoreDestroy);
        }
        return vesselWeexView;
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (this.mProxyView == null) {
        } else {
            this.mProxyView.onActivityResult(i, i2, intent);
        }
    }
}
