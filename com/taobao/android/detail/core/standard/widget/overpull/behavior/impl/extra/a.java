package com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.extra;

import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.OverScroller;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.d;
import tb.arc;
import tb.bay;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String d = "AURAOverPullExtraHorizontalHandler";
    private int e = 0;
    private int f = 0;

    static {
        kge.a(1646624507);
    }

    public a() {
        emu.a("com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.extra.AURAOverPullExtraHorizontalHandler");
    }

    @Override // com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.extra.c
    public void a(CoordinatorLayout coordinatorLayout, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ab617aa", new Object[]{this, coordinatorLayout, view, new Integer(i)});
            return;
        }
        int width = coordinatorLayout.getWidth();
        if (width == 0) {
            width = bay.b();
        }
        coordinatorLayout.onLayoutChild(view, i);
        this.e = width;
        this.f = width - this.c;
        int left = view.getLeft();
        if (left == width) {
            return;
        }
        ViewCompat.offsetLeftAndRight(view, width - left);
    }

    @Override // com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.extra.c
    public void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5901133c", new Object[]{this, coordinatorLayout, view, view2, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
            return;
        }
        int left = view.getLeft();
        if (left == this.e && i < 0) {
            arc.a().a("AURAOverPullExtraHorizontalHandler", "onNestedPreScroll", d.CLOSE_TYPE_SKIP);
        } else if (left == (-this.c) && i > 0) {
            arc.a().a("AURAOverPullExtraHorizontalHandler", "onNestedPreScroll", d.CLOSE_TYPE_SKIP);
        } else {
            int i5 = -i;
            if (i5 == 0) {
                return;
            }
            iArr[0] = i;
            int i6 = left + i5;
            if (i5 <= 0 ? i6 < (i4 = this.f) : i6 > (i4 = this.e)) {
                i5 = i4 - left;
            }
            ViewCompat.offsetLeftAndRight(view, i5);
        }
    }

    @Override // com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.extra.c
    public float a(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9501e35a", new Object[]{this, view})).floatValue() : Math.abs(this.e - view.getLeft()) / this.c;
    }

    @Override // com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.extra.c
    public boolean a(View view, OverScroller overScroller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98f1d6e2", new Object[]{this, view, overScroller})).booleanValue();
        }
        int left = view.getLeft();
        if (left == this.e) {
            return false;
        }
        overScroller.startScroll(left, view.getTop(), this.e - left, 0);
        return true;
    }

    @Override // com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.extra.c
    public void b(View view, OverScroller overScroller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262c885f", new Object[]{this, view, overScroller});
        } else {
            ViewCompat.offsetLeftAndRight(view, overScroller.getCurrX() - view.getLeft());
        }
    }
}
