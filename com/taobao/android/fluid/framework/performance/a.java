package com.taobao.android.fluid.framework.performance;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ihi;
import tb.jbh;
import tb.jck;
import tb.kge;
import tb.sgx;
import tb.spx;
import tb.spy;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(844221138);
    }

    public static String a(spx spxVar, spy spyVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97b5b4f", new Object[]{spxVar, spyVar});
        }
        if (spxVar == null || spyVar == null) {
            return "defaultMessageTag";
        }
        if (spxVar instanceof jbh) {
            str = "GlobalH5MessageHandler";
        } else if (spxVar instanceof jck) {
            str = "GlobalTNodeMessageHandler";
        } else {
            str = spxVar instanceof sgx ? "CardWeeXV2MessageHandler" : "MessageHandler";
        }
        return str + "/" + spyVar.c;
    }

    public static int a(spx spxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff341330", new Object[]{spxVar})).intValue();
        }
        if (spxVar instanceof jbh) {
            return ihi.a(300);
        }
        return ihi.a(180);
    }

    public static int b(spx spxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("edb719b1", new Object[]{spxVar})).intValue() : (!(spxVar instanceof jbh) && (spxVar instanceof jck)) ? 3001 : 3002;
    }
}
