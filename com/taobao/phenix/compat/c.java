package com.taobao.phenix.compat;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.b;
import tb.nig;
import tb.niw;
import tb.niy;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            a(null, null, null, null, null);
        }
    }

    public static void a(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810f83cf", new Object[]{num, num2, num3, num4, num5});
            return;
        }
        niy niyVar = new niy();
        niyVar.b();
        try {
            nig a2 = b.h().b().a(niyVar);
            if (num != null) {
                a2.a(17, num.intValue());
            }
            if (num2 != null) {
                a2.a(34, num2.intValue());
            }
            if (num3 != null) {
                a2.a(51, num3.intValue());
            }
            if (num4 != null) {
                a2.a(68, num4.intValue());
            }
            if (num5 != null) {
                a2.a(85, num5.intValue());
            }
            niw.b("Alivfs4Phenix", "disk cache setup, top1=%s top2=%s top3=%s top4=%s top5=%s", num, num2, num3, num4, num5);
        } catch (RuntimeException e) {
            niw.d("Alivfs4Phenix", "disk cache setup error=%s", e);
        }
    }
}
