package com.alibaba.android.ultron.ext.vlayout;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import tb.blm;
import tb.bls;
import tb.kge;

/* loaded from: classes2.dex */
public class b extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    public static final int VERTICAL = 1;
    private static Field p;
    private static Method q;

    /* renamed from: a  reason: collision with root package name */
    public c f2641a;
    public Bundle b;
    public int c;
    private g d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;
    private final a i;
    private final C0092b j;
    private final Method k;
    private com.alibaba.android.ultron.ext.vlayout.a l;
    private RecyclerView m;
    private Object[] n;
    private bls o;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1602403907:
                super.assertNotInLayoutOrScroll((String) objArr[0]);
                return null;
            case -1447122930:
                super.setOrientation(((Number) objArr[0]).intValue());
                return null;
            case -1227808903:
                return new Integer(super.findLastVisibleItemPosition());
            case 69461489:
                return new Integer(super.findFirstVisibleItemPosition());
            case 1133151231:
                super.onDetachedFromWindow((RecyclerView) objArr[0], (RecyclerView.Recycler) objArr[1]);
                return null;
            case 1238488515:
                super.onAttachedToWindow((RecyclerView) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public int a(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2621734e", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)})).intValue();
        }
        return 0;
    }

    public int a(View view, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c2d0b5d", new Object[]{this, view, new Boolean(z), new Boolean(z2)})).intValue();
        }
        return 0;
    }

    public void a(RecyclerView.State state, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e80b7bb0", new Object[]{this, state, aVar});
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ g a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("8b7a4c09", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ RecyclerView b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("1be4e697", new Object[]{bVar}) : bVar.m;
    }

    public b(Context context) {
        this(context, 1, false);
    }

    public b(Context context, int i, boolean z) {
        super(context, i, z);
        this.f = false;
        this.g = -1;
        this.h = Integer.MIN_VALUE;
        this.b = null;
        this.n = new Object[0];
        this.o = new bls();
        this.i = new a();
        setOrientation(i);
        setReverseLayout(z);
        this.j = new C0092b(this);
        try {
            this.k = LinearLayoutManager.class.getDeclaredMethod("ensureLayoutState", new Class[0]);
            this.k.setAccessible(true);
            try {
                Method declaredMethod = RecyclerView.LayoutManager.class.getDeclaredMethod("setItemPrefetchEnabled", Boolean.TYPE);
                if (declaredMethod == null) {
                    return;
                }
                declaredMethod.invoke(this, false);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void a(com.alibaba.android.ultron.ext.vlayout.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27d42ed", new Object[]{this, aVar});
        } else {
            this.l = aVar;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        Bundle bundle = this.b;
        if (bundle != null) {
            return new Bundle(bundle);
        }
        Bundle bundle2 = new Bundle();
        if (getChildCount() > 0) {
            boolean z = this.e ^ this.f;
            bundle2.putBoolean("AnchorLayoutFromEnd", z);
            if (z) {
                View e = e();
                bundle2.putInt("AnchorOffset", this.d.d() - this.d.b(e));
                bundle2.putInt("AnchorPosition", getPosition(e));
            } else {
                View d2 = d();
                bundle2.putInt("AnchorPosition", getPosition(d2));
                bundle2.putInt("AnchorOffset", this.d.a(d2) - this.d.c());
            }
        } else {
            bundle2.putInt("AnchorPosition", -1);
        }
        return bundle2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (!(parcelable instanceof Bundle)) {
        } else {
            this.b = (Bundle) parcelable;
            requestLayout();
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
            return;
        }
        super.setOrientation(i);
        this.d = null;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (getOrientation() == 1 || !isLayoutRTL()) {
            this.f = getReverseLayout();
        } else {
            this.f = !getReverseLayout();
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 1;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("d3d13928", new Object[]{this, new Integer(i)});
        }
        if (getChildCount() == 0) {
            return null;
        }
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.f) {
            i2 = -1;
        }
        if (getOrientation() == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int a2;
        int i6;
        View findViewByPosition;
        int a3;
        int i7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f43ad1", new Object[]{this, recycler, state});
            return;
        }
        Bundle bundle = this.b;
        if (bundle != null && bundle.getInt("AnchorPosition") >= 0) {
            this.g = this.b.getInt("AnchorPosition");
        }
        a();
        this.f2641a.b = false;
        c();
        this.i.a();
        this.i.c = this.f ^ getStackFromEnd();
        b(state, this.i);
        int extraLayoutSpace = getExtraLayoutSpace(state);
        if ((state.getTargetScrollPosition() < this.i.f2642a) == this.f) {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        } else {
            i = 0;
        }
        int c2 = extraLayoutSpace + this.d.c();
        int g = i + this.d.g();
        if (state.isPreLayout() && (i6 = this.g) != -1 && this.h != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i6)) != null) {
            if (this.f) {
                i7 = this.d.d() - this.d.b(findViewByPosition);
                a3 = this.h;
            } else {
                a3 = this.d.a(findViewByPosition) - this.d.c();
                i7 = this.h;
            }
            int i8 = i7 - a3;
            if (i8 > 0) {
                c2 += i8;
            } else {
                g -= i8;
            }
        }
        a(state, this.i);
        detachAndScrapAttachedViews(recycler);
        this.f2641a.k = state.isPreLayout();
        this.f2641a.f2644a = true;
        if (this.i.c) {
            b(this.i);
            c cVar = this.f2641a;
            cVar.i = c2;
            a(recycler, cVar, state, false);
            i3 = this.f2641a.c;
            if (this.f2641a.d > 0) {
                g += this.f2641a.d;
            }
            a(this.i);
            c cVar2 = this.f2641a;
            cVar2.i = g;
            cVar2.e += this.f2641a.f;
            a(recycler, this.f2641a, state, false);
            i2 = this.f2641a.c;
        } else {
            a(this.i);
            c cVar3 = this.f2641a;
            cVar3.i = g;
            a(recycler, cVar3, state, false);
            i2 = this.f2641a.c;
            if (this.f2641a.d > 0) {
                c2 += this.f2641a.d;
            }
            b(this.i);
            c cVar4 = this.f2641a;
            cVar4.i = c2;
            cVar4.e += this.f2641a.f;
            a(recycler, this.f2641a, state, false);
            i3 = this.f2641a.c;
        }
        if (getChildCount() > 0) {
            if (this.f ^ getStackFromEnd()) {
                int a4 = a(i2, recycler, state, true);
                i4 = i3 + a4;
                i5 = i2 + a4;
                a2 = b(i4, recycler, state, false);
            } else {
                int b = b(i3, recycler, state, true);
                i4 = i3 + b;
                i5 = i2 + b;
                a2 = a(i5, recycler, state, false);
            }
            i3 = i4 + a2;
            i2 = i5 + a2;
        }
        a(recycler, state, i3, i2);
        if (!state.isPreLayout()) {
            this.g = -1;
            this.h = Integer.MIN_VALUE;
            this.d.a();
        }
        this.e = getStackFromEnd();
        this.b = null;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d1d5c3", new Object[]{this, recyclerView});
            return;
        }
        super.onAttachedToWindow(recyclerView);
        this.m = recyclerView;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("438a83ff", new Object[]{this, recyclerView, recycler});
            return;
        }
        super.onDetachedFromWindow(recyclerView, recycler);
        this.m = null;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public int findFirstVisibleItemPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("423e5f1", new Object[]{this})).intValue();
        }
        a();
        return super.findFirstVisibleItemPosition();
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public int findLastVisibleItemPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6d11f79", new Object[]{this})).intValue();
        }
        a();
        try {
            return super.findLastVisibleItemPosition();
        } catch (Exception e) {
            boolean a2 = blm.a();
            a(a2);
            if (a2) {
                throw e;
            }
            com.alibaba.android.ultron.ext.vlayout.a aVar = this.l;
            if (aVar == null) {
                return -1;
            }
            aVar.a(this, e);
            return -1;
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        UnifyLog.d("ExposeLLManagerEx", "findLastVisibleItemPosition exception,,itemCount=" + getItemCount() + ",childCount=" + getChildCount() + ",crashWhenFindLastVisibleItem" + z);
    }

    private View a(RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3bd1392b", new Object[]{this, state}) : this.f ? a(state.getItemCount()) : b(state.getItemCount());
    }

    private View b(RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("2d22c8ac", new Object[]{this, state}) : this.f ? b(state.getItemCount()) : a(state.getItemCount());
    }

    private View a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("46aa9b1d", new Object[]{this, new Integer(i)}) : a(0, getChildCount(), i);
    }

    private View b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("42ac29fc", new Object[]{this, new Integer(i)}) : a(getChildCount() - 1, -1, i);
    }

    private View a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        int i4 = 1;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c8d058bd", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        a();
        int c2 = this.d.c();
        int d2 = this.d.d();
        if (i2 <= i) {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.d.a(childAt) < d2 && this.d.b(childAt) >= c2) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    private void a(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569a138", new Object[]{this, recycler, state, new Integer(i), new Integer(i2)});
        } else if (!state.willRunPredictiveAnimations() || getChildCount() == 0 || state.isPreLayout() || !supportsPredictiveItemAnimations()) {
        } else {
            List<RecyclerView.ViewHolder> scrapList = recycler.getScrapList();
            int size = scrapList.size();
            int position = getPosition(getChildAt(0));
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i3 = -1;
                if (i4 >= size) {
                    break;
                }
                RecyclerView.ViewHolder viewHolder = scrapList.get(i4);
                if (((viewHolder.getPosition() < position) != this.f ? (char) 65535 : (char) 1) == 65535) {
                    i5 += this.d.c(viewHolder.itemView);
                } else {
                    i6 += this.d.c(viewHolder.itemView);
                }
                i4++;
            }
            this.f2641a.l = scrapList;
            if (i5 > 0) {
                b(getPosition(d()), i);
                c cVar = this.f2641a;
                cVar.i = i5;
                cVar.d = 0;
                cVar.e += this.f ? 1 : -1;
                c cVar2 = this.f2641a;
                cVar2.f2644a = true;
                a(recycler, cVar2, state, false);
            }
            if (i6 > 0) {
                a(getPosition(e()), i2);
                c cVar3 = this.f2641a;
                cVar3.i = i6;
                cVar3.d = 0;
                int i7 = cVar3.e;
                if (!this.f) {
                    i3 = 1;
                }
                cVar3.e = i7 + i3;
                c cVar4 = this.f2641a;
                cVar4.f2644a = true;
                a(recycler, cVar4, state, false);
            }
            this.f2641a.l = null;
        }
    }

    private void b(RecyclerView.State state, a aVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1051bbf1", new Object[]{this, state, aVar});
        } else if (d(state, aVar) || c(state, aVar)) {
        } else {
            aVar.b();
            if (getStackFromEnd()) {
                i = state.getItemCount() - 1;
            }
            aVar.f2642a = i;
        }
    }

    private boolean c(RecyclerView.State state, a aVar) {
        View b;
        int c2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3897fc36", new Object[]{this, state, aVar})).booleanValue();
        }
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && aVar.a(focusedChild, state)) {
            return true;
        }
        if (this.e != getStackFromEnd()) {
            return false;
        }
        if (aVar.c) {
            b = a(state);
        } else {
            b = b(state);
        }
        if (b == null) {
            return false;
        }
        aVar.a(b);
        if (!state.isPreLayout() && supportsPredictiveItemAnimations()) {
            if (this.d.a(b) >= this.d.d() || this.d.b(b) < this.d.c()) {
                z = true;
            }
            if (z) {
                if (aVar.c) {
                    c2 = this.d.d();
                } else {
                    c2 = this.d.c();
                }
                aVar.b = c2;
            }
        }
        return true;
    }

    private boolean d(RecyclerView.State state, a aVar) {
        int i;
        int a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60de3c77", new Object[]{this, state, aVar})).booleanValue();
        }
        if (!state.isPreLayout() && (i = this.g) != -1) {
            if (i < 0 || i >= state.getItemCount()) {
                this.g = -1;
                this.h = Integer.MIN_VALUE;
            } else {
                aVar.f2642a = this.g;
                Bundle bundle = this.b;
                if (bundle != null && bundle.getInt("AnchorPosition") >= 0) {
                    aVar.c = this.b.getBoolean("AnchorLayoutFromEnd");
                    if (aVar.c) {
                        aVar.b = this.d.d() - this.b.getInt("AnchorOffset");
                    } else {
                        aVar.b = this.d.c() + this.b.getInt("AnchorOffset");
                    }
                    return true;
                } else if (this.h == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(this.g);
                    if (findViewByPosition != null) {
                        if (this.d.c(findViewByPosition) > this.d.f()) {
                            aVar.b();
                            return true;
                        } else if (this.d.a(findViewByPosition) - this.d.c() < 0) {
                            aVar.b = this.d.c();
                            aVar.c = false;
                            return true;
                        } else if (this.d.d() - this.d.b(findViewByPosition) < 0) {
                            aVar.b = this.d.d();
                            aVar.c = true;
                            return true;
                        } else {
                            if (aVar.c) {
                                a2 = this.d.b(findViewByPosition) + this.d.b();
                            } else {
                                a2 = this.d.a(findViewByPosition);
                            }
                            aVar.b = a2;
                        }
                    } else {
                        if (getChildCount() > 0) {
                            if ((this.g < getPosition(getChildAt(0))) == this.f) {
                                z = true;
                            }
                            aVar.c = z;
                        }
                        aVar.b();
                    }
                    return true;
                } else {
                    boolean z2 = this.f;
                    aVar.c = z2;
                    if (z2) {
                        aVar.b = this.d.d() - this.h;
                    } else {
                        aVar.b = this.d.c() + this.h;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private int a(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("556e7a22", new Object[]{this, new Integer(i), recycler, state, new Boolean(z)})).intValue();
        }
        int d3 = this.d.d() - i;
        if (d3 <= 0) {
            return 0;
        }
        int i2 = -a(-d3, recycler, state);
        int i3 = i + i2;
        if (!z || (d2 = this.d.d() - i3) <= 0) {
            return i2;
        }
        this.d.a(d2);
        return d2 + i2;
    }

    private int b(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1dcc9ec1", new Object[]{this, new Integer(i), recycler, state, new Boolean(z)})).intValue();
        }
        int c3 = i - this.d.c();
        if (c3 <= 0) {
            return 0;
        }
        int i2 = -a(c3, recycler, state);
        int i3 = i + i2;
        if (!z || (c2 = i3 - this.d.c()) <= 0) {
            return i2;
        }
        this.d.a(-c2);
        return i2 - c2;
    }

    private void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18c20c6f", new Object[]{this, aVar});
        } else {
            a(aVar.f2642a, aVar.b);
        }
    }

    private void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.f2641a.d = this.d.d() - i2;
        this.f2641a.f = this.f ? -1 : 1;
        c cVar = this.f2641a;
        cVar.e = i;
        cVar.g = 1;
        cVar.c = i2;
        cVar.h = Integer.MIN_VALUE;
    }

    private void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184ba670", new Object[]{this, aVar});
        } else {
            b(aVar.f2642a, aVar.b);
        }
    }

    private void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.f2641a.d = i2 - this.d.c();
        c cVar = this.f2641a;
        cVar.e = i;
        if (!this.f) {
            i3 = -1;
        }
        cVar.f = i3;
        c cVar2 = this.f2641a;
        cVar2.g = -1;
        cVar2.c = i2;
        cVar2.h = Integer.MIN_VALUE;
    }

    public void a() {
        if (this.f2641a == null) {
            this.f2641a = new c();
        }
        if (this.d == null) {
            this.d = g.a(this, getOrientation());
        }
        try {
            this.k.invoke(this, this.n);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
            return;
        }
        this.g = i;
        this.h = Integer.MIN_VALUE;
        Bundle bundle = this.b;
        if (bundle != null) {
            bundle.putInt("AnchorPosition", -1);
        }
        requestLayout();
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void scrollToPositionWithOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5c5ef1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.g = i;
        this.h = i2;
        Bundle bundle = this.b;
        if (bundle != null) {
            bundle.putInt("AnchorPosition", -1);
        }
        requestLayout();
    }

    public void a(int i, int i2, boolean z, RecyclerView.State state) {
        int c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0e06cd", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), state});
            return;
        }
        this.f2641a.i = getExtraLayoutSpace(state);
        c cVar = this.f2641a;
        cVar.g = i;
        int i3 = -1;
        if (i == 1) {
            cVar.i += this.d.g();
            View e = e();
            c cVar2 = this.f2641a;
            if (!this.f) {
                i3 = 1;
            }
            cVar2.f = i3;
            this.f2641a.e = getPosition(e) + this.f2641a.f;
            this.f2641a.c = this.d.b(e) + a(e, true, false);
            c2 = this.f2641a.c - this.d.d();
        } else {
            View d2 = d();
            this.f2641a.i += this.d.c();
            c cVar3 = this.f2641a;
            if (this.f) {
                i3 = 1;
            }
            cVar3.f = i3;
            this.f2641a.e = getPosition(d2) + this.f2641a.f;
            this.f2641a.c = this.d.a(d2) + a(d2, false, false);
            c2 = (-this.f2641a.c) + this.d.c();
        }
        c cVar4 = this.f2641a;
        cVar4.d = i2;
        if (z) {
            cVar4.d -= c2;
        }
        this.f2641a.h = c2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("897f7fec", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        if (getOrientation() != 1) {
            return a(i, recycler, state);
        }
        return 0;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc1b187e", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        if (getOrientation() != 0) {
            return a(i, recycler, state);
        }
        return 0;
    }

    public int a(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("765e6138", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        this.f2641a.b = true;
        a();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        a(i2, abs, true, state);
        int i3 = this.f2641a.h;
        c cVar = this.f2641a;
        cVar.f2644a = false;
        int a2 = i3 + a(recycler, cVar, state, false);
        if (a2 < 0) {
            return 0;
        }
        if (abs > a2) {
            i = i2 * a2;
        }
        this.d.a(-i);
        return i;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a07d41bd", new Object[]{this, str});
        } else if (this.b != null) {
        } else {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void a(RecyclerView.Recycler recycler, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac9faf7", new Object[]{this, recycler, new Integer(i), new Integer(i2)});
        } else if (i != i2) {
            if (i2 <= i) {
                while (i > i2) {
                    removeAndRecycleViewAt(i, recycler);
                    i--;
                }
                return;
            }
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                removeAndRecycleViewAt(i3, recycler);
            }
        }
    }

    private void a(RecyclerView.Recycler recycler, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aaba98c", new Object[]{this, recycler, new Integer(i)});
        } else if (i >= 0) {
            int childCount = getChildCount();
            if (!this.f) {
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (this.d.b(getChildAt(i2)) + this.c > i) {
                        a(recycler, 0, i2);
                        return;
                    }
                }
                return;
            }
            int i3 = childCount - 1;
            for (int i4 = i3; i4 >= 0; i4--) {
                if (this.d.b(getChildAt(i4)) + this.c > i) {
                    a(recycler, i3, i4);
                    return;
                }
            }
        }
    }

    private void b(RecyclerView.Recycler recycler, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3fffecd", new Object[]{this, recycler, new Integer(i)});
            return;
        }
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int e = this.d.e() - i;
        if (this.f) {
            for (int i2 = 0; i2 < childCount; i2++) {
                if (this.d.a(getChildAt(i2)) - this.c < e) {
                    a(recycler, 0, i2);
                    return;
                }
            }
            return;
        }
        int i3 = childCount - 1;
        for (int i4 = i3; i4 >= 0; i4--) {
            if (this.d.a(getChildAt(i4)) - this.c < e) {
                a(recycler, i3, i4);
                return;
            }
        }
    }

    private void a(RecyclerView.Recycler recycler, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92cf29c", new Object[]{this, recycler, cVar});
        } else if (!cVar.b) {
        } else {
            if (cVar.g == -1) {
                b(recycler, cVar.h);
            } else {
                a(recycler, cVar.h);
            }
        }
    }

    public int a(RecyclerView.Recycler recycler, c cVar, RecyclerView.State state, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18463a0a", new Object[]{this, recycler, cVar, state, new Boolean(z)})).intValue();
        }
        int i = cVar.d;
        if (cVar.h != Integer.MIN_VALUE) {
            if (cVar.d < 0) {
                cVar.h += cVar.d;
            }
            a(recycler, cVar);
        }
        int i2 = cVar.d + cVar.i + this.c;
        while (i2 > 0 && cVar.a(state)) {
            this.o.a();
            a(recycler, state, cVar, this.o);
            if (this.o.b) {
                break;
            }
            cVar.c += this.o.f25966a * cVar.g;
            if (!this.o.c || this.f2641a.l != null || !state.isPreLayout()) {
                cVar.d -= this.o.f25966a;
                i2 -= this.o.f25966a;
            }
            if (cVar.h != Integer.MIN_VALUE) {
                cVar.h += this.o.f25966a;
                if (cVar.d < 0) {
                    cVar.h += cVar.d;
                }
                a(recycler, cVar);
            }
            if (z && this.o.d) {
                break;
            }
        }
        return i - cVar.d;
    }

    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, c cVar, bls blsVar) {
        int paddingTop;
        int i;
        int i2;
        int i3;
        int i4;
        int d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4634d304", new Object[]{this, recycler, state, cVar, blsVar});
            return;
        }
        View a2 = cVar.a(recycler);
        if (a2 == null) {
            blsVar.b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) a2.getLayoutParams();
        if (cVar.l == null) {
            if (this.f == (cVar.g == -1)) {
                addView(a2);
            } else {
                addView(a2, 0);
            }
        } else {
            if (this.f == (cVar.g == -1)) {
                addDisappearingView(a2);
            } else {
                addDisappearingView(a2, 0);
            }
        }
        measureChildWithMargins(a2, 0, 0);
        blsVar.f25966a = this.d.c(a2);
        if (getOrientation() == 1) {
            if (isLayoutRTL()) {
                d2 = getWidth() - getPaddingRight();
                i3 = d2 - this.d.d(a2);
            } else {
                i3 = getPaddingLeft();
                d2 = this.d.d(a2) + i3;
            }
            if (cVar.g == -1) {
                i4 = cVar.c;
                int i5 = d2;
                paddingTop = cVar.c - blsVar.f25966a;
                i = i5;
            } else {
                int i6 = cVar.c;
                i4 = cVar.c + blsVar.f25966a;
                i = d2;
                paddingTop = i6;
            }
        } else {
            paddingTop = getPaddingTop();
            int d3 = this.d.d(a2) + paddingTop;
            if (cVar.g == -1) {
                int i7 = cVar.c;
                i2 = d3;
                i3 = cVar.c - blsVar.f25966a;
                i = i7;
            } else {
                int i8 = cVar.c;
                i = cVar.c + blsVar.f25966a;
                i2 = d3;
                i3 = i8;
            }
            i4 = i2;
        }
        layoutDecorated(a2, i3 + layoutParams.leftMargin, paddingTop + layoutParams.topMargin, i - layoutParams.rightMargin, i4 - layoutParams.bottomMargin);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            blsVar.c = true;
        }
        blsVar.d = a2.isFocusable();
    }

    private int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue();
        }
        int orientation = getOrientation();
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        return i != 17 ? i != 33 ? i != 66 ? (i == 130 && orientation == 1) ? 1 : Integer.MIN_VALUE : orientation == 0 ? 1 : Integer.MIN_VALUE : orientation == 1 ? -1 : Integer.MIN_VALUE : orientation == 0 ? -1 : Integer.MIN_VALUE;
    }

    private View d() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this});
        }
        if (this.f) {
            i = getChildCount() - 1;
        }
        return getChildAt(i);
    }

    private View e() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("42261fae", new Object[]{this});
        }
        if (!this.f) {
            i = getChildCount() - 1;
        }
        return getChildAt(i);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int c2;
        View a2;
        View e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("92ff08ec", new Object[]{this, view, new Integer(i), recycler, state});
        }
        c();
        if (getChildCount() == 0 || (c2 = c(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (c2 == -1) {
            a2 = b(state);
        } else {
            a2 = a(state);
        }
        if (a2 == null) {
            return null;
        }
        a();
        a(c2, (int) (this.d.f() * 0.33f), false, state);
        c cVar = this.f2641a;
        cVar.h = Integer.MIN_VALUE;
        cVar.b = false;
        cVar.f2644a = false;
        a(recycler, cVar, state, true);
        if (c2 == -1) {
            e = d();
        } else {
            e = e();
        }
        if (e != a2 && e.isFocusable()) {
            return e;
        }
        return null;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c4fda0d0", new Object[]{this})).booleanValue() : this.b == null && this.e == getStackFromEnd();
    }

    public void a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b3caa", new Object[]{this, view, new Boolean(z)});
            return;
        }
        if (!z) {
            i = -1;
        }
        addView(view, i);
        this.j.a(view);
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.j.a(view);
        }
    }

    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else {
            this.j.b(view);
        }
    }

    static {
        kge.a(-782003882);
        p = null;
        q = null;
    }

    public static boolean a(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d6090f29", new Object[]{viewHolder})).booleanValue() : new d(viewHolder).d();
    }

    public static void a(RecyclerView.LayoutParams layoutParams, RecyclerView.ViewHolder viewHolder) {
        try {
            if (p == null) {
                p = RecyclerView.LayoutParams.class.getDeclaredField("mViewHolder");
            }
            p.setAccessible(true);
            p.set(layoutParams, viewHolder);
            if (q == null) {
                Method declaredMethod = RecyclerView.ViewHolder.class.getDeclaredMethod("setFlags", Integer.TYPE, Integer.TYPE);
                q = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            q.invoke(viewHolder, 4, 4);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int ITEM_DIRECTION_HEAD = -1;
        public static final int ITEM_DIRECTION_TAIL = 1;
        public static final int LAYOUT_END = 1;
        public static final int LAYOUT_START = -1;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        private Method m;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2644a = false;
        public boolean b = true;
        public int i = 0;
        public int j = 0;
        public boolean k = false;
        public List<RecyclerView.ViewHolder> l = null;

        static {
            kge.a(456682777);
        }

        public c() {
            this.m = null;
            try {
                this.m = RecyclerView.ViewHolder.class.getDeclaredMethod("isRemoved", new Class[0]);
                this.m.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

        public boolean a(RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6a85392d", new Object[]{this, state})).booleanValue();
            }
            int i = this.e;
            return i >= 0 && i < state.getItemCount();
        }

        public View a(RecyclerView.Recycler recycler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("60f824d9", new Object[]{this, recycler});
            }
            if (this.l != null) {
                return a();
            }
            View viewForPosition = recycler.getViewForPosition(this.e);
            this.e += this.f;
            return viewForPosition;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0051 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0053 A[ADDED_TO_REGION, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private android.view.View a() {
            /*
                r9 = this;
                java.util.List<android.support.v7.widget.RecyclerView$ViewHolder> r0 = r9.l
                int r0 = r0.size()
                r1 = 0
                r2 = 0
                r3 = 2147483647(0x7fffffff, float:NaN)
                r4 = r1
                r3 = 0
                r5 = 2147483647(0x7fffffff, float:NaN)
            L10:
                if (r3 >= r0) goto L56
                java.util.List<android.support.v7.widget.RecyclerView$ViewHolder> r6 = r9.l
                java.lang.Object r6 = r6.get(r3)
                android.support.v7.widget.RecyclerView$ViewHolder r6 = (android.support.v7.widget.RecyclerView.ViewHolder) r6
                boolean r7 = r9.k
                if (r7 != 0) goto L3d
                java.lang.reflect.Method r7 = r9.m     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L32
                java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L32
                java.lang.Object r7 = r7.invoke(r6, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L32
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L32
                boolean r7 = r7.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L32
                goto L37
            L2d:
                r7 = move-exception
                r7.printStackTrace()
                goto L36
            L32:
                r7 = move-exception
                r7.printStackTrace()
            L36:
                r7 = 0
            L37:
                boolean r8 = r9.k
                if (r8 != 0) goto L3d
                if (r7 != 0) goto L53
            L3d:
                int r7 = r6.getPosition()
                int r8 = r9.e
                int r7 = r7 - r8
                int r8 = r9.f
                int r7 = r7 * r8
                if (r7 < 0) goto L53
                if (r7 >= r5) goto L53
                if (r7 == 0) goto L51
                r4 = r6
                r5 = r7
                goto L53
            L51:
                r4 = r6
                goto L56
            L53:
                int r3 = r3 + 1
                goto L10
            L56:
                if (r4 == 0) goto L64
                int r0 = r4.getPosition()
                int r1 = r9.f
                int r0 = r0 + r1
                r9.e = r0
                android.view.View r0 = r4.itemView
                return r0
            L64:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.ext.vlayout.b.c.a():android.view.View");
        }
    }

    /* loaded from: classes2.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f2642a;
        public int b;
        public boolean c;

        static {
            kge.a(-793012943);
        }

        public a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.f2642a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
        }

        public void b() {
            int c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            if (this.c) {
                c = b.a(b.this).d();
            } else {
                c = b.a(b.this).c();
            }
            this.b = c;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "AnchorInfo{mPosition=" + this.f2642a + ", mCoordinate=" + this.b + ", mLayoutFromEnd=" + this.c + '}';
        }

        public boolean a(View view, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b016bcaf", new Object[]{this, view, state})).booleanValue();
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (layoutParams.isItemRemoved() || layoutParams.getViewPosition() < 0 || layoutParams.getViewPosition() >= state.getItemCount()) {
                return false;
            }
            a(view);
            return true;
        }

        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                return;
            }
            if (this.c) {
                this.b = b.a(b.this).b(view) + b.this.a(view, this.c, true) + b.a(b.this).b();
            } else {
                this.b = b.a(b.this).a(view) + b.this.a(view, this.c, true);
            }
            this.f2642a = b.this.getPosition(view);
        }
    }

    /* loaded from: classes2.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static Method b;
        private static Method c;
        private static Method d;
        private static Method e;
        private static Method f;

        /* renamed from: a  reason: collision with root package name */
        private RecyclerView.ViewHolder f2645a;

        static {
            kge.a(-688639308);
            try {
                Method declaredMethod = RecyclerView.ViewHolder.class.getDeclaredMethod("shouldIgnore", new Class[0]);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = RecyclerView.ViewHolder.class.getDeclaredMethod("isInvalid", new Class[0]);
                c = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = RecyclerView.ViewHolder.class.getDeclaredMethod("isRemoved", new Class[0]);
                d = declaredMethod3;
                declaredMethod3.setAccessible(true);
                Method declaredMethod4 = RecyclerView.ViewHolder.class.getDeclaredMethod("setFlags", Integer.TYPE, Integer.TYPE);
                f = declaredMethod4;
                declaredMethod4.setAccessible(true);
                try {
                    e = RecyclerView.ViewHolder.class.getDeclaredMethod("isChanged", new Class[0]);
                } catch (NoSuchMethodException unused) {
                    e = RecyclerView.ViewHolder.class.getDeclaredMethod("isUpdated", new Class[0]);
                }
                e.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            }
        }

        public static void a(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            try {
                f.invoke(viewHolder, Integer.valueOf(i), Integer.valueOf(i2));
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }

        public d(RecyclerView.ViewHolder viewHolder) {
            this.f2645a = viewHolder;
        }

        public boolean a() {
            Method method = c;
            if (method == null) {
                return true;
            }
            try {
                return ((Boolean) method.invoke(this.f2645a, new Object[0])).booleanValue();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return true;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return true;
            }
        }

        public boolean b() {
            Method method = d;
            if (method == null) {
                return true;
            }
            try {
                return ((Boolean) method.invoke(this.f2645a, new Object[0])).booleanValue();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return true;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return true;
            }
        }

        public boolean c() {
            Method method = e;
            if (method == null) {
                return true;
            }
            try {
                return ((Boolean) method.invoke(this.f2645a, new Object[0])).booleanValue();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return true;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return true;
            }
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : a() || b() || c();
        }
    }

    /* renamed from: com.alibaba.android.ultron.ext.vlayout.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0092b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Object b;
        private Method c;
        private Method d;
        private Method e;
        private Method f;
        private Field g;
        private Object h;
        private Method i;
        private Field j;
        private List k;
        private RecyclerView.LayoutManager l;
        private Object[] m = new Object[1];

        static {
            kge.a(232350583);
        }

        public void a() {
            try {
                if (this.b != null) {
                    return;
                }
                this.b = this.j.get(this.l);
                if (this.b == null) {
                    return;
                }
                Class<?> cls = this.b.getClass();
                this.c = cls.getDeclaredMethod("hide", View.class);
                this.c.setAccessible(true);
                try {
                    this.d = cls.getDeclaredMethod("findHiddenNonRemovedView", Integer.TYPE, Integer.TYPE);
                    this.d.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                    this.e = cls.getDeclaredMethod("findHiddenNonRemovedView", Integer.TYPE);
                    this.e.setAccessible(true);
                }
                this.f = cls.getDeclaredMethod("isHidden", View.class);
                this.f.setAccessible(true);
                Field declaredField = cls.getDeclaredField("mBucket");
                declaredField.setAccessible(true);
                this.h = declaredField.get(this.b);
                this.i = this.h.getClass().getDeclaredMethod(com.taobao.android.weex_framework.util.a.ATOM_EXT_clear, Integer.TYPE);
                this.i.setAccessible(true);
                this.g = cls.getDeclaredField("mHiddenViews");
                this.g.setAccessible(true);
                this.k = (List) this.g.get(this.b);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public C0092b(RecyclerView.LayoutManager layoutManager) {
            this.l = layoutManager;
            try {
                this.j = RecyclerView.LayoutManager.class.getDeclaredField("mChildHelper");
                this.j.setAccessible(true);
                a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void a(View view) {
            try {
                a();
                if (this.k.indexOf(view) >= 0) {
                    return;
                }
                this.m[0] = view;
                this.c.invoke(this.b, this.m);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void b(View view) {
            try {
                a();
                this.m[0] = Integer.valueOf(b.b(b.this).indexOfChild(view));
                this.i.invoke(this.h, this.m);
                if (this.k == null) {
                    return;
                }
                this.k.remove(view);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
