package com.alibaba.android.ultron.ext.vlayout;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;

/* loaded from: classes2.dex */
public interface e {
    int a(int i, int i2, boolean z);

    c a(int i);

    void a(View view);

    void a(View view, int i);

    void a(View view, int i, int i2, int i3, int i4);

    void a(VirtualLayoutManager.c cVar, View view);

    void a(VirtualLayoutManager.c cVar, View view, int i);

    void a_(View view, boolean z);

    void b(View view);

    void b(View view, int i, int i2, int i3, int i4);

    void b(View view, boolean z);

    boolean b();

    g c();

    void c(View view);

    g d();

    boolean d(View view);

    View d_();

    int e();

    void e(View view);

    int f();

    RecyclerView.ViewHolder f(View view);

    View findViewByPosition(int i);

    void g(View view);

    boolean g();

    View getChildAt(int i);

    int getChildCount();

    int getOrientation();

    int getPaddingBottom();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingTop();

    int getPosition(View view);

    boolean getReverseLayout();

    void measureChild(View view, int i, int i2);

    void measureChildWithMargins(View view, int i, int i2);
}
