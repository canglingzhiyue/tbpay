package com.taobao.android.fluid.common.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.b;
import java.util.ArrayList;
import java.util.List;
import tb.iqw;
import tb.kge;
import tb.obw;
import tb.spz;

/* loaded from: classes5.dex */
public class RoundCornerLayout extends BaseRoundCornerLayout implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RoundCornerLayout";
    private String mAcceptGestureType;
    private boolean mCanPullInterceptHorizontal;
    private boolean mLockList;
    private String mWeexConsumeState;
    public final List<MotionEvent> pendingEvent;

    static {
        kge.a(564024559);
        kge.a(625737775);
    }

    public static /* synthetic */ Object ipc$super(RoundCornerLayout roundCornerLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != -407533570) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public boolean canInterceptVertical() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c35c74f3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public RoundCornerLayout(Context context) {
        super(context);
        this.pendingEvent = new ArrayList();
        this.mWeexConsumeState = obw.WEEX_STATE_NOT_EXIST;
        this.mCanPullInterceptHorizontal = true;
        this.mLockList = false;
    }

    public RoundCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.pendingEvent = new ArrayList();
        this.mWeexConsumeState = obw.WEEX_STATE_NOT_EXIST;
        this.mCanPullInterceptHorizontal = true;
        this.mLockList = false;
    }

    public boolean beenConsume() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1aa5a2bb", new Object[]{this})).booleanValue() : obw.WEEX_STATE_CONSUME.equals(this.mWeexConsumeState);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.b
    public boolean canPullIntercept(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcc734e2", new Object[]{this, str})).booleanValue();
        }
        if (iqw.k()) {
            boolean beenConsume = beenConsume();
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 127644138) {
                if (hashCode == 1802651544 && str.equals(b.PULL_HORIZONTAL_DRAG)) {
                    c = 0;
                }
            } else if (str.equals(b.PULL_VERTICAL_DRAG)) {
                c = 1;
            }
            if (c == 0) {
                beenConsume &= this.mCanPullInterceptHorizontal;
            } else if (c != 1) {
                return beenConsume;
            }
            return beenConsume && (TextUtils.equals(b.PULL_INIT, this.mAcceptGestureType) || str.equals(this.mAcceptGestureType));
        }
        return beenConsume();
    }

    public void clearPendingEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31204ab7", new Object[]{this});
        } else {
            this.pendingEvent.clear();
        }
    }

    public void doPendingEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13264f5", new Object[]{this});
            return;
        }
        for (MotionEvent motionEvent : this.pendingEvent) {
            onTouchEvent(motionEvent);
        }
        clearPendingEvent();
    }

    public String getWeexConsume() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4a201c94", new Object[]{this}) : this.mWeexConsumeState;
    }

    public void setWeexConsume(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119aa4ca", new Object[]{this, str});
            return;
        }
        spz.c(TAG, "setWeexConsume,beenConsume:" + str);
        this.mWeexConsumeState = str;
    }

    public boolean isLockList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65b876be", new Object[]{this})).booleanValue() : this.mLockList;
    }

    public void setLockList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204ddf22", new Object[]{this, new Boolean(z)});
        } else {
            this.mLockList = z;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!canInterceptVertical()) {
            addPendingEvent(motionEvent);
            int action = motionEvent.getAction();
            if ((action == 1 || action == 3) && obw.WEEX_STATE_NOT_CONSUME.equals(getWeexConsume())) {
                return onTouchEvent(motionEvent);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!canInterceptVertical() && ((action = motionEvent.getAction()) == 1 || action == 3)) {
            clearPendingEvent();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAcceptGestureType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9efc5f8a", new Object[]{this, str});
            return;
        }
        spz.c(TAG, "setAcceptGestureType,acceptGestureType:" + str);
        this.mAcceptGestureType = str;
    }

    public void setCanPullInterceptHorizontal(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47a62fa", new Object[]{this, new Boolean(z)});
        } else {
            this.mCanPullInterceptHorizontal = z;
        }
    }

    public void addPendingEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25b7d760", new Object[]{this, motionEvent});
            return;
        }
        if (motionEvent.getAction() == 0) {
            clearPendingEvent();
        }
        this.pendingEvent.add(MotionEvent.obtain(motionEvent));
    }
}
