package com.etao.feimagesearch.util;

import android.graphics.PointF;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class aa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(121735748);
    }

    public static PointF a(PointF pointF, PointF pointF2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("df8c2c7f", new Object[]{pointF, pointF2}) : pointF.x / pointF.y > pointF2.x / pointF2.y ? new PointF(pointF2.x, (pointF2.x * pointF.y) / pointF.x) : new PointF((pointF2.y * pointF.x) / pointF.y, pointF2.y);
    }
}
