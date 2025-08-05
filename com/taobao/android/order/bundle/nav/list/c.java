package com.taobao.android.order.bundle.nav.list;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.hxd;
import tb.hyq;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-104029644);
    }

    public static void a(int i, Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ceefe22", new Object[]{new Integer(i), intent, str});
            return;
        }
        String d = hxd.d(intent);
        Uri data = intent.getData();
        String str2 = null;
        if (data != null) {
            str2 = data.toString();
        }
        String g = com.taobao.android.order.bundle.helper.g.g(intent);
        HashMap hashMap = new HashMap();
        hashMap.put("downgradeType", d);
        hashMap.put("url", str2);
        hashMap.put("tabType", g);
        String str3 = "OL-FT-" + i;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hyq.a(null, "downgradeProcess", "orderListUrlResolver", "1", str3, str, hashMap);
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
