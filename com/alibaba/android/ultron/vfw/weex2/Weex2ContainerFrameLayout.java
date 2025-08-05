package com.alibaba.android.ultron.vfw.weex2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.p;
import java.util.ArrayList;
import java.util.Map;
import tb.jvq;
import tb.kge;

/* loaded from: classes2.dex */
public class Weex2ContainerFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_VIEW_APPEAR = "viewAppear";
    private static final String EVENT_VIEW_DISAPPEAR = "viewDisappear";
    private static final String KEY_GESTURE_STATE = "state";
    private static final ArrayList<MotionEvent> mEvents;
    private boolean enableNestedScroll;
    private boolean mDispatchEventState;
    private String mGestureState;
    private p mMUSInstance;
    private b mWeex2EventDispatch;

    public static /* synthetic */ Object ipc$super(Weex2ContainerFrameLayout weex2ContainerFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != 2075560917) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
    }

    public static /* synthetic */ String access$002(Weex2ContainerFrameLayout weex2ContainerFrameLayout, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abbd5995", new Object[]{weex2ContainerFrameLayout, str});
        }
        weex2ContainerFrameLayout.mGestureState = str;
        return str;
    }

    public static /* synthetic */ b access$100(Weex2ContainerFrameLayout weex2ContainerFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f21954e3", new Object[]{weex2ContainerFrameLayout}) : weex2ContainerFrameLayout.mWeex2EventDispatch;
    }

    public static /* synthetic */ ArrayList access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("6033ab53", new Object[0]) : mEvents;
    }

    static {
        kge.a(985748711);
        mEvents = new ArrayList<>();
    }

    public void setWeex2EventDispatch(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df13b19", new Object[]{this, bVar});
        } else {
            this.mWeex2EventDispatch = bVar;
        }
    }

    public void setEnableNestedScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb5a504", new Object[]{this, new Boolean(z)});
        } else {
            this.enableNestedScroll = z;
        }
    }

    public Weex2ContainerFrameLayout(Context context) {
        super(context);
        this.mDispatchEventState = false;
        this.mGestureState = "default";
        this.enableNestedScroll = false;
    }

    public Weex2ContainerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDispatchEventState = false;
        this.mGestureState = "default";
        this.enableNestedScroll = false;
    }

    public Weex2ContainerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDispatchEventState = false;
        this.mGestureState = "default";
        this.enableNestedScroll = false;
    }

    public void initWeex2Instance(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a4a8050", new Object[]{this, pVar});
            return;
        }
        this.mMUSInstance = pVar;
        this.mMUSInstance.setGestureEventListener(new jvq() { // from class: com.alibaba.android.ultron.vfw.weex2.Weex2ContainerFrameLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jvq
            public void a(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                } else if (map == null || map.get("state") == null) {
                } else {
                    if (((Boolean) map.get("state")).booleanValue()) {
                        Weex2ContainerFrameLayout.access$002(Weex2ContainerFrameLayout.this, "receive");
                        return;
                    }
                    Weex2ContainerFrameLayout.access$002(Weex2ContainerFrameLayout.this, "reject");
                    if (Weex2ContainerFrameLayout.access$100(Weex2ContainerFrameLayout.this) == null) {
                        return;
                    }
                    Weex2ContainerFrameLayout.access$100(Weex2ContainerFrameLayout.this).a(Weex2ContainerFrameLayout.access$200());
                    Weex2ContainerFrameLayout.access$200().clear();
                }
            }
        });
    }

    public void setDispatchEventState(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6bda5a", new Object[]{this, iDMComponent});
            return;
        }
        JSONObject fields = iDMComponent.getFields();
        if (fields == null || !fields.containsKey("config")) {
            return;
        }
        this.mDispatchEventState = Boolean.parseBoolean(fields.getJSONObject("config").getString("android_dispatchEvent"));
    }

    public MUSDKInstance getMUSInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("4b649f77", new Object[]{this});
        }
        p pVar = this.mMUSInstance;
        if (!(pVar instanceof MUSDKInstance)) {
            return null;
        }
        return (MUSDKInstance) pVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.enableNestedScroll) {
            return false;
        }
        if (!this.mDispatchEventState || this.mWeex2EventDispatch == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            mEvents.clear();
            this.mGestureState = "default";
        }
        mEvents.add(MotionEvent.obtain(motionEvent));
        if (this.mGestureState.equals("receive")) {
            mEvents.clear();
            return super.dispatchTouchEvent(motionEvent);
        } else if (this.mGestureState.equals("reject")) {
            this.mWeex2EventDispatch.a(mEvents);
            mEvents.clear();
            return false;
        } else {
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        p pVar = this.mMUSInstance;
        if (pVar == null) {
            return;
        }
        if (i == 8 || i == 4) {
            this.mMUSInstance.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, EVENT_VIEW_DISAPPEAR, null);
        } else {
            pVar.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, EVENT_VIEW_APPEAR, null);
        }
    }
}
