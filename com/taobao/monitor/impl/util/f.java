package com.taobao.monitor.impl.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(com.taobao.monitor.procedure.g gVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c4237a", new Object[]{gVar, str, obj});
        } else if (gVar == null || StringUtils.isEmpty(str) || obj == null) {
        } else {
            gVar.a(str, obj);
        }
    }

    public static void b(com.taobao.monitor.procedure.g gVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d00a7b", new Object[]{gVar, str, obj});
        } else if (gVar == null || StringUtils.isEmpty(str) || obj == null || StringUtils.isEmpty(obj.toString())) {
        } else {
            gVar.a(str, obj);
        }
    }

    public static void a(com.taobao.monitor.procedure.g gVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c5db66", new Object[]{gVar, str, new Long(j)});
        } else if (gVar == null || StringUtils.isEmpty(str) || j <= 0) {
        } else {
            gVar.a(str, j);
        }
    }
}
