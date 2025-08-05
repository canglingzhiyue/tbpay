package com.taobao.search.m3.widget;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final int LAYOUT_TYPE_STACK = 1;
    public static final int LAYOUT_TYPE_WITH_MORE = 2;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<View> f19155a = new ArrayList<>();
    private int b = 1;
    private int c;
    private int d;

    static {
        kge.a(-380561206);
        Companion = new a(null);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-1562898542);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        q.c(view, "view");
        this.f19155a.add(view);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b = 2;
        }
    }

    public final void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        q.c(view, "view");
        this.f19155a.add(0, view);
    }

    public final void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        this.d = 0;
        Iterator<View> it = this.f19155a.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            View view = it.next();
            q.a((Object) view, "view");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            view.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, Integer.MIN_VALUE), i2);
            size -= (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin) + view.getMeasuredWidth();
            if (this.b == 2 && z) {
                z = false;
            } else if (view.getMeasuredHeight() > i3) {
                i3 = view.getMeasuredHeight();
                this.d = marginLayoutParams.topMargin + (view.getMeasuredHeight() / 2);
            }
        }
    }

    public final int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (this.b == 1) {
            Iterator<View> it = this.f19155a.iterator();
            while (it.hasNext()) {
                View view = it.next();
                q.a((Object) view, "view");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int measuredHeight = (this.d + i) - (view.getMeasuredHeight() / 2);
                view.layout(marginLayoutParams.leftMargin + i2, measuredHeight, i2 + marginLayoutParams.leftMargin + view.getMeasuredWidth(), view.getMeasuredHeight() + measuredHeight);
                i2 = view.getRight();
            }
        } else if (this.f19155a.size() >= 2) {
            View view2 = this.f19155a.get(0);
            q.a((Object) view2, "views[0]");
            View view3 = view2;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            int measuredHeight2 = (this.d + i) - (view3.getMeasuredHeight() / 2);
            view3.layout((i3 - marginLayoutParams2.rightMargin) - view3.getMeasuredWidth(), measuredHeight2, i3 - marginLayoutParams2.rightMargin, view3.getMeasuredHeight() + measuredHeight2);
            int size = this.f19155a.size();
            for (int i4 = 1; i4 < size; i4++) {
                View view4 = this.f19155a.get(i4);
                q.a((Object) view4, "views[index]");
                View view5 = view4;
                ViewGroup.LayoutParams layoutParams3 = view5.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                int measuredHeight3 = (this.d + i) - (view5.getMeasuredHeight() / 2);
                int i5 = i2 + marginLayoutParams3.leftMargin;
                view5.layout(i5, measuredHeight3, view5.getMeasuredWidth() + i5, view5.getMeasuredHeight() + measuredHeight3);
                i2 = i5 + view5.getMeasuredWidth() + marginLayoutParams3.rightMargin;
            }
        }
        return this.c;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.c;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        this.c = 0;
        Iterator<View> it = this.f19155a.iterator();
        int i = 0;
        while (it.hasNext()) {
            View view = it.next();
            if (this.b != 2 || !z) {
                q.a((Object) view, "view");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (view.getMeasuredHeight() > i) {
                    this.c = view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    i = view.getMeasuredHeight();
                }
            } else {
                z = false;
            }
        }
        return this.c;
    }
}
