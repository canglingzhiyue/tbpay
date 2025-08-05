package com.alibaba.poplayer.factory.view.base;

import android.view.MotionEvent;
import android.view.View;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.model.style.StyleModel;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.d;
import com.alibaba.poplayer.utils.c;
import com.alibaba.poplayer.utils.g;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DRAG_MODE_X = "x";
    public static final String DRAG_MODE_Y = "y";
    private final boolean e;
    private final String f;
    private int j;
    private int k;
    private PopRequest n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean g = false;
    private float h = 0.0f;
    private float i = 0.0f;
    private boolean l = false;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3180a = false;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    private boolean m = false;

    static {
        kge.a(-448953815);
    }

    public a(PopRequest popRequest, boolean z, String str) {
        int i = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.n = popRequest;
        this.e = z;
        this.f = str;
        BaseConfigItem c = d.c(popRequest);
        StyleModel.DragArea dragArea = (c == null || c.styleConfigs == null) ? null : c.styleConfigs.dragArea;
        this.o = dragArea != null ? (int) g.a(PopLayer.getReference().getApp(), Float.parseFloat(dragArea.offsetLeft)) : 0;
        this.p = dragArea != null ? (int) g.a(PopLayer.getReference().getApp(), Float.parseFloat(dragArea.offsetRight)) : 0;
        this.q = dragArea != null ? (int) g.a(PopLayer.getReference().getApp(), Float.parseFloat(dragArea.offsetTop)) : 0;
        this.q += popRequest.c();
        this.r = dragArea != null ? (int) g.a(PopLayer.getReference().getApp(), Float.parseFloat(dragArea.offsetBottom)) : i;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public boolean a(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff88d03", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (this.n == null || !this.e) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = motionEvent.getX();
            this.i = motionEvent.getY();
            this.g = false;
            c.a("DragHelper.onInterceptTouchEvent.ACTION_DOWN.mLastTouchX=%s.mLastTouchY=%s.", Float.valueOf(this.h), Float.valueOf(this.i));
            return false;
        } else if (actionMasked != 2) {
            return false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            boolean z = !"x".equals(this.f) ? !(!"y".equals(this.f) ? Math.abs(x - this.h) < 5.0f || Math.abs(y - this.i) < 5.0f : Math.abs(y - this.i) < 5.0f) : Math.abs(x - this.h) >= 5.0f;
            if (z) {
                this.m = true;
            }
            this.g = z;
            c.a("DragHelper.onInterceptTouchEvent.ACTION_MOVE.moveX=%s.moveY=%s.moved=%s", Float.valueOf(x), Float.valueOf(y), Boolean.valueOf(z));
            return z;
        }
    }

    public boolean b(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a23322", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (this.n == null || !this.e || !this.g) {
            return false;
        }
        View view2 = (View) view.getParent();
        int width = view2.getWidth();
        int height = view2.getHeight();
        if (motionEvent.getActionMasked() == 2) {
            this.f3180a = false;
            this.b = false;
            this.c = false;
            this.d = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int i = (int) (x - this.h);
            int i2 = (int) (y - this.i);
            float left = view.getLeft() + i;
            float top = view.getTop() + i2;
            float right = view.getRight() + i;
            float bottom = view.getBottom() + i2;
            c.a("DragHelper.onTouchEvent.ACTION_MOVE.dx=%s.dy=%s.mLeft=%s.mTop=%s.mRight=%s.mBottom=%s", Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(left), Float.valueOf(top), Float.valueOf(right), Float.valueOf(bottom));
            if (left < this.o) {
                this.b = true;
            }
            if (right > width - this.p) {
                this.f3180a = true;
            }
            if (top < this.q) {
                this.c = true;
            }
            if (bottom > height - this.r) {
                this.d = true;
            }
            if (!"y".equals(this.f) && !this.b && !this.f3180a) {
                view.offsetLeftAndRight(i);
                this.j += i;
            }
            if (!"x".equals(this.f) && !this.c && !this.d) {
                view.offsetTopAndBottom(i2);
                this.k += i2;
            }
            c.a("DragHelper.onTouchEvent.ACTION_MOVE.dx=%s.dy=%s.mDx=%s.mDy=%s.mLeft=%s.mTop=%s.mRight=%s.mBottom=%s.moveLeft=%s,moveLeft=%s.parentWidth=%s.parentHeight=%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.j), Integer.valueOf(this.k), Float.valueOf(left), Float.valueOf(top), Float.valueOf(right), Float.valueOf(bottom), Boolean.valueOf(this.b), Boolean.valueOf(this.f3180a), Integer.valueOf(width), Integer.valueOf(height));
        }
        return true;
    }

    public void a(View view, boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("829f006a", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.n == null || !this.e || !this.m) {
        } else {
            if ("x".equals(this.f)) {
                view.offsetLeftAndRight(this.j);
            } else if ("y".equals(this.f)) {
                view.offsetTopAndBottom(this.k);
            } else {
                view.offsetLeftAndRight(this.j);
                view.offsetTopAndBottom(this.k);
            }
        }
    }
}
