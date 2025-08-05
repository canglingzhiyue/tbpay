package com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public StackLayoutManager.ScrollOrientation f12164a;
    public int b;
    public float c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    /* renamed from: com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.b$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12165a = new int[StackLayoutManager.ScrollOrientation.values().length];

        static {
            try {
                f12165a[StackLayoutManager.ScrollOrientation.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12165a[StackLayoutManager.ScrollOrientation.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12165a[StackLayoutManager.ScrollOrientation.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12165a[StackLayoutManager.ScrollOrientation.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(-1630933633);
    }

    public void a(StackLayoutManager stackLayoutManager, int i, float f, View view, int i2, a aVar) {
        int a2;
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d14289a", new Object[]{this, stackLayoutManager, new Integer(i), new Float(f), view, new Integer(i2), aVar});
            return;
        }
        this.h = stackLayoutManager.getWidth();
        this.i = stackLayoutManager.getHeight();
        this.j = i;
        View childAt = ((ViewGroup) view).getChildAt(0);
        if (childAt != null) {
            childAt.setClickable(true);
            childAt.setFocusable(true);
        }
        int decoratedMeasuredWidth = childAt == null ? stackLayoutManager.getDecoratedMeasuredWidth(view) : childAt.getMeasuredWidth();
        int decoratedMeasuredHeight = childAt == null ? stackLayoutManager.getDecoratedMeasuredHeight(view) : childAt.getMeasuredHeight();
        if (!this.d) {
            this.e = this.h - decoratedMeasuredWidth;
            this.f = this.i - decoratedMeasuredHeight;
            this.g = d();
            this.d = true;
        }
        if (i2 == 0) {
            a2 = b();
            b = c();
        } else {
            a2 = a(i2, f);
            b = b(i2, f);
        }
        float a3 = aVar.a(f, i2);
        int i3 = AnonymousClass1.f12165a[this.f12164a.ordinal()];
        if (i3 == 1) {
            a2 += (int) ((decoratedMeasuredWidth * (1.0f - a3)) / 2.0f);
        } else if (i3 == 2) {
            a2 -= (int) ((decoratedMeasuredWidth * (1.0f - a3)) / 2.0f);
        } else if (i3 == 3) {
            b += (int) ((decoratedMeasuredWidth * (1.0f - a3)) / 2.0f);
        } else if (i3 == 4) {
            b -= (int) ((decoratedMeasuredHeight * (1.0f - a3)) / 2.0f);
        }
        int i4 = a2;
        stackLayoutManager.layoutDecorated(view, i4, b, i4 + decoratedMeasuredWidth, b + decoratedMeasuredHeight);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.d = false;
        }
    }

    private int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        int i = AnonymousClass1.f12165a[this.f12164a.ordinal()];
        if (i == 1) {
            return this.g - (this.j % this.h);
        }
        if (i == 2) {
            int i2 = this.j;
            int i3 = this.h;
            if (i2 % i3 == 0) {
                return this.g;
            }
            return this.g + (i3 - (i2 % i3));
        }
        return this.e / 2;
    }

    private int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        int i = AnonymousClass1.f12165a[this.f12164a.ordinal()];
        if (i == 3) {
            return this.g - (this.j % this.i);
        }
        if (i == 4) {
            int i2 = this.j;
            int i3 = this.i;
            if (i2 % i3 == 0) {
                return this.g;
            }
            return this.g + (i3 - (i2 % i3));
        }
        return this.f / 2;
    }

    private int a(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c114778", new Object[]{this, new Integer(i), new Float(f)})).intValue();
        }
        int i2 = AnonymousClass1.f12165a[this.f12164a.ordinal()];
        if (i2 == 1) {
            return (int) (this.g + (this.c * (i - f)));
        }
        if (i2 == 2) {
            return (int) (this.g - (this.c * (i - f)));
        }
        return this.e / 2;
    }

    private int b(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90f782b9", new Object[]{this, new Integer(i), new Float(f)})).intValue();
        }
        int i2 = AnonymousClass1.f12165a[this.f12164a.ordinal()];
        if (i2 == 3) {
            return (int) (this.g + (this.c * (i - f)));
        }
        if (i2 == 4) {
            return (int) (this.g - (this.c * (i - f)));
        }
        return this.f / 2;
    }

    private int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        int i = AnonymousClass1.f12165a[this.f12164a.ordinal()];
        if (i == 1) {
            return (int) ((this.e - (this.c * Math.max(0, this.b - 1))) / 2.0f);
        }
        if (i == 2) {
            return (int) ((this.e + (this.c * Math.max(0, this.b - 1))) / 2.0f);
        }
        if (i == 3) {
            return (int) ((this.f - (this.c * Math.max(0, this.b - 1))) / 2.0f);
        }
        return (int) ((this.f + (this.c * Math.max(0, this.b - 1))) / 2.0f);
    }
}
