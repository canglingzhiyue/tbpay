package com.taobao.android.buy.module.scrollbar.widget;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.atp;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f9252a;
    public int b;
    private int d;
    private RecyclerView e;
    private LinearLayoutManager f;
    private final Map<Integer, Integer> c = new HashMap();
    private int g = -1;

    static {
        kge.a(-2012134527);
    }

    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        this.e = recyclerView;
        RecyclerView.LayoutManager layoutManager = this.e.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return;
        }
        this.f = (LinearLayoutManager) layoutManager;
    }

    public int a() {
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        int findFirstVisibleItemPosition = this.f.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.f.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition == this.b && this.g == -1 && (findViewByPosition = this.f.findViewByPosition(findFirstVisibleItemPosition)) != null) {
            this.g = findViewByPosition.getTop();
        }
        if (findFirstVisibleItemPosition < this.b) {
            return 0;
        }
        if (!this.c.containsKey(Integer.valueOf(findFirstVisibleItemPosition)) || !this.c.containsKey(Integer.valueOf(findLastVisibleItemPosition))) {
            for (int i = findFirstVisibleItemPosition; i <= findLastVisibleItemPosition; i++) {
                if (this.c.containsKey(Integer.valueOf(i))) {
                    this.d -= this.c.get(Integer.valueOf(i)).intValue();
                }
                View findViewByPosition2 = this.f.findViewByPosition(i);
                if (findViewByPosition2 != null && findViewByPosition2.getMeasuredHeight() != 0) {
                    this.c.put(Integer.valueOf(i), Integer.valueOf(findViewByPosition2.getMeasuredHeight()));
                    this.d += this.c.get(Integer.valueOf(i)).intValue();
                }
            }
        }
        float f = findFirstVisibleItemPosition;
        int i2 = this.b;
        return (int) ((-this.f.findViewByPosition(findFirstVisibleItemPosition).getTop()) + ((this.d / this.c.size()) * (f - ((i2 * i2) / f))) + this.g);
    }

    public int b() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (this.c.size() != 0) {
            i = (this.d / this.c.size()) * this.f9252a;
        }
        if (this.c.size() > this.f9252a - 2) {
            return this.d;
        }
        return Math.max(i, this.d);
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        atp atpVar = (atp) this.e.getLayoutManager();
        int childCount = atpVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (!atpVar.a(i).g()) {
                this.b = i;
                return i;
            }
        }
        return 0;
    }
}
