package com.taobao.android.dinamicx.widget.scroller;

import android.util.SparseArray;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.x;
import tb.kge;

/* loaded from: classes5.dex */
public class b extends x.c.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SparseArray<View> b;
    private View c;

    static {
        kge.a(-492842098);
    }

    private b(View view) {
        super(view);
        this.c = view;
        this.b = new SparseArray<>();
    }

    public static b a(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3e1e6736", new Object[]{view}) : new b(view);
    }
}
