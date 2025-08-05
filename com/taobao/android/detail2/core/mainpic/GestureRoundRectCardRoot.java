package com.taobao.android.detail2.core.mainpic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.widget.RoundRectCardRoot;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.fjt;
import tb.kge;
import tb.obw;

/* loaded from: classes5.dex */
public class GestureRoundRectCardRoot extends RoundRectCardRoot {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String WEEX_STATE_CONSUME;
    public static String WEEX_STATE_NOT_CONSUME;
    public static String WEEX_STATE_NOT_EXIST;
    private float downX;
    private float downY;
    private boolean hasMonitorGestureFive;
    private boolean hasMonitorGestureTen;
    private boolean isVerticalMode;
    private String mWeexConsumeState;
    public List<MotionEvent> pendingEvent;

    public static /* synthetic */ Object ipc$super(GestureRoundRectCardRoot gestureRoundRectCardRoot, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -407533570) {
            if (hashCode != 2075560917) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
    }

    static {
        kge.a(-1406603608);
        WEEX_STATE_CONSUME = obw.WEEX_STATE_CONSUME;
        WEEX_STATE_NOT_CONSUME = obw.WEEX_STATE_NOT_CONSUME;
        WEEX_STATE_NOT_EXIST = obw.WEEX_STATE_NOT_EXIST;
    }

    public GestureRoundRectCardRoot(Context context) {
        super(context);
        this.mWeexConsumeState = WEEX_STATE_NOT_EXIST;
        this.pendingEvent = new ArrayList();
    }

    public GestureRoundRectCardRoot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWeexConsumeState = WEEX_STATE_NOT_EXIST;
        this.pendingEvent = new ArrayList();
    }

    public GestureRoundRectCardRoot(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mWeexConsumeState = WEEX_STATE_NOT_EXIST;
        this.pendingEvent = new ArrayList();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getActionMasked() == 0) {
            clearPendingEvent();
            this.mWeexConsumeState = WEEX_STATE_NOT_EXIST;
        }
        if (WEEX_STATE_NOT_EXIST.equals(this.mWeexConsumeState)) {
            addPendingEvent(motionEvent);
            return super.dispatchTouchEvent(motionEvent);
        } else if (WEEX_STATE_NOT_CONSUME.equals(this.mWeexConsumeState)) {
            return findViewById(R.id.mainpic_feeds_pullbase).dispatchTouchEvent(motionEvent);
        } else {
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue() : super.onInterceptTouchEvent(motionEvent);
    }

    public void addPendingEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25b7d760", new Object[]{this, motionEvent});
            return;
        }
        if (motionEvent.getAction() == 0) {
            this.hasMonitorGestureFive = false;
            this.hasMonitorGestureTen = false;
            clearPendingEvent();
        }
        this.pendingEvent.add(MotionEvent.obtain(motionEvent));
        if (this.pendingEvent.size() > 5 && !this.hasMonitorGestureFive) {
            this.hasMonitorGestureFive = true;
            fjt.a("new_detail异常", "未处理手势事件超过5个");
        }
        if (this.pendingEvent.size() <= 10 || this.hasMonitorGestureTen) {
            return;
        }
        this.hasMonitorGestureTen = true;
        fjt.a("new_detail异常", "未处理手势事件超过10个");
    }

    public void doPendingEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13264f5", new Object[]{this});
            return;
        }
        for (MotionEvent motionEvent : this.pendingEvent) {
            findViewById(R.id.mainpic_feeds_pullbase).dispatchTouchEvent(motionEvent);
        }
        clearPendingEvent();
    }

    public void clearPendingEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31204ab7", new Object[]{this});
        } else {
            this.pendingEvent.clear();
        }
    }

    public void setWeexConsume(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119aa4ca", new Object[]{this, str});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "setWeexConsume: " + str);
        this.mWeexConsumeState = str;
    }
}
