package com.flybird;

import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBScrollView;
import java.util.Set;

/* loaded from: classes4.dex */
public class FBScrollHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f7172a;
    public final boolean b;
    public final View c;
    public FBScrollView.FBScrollViewListener d;
    public final float f;
    public boolean g;
    public boolean h;
    public int m;
    public float p;
    public float q;
    public Set<FBScrollView.FBScrollViewListener> e = null;
    public int i = 0;
    public int j = 0;
    public final Handler k = new Handler();
    public final Runnable l = new Runnable() { // from class: com.flybird.FBScrollHelper.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FBScrollHelper fBScrollHelper = FBScrollHelper.this;
            if (fBScrollHelper.b || fBScrollHelper.i != fBScrollHelper.f7172a.getScrollY()) {
                FBScrollHelper fBScrollHelper2 = FBScrollHelper.this;
                if (!fBScrollHelper2.b || fBScrollHelper2.j != fBScrollHelper2.f7172a.getScrollX()) {
                    FBScrollHelper.this.k.postDelayed(this, 50L);
                    FBScrollHelper fBScrollHelper3 = FBScrollHelper.this;
                    fBScrollHelper3.j = fBScrollHelper3.f7172a.getScrollX();
                    FBScrollHelper fBScrollHelper4 = FBScrollHelper.this;
                    fBScrollHelper4.i = fBScrollHelper4.f7172a.getScrollY();
                    return;
                }
            }
            FBScrollHelper fBScrollHelper5 = FBScrollHelper.this;
            FBScrollView.FBScrollViewListener fBScrollViewListener = fBScrollHelper5.d;
            if (fBScrollViewListener == null) {
                return;
            }
            fBScrollViewListener.onScrollStop(fBScrollHelper5.f7172a.getScrollX(), FBScrollHelper.this.f7172a.getScrollY(), FBScrollHelper.this.h);
        }
    };
    public float n = 0.0f;
    public float o = 0.0f;
    public final Rect r = new Rect();
    public boolean s = false;
    public int t = 0;
    public int u = 0;

    public FBScrollHelper(View view, View view2, boolean z) {
        this.f7172a = view;
        this.c = view2;
        this.b = z;
        this.f = FBTools.getDp(view.getContext()) * 10.0f;
    }

    public void a(int i, int i2, int i3, int i4) {
        FBScrollView.FBScrollViewListener fBScrollViewListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (!this.s && (fBScrollViewListener = this.d) != null) {
            fBScrollViewListener.onScrollChanged(i, i2, i3, i4, this.h);
            Set<FBScrollView.FBScrollViewListener> set = this.e;
            if (set == null) {
                return;
            }
            for (FBScrollView.FBScrollViewListener fBScrollViewListener2 : set) {
                fBScrollViewListener2.onScrollChanged(i, i2, i3, i4, this.h);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBScrollHelper.a(android.view.MotionEvent):boolean");
    }

    public final void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.s && this.d != null) {
            if ((this.b || Math.abs(i2 - this.u) <= 0) && (!this.b || Math.abs(i - this.t) <= 0)) {
                return;
            }
            this.d.onScrollChanged(i, i2, this.u, this.t, this.h);
            Set<FBScrollView.FBScrollViewListener> set = this.e;
            if (set != null) {
                for (FBScrollView.FBScrollViewListener fBScrollViewListener : set) {
                    fBScrollViewListener.onScrollChanged(i, i2, this.u, this.t, this.h);
                }
            }
            this.t = i;
            this.u = i2;
        }
    }
}
