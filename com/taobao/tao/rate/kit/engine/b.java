package com.taobao.tao.rate.kit.engine;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1247758956);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (context == null || StringUtils.isEmpty(str)) {
        } else {
            Toast.makeText(context.getApplicationContext(), str, 0).show();
        }
    }
}
