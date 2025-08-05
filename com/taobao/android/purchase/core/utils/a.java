package com.taobao.android.purchase.core.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.t;
import com.taobao.tao.alipay.export.CashdeskConstants;
import tb.fke;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(449081167);
    }

    public static void a(Context context) {
        AliNavServiceInterface a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null || (a2 = t.a()) == null) {
        } else {
            a2.a(context).a(CashdeskConstants.ORDER_LIST_URL);
            fke.a(context);
        }
    }
}
