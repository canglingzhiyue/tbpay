package com.alibaba.android.bindingx.core.internal;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f2247a;
    private long b;
    private double c;
    private double d;
    private float e;
    private float f;
    private boolean g;
    private int[] h = new int[2];
    private a i;

    /* loaded from: classes2.dex */
    public interface a {
        void a(s sVar);

        void b(s sVar);

        void c(s sVar);
    }

    static {
        kge.a(273414996);
    }

    public s(a aVar) {
        this.i = aVar;
    }

    private void b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74207cbe", new Object[]{this, motionEvent});
            return;
        }
        this.b = this.f2247a;
        this.f2247a = motionEvent.getEventTime();
        int findPointerIndex = motionEvent.findPointerIndex(this.h[0]);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.h[1]);
        if (findPointerIndex == -1 || findPointerIndex2 == -1) {
            return;
        }
        float x = motionEvent.getX(findPointerIndex);
        float y = motionEvent.getY(findPointerIndex);
        float x2 = motionEvent.getX(findPointerIndex2);
        float y2 = motionEvent.getY(findPointerIndex2);
        this.e = (x + x2) * 0.5f;
        this.f = (y + y2) * 0.5f;
        double d = -Math.atan2(y2 - y, x2 - x);
        if (Double.isNaN(this.c)) {
            this.d = mto.a.GEO_NOT_SUPPORT;
        } else {
            this.d = this.c - d;
        }
        this.c = d;
        double d2 = this.d;
        if (d2 > 3.141592653589793d) {
            this.d = d2 - 3.141592653589793d;
        } else if (d2 < -3.141592653589793d) {
            this.d = d2 + 3.141592653589793d;
        }
        double d3 = this.d;
        if (d3 > 1.5707963267948966d) {
            this.d = d3 - 3.141592653589793d;
        } else if (d3 >= -1.5707963267948966d) {
        } else {
            this.d = d3 + 3.141592653589793d;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.g) {
        } else {
            this.g = false;
            int[] iArr = this.h;
            iArr[0] = -1;
            iArr[1] = -1;
            a aVar = this.i;
            if (aVar != null) {
                aVar.c(this);
            }
            this.d = mto.a.GEO_NOT_SUPPORT;
            this.c = mto.a.GEO_NOT_SUPPORT;
        }
    }

    public boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
            this.h[0] = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.h[1] = -1;
        } else if (actionMasked == 1) {
            c();
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (!this.g) {
                    this.h[1] = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.g = true;
                    this.b = motionEvent.getEventTime();
                    this.c = Double.NaN;
                    b(motionEvent);
                    a aVar = this.i;
                    if (aVar != null) {
                        aVar.b(this);
                    }
                }
            } else if (actionMasked == 6 && this.g) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                int[] iArr = this.h;
                if (pointerId == iArr[0] || pointerId == iArr[1]) {
                    c();
                }
            }
        } else if (this.g) {
            int[] iArr2 = this.h;
            if (iArr2[0] != -1 && iArr2[1] != -1) {
                b(motionEvent);
                if (this.i != null && b() != mto.a.GEO_NOT_SUPPORT) {
                    this.i.a(this);
                }
            }
        }
        return true;
    }

    public double a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c56", new Object[]{this})).doubleValue() : this.d;
    }

    public double b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d7", new Object[]{this})).doubleValue() : Math.toDegrees(a());
    }
}
