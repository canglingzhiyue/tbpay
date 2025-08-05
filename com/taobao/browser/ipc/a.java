package com.taobao.browser.ipc;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TaoApplication;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f16783a;

    static {
        kge.a(775692271);
    }

    public static boolean a(Context context) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            bool = (Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context});
        } else {
            if (f16783a == null) {
                String processName = TaoApplication.getProcessName(context);
                if (context != null && TextUtils.equals(processName, context.getPackageName())) {
                    z = true;
                }
                f16783a = Boolean.valueOf(z);
            }
            bool = f16783a;
        }
        return bool.booleanValue();
    }
}
