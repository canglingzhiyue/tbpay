package com.taobao.mmad.render.dx.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import tb.kge;

/* loaded from: classes7.dex */
public class DXSwipeInteractEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private double angle;
    private float distance;
    private boolean isTriggerInteractSuccess;
    private float validSlideDistance;

    static {
        kge.a(1759608974);
    }

    public DXSwipeInteractEvent(long j, boolean z, float f, double d, float f2) {
        super(j);
        this.isTriggerInteractSuccess = z;
        this.distance = f;
        this.angle = d;
        this.validSlideDistance = f2;
    }

    public float getDistance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25f8a062", new Object[]{this})).floatValue() : this.distance;
    }

    public double getAngle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d6aecd12", new Object[]{this})).doubleValue() : this.angle;
    }

    public float getValidSlideDistance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c4d3c97", new Object[]{this})).floatValue() : this.validSlideDistance;
    }

    public boolean isTriggerInteractSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("843aceea", new Object[]{this})).booleanValue() : this.isTriggerInteractSuccess;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXSwipeInteractEvent{isTriggerInteractSuccess=" + this.isTriggerInteractSuccess + ", distance=" + this.distance + ", angle=" + this.angle + ", validSlideDistance=" + this.validSlideDistance + '}';
    }
}
