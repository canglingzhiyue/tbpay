package com.taobao.android.detail.wrapper.ext.event;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.DetailEvent;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class WrapMotionEvent extends DetailEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MotionEvent event;

    static {
        kge.a(-664769040);
    }

    public static /* synthetic */ Object ipc$super(WrapMotionEvent wrapMotionEvent, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public int getPointerCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3970b3c2", new Object[]{this})).intValue();
        }
        return 1;
    }

    public WrapMotionEvent(int i) {
        super(i);
        emu.a("com.taobao.android.detail.wrapper.ext.event.WrapMotionEvent");
    }

    public WrapMotionEvent(int i, MotionEvent motionEvent) {
        this(i);
        this.event = motionEvent;
    }

    public static WrapMotionEvent wrap(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WrapMotionEvent) ipChange.ipc$dispatch("28d7a4e7", new Object[]{motionEvent});
        }
        try {
            return new EclairMotionEvent(motionEvent);
        } catch (VerifyError unused) {
            return new WrapMotionEvent(0, motionEvent);
        }
    }

    public int getAction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c8fafa6", new Object[]{this})).intValue() : this.event.getAction();
    }

    public float getX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("754e2f39", new Object[]{this})).floatValue() : this.event.getX();
    }

    public float getX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34782cca", new Object[]{this, new Integer(i)})).floatValue();
        }
        verifyPointerIndex(i);
        return getX();
    }

    public float getY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("755c46ba", new Object[]{this})).floatValue() : this.event.getY();
    }

    public float getY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("362d0569", new Object[]{this, new Integer(i)})).floatValue();
        }
        verifyPointerIndex(i);
        return getY();
    }

    public int getPointerId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8205830d", new Object[]{this, new Integer(i)})).intValue();
        }
        verifyPointerIndex(i);
        return 0;
    }

    private void verifyPointerIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b465d46e", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            throw new IllegalArgumentException("Invalid pointer index for Donut/Cupcake");
        }
    }
}
