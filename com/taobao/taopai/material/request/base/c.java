package com.taobao.taopai.material.request.base;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.qbu;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-346835643);
    }

    public static void a(qbu qbuVar, MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107d5823", new Object[]{qbuVar, mtopResponse, str});
        } else if (qbuVar == null) {
        } else {
            if (mtopResponse == null) {
                qbuVar.a(str, "");
                return;
            }
            String str2 = " handleError " + mtopResponse.toString();
            qbuVar.a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        }
    }
}
