package com.taobao.vessel;

import android.content.Context;
import android.graphics.Canvas;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.base.VesselBaseView;
import com.taobao.vessel.utils.VesselType;
import com.taobao.vessel.utils.c;
import com.taobao.vessel.web.VesselWebApiPlugin;
import com.taobao.vessel.widget.NoDataMaskView;
import java.util.Map;
import tb.kge;
import tb.rgu;
import tb.rgv;
import tb.rgw;
import tb.rgy;

/* loaded from: classes9.dex */
public class VesselParentView extends VesselBaseView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;
    public boolean IsShowLoading;
    public boolean flag;
    public boolean interceptException;
    public VesselType mCurrentVesselType;
    public NoDataMaskView mNoDataMaskView;
    public VesselBaseView mProxyView;

    public static /* synthetic */ Object ipc$super(VesselParentView vesselParentView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1632570124:
                super.onScrollRightOrLeftEdge((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -1553366115:
                super.onScrollToTop((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -1249006439:
                super.onScrollToBottom((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -1209090403:
                super.setOnScrollViewListener((rgv) objArr[0]);
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 1125809207:
                super.setVesselViewCallback((rgw) objArr[0]);
                return null;
            case 1304591058:
                super.setOnLoadListener((rgu) objArr[0]);
                return null;
            case 1785180258:
                return new Boolean(super.onScrollEnabled((View) objArr[0], ((Boolean) objArr[1]).booleanValue()));
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void loadUrl(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b60501d6", new Object[]{this, str, obj});
        }
    }

    static {
        kge.a(-1783185269);
        TAG = VesselView.class.getSimpleName();
    }

    public VesselParentView(Context context) {
        this(context, null);
    }

    public VesselParentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VesselParentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.flag = true;
        this.interceptException = true;
        registerWindVane();
        initNodataMaskView();
    }

    private void initNodataMaskView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44432173", new Object[]{this});
        } else if (!this.IsShowLoading || this.mNoDataMaskView != null) {
        } else {
            this.mNoDataMaskView = new NoDataMaskView(getContext());
            this.mNoDataMaskView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            addView(this.mNoDataMaskView);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (needIntercept(motionEvent)) {
            if (motionEvent.getAction() == 0) {
                setParentScrollAble(true);
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() == 2 && this.flag) {
                setParentScrollAble(false);
            }
            this.flag = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Deprecated
    public View getVesselView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4ebcac3a", new Object[]{this}) : this.mProxyView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        } else if (this.interceptException) {
            try {
                super.dispatchDraw(canvas);
            } catch (Exception e) {
                onLoadError(new rgy(e.getMessage(), e.getMessage(), c.NATIVE_TYPE));
            }
        } else {
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.interceptException) {
            try {
                return super.dispatchTouchEvent(motionEvent);
            } catch (Exception e) {
                onLoadError(new rgy(e.getMessage(), e.getMessage(), c.NATIVE_TYPE));
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void fireEvent(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
            return;
        }
        VesselBaseView vesselBaseView = this.mProxyView;
        if (vesselBaseView == null) {
            return;
        }
        vesselBaseView.fireEvent(str, map);
    }

    @Override // com.taobao.vessel.base.VesselBaseView, tb.rgv
    public void onScrollToTop(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a369839d", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrollToTop(view, i, i2);
        setParentScrollAble(false);
        this.flag = true;
    }

    @Override // com.taobao.vessel.base.VesselBaseView, tb.rgv
    public void onScrollToBottom(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58dac99", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrollToBottom(view, i, i2);
        setParentScrollAble(false);
        this.flag = true;
    }

    @Override // com.taobao.vessel.base.VesselBaseView, tb.rgv
    public void onScrollRightOrLeftEdge(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb0f4f4", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrollRightOrLeftEdge(view, i, i2);
        setParentScrollAble(false);
        this.flag = true;
    }

    @Override // com.taobao.vessel.base.VesselBaseView, tb.rgv
    public boolean onScrollEnabled(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a67b062", new Object[]{this, view, new Boolean(z)})).booleanValue();
        }
        this.flag = true;
        return super.onScrollEnabled(view, z);
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public boolean refresh(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a612d42", new Object[]{this, obj})).booleanValue();
        }
        VesselBaseView vesselBaseView = this.mProxyView;
        if (vesselBaseView == null) {
            return false;
        }
        return vesselBaseView.refresh(obj);
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void releaseMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f01c06f", new Object[]{this});
            return;
        }
        VesselBaseView vesselBaseView = this.mProxyView;
        if (vesselBaseView != null) {
            vesselBaseView.releaseMemory();
            this.mProxyView = null;
        }
        removeAllViews();
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public View getChildView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("5d844df4", new Object[]{this}) : this.mProxyView;
    }

    public void setDowngradeUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac267fcd", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.mDowngradeUrl = str;
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void setVesselViewCallback(rgw rgwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431a7c37", new Object[]{this, rgwVar});
        } else {
            super.setVesselViewCallback(rgwVar);
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void setOnLoadListener(rgu rguVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc27ad2", new Object[]{this, rguVar});
        } else {
            super.setOnLoadListener(rguVar);
        }
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void setOnScrollViewListener(rgv rgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7eebe9d", new Object[]{this, rgvVar});
        } else {
            super.setOnScrollViewListener(rgvVar);
        }
    }

    public void setInterceptException(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd7686de", new Object[]{this, new Boolean(z)});
        } else {
            this.interceptException = z;
        }
    }

    public void setShowLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aaedb90", new Object[]{this, new Boolean(z)});
        } else {
            this.IsShowLoading = z;
        }
    }

    public void setParentScrollAble(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e88c7a", new Object[]{this, new Boolean(z)});
        } else if (getParent() == null) {
        } else {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // tb.rgx
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        VesselBaseView vesselBaseView = this.mProxyView;
        if (vesselBaseView == null) {
            return;
        }
        vesselBaseView.onStart();
    }

    @Override // tb.rgx
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        VesselBaseView vesselBaseView = this.mProxyView;
        if (vesselBaseView == null) {
            return;
        }
        vesselBaseView.onResume();
    }

    @Override // tb.rgx
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        VesselBaseView vesselBaseView = this.mProxyView;
        if (vesselBaseView == null) {
            return;
        }
        vesselBaseView.onPause();
    }

    @Override // tb.rgx
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        VesselBaseView vesselBaseView = this.mProxyView;
        if (vesselBaseView == null) {
            return;
        }
        vesselBaseView.onStop();
    }

    @Override // tb.rgx
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        VesselBaseView vesselBaseView = this.mProxyView;
        if (vesselBaseView == null) {
            return;
        }
        vesselBaseView.onDestroy();
    }

    private void registerWindVane() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19263394", new Object[]{this});
        } else {
            q.a(c.JS_BRIDGE_NAME, (Class<? extends e>) VesselWebApiPlugin.class);
        }
    }
}
