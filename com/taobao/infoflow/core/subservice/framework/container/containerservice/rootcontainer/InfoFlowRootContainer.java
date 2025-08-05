package com.taobao.infoflow.core.subservice.framework.container.containerservice.rootcontainer;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ldf;

/* loaded from: classes7.dex */
public class InfoFlowRootContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InfoFlowRootContainer";

    static {
        kge.a(-254658751);
    }

    public static /* synthetic */ Object ipc$super(InfoFlowRootContainer infoFlowRootContainer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1604649632:
                super.requestLayout();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public InfoFlowRootContainer(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onMeasure(i, i2);
        ldf.e(TAG, "InfoFlowRootContainer onMeasure 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onLayout(z, i, i2, i3, i4);
        ldf.e(TAG, "InfoFlowRootContainer onLayout 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.requestLayout();
        ldf.e(TAG, "InfoFlowRootContainer requestLayout 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            ldf.e(TAG, "InfoFlowRootContainer dispatchTouchEvent  ACTION_DOWN 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            return dispatchTouchEvent;
        } else if (action == 1) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
            ldf.e(TAG, "InfoFlowRootContainer dispatchTouchEvent  ACTION_UP 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + "ms");
            return dispatchTouchEvent2;
        } else {
            return super.dispatchTouchEvent(motionEvent);
        }
    }
}
