package com.taobao.android.searchbaseframe.meta.datasource;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes6.dex */
public class ComboOp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f14974a;
    private final int b;
    private final int c;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Behavior {
    }

    static {
        kge.a(623788481);
    }

    private ComboOp(int i, int i2, int i3) {
        this.f14974a = i;
        this.b = i2;
        this.c = i3;
    }

    public static ComboOp a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ComboOp) ipChange.ipc$dispatch("d3de551c", new Object[]{new Integer(i), new Integer(i2)}) : new ComboOp(1, i, i2);
    }

    public static ComboOp a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ComboOp) ipChange.ipc$dispatch("68bacac9", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)}) : new ComboOp(2, i3 + i, i + i2);
    }

    public static ComboOp b(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ComboOp) ipChange.ipc$dispatch("3e0ddd3b", new Object[]{new Integer(i), new Integer(i2)}) : new ComboOp(3, i, i2);
    }

    public void a(int i, RecyclerView.Adapter<?> adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18aff25e", new Object[]{this, new Integer(i), adapter});
            return;
        }
        int i2 = this.f14974a;
        if (i2 == 1) {
            int i3 = this.b;
            adapter.notifyItemRangeChanged(i + i3, this.c - i3);
        } else if (i2 == 2) {
            int i4 = this.b;
            adapter.notifyItemRangeRemoved(i + i4, this.c - i4);
        } else if (i2 != 3) {
        } else {
            int i5 = this.b;
            adapter.notifyItemRangeInserted(i + i5, this.c - i5);
        }
    }
}
