package com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.extra;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.widget.OverScroller;

/* loaded from: classes4.dex */
public interface c {
    float a(View view);

    void a(float f, int i);

    void a(int i);

    void a(CoordinatorLayout coordinatorLayout, View view, int i);

    void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3);

    boolean a(View view, OverScroller overScroller);

    void b(View view, OverScroller overScroller);
}
