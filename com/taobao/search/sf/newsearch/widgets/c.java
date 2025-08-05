package com.taobao.search.sf.newsearch.widgets;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.r;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes8.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1640165357);
    }

    public static final boolean a(int i, int i2, ViewGroup parent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c08270b", new Object[]{new Integer(i), new Integer(i2), parent})).booleanValue();
        }
        q.c(parent, "parent");
        if (!r.cl()) {
            return false;
        }
        int childCount = parent.getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = parent.getChildAt(i3);
            if (childAt.canScrollVertically(1) || childAt.canScrollVertically(-1)) {
                Rect rect = new Rect();
                childAt.getGlobalVisibleRect(rect);
                if (rect.contains(i, i2)) {
                    return true;
                }
            } else if ((childAt instanceof ViewGroup) && (z = a(i, i2, (ViewGroup) childAt))) {
                return z;
            }
        }
        return z;
    }
}
