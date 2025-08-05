package com.taobao.search.musie.video;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jwr;
import tb.kge;

/* loaded from: classes7.dex */
public class b implements jwr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1477700436);
        kge.a(-1780416565);
    }

    @Override // tb.jwr
    public com.taobao.android.weex_uikit.widget.video.c a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_uikit.widget.video.c) ipChange.ipc$dispatch("f5c17429", new Object[]{this, context}) : new a(context);
    }
}
