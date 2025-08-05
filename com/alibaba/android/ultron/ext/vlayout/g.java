package com.alibaba.android.ultron.ext.vlayout;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    /* renamed from: a  reason: collision with root package name */
    public final b f2647a;
    private int b;

    static {
        kge.a(-1343411366);
    }

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    private g(b bVar) {
        this.b = Integer.MIN_VALUE;
        this.f2647a = bVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b = f();
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (Integer.MIN_VALUE != this.b) {
            return f() - this.b;
        }
        return 0;
    }

    public static g a(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("4b34c27e", new Object[]{bVar, new Integer(i)});
        }
        if (i == 0) {
            return a(bVar);
        }
        if (i == 1) {
            return b(bVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static g a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("8b7a4c09", new Object[]{bVar}) : new g(bVar) { // from class: com.alibaba.android.ultron.ext.vlayout.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int d() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f2647a.getWidth() - this.f2647a.getPaddingRight();
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int e() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f2647a.getWidth();
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else {
                    this.f2647a.offsetChildrenHorizontal(i);
                }
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int c() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f2647a.getPaddingLeft();
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int c(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("8d05011b", new Object[]{this, view})).intValue();
                }
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return !this.f2647a.b() ? this.f2647a.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin : this.f2647a.getDecoratedMeasuredWidth(view);
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int d(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("89068ffa", new Object[]{this, view})).intValue();
                }
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.f2647a.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int b(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("9103723c", new Object[]{this, view})).intValue();
                }
                return !this.f2647a.b() ? this.f2647a.getDecoratedRight(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin : this.f2647a.getDecoratedRight(view);
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("9501e35d", new Object[]{this, view})).intValue();
                }
                return !this.f2647a.b() ? this.f2647a.getDecoratedLeft(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin : this.f2647a.getDecoratedLeft(view);
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int f() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : (this.f2647a.getWidth() - this.f2647a.getPaddingLeft()) - this.f2647a.getPaddingRight();
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int g() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.f2647a.getPaddingRight();
            }
        };
    }

    public static g b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("edd562e8", new Object[]{bVar}) : new g(bVar) { // from class: com.alibaba.android.ultron.ext.vlayout.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int d() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f2647a.getHeight() - this.f2647a.getPaddingBottom();
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int e() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f2647a.getHeight();
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else {
                    this.f2647a.offsetChildrenVertical(i);
                }
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int c() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f2647a.getPaddingTop();
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int c(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("8d05011b", new Object[]{this, view})).intValue();
                }
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return !this.f2647a.b() ? this.f2647a.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin : this.f2647a.getDecoratedMeasuredHeight(view);
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int d(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("89068ffa", new Object[]{this, view})).intValue();
                }
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.f2647a.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int b(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("9103723c", new Object[]{this, view})).intValue();
                }
                return !this.f2647a.b() ? this.f2647a.getDecoratedBottom(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin : this.f2647a.getDecoratedBottom(view);
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("9501e35d", new Object[]{this, view})).intValue();
                }
                return !this.f2647a.b() ? this.f2647a.getDecoratedTop(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin : this.f2647a.getDecoratedTop(view);
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int f() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : (this.f2647a.getHeight() - this.f2647a.getPaddingTop()) - this.f2647a.getPaddingBottom();
            }

            @Override // com.alibaba.android.ultron.ext.vlayout.g
            public int g() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.f2647a.getPaddingBottom();
            }
        };
    }
}
