package com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class StackLayoutManager extends RecyclerView.LayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ScrollOrientation f12160a;
    private final b b;
    private final com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.a c;
    private final int d;
    private int e;
    private boolean f;
    private final boolean g;
    private ScrollOrientation h;
    private final boolean i;
    private int j;
    private a k;

    /* renamed from: com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12163a = new int[ScrollOrientation.values().length];

        static {
            try {
                f12163a[ScrollOrientation.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12163a[ScrollOrientation.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12163a[ScrollOrientation.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12163a[ScrollOrientation.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public enum ScrollOrientation {
        RIGHT,
        LEFT,
        BOTTOM,
        TOP,
        NONE
    }

    /* loaded from: classes5.dex */
    public interface a {
    }

    static {
        kge.a(-1315877417);
    }

    public static /* synthetic */ Object ipc$super(StackLayoutManager stackLayoutManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1238488515) {
            super.onAttachedToWindow((RecyclerView) objArr[0]);
            return null;
        } else if (hashCode == 1604649632) {
            super.requestLayout();
            return null;
        } else if (hashCode != 2011679854) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.smoothScrollToPosition((RecyclerView) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue());
            return null;
        }
    }

    public static /* synthetic */ ScrollOrientation a(StackLayoutManager stackLayoutManager, ScrollOrientation scrollOrientation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollOrientation) ipChange.ipc$dispatch("c3ade924", new Object[]{stackLayoutManager, scrollOrientation});
        }
        stackLayoutManager.h = scrollOrientation;
        return scrollOrientation;
    }

    public static /* synthetic */ void a(StackLayoutManager stackLayoutManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b35eae61", new Object[]{stackLayoutManager, new Integer(i)});
        } else {
            stackLayoutManager.a(i);
        }
    }

    public static /* synthetic */ void a(StackLayoutManager stackLayoutManager, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac225810", new Object[]{stackLayoutManager, recyclerView});
        } else {
            stackLayoutManager.a(recyclerView);
        }
    }

    public static /* synthetic */ boolean a(StackLayoutManager stackLayoutManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("585de0e6", new Object[]{stackLayoutManager})).booleanValue() : stackLayoutManager.g;
    }

    public static /* synthetic */ boolean a(StackLayoutManager stackLayoutManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b35eee36", new Object[]{stackLayoutManager, new Boolean(z)})).booleanValue();
        }
        stackLayoutManager.f = z;
        return z;
    }

    public static /* synthetic */ ScrollOrientation b(StackLayoutManager stackLayoutManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScrollOrientation) ipChange.ipc$dispatch("adb2bc1c", new Object[]{stackLayoutManager}) : stackLayoutManager.f12160a;
    }

    public static /* synthetic */ int c(StackLayoutManager stackLayoutManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1d140e93", new Object[]{stackLayoutManager})).intValue() : stackLayoutManager.e;
    }

    public static /* synthetic */ int d(StackLayoutManager stackLayoutManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7f6f2572", new Object[]{stackLayoutManager})).intValue() : stackLayoutManager.b();
    }

    public static /* synthetic */ boolean e(StackLayoutManager stackLayoutManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e1ca3c62", new Object[]{stackLayoutManager})).booleanValue() : stackLayoutManager.f;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f43ad1", new Object[]{this, recycler, state});
            return;
        }
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a();
        removeAndRecycleAllViews(recycler);
        if (getItemCount() > 0) {
            this.e = b(this.e);
            if (this.i) {
                b(recycler);
            } else {
                a(recycler);
            }
        }
        a(getItemCount() > 0 ? b() % getItemCount() : b());
    }

    private void a(RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3f5457", new Object[]{this, recycler});
            return;
        }
        int b = b();
        int min = Math.min(c(), getItemCount() - 1);
        float a2 = a();
        int i2 = min;
        while (i2 >= b) {
            View viewForPosition = recycler.getViewForPosition(i2);
            if (viewForPosition != null) {
                addView(viewForPosition);
                measureChild(viewForPosition, i, i);
                int i3 = i2 - b;
                this.b.a(this, this.e, a2, viewForPosition, i3, this.c);
                this.c.a(a2, viewForPosition, i3);
            }
            i2--;
            i = 0;
        }
        int i4 = b - 1;
        if (i4 >= 0) {
            a(recycler, recycler.getViewForPosition(i4));
        }
        int i5 = min + 1;
        if (i5 >= getItemCount()) {
            return;
        }
        a(recycler, recycler.getViewForPosition(i5));
    }

    private void a(RecyclerView.Recycler recycler, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4076bf1b", new Object[]{this, recycler, view});
        } else if (view == null) {
        } else {
            a(view);
            removeAndRecycleView(view, recycler);
        }
    }

    private void b(RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("375ad2f6", new Object[]{this, recycler});
            return;
        }
        int b = b();
        int c = c();
        float a2 = a();
        int i2 = c;
        while (i2 >= b) {
            View viewForPosition = recycler.getViewForPosition(i2 % getItemCount());
            if (viewForPosition != null) {
                addView(viewForPosition);
                measureChild(viewForPosition, i, i);
                int i3 = i2 - b;
                this.b.a(this, this.e, a2, viewForPosition, i3, this.c);
                this.c.a(a2, viewForPosition, i3);
            }
            i2--;
            i = 0;
        }
        int i4 = b - 1;
        if (i4 >= 0) {
            a(recycler, recycler.getViewForPosition(i4 % getItemCount()));
        }
        int i5 = c + 1;
        if (i5 >= getItemCount()) {
            return;
        }
        a(recycler, recycler.getViewForPosition(i5 % getItemCount()));
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    private int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (getWidth() == 0 || getHeight() == 0) {
            return 0;
        }
        int i = AnonymousClass3.f12163a[this.f12160a.ordinal()];
        if (i == 1) {
            return (int) Math.floor(this.e / getWidth());
        }
        if (i == 2) {
            return (int) Math.floor(this.e / getHeight());
        }
        if (i == 3) {
            return (int) ((getItemCount() - 1) - Math.ceil(this.e / getWidth()));
        }
        return (int) ((getItemCount() - 1) - Math.ceil(this.e / getHeight()));
    }

    private int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        int b = b();
        if (this.i) {
            return b + this.d;
        }
        return Math.min(b + this.d, getItemCount() - 1);
    }

    public float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue();
        }
        if (getWidth() == 0 || getHeight() == 0) {
            return 0.0f;
        }
        int i = AnonymousClass3.f12163a[this.f12160a.ordinal()];
        if (i == 1) {
            return (this.e % getWidth()) / getWidth();
        }
        if (i == 2) {
            return (this.e % getHeight()) / getHeight();
        }
        if (i == 3) {
            float width = 1.0f - ((this.e % getWidth()) / getWidth());
            if (width != 1.0f) {
                return width;
            }
            return 0.0f;
        }
        float height = 1.0f - ((this.e % getHeight()) / getHeight());
        if (height != 1.0f) {
            return height;
        }
        return 0.0f;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.k == null || !this.g || i == this.j) {
        } else {
            this.j = i;
        }
    }

    private int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = AnonymousClass3.f12163a[this.f12160a.ordinal()];
        int i3 = 500;
        if (i2 == 1 || i2 == 3) {
            int width = getWidth() * (getItemCount() - 1);
            if (!this.i) {
                i3 = 1;
            }
            return Math.max(Math.min(width * i3, i), 0);
        }
        int height = getHeight() * (getItemCount() - 1);
        if (!this.i) {
            i3 = 1;
        }
        return Math.max(Math.min(height * i3, i), 0);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("897f7fec", new Object[]{this, new Integer(i), recycler, state})).intValue() : a(i, recycler);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dc1b187e", new Object[]{this, new Integer(i), recycler, state})).intValue() : a(i, recycler);
    }

    private int a(int i, RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c452577", new Object[]{this, new Integer(i), recycler})).intValue();
        }
        int i2 = this.e + i;
        this.e = b(i2);
        int i3 = (this.e - i2) + i;
        if (i3 == 0) {
            return 0;
        }
        detachAndScrapAttachedViews(recycler);
        if (this.i) {
            b(recycler);
        } else {
            a(recycler);
        }
        return i3;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(final RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d1d5c3", new Object[]{this, recyclerView});
            return;
        }
        super.onAttachedToWindow(recyclerView);
        recyclerView.setOnFlingListener(new RecyclerView.OnFlingListener() { // from class: com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
                if (com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.c(r4.b) < (r4.b.getHeight() * (r4.b.getItemCount() - 1))) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
                com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.a(r4.b, true);
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
                if (com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.c(r4.b) < (r4.b.getWidth() * (r4.b.getItemCount() - 1))) goto L18;
             */
            @Override // android.support.v7.widget.RecyclerView.OnFlingListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onFling(int r5, int r6) {
                /*
                    r4 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.AnonymousClass1.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 3
                    r3 = 1
                    if (r1 == 0) goto L29
                    java.lang.Object[] r1 = new java.lang.Object[r2]
                    r2 = 0
                    r1[r2] = r4
                    java.lang.Integer r2 = new java.lang.Integer
                    r2.<init>(r5)
                    r1[r3] = r2
                    r5 = 2
                    java.lang.Integer r2 = new java.lang.Integer
                    r2.<init>(r6)
                    r1[r5] = r2
                    java.lang.String r5 = "8af30028"
                    java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    boolean r5 = r5.booleanValue()
                    return r5
                L29:
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r0 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    boolean r0 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.a(r0)
                    if (r0 == 0) goto Lbb
                    int[] r0 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.AnonymousClass3.f12163a
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r1 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$ScrollOrientation r1 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.b(r1)
                    int r1 = r1.ordinal()
                    r0 = r0[r1]
                    if (r0 == r3) goto L7e
                    if (r0 == r2) goto L7e
                    if (r6 <= 0) goto L4d
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$ScrollOrientation r6 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.ScrollOrientation.TOP
                L49:
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.a(r5, r6)
                    goto L59
                L4d:
                    if (r6 >= 0) goto L54
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$ScrollOrientation r6 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.ScrollOrientation.BOTTOM
                    goto L49
                L54:
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$ScrollOrientation r6 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.ScrollOrientation.NONE
                    goto L49
                L59:
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    int r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.c(r5)
                    if (r5 <= 0) goto Lb4
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    int r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.c(r5)
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r6 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    int r6 = r6.getHeight()
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r0 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    int r0 = r0.getItemCount()
                    int r0 = r0 - r3
                    int r6 = r6 * r0
                    if (r5 >= r6) goto Lb4
                L78:
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.a(r5, r3)
                    goto Lb4
                L7e:
                    if (r5 <= 0) goto L88
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$ScrollOrientation r6 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.ScrollOrientation.LEFT
                L84:
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.a(r5, r6)
                    goto L94
                L88:
                    if (r5 >= 0) goto L8f
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$ScrollOrientation r6 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.ScrollOrientation.RIGHT
                    goto L84
                L8f:
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$ScrollOrientation r6 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.ScrollOrientation.NONE
                    goto L84
                L94:
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    int r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.c(r5)
                    if (r5 <= 0) goto Lb4
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    int r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.c(r5)
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r6 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    int r6 = r6.getWidth()
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r0 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    int r0 = r0.getItemCount()
                    int r0 = r0 - r3
                    int r6 = r6 * r0
                    if (r5 >= r6) goto Lb4
                    goto L78
                Lb4:
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    android.support.v7.widget.RecyclerView r6 = r2
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.a(r5, r6)
                Lbb:
                    com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.this
                    boolean r5 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.a(r5)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.AnonymousClass1.onFling(int, int):boolean");
            }
        });
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == 2142696127) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView2, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView2, i);
                if (i != 0) {
                    if (i != 1) {
                        return;
                    }
                    StackLayoutManager.a(StackLayoutManager.this, false);
                    return;
                }
                StackLayoutManager stackLayoutManager = StackLayoutManager.this;
                StackLayoutManager.a(stackLayoutManager, stackLayoutManager.getItemCount() > 0 ? StackLayoutManager.d(StackLayoutManager.this) % StackLayoutManager.this.getItemCount() : StackLayoutManager.d(StackLayoutManager.this));
                if (StackLayoutManager.e(StackLayoutManager.this)) {
                    StackLayoutManager.a(StackLayoutManager.this, false);
                    return;
                }
                StackLayoutManager.a(StackLayoutManager.this, true);
                StackLayoutManager.a(StackLayoutManager.this, recyclerView);
            }
        });
    }

    private void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
        } else if (!this.g || a() == 0.0f) {
        } else {
            this.f = true;
            a(c(b()), recyclerView, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (r1 != 4) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int c(int r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L21
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            r1[r2] = r6
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            r1[r3] = r2
            java.lang.String r7 = "ab8b44cc"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            return r7
        L21:
            com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$ScrollOrientation r0 = r6.h
            int[] r1 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.AnonymousClass3.f12163a
            com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$ScrollOrientation r4 = r6.f12160a
            int r4 = r4.ordinal()
            r1 = r1[r4]
            if (r1 == r3) goto L38
            if (r1 == r2) goto L4e
            r2 = 3
            if (r1 == r2) goto L43
            r2 = 4
            if (r1 == r2) goto L59
            goto L64
        L38:
            com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$ScrollOrientation r1 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.ScrollOrientation.LEFT
            if (r0 != r1) goto L3e
            int r7 = r7 + r3
            return r7
        L3e:
            com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$ScrollOrientation r1 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.ScrollOrientation.RIGHT
            if (r0 != r1) goto L43
            return r7
        L43:
            com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$ScrollOrientation r1 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.ScrollOrientation.RIGHT
            if (r0 != r1) goto L49
            int r7 = r7 + r3
            return r7
        L49:
            com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$ScrollOrientation r1 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.ScrollOrientation.LEFT
            if (r0 != r1) goto L4e
            return r7
        L4e:
            com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$ScrollOrientation r1 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.ScrollOrientation.TOP
            if (r0 != r1) goto L54
            int r7 = r7 + r3
            return r7
        L54:
            com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$ScrollOrientation r1 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.ScrollOrientation.BOTTOM
            if (r0 != r1) goto L59
            return r7
        L59:
            com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$ScrollOrientation r1 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.ScrollOrientation.BOTTOM
            if (r0 != r1) goto L5f
            int r7 = r7 + r3
            return r7
        L5f:
            com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager$ScrollOrientation r1 = com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.ScrollOrientation.TOP
            if (r0 != r1) goto L64
            return r7
        L64:
            float r0 = r6.a()
            double r0 = (double) r0
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L70
            return r7
        L70:
            int r7 = r7 + r3
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.c(int):int");
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue() : this.f12160a == ScrollOrientation.RIGHT || this.f12160a == ScrollOrientation.LEFT;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue() : this.f12160a == ScrollOrientation.BOTTOM || this.f12160a == ScrollOrientation.TOP;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.LayoutParams) ipChange.ipc$dispatch("fdddbac1", new Object[]{this}) : new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= getItemCount()) {
            throw new ArrayIndexOutOfBoundsException("$position is out of bound [0..$itemCount-1]");
        } else {
            this.f = true;
            this.e = d(i);
            requestLayout();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e7cc6e", new Object[]{this, recyclerView, state, new Integer(i)});
            return;
        }
        super.smoothScrollToPosition(recyclerView, state, i);
        if (i < 0 || i >= getItemCount()) {
            throw new ArrayIndexOutOfBoundsException("$position is out of bound [0..$itemCount-1]");
        }
        this.f = true;
        a(i, recyclerView, true);
    }

    private void a(int i, RecyclerView recyclerView, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae0ee2e4", new Object[]{this, new Integer(i), recyclerView, bool});
            return;
        }
        int d = d(i);
        int i2 = AnonymousClass3.f12163a[this.f12160a.ordinal()];
        if (i2 == 1 || i2 == 3) {
            if (bool.booleanValue()) {
                recyclerView.smoothScrollBy(d - this.e, 0);
            } else {
                recyclerView.scrollBy(d - this.e, 0);
            }
        } else if (bool.booleanValue()) {
            recyclerView.smoothScrollBy(0, d - this.e);
        } else {
            recyclerView.scrollBy(0, d - this.e);
        }
    }

    private int d(int i) {
        int itemCount;
        int width;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad401d6b", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = AnonymousClass3.f12163a[this.f12160a.ordinal()];
        if (i2 == 1) {
            return i * getWidth();
        }
        if (i2 == 2) {
            return i * getHeight();
        }
        if (i2 == 3) {
            itemCount = (getItemCount() - 1) - i;
            width = getWidth();
        } else {
            itemCount = (getItemCount() - 1) - i;
            width = getHeight();
        }
        return itemCount * width;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
            return;
        }
        super.requestLayout();
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }
}
