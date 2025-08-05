package com.taobao.android.dinamicx;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class bv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1365187599);
    }

    public abstract int ap2Px(DinamicXEngine dinamicXEngine, Context context, float f);

    public abstract int px2Ap(DinamicXEngine dinamicXEngine, Context context, float f);
}
