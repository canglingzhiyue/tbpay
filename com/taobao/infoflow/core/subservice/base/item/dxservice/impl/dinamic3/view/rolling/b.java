package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.rolling;

import android.graphics.Typeface;
import mtopsdk.common.util.StringUtils;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Calendar;
import tb.fxo;
import tb.kge;
import tb.ldf;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2124503730);
    }

    private static int a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821d35f", new Object[]{new Boolean(z)})).intValue() : z ? 1 : 0;
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue() : str.replaceAll("E[+-]?\\d+", "").replace(".", "").length();
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        int a2 = a(str);
        int a3 = a(String.valueOf((int) Float.parseFloat(str)));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a3; i++) {
            sb.append('0');
        }
        if (a3 != a2) {
            sb.append('.');
            for (int i2 = a3 + 1; i2 <= a2; i2++) {
                sb.append('0');
            }
        }
        return sb.toString();
    }

    public static boolean a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{new Long(j)})).booleanValue() : j < a() && System.currentTimeMillis() >= a();
    }

    public static void a(TextView textView, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2888b42", new Object[]{textView, new Boolean(z), str});
        } else if (StringUtils.isEmpty(str)) {
            textView.setTypeface(Typeface.defaultFromStyle(a(z)));
        } else {
            Typeface typeface = null;
            try {
                typeface = fxo.a().a(str, a(z));
            } catch (InterruptedException e) {
                ldf.d("RollingNumberUtil", "出现异常: " + e);
            }
            if (typeface != null) {
                textView.setLineSpacing(10.0f, 1.0f);
                textView.setTypeface(typeface);
                return;
            }
            textView.setTypeface(Typeface.defaultFromStyle(a(z)));
        }
    }
}
