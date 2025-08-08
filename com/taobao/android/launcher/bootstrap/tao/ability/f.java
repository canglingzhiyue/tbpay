package com.taobao.android.launcher.bootstrap.tao.ability;

import android.app.Instrumentation;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gtk;
import tb.gtx;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static d a(gtx gtxVar, gtk gtkVar, Instrumentation instrumentation, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("ca547942", new Object[]{gtxVar, gtkVar, instrumentation, context}) : (context == null || !com.taobao.android.autosize.api.a.a(context)) ? (gtxVar == null || StringUtils.equals(gtxVar.f28453a, gtxVar.b)) ? new g(gtkVar, instrumentation) : new e(instrumentation) : new k(gtkVar, instrumentation, context);
    }
}
