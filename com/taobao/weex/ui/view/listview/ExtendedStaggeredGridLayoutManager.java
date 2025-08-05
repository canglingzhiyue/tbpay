package com.taobao.weex.ui.view.listview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.utils.WXLogUtils;
import tb.kge;

/* loaded from: classes9.dex */
public class ExtendedStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-278190804);
    }

    public static /* synthetic */ Object ipc$super(ExtendedStaggeredGridLayoutManager extendedStaggeredGridLayoutManager, String str, Object... objArr) {
        if (str.hashCode() == -756469868) {
            super.onItemsRemoved((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ExtendedStaggeredGridLayoutManager(int i, int i2) {
        super(i, i2);
    }

    @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2e92f94", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else if (i == -1) {
            WXLogUtils.e("ExtendedStaggeredGridLayoutManager: onItemsRemoved  Error Invalid Index : positionStart :" + i + "  itemCount:" + i2);
        } else {
            if (WXEnvironment.isApkDebugable()) {
                WXLogUtils.e("ExtendedStaggeredGridLayoutManager: onItemsRemoved  positionStart :" + i + "  itemCount:" + i2);
            }
            super.onItemsRemoved(recyclerView, i, i2);
        }
    }
}
