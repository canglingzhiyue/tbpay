package com.taobao.weex.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.Constants;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXDiv;
import com.taobao.weex.ui.view.gesture.WXGesture;
import com.taobao.weex.ui.view.gesture.WXGestureObservable;
import com.taobao.weex.utils.WXExceptionUtils;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class WXFrameLayout extends BaseFrameLayout implements IRenderResult<WXDiv>, IRenderStatus<WXDiv>, WXGestureObservable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WeakReference<WXDiv> mWeakReference;
    private WXGesture wxGesture;

    static {
        kge.a(-331336788);
        kge.a(845412507);
        kge.a(601855591);
        kge.a(559910546);
    }

    public static /* synthetic */ Object ipc$super(WXFrameLayout wXFrameLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case -162797456:
                super.setTranslationX(((Number) objArr[0]).floatValue());
                return null;
            case 1841988059:
                super.dispatchDrawInterval((Canvas) objArr[0]);
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public WXFrameLayout(Context context) {
        super(context);
    }

    @Override // com.taobao.weex.ui.view.IRenderResult
    public WXDiv getComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXDiv) ipChange.ipc$dispatch("23e91c19", new Object[]{this});
        }
        WeakReference<WXDiv> weakReference = this.mWeakReference;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.taobao.weex.ui.view.IRenderStatus
    public void holdComponent(WXDiv wXDiv) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35e56", new Object[]{this, wXDiv});
        } else {
            this.mWeakReference = new WeakReference<>(wXDiv);
        }
    }

    @Override // com.taobao.weex.ui.view.gesture.WXGestureObservable
    public void registerGestureListener(WXGesture wXGesture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f22228", new Object[]{this, wXGesture});
        } else {
            this.wxGesture = wXGesture;
        }
    }

    @Override // com.taobao.weex.ui.view.gesture.WXGestureObservable
    public WXGesture getGestureListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXGesture) ipChange.ipc$dispatch("6443f4e7", new Object[]{this}) : this.wxGesture;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        WXGesture wXGesture = this.wxGesture;
        return wXGesture != null ? dispatchTouchEvent | wXGesture.onTouch(this, motionEvent) : dispatchTouchEvent;
    }

    @Override // com.taobao.weex.ui.view.BaseFrameLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        WXSDKInstance sDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            super.dispatchDrawInterval(canvas);
        } catch (Throwable th) {
            if (getComponent() != null) {
                notifyLayerOverFlow();
                if (getComponent() != null && (sDKInstance = WXSDKManager.getInstance().getSDKInstance(getComponent().getInstanceId())) != null && sDKInstance.ar() != null && !sDKInstance.ar().f) {
                    sDKInstance.ar().f = true;
                    reportLayerOverFlowError();
                }
            }
            WXLogUtils.e("Layer overflow limit error", WXLogUtils.getStackTrace(th));
        }
    }

    private int reportLayerOverFlowError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4ab0983", new Object[]{this})).intValue();
        }
        int calLayerDeep = calLayerDeep(this, 0);
        if (getComponent() != null) {
            String instanceId = getComponent().getInstanceId();
            WXErrorCode wXErrorCode = WXErrorCode.WX_RENDER_ERR_LAYER_OVERFLOW;
            WXExceptionUtils.commitCriticalExceptionRT(instanceId, wXErrorCode, "draw android view", WXErrorCode.WX_RENDER_ERR_LAYER_OVERFLOW.getErrorMsg() + "Layer overflow limit error: " + calLayerDeep + " layers!", null);
        }
        return calLayerDeep;
    }

    private int calLayerDeep(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5157301a", new Object[]{this, view, new Integer(i)})).intValue();
        }
        int i2 = i + 1;
        return (view.getParent() == null || !(view.getParent() instanceof View)) ? i2 : calLayerDeep((View) view.getParent(), i2);
    }

    public void notifyLayerOverFlow() {
        WXSDKInstance wXDiv;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2838751", new Object[]{this});
        } else if (getComponent() != null && (wXDiv = getComponent().getInstance()) != null && wXDiv.j() != null) {
            for (String str : wXDiv.j()) {
                WXComponent wXComponent = WXSDKManager.getInstance().getWXRenderManager().getWXComponent(wXDiv.N(), str);
                HashMap hashMap = new HashMap();
                hashMap.put("ref", str);
                hashMap.put(Constants.Weex.INSTANCEID, wXComponent.getInstanceId());
                wXComponent.fireEvent(Constants.Event.LAYEROVERFLOW, hashMap);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64be870", new Object[]{this, new Float(f)});
        } else {
            super.setTranslationX(f);
        }
    }
}
