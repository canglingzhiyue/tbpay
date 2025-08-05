package com.taobao.tlog.adapter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.olg;

@Deprecated
/* loaded from: classes9.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f22965a = false;

    static {
        try {
            Class.forName("com.taobao.tao.log.TLog");
            f22965a = true;
        } catch (ClassNotFoundException unused) {
            f22965a = false;
        }
    }

    @Deprecated
    public static void a(Context context, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742d5b91", new Object[]{context, str, str2, map});
        } else if (!f22965a) {
        } else {
            olg.a(str, str2, map, null);
        }
    }
}
