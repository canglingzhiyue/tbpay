package com.taobao.android.detail.wrapper.ext.event;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class EclairMotionEvent extends WrapMotionEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1282888066);
    }

    public EclairMotionEvent(MotionEvent motionEvent) {
        super(0, motionEvent);
        emu.a("com.taobao.android.detail.wrapper.ext.event.EclairMotionEvent");
    }

    @Override // com.taobao.android.detail.wrapper.ext.event.WrapMotionEvent
    public float getX(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("34782cca", new Object[]{this, new Integer(i)})).floatValue() : this.event.getX(i);
    }

    @Override // com.taobao.android.detail.wrapper.ext.event.WrapMotionEvent
    public float getY(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("362d0569", new Object[]{this, new Integer(i)})).floatValue() : this.event.getY(i);
    }

    @Override // com.taobao.android.detail.wrapper.ext.event.WrapMotionEvent
    public int getPointerCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3970b3c2", new Object[]{this})).intValue() : this.event.getPointerCount();
    }

    @Override // com.taobao.android.detail.wrapper.ext.event.WrapMotionEvent
    public int getPointerId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8205830d", new Object[]{this, new Integer(i)})).intValue() : this.event.getPointerId(i);
    }
}
