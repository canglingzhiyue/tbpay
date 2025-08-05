package com.tmall.android.dai.trigger.protocol;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.model.d;
import com.tmall.android.dai.model.e;
import com.tmall.android.dai.model.f;
import com.tmall.android.dai.model.g;
import tb.kge;
import tb.rli;
import tb.rlm;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-318570142);
    }

    public static a<?, ?, ?> a(String str, String str2, e eVar) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("42cf3a6e", new Object[]{str, str2, eVar});
        }
        if (eVar == null) {
            return null;
        }
        rlm rlmVar = new rlm(str, str2);
        if (eVar instanceof g) {
            return new c(str, new rli((g) eVar), rlmVar, "");
        }
        if (eVar instanceof d) {
            try {
                return Cep.createFromConfigAndSink(((d) eVar).a(), str2, str);
            } catch (Exception e) {
                e = e;
                str3 = "Cep";
            }
        } else if (!(eVar instanceof f)) {
            return null;
        } else {
            try {
                return Cep.createStreamProtocolFromConfigAndSink(((f) eVar).a(), str2, str);
            } catch (Exception e2) {
                e = e2;
                str3 = "Stream_Cep";
            }
        }
        com.taobao.mrt.utils.a.b(str3, "create trigger failed", e);
        return null;
    }
}
