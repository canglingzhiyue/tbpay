package com.taobao.detail.rate.v2;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f17029a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;

    public g(d dVar) {
        this.f17029a = dVar;
    }

    public void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 2) {
            if ((actionMasked != 5 && actionMasked != 6) || motionEvent.getPointerCount() != 2) {
                return;
            }
            this.b = b(motionEvent);
        } else if (motionEvent.getPointerCount() <= 1) {
        } else {
            this.c = b(motionEvent);
            double degrees = Math.toDegrees(Math.atan(this.c)) - Math.toDegrees(Math.atan(this.b));
            if (Math.abs(degrees) <= 120.0d) {
                this.f17029a.a((float) degrees, (this.f + this.d) / 2.0f, (this.g + this.e) / 2.0f);
            }
            this.b = this.c;
        }
    }

    private float b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74207cae", new Object[]{this, motionEvent})).floatValue();
        }
        this.d = motionEvent.getX(0);
        this.e = motionEvent.getY(0);
        this.f = motionEvent.getX(1);
        this.g = motionEvent.getY(1);
        return (this.g - this.e) / (this.f - this.d);
    }
}
