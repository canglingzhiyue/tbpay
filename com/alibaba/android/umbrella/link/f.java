package com.alibaba.android.umbrella.link;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.umbrella.link.export.TraceLogEventType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TTraceLog;
import tb.riy;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface a {
        void a(String str);
    }

    public static void a(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final TraceLogEventType traceLogEventType, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1784d1", new Object[]{str, str2, str3, str4, str5, str6, traceLogEventType, strArr});
        } else if (com.alibaba.android.umbrella.trace.b.g()) {
        } else {
            a(a(str3, strArr), new a() { // from class: com.alibaba.android.umbrella.link.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.umbrella.link.f.a
                public void a(String str7) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str7});
                        return;
                    }
                    Log.e(str, str7);
                    TTraceLog.event("", "", str + riy.ARRAY_START_STR + str2 + riy.ARRAY_END_STR, str3, 0L, str4, str5, str6, traceLogEventType.getValue(), str7);
                }
            });
        }
    }

    private static void a(String str, a aVar) {
        String substring;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e29b1eb7", new Object[]{str, aVar});
        } else if (str == null) {
        } else {
            if (str.length() == 0) {
                str = " ";
            }
            while (i < str.length()) {
                int i2 = i + 25600;
                if (str.length() <= i2) {
                    substring = str.substring(i);
                } else {
                    substring = str.substring(i, i2);
                }
                if (i != 0) {
                    substring = "----- log split -----\n" + substring;
                }
                aVar.a(substring);
                i = i2;
            }
        }
    }

    private static String a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e7f4c93", new Object[]{str, strArr});
        }
        if (strArr == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append(".");
                }
                sb.append(strArr[i]);
                if (strArr.length > 1) {
                    sb.append(" |");
                }
            } else {
                sb.append(" ");
                sb.append(strArr[i]);
            }
        }
        return sb.toString();
    }
}
