package com.taobao.android.detail.ttdetail.utils;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class ax {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1215930340);
    }

    public static int a(RecyclerView recyclerView) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int spanCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46606589", new Object[]{recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) || (layoutManager instanceof LinearLayoutManager)) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || (spanCount = (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager).getSpanCount()) <= 0) {
            return -1;
        }
        int[] iArr = new int[spanCount];
        staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
        int length = iArr.length;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArr[i2] < i) {
                i = iArr[i2];
            }
        }
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }
}
