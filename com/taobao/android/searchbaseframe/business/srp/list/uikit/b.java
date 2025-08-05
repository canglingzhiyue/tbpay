package com.taobao.android.searchbaseframe.business.srp.list.uikit;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.itd;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends RecyclerView.RecycledViewPool {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-313186795);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == -149959711) {
            super.putRecycledView((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v7.widget.RecyclerView.RecycledViewPool
    public void putRecycledView(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f70fcbe1", new Object[]{this, viewHolder});
            return;
        }
        try {
            int itemViewType = viewHolder.getItemViewType();
            int recycledViewCount = getRecycledViewCount(itemViewType);
            super.putRecycledView(viewHolder);
            if (getRecycledViewCount(itemViewType) > recycledViewCount || !(viewHolder instanceof itd)) {
                return;
            }
            ((itd) viewHolder).destroyAndRemoveFromParent();
        } catch (Throwable unused) {
        }
    }
}
