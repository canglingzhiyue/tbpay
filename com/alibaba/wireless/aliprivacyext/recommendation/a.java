package com.alibaba.wireless.aliprivacyext.recommendation;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.wireless.aliprivacyext.d;
import com.alibaba.wireless.aliprivacyext.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.login4android.Login;
import java.util.List;
import tb.cfz;
import tb.cgf;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
        } else {
            cfz.b(context, z);
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : cfz.d(context);
    }

    public static d.a c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d.a) ipChange.ipc$dispatch("531653ce", new Object[]{context});
        }
        d.a aVar = new d.a();
        aVar.a(cgf.d(context));
        aVar.b(cgf.e(context));
        aVar.a(e(context));
        return aVar;
    }

    private static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        String utdid = UTDevice.getUtdid(context);
        String g = cgf.g(context);
        if (g != null) {
            return f.a(utdid, Long.parseLong("1000"), g);
        }
        return false;
    }

    private static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue();
        }
        if (!"0".equals(cgf.l(context))) {
            return b(context);
        }
        return false;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (Login.checkSessionValid() || !cgf.c(context)) {
            return false;
        }
        String f = cgf.f(context);
        if (TextUtils.isEmpty(f) || !a(context, f.b(f, String.class))) {
            return false;
        }
        return d(context);
    }

    private static boolean a(Context context, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9773155", new Object[]{context, list})).booleanValue();
        }
        if (list != null && !list.isEmpty()) {
            return list.contains(f.c(context));
        }
        return false;
    }
}
