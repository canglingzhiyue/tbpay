package com.taobao.android.dinamicx.widget.recycler.expose;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.fzu;
import tb.fzv;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements RecyclerView.OnChildAttachStateChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerView f12131a;
    private final fzu b;
    private final fzv c;
    private final HashMap<Integer, Long> d = new HashMap<>();
    private final long e;

    static {
        kge.a(-1460387618);
        kge.a(-1469681034);
    }

    public b(RecyclerView recyclerView, fzu fzuVar, fzv fzvVar, long j) {
        this.f12131a = recyclerView;
        this.b = fzuVar;
        this.c = fzvVar;
        this.e = j;
    }

    @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(View view) {
        RecyclerView recyclerView;
        int childAdapterPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517542da", new Object[]{this, view});
        } else if (view == null || (recyclerView = this.f12131a) == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) < 0) {
        } else {
            b(childAdapterPosition);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(View view) {
        int childAdapterPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a66017d", new Object[]{this, view});
        } else if ((view == null && this.f12131a == null) || (childAdapterPosition = this.f12131a.getChildAdapterPosition(view)) < 0) {
        } else {
            try {
                a(childAdapterPosition);
            } catch (Throwable th) {
                e.a(com.taobao.android.dinamicx.exception.a.a(th));
            }
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.b != null) {
            a(i, this.f12131a);
        }
        this.d.remove(Integer.valueOf(i));
    }

    private void a(int i, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8b1dc9", new Object[]{this, new Integer(i), recyclerView});
        } else if (recyclerView == null || recyclerView.getLayoutManager() == null || this.b == null || recyclerView.getLayoutManager().findViewByPosition(i) == null) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = this.d.get(Integer.valueOf(i)).longValue();
            if (longValue <= 0 || longValue >= currentTimeMillis) {
                return;
            }
            long j = currentTimeMillis - longValue;
            this.d.put(Integer.valueOf(i), 0L);
            if (j < this.e) {
                return;
            }
            this.b.a(i, j);
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (this.d.get(Integer.valueOf(i)) != null && this.d.get(Integer.valueOf(i)).longValue() > 0) {
        } else {
            this.d.put(Integer.valueOf(i), 0L);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (this.f12131a != null && this.f12131a.getLayoutManager() != null && this.b != null) {
                for (Map.Entry<Integer, Long> entry : this.d.entrySet()) {
                    if (e.a(this.f12131a.getLayoutManager().findViewByPosition(entry.getKey().intValue()), this.c.a())) {
                        a(entry.getKey().intValue(), this.f12131a);
                    }
                }
            }
        } catch (Throwable th) {
            e.a(com.taobao.android.dinamicx.exception.a.a(th));
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (this.f12131a != null && this.f12131a.getLayoutManager() != null && this.b != null) {
                Iterator it = new ArrayList(this.d.keySet()).iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    View findViewByPosition = this.f12131a.getLayoutManager().findViewByPosition(intValue);
                    if (findViewByPosition != null) {
                        int i = (this.d.get(Integer.valueOf(intValue)).longValue() > 0L ? 1 : (this.d.get(Integer.valueOf(intValue)).longValue() == 0L ? 0 : -1));
                        if (i == 0 && e.a(findViewByPosition, this.c.a())) {
                            this.d.put(Integer.valueOf(intValue), Long.valueOf(System.currentTimeMillis()));
                        } else if (i > 0 && e.b(findViewByPosition, 0.1f)) {
                            a(intValue, this.f12131a);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            e.a(com.taobao.android.dinamicx.exception.a.a(th));
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            b();
        }
    }
}
