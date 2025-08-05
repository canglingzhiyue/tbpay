package com.taobao.android.detail.wrapper.ext.video;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.video.DetailVideoSource;
import com.taobao.avplayer.DWInstance;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1720218682);
        emu.a("com.taobao.android.detail.wrapper.ext.video.MinVideoEventPosterCustom");
    }

    public static void a(Context context, DWInstance dWInstance, com.taobao.android.trade.event.c cVar, DetailVideoSource detailVideoSource, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10f61d8", new Object[]{context, dWInstance, cVar, detailVideoSource, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (dWInstance == null || context == null) {
        } else {
            com.taobao.android.trade.event.f.a(context, new f(dWInstance, dWInstance.getView(), detailVideoSource, i, i2, i3, i4), cVar);
        }
    }
}
