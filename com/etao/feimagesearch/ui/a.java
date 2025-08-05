package com.etao.feimagesearch.ui;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.coy;
import tb.kge;
import tb.suq;

/* loaded from: classes3.dex */
public final class a extends GridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-495494560);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -602204034) {
            if (hashCode != 1626618577) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
            return null;
        }
        return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
    }

    public a(Context context, int i) {
        super(context, i);
    }

    @Override // android.support.v7.widget.GridLayoutManager, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f43ad1", new Object[]{this, recycler, state});
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (Exception e) {
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "AlbumCrash", 19999, "exceptionType", e.getClass().getName(), suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, "onLayout");
        }
    }

    @Override // android.support.v7.widget.GridLayoutManager, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc1b187e", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        try {
            return super.scrollVerticallyBy(i, recycler, state);
        } catch (Exception e) {
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "AlbumCrash", 19999, "exceptionType", e.getClass().getName(), suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, "scrollVerticallyBy");
            return 0;
        }
    }
}
