package com.taobao.live.home.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.dinamic.model.DinamicDataObject;
import com.taobao.live.home.dinamic.view.b;
import com.taobao.live.home.dinamic.view.c;
import tb.prc;

/* loaded from: classes7.dex */
public class a extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String e = "a";
    private int f;
    private Paint g;
    private InterfaceC0686a h;
    private boolean i;
    private int j;
    private boolean k;
    private boolean l;
    private Context m;
    private int n;

    /* renamed from: com.taobao.live.home.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public interface InterfaceC0686a {
        boolean a();
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1861229814) {
            super.onDraw((Canvas) objArr[0], (RecyclerView) objArr[1], (RecyclerView.State) objArr[2]);
            return null;
        } else if (hashCode != -1606942954) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDrawOver((Canvas) objArr[0], (RecyclerView) objArr[1], (RecyclerView.State) objArr[2]);
            return null;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public a(Context context, int i, int i2, int i3, int i4, InterfaceC0686a interfaceC0686a, String str) {
        super(i, i2, i3);
        this.f = -1;
        this.i = false;
        this.m = context;
        this.j = i4;
        this.h = interfaceC0686a;
        this.g = new Paint();
        this.g.setColor(Color.parseColor(str));
        this.n = prc.a(this.m, 11.0f);
    }

    public a(Context context, int i, int i2, int i3, int i4, InterfaceC0686a interfaceC0686a) {
        this(context, i, i2, i3, i4, interfaceC0686a, "#FFFFFF");
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a037ff16", new Object[]{this, canvas, recyclerView, state});
        } else {
            super.onDrawOver(canvas, recyclerView, state);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("910fe30a", new Object[]{this, canvas, recyclerView, state});
            return;
        }
        super.onDraw(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (recyclerView.getChildViewHolder(childAt) instanceof b) {
                DinamicDataObject b = ((b) recyclerView.getChildViewHolder(childAt)).b();
                boolean z = b != null && b.noLeftRightSpace;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) childAt.getLayoutParams();
                int i2 = this.f;
                if (-1 == i2) {
                    i2 = 0;
                }
                int spanIndex = layoutParams.getSpanIndex();
                if (childAdapterPosition >= i2) {
                    int spanCount = ((StaggeredGridLayoutManager) recyclerView.getLayoutManager()).getSpanCount();
                    if (childAdapterPosition == i2) {
                        a(canvas, childAt, a(spanIndex, spanCount), b(spanIndex, spanCount), z, true);
                    } else if (childAdapterPosition == i2 + 1 && !this.i) {
                        a(canvas, childAt, a(spanIndex, spanCount), b(spanIndex, spanCount), z, true);
                    } else {
                        a(canvas, childAt, a(spanIndex, spanCount), b(spanIndex, spanCount), z, false);
                    }
                }
            }
        }
    }

    private void a(Canvas canvas, View view, boolean z, boolean z2, boolean z3, boolean z4) {
        int top;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5559635", new Object[]{this, canvas, view, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
            return;
        }
        if (this.l && z4) {
            top = view.getTop() + this.n;
        } else {
            top = view.getTop() - this.c;
        }
        int left = view.getLeft();
        int right = view.getRight();
        int bottom = view.getBottom();
        if (!z3) {
            left = view.getLeft() - (z ? this.f17753a : this.b);
            right = view.getRight() + (z2 ? this.f17753a : this.b);
        }
        canvas.drawRect(left, top, right, bottom, this.g);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    @Override // com.taobao.live.home.dinamic.view.c, android.support.v7.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        DinamicDataObject b;
        InterfaceC0686a interfaceC0686a;
        InterfaceC0686a interfaceC0686a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        rect.set(0, 0, 0, 0);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        InterfaceC0686a interfaceC0686a3 = this.h;
        if (interfaceC0686a3 != null && interfaceC0686a3.a() && childAdapterPosition == 0) {
            rect.left = 0;
            rect.right = 0;
        } else {
            int spanCount = ((StaggeredGridLayoutManager) recyclerView.getLayoutManager()).getSpanCount();
            int width = recyclerView.getWidth();
            int i = width / spanCount;
            int i2 = spanCount - 1;
            int i3 = (((width - ((this.b * i2) << 1)) - this.f17753a) - this.f17753a) / spanCount;
            int spanIndex = layoutParams.getSpanIndex();
            if (spanIndex == 0) {
                rect.left = this.f17753a;
            } else if (spanIndex == i2) {
                rect.left = (i - this.f17753a) - i3;
            } else {
                rect.left = (this.b << 1) - ((((i - i3) * spanIndex) - ((this.b << 1) * (spanIndex - 1))) - this.f17753a);
            }
            if ((recyclerView.getChildViewHolder(view) instanceof b) && (b = ((b) recyclerView.getChildViewHolder(view)).b()) != null && b.noLeftRightSpace) {
                rect.left = 0;
                rect.right = 0;
            }
        }
        if (!this.l) {
            if (childAdapterPosition == 0 && (interfaceC0686a = this.h) != null && interfaceC0686a.a()) {
                rect.top = 0;
                return;
            }
            int i4 = this.f;
            if (childAdapterPosition == i4) {
                this.i = layoutParams.isFullSpan();
                InterfaceC0686a interfaceC0686a4 = this.h;
                if (interfaceC0686a4 != null && interfaceC0686a4.a()) {
                    rect.top = this.j;
                } else {
                    rect.top = this.c;
                }
            } else if (childAdapterPosition == i4 + 1 && !this.i) {
                InterfaceC0686a interfaceC0686a5 = this.h;
                if (interfaceC0686a5 != null && interfaceC0686a5.a()) {
                    rect.top = this.j;
                } else {
                    rect.top = this.c;
                }
            } else {
                rect.top = this.c;
            }
        } else if (childAdapterPosition == 0 && (((interfaceC0686a2 = this.h) != null && interfaceC0686a2.a()) || this.f == 1)) {
            rect.top = 0;
        } else {
            int i5 = this.f;
            if (childAdapterPosition == i5 - 1) {
                InterfaceC0686a interfaceC0686a6 = this.h;
                if (interfaceC0686a6 != null && interfaceC0686a6.a()) {
                    rect.top = this.j;
                } else if (this.k) {
                    rect.top = 0;
                } else {
                    rect.top = this.c;
                }
            } else if (childAdapterPosition == i5) {
                this.i = layoutParams.isFullSpan();
                rect.top = -this.n;
            } else if (childAdapterPosition == i5 + 1 && !this.i) {
                rect.top = -this.n;
            } else {
                rect.top = this.c;
            }
        }
    }

    private boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : i % i2 == 0;
    }

    private boolean b(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("90f78e0d", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : (i + 1) % i2 == 0;
    }
}
