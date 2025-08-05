package com.taobao.search.searchdoor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.r;
import tb.kge;

/* loaded from: classes7.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(586713616);
    }

    public static String a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{new Boolean(z)}) : z ? r.a("search_preload_biz", "preloadData", "") : r.a("search_preload_biz", "i18preloadData", "");
    }
}
