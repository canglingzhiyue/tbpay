package com.alibaba.android.ultron.ext.vlayout;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class j<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public VirtualLayoutManager f2652a;

    static {
        kge.a(-1316673487);
    }

    public j(VirtualLayoutManager virtualLayoutManager) {
        this.f2652a = virtualLayoutManager;
    }

    public void b(List<c> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else {
            this.f2652a.a(list);
        }
    }
}
