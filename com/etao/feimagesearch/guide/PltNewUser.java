package com.etao.feimagesearch.guide;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.cip.capture.components.c;
import com.etao.feimagesearch.k;
import tb.cuj;
import tb.kge;

/* loaded from: classes3.dex */
public class PltNewUser {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long THIRTY_DAYS = -1702967296;

    static {
        kge.a(-651131595);
    }

    public static boolean isNewUser(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78b27c4", new Object[]{context})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long a2 = cuj.a(context, c.KEY_LAST_TIME, 0L);
        return a2 == 0 || currentTimeMillis - a2 >= THIRTY_DAYS;
    }

    public static void markPltUsed(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec4bd9", new Object[]{context});
        } else {
            k.a(context, c.KEY_LAST_TIME, System.currentTimeMillis());
        }
    }
}
