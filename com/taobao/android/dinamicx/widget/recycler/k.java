package com.taobao.android.dinamicx.widget.recycler;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import tb.fqi;
import tb.kge;

/* loaded from: classes5.dex */
public class k extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private StickyLayout f12144a;
    private e b;
    private boolean g;
    private SparseArray<List<RecyclerView.ViewHolder>> c = new SparseArray<>();
    private SparseArray<RecyclerView.ViewHolder> d = new SparseArray<>();
    private Set<Integer> e = new HashSet();
    private List<String> f = new ArrayList();
    private SparseArray<RecyclerView.ViewHolder> h = new SparseArray<>();

    static {
        kge.a(-364626396);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        if (str.hashCode() == -1606942954) {
            super.onDrawOver((Canvas) objArr[0], (RecyclerView) objArr[1], (RecyclerView.State) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public k(boolean z) {
        this.g = false;
        this.g = z;
    }

    public void a(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51b1d2b", new Object[]{this, adapter});
        } else if (!(adapter instanceof e)) {
        } else {
            this.b = (e) adapter;
        }
    }

    public void a(StickyLayout stickyLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e222184c", new Object[]{this, stickyLayout});
        } else {
            this.f12144a = stickyLayout;
        }
    }

    public RecyclerView.ViewHolder a(RecyclerView recyclerView, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("2bf9db44", new Object[]{this, recyclerView, new Integer(i), new Boolean(z)});
        }
        int b = this.b.b(i);
        RecyclerView.ViewHolder a2 = this.g ? this.h.get(b) : a(b);
        List<Integer> b2 = this.b.b();
        int i6 = -1;
        if (b2 != null) {
            i6 = b2.indexOf(Integer.valueOf(b));
        }
        RecyclerView.ViewHolder viewHolder = null;
        if (a2 != null && i6 >= 0) {
            b(b, a2);
            a2 = null;
        }
        if (a2 == null) {
            List<RecyclerView.ViewHolder> list = this.c.get(this.b.getItemViewType(b));
            if (list != null && list.size() > 0) {
                viewHolder = list.remove(0);
            }
            if (viewHolder == null) {
                e eVar = this.b;
                a2 = eVar.onCreateViewHolder(recyclerView, eVar.getItemViewType(b));
            } else {
                a2 = viewHolder;
            }
            View view = a2.itemView;
            view.setTag(R.id.dx_recycler_sticky_holder, a2);
            view.setTag(R.id.dx_recycler_sticky_key, Integer.valueOf(b));
            this.b.b(a2, b);
            if (i6 >= 0) {
                b2.remove(i6);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                i3 = marginLayoutParams.leftMargin;
                i4 = marginLayoutParams.topMargin;
                i5 = marginLayoutParams.rightMargin;
                i2 = marginLayoutParams.bottomMargin;
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((((recyclerView.getMeasuredWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight()) - i3) - i5, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(i3, i4, view.getMeasuredWidth() + i5, view.getMeasuredHeight() + i2);
            a(b, a2);
        }
        if (z && a2.itemView.getParent() == null && this.f12144a != null) {
            this.f12144a.addView(a2.itemView, a2.itemView.getLayoutParams());
        }
        if (this.g) {
            this.h.put(b, a2);
        }
        return a2;
    }

    private RecyclerView.ViewHolder a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("31987998", new Object[]{this, new Integer(i)}) : this.d.get(i);
    }

    private void a(int i, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3adf4912", new Object[]{this, new Integer(i), viewHolder});
        } else {
            this.d.put(i, viewHolder);
        }
    }

    private boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        e eVar = this.b;
        return eVar != null && eVar.d(i);
    }

    private int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue();
        }
        e eVar = this.b;
        if (eVar != null) {
            return eVar.e(i);
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        rect.set(0, 0, 0, 0);
        if (recyclerView.getAdapter() == null || this.b == null) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        a(recyclerView, childAdapterPosition);
        if (!b(childAdapterPosition)) {
            return;
        }
        RecyclerView.ViewHolder a2 = a(recyclerView, childAdapterPosition, true);
        ViewGroup.LayoutParams layoutParams = a2.itemView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i4 = marginLayoutParams.leftMargin;
            i2 = marginLayoutParams.topMargin;
            i3 = marginLayoutParams.rightMargin;
            i = marginLayoutParams.bottomMargin;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        rect.set(i4, a2.itemView.getMeasuredHeight() - i2, i3, i);
    }

    private void a(RecyclerView recyclerView, int i) {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
        } else if (!fqi.aJ() || (eVar = this.b) == null || i >= eVar.j()) {
            if (this.g) {
                this.h.clear();
            } else {
                this.e.clear();
                int childCount = recyclerView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i2));
                    if (b(childAdapterPosition) || (i2 == 0 && this.b.c(childAdapterPosition))) {
                        this.e.add(Integer.valueOf(this.b.b(childAdapterPosition)));
                    }
                }
            }
            b();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a037ff16", new Object[]{this, canvas, recyclerView, state});
            return;
        }
        super.onDrawOver(canvas, recyclerView, state);
        if (this.b == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (!(adapter instanceof a)) {
            return;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (b(childAdapterPosition) || (i == 0 && this.b.c(childAdapterPosition))) {
                a(canvas, recyclerView, childAt, adapter, childAdapterPosition, i);
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ArrayList<View> arrayList = new ArrayList(0);
        for (int i = 0; i < this.f12144a.getChildCount(); i++) {
            View childAt = this.f12144a.getChildAt(i);
            int b = this.b.b(((Integer) childAt.getTag(R.id.dx_recycler_sticky_key)).intValue());
            if (!this.e.contains(Integer.valueOf(b))) {
                b(b, (RecyclerView.ViewHolder) childAt.getTag(R.id.dx_recycler_sticky_holder));
                arrayList.add(childAt);
            }
        }
        for (View view : arrayList) {
            this.f12144a.removeView(view);
        }
    }

    private void a(Canvas canvas, RecyclerView recyclerView, View view, RecyclerView.Adapter adapter, int i, int i2) {
        int i3;
        int measuredHeight;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ec656a", new Object[]{this, canvas, recyclerView, view, adapter, new Integer(i), new Integer(i2)});
            return;
        }
        View view2 = a(recyclerView, i, true).itemView;
        canvas.save();
        Rect rect = new Rect();
        if (recyclerView != null && recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().calculateItemDecorationsForChild(view, rect);
        }
        int paddingLeft = recyclerView.getPaddingLeft();
        if (fqi.an()) {
            if (b(i)) {
                i3 = rect.left;
            }
            int i4 = paddingLeft;
            int c = c(i);
            int a2 = a(recyclerView, adapter.getItemCount(), view, view2, i, i2, c);
            measuredHeight = view2.getMeasuredHeight() + a2;
            if (measuredHeight <= 0 || a2 >= recyclerView.getMeasuredHeight()) {
            }
            int b = this.b.b(i);
            if (b(b)) {
                String valueOf = String.valueOf(b);
                if (a2 == c) {
                    if (!this.f.contains(valueOf)) {
                        this.f.add(valueOf);
                        this.b.a(b, true);
                    }
                } else if (a2 > fqi.g() + c && this.f.contains(valueOf)) {
                    this.f.remove(valueOf);
                    this.b.a(b, false);
                }
            }
            canvas.translate(i4, a2);
            view2.draw(canvas);
            canvas.restore();
            view2.layout(i4, a2, view2.getMeasuredWidth() + i4, measuredHeight);
            return;
        }
        i3 = rect.left;
        paddingLeft += i3;
        int i42 = paddingLeft;
        int c2 = c(i);
        int a22 = a(recyclerView, adapter.getItemCount(), view, view2, i, i2, c2);
        measuredHeight = view2.getMeasuredHeight() + a22;
        if (measuredHeight <= 0) {
        }
    }

    private void b(int i, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60735213", new Object[]{this, new Integer(i), viewHolder});
            return;
        }
        this.d.remove(i);
        if (viewHolder == null) {
            return;
        }
        int itemViewType = this.b.getItemViewType(i);
        List<RecyclerView.ViewHolder> list = this.c.get(itemViewType);
        if (list == null) {
            list = new LinkedList<>();
            this.c.put(itemViewType, list);
        }
        list.add(viewHolder);
    }

    private int a(RecyclerView recyclerView, int i, View view, View view2, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        int i5 = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95cde249", new Object[]{this, recyclerView, new Integer(i), view, view2, new Integer(i2), new Integer(i3), new Integer(i4)})).intValue();
        }
        int height = view2.getHeight();
        int y = ((int) view.getY()) - height;
        if (i3 == 0) {
            int childCount = recyclerView.getChildCount();
            int b = this.b.b(i2);
            while (true) {
                if (i5 >= childCount) {
                    break;
                }
                int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i5));
                if (childAdapterPosition == -1 || !this.b.c(childAdapterPosition) || b == this.b.b(childAdapterPosition)) {
                    i5++;
                } else {
                    int y2 = ((int) recyclerView.getChildAt(i5).getY()) - (height + a(recyclerView, childAdapterPosition, false).itemView.getHeight());
                    if (y2 < 0) {
                        return y2;
                    }
                }
            }
            y = Math.max(i4, y);
        }
        return Math.max(i4, y);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f.clear();
        }
    }
}
