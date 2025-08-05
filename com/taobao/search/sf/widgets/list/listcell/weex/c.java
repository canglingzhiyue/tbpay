package com.taobao.search.sf.widgets.list.listcell.weex;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import kotlin.jvm.internal.q;
import tb.ium;
import tb.kge;

/* loaded from: classes8.dex */
public final class c extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-529126352);
    }

    @Override // tb.jzc, tb.jzd
    public int a(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ce43e6e", new Object[]{this, weexBean})).intValue();
        }
        return 0;
    }

    @Override // tb.jzc, tb.jzd
    public int b(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d9a0b2f", new Object[]{this, weexBean})).intValue();
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Activity activity, com.taobao.search.sf.a modelAdapter, ium parent, ListStyle style, ViewGroup viewGroup, int i) {
        super(activity, modelAdapter, parent, style, viewGroup, i);
        q.c(activity, "activity");
        q.c(modelAdapter, "modelAdapter");
        q.c(parent, "parent");
        q.c(style, "style");
    }
}
