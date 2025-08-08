package com.taobao.android.order.bundle.nav.detail;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.hxd;
import tb.hyq;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-960307163);
    }

    public static void a(int i, Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ceefe22", new Object[]{new Integer(i), intent, str});
            return;
        }
        String d = hxd.d(intent);
        String a2 = hxd.a(intent);
        Uri data = intent.getData();
        String str2 = null;
        if (data != null) {
            str2 = data.toString();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("downgradeType", d);
        hashMap.put("orderId", a2);
        hashMap.put("url", str2);
        String str3 = "OD-FT-" + i;
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        hyq.a(null, "downgradeProcess", "orderDetailUrlResolver", "1", str3, str, hashMap);
    }

    public static void a(int i, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d12ba58", new Object[]{new Integer(i), intent});
        } else {
            a(i, intent, null);
        }
    }
}
