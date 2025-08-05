package com.taobao.android.dinamicx.widget.recycler;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class i extends StaggeredGridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WaterfallLayout f12142a;

    static {
        kge.a(1644180534);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        if (str.hashCode() == -602204034) {
            return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public i(int i, int i2, WaterfallLayout waterfallLayout) {
        super(i, i2);
        this.f12142a = waterfallLayout;
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc1b187e", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        try {
            int scrollVerticallyBy = super.scrollVerticallyBy(i, recycler, state);
            if (this.f12142a != null) {
                if (scrollVerticallyBy == 0) {
                    if (i > 0) {
                        this.f12142a.a(true);
                    } else if (i < 0) {
                        this.f12142a.b(true);
                    }
                } else if (i != 0) {
                    this.f12142a.a(false);
                    this.f12142a.b(false);
                }
            }
            return scrollVerticallyBy;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }
}
